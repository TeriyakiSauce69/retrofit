package com.example.retrofit;

import java.util.List;

import retrofit2.Callback;
import retrofit2.http.GET;

import retrofit2.Call;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {

//    @GET("analyze.php?qid=457343118&pretty=1")
//    Call<Post> getPost();

    @GET("analyze.php")
    Call<Post> getPost(
            @Query("qid") String qid,
            @Query("pretty") String pretty
    );
}
