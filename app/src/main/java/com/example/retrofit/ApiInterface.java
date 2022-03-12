package com.example.retrofit;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/todos")
    Call<List<Todo>> getTodos();



//    @GET("/todos/{id}")
//    Call<Todo> getTodo(@Path("id") int id);

    @GET("analyze.php")
    Call<Todo> getTodo(
            @Query("indicator") String indicator,
            @Query("pretty") String pretty
    );

//    @GET("analyze.php?indicator=2600:1004:b032:ae2d:482e:bdc2:65b9:76&pretty=1")
//    Call<Todo> getTodo();

    @GET("/todos")
    Call<List<Todo>> getTodosUsingQuery(@Query("userId") int userId, @Query("completed") boolean completed);

    @POST("/todos")
    Call<Todo> postTodo(@Body  Todo todo);
}
