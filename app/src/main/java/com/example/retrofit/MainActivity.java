package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import retrofit2.Callback;
import retrofit2.Call;
import retrofit2.Response;

import retrofit2.Retrofit;

import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    ApiInterface apiInterface;

    JsonPlaceHolderApi jsonPlaceHolderApi;

    TextView fTextView;

    Integer the_qid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        jsonPlaceHolderApi = ApiClient.getClient().create(JsonPlaceHolderApi.class);

        fTextView = findViewById(R.id.tv1);
//        Call<Post> call = jsonPlaceHolderApi.getPost();

        getTodoUsingRouteParameter();
        (new Handler()).postDelayed(this::getUser, 15000);
        //getUser();

    }

    public void getTodos(View view) {

        Call<List<Todo>> call = apiInterface.getTodos();
        call.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {
                Log.e(TAG, "onResponse: " +  response.body());
            }

            @Override
            public void onFailure(Call<List<Todo>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getLocalizedMessage() );
            }
        });
    }

    public void getTodoUsingRouteParameter() {
        Call<Todo> todoCall = apiInterface.getTodo("2600:1004:b032:ae2d:482e:bdc2:65b9:76","1");
        todoCall.enqueue(new Callback<Todo>() {
            @Override
            public void onResponse(Call<Todo> call, Response<Todo> response) {
                Log.e(TAG, "onResponse: " + response.body() );
                the_qid = response.body().getQid();
                Toast.makeText(MainActivity.this,
                        "IP was Put Into Queue, info will display shortly. Please be patient.", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Todo> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getLocalizedMessage() );
            }
        });
    }

    public void getTodosUsingQuery(View view) {
        Call<List<Todo>> listCall = apiInterface.getTodosUsingQuery(3, false);
        listCall.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {
                Log.e(TAG, "onResponse: " + response.body() );
            }

            @Override
            public void onFailure(Call<List<Todo>> call, Throwable t) {
            }
        });
    }

//    public void postTodo(View view) {
//
//        Todo todo = new Todo(3, "Get me milk", false);
//
//        Call<Todo> todoPostCall = apiInterface.postTodo(todo);
//        todoPostCall.enqueue(new Callback<Todo>() {
//            @Override
//            public void onResponse(Call<Todo> call, Response<Todo> response) {
//                Log.e(TAG, "onResponse: " + response.body() );
//            }
//            @Override
//            public void onFailure(Call<Todo> call, Throwable t) {
//            }
//        });
//
//    }

    public void getUser(){
        //Execute the Network request
        String da_qid = String.valueOf(the_qid);
        Call<Post> call = jsonPlaceHolderApi.getPost(da_qid,"1");
        //Execute the request in a background thread
        call.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                if (!response.isSuccessful()){
                    fTextView.setText("It gets this far that's it.");
                    return;
                }

//                if (response.body() != null){
//                    //Get the values
                String userContent = "";
                userContent += "Success: " + response.body().getSuccess() + "\n";
                userContent += "Q ID: " + response.body().getQid() + "\n";
                userContent += "Status: " + response.body().getStatus() + "\n";
                userContent += "Risk: " + response.body().getData().getRisk() + "\n";
                userContent += "Longitude: " + response.body().getData().getProperties().getGeo().getLong() + "\n";
                userContent += "Latitude: " + response.body().getData().getProperties().getGeo().getLat() + "\n";
                userContent += "Region: " + response.body().getData().getProperties().getGeo().getRegion() + "\n";
                userContent += "Address: " + response.body().getData().getProperties().getGeo().getAddress() + "\n";
                userContent += "ISP: " + response.body().getData().getProperties().getGeo().getIsp() + "\n";
                userContent += "City: " + response.body().getData().getProperties().getGeo().getCity() + "\n";
                userContent += "ASN: " + response.body().getData().getProperties().getGeo().getAsn() + "\n";
                userContent += "Country: " + response.body().getData().getProperties().getGeo().getCountry() + "\n";
                userContent += "CountyCode: " + response.body().getData().getProperties().getGeo().getCountrycode() + "\n";
                userContent += "Organization: " + response.body().getData().getProperties().getGeo().getOrg() + "\n";
                //userContent += "Organization: " + response.body().getData().getProperties().getWhois() + "\n";

                fTextView.setText(userContent);
//                }
                //Log.e(TAG, "onResponse: " + response.body() );
            }
            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                fTextView.setText("Failure: " + t);
            }
        });
    }


}