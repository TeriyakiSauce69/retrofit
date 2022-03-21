package com.example.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class data1 {
    @SerializedName("attributes")
    @Expose
    private attributes1 attributes;

    public attributes1 getAttributes() {
        return attributes;
    }

    public void setAttributes(attributes1 attributes) {
        this.attributes = attributes;
    }
}
