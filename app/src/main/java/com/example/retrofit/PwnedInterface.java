package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PwnedInterface {
    @Headers({"user-agent: RetrofitApp",
            "hibp-api-key: yourkeyhere"})
    @GET("{account}")
    Call<List<Pwned>> getPwned(@Path(value = "account", encoded = true)String account, @Query("truncateResponse") Boolean fullness);
}
