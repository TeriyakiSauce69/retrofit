package com.example.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IpInfo {
    @SerializedName("data")
    @Expose
    private data1 data;

    public data1 getData() {
        return data;
    }

    public void setData(data1 data) {
        this.data = data;
    }
}
