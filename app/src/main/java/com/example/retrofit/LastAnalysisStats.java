package com.example.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastAnalysisStats {
    @SerializedName("harmless")
    @Expose
    private Integer harmless;
    @SerializedName("malicious")
    @Expose
    private Integer malicious;
    @SerializedName("suspicious")
    @Expose
    private Integer suspicious;
    @SerializedName("undetected")
    @Expose
    private Integer undetected;
    @SerializedName("timeout")
    @Expose
    private Integer timeout;

    public Integer getHarmless() {
        return harmless;
    }

    public void setHarmless(Integer harmless) {
        this.harmless = harmless;
    }

    public Integer getMalicious() {
        return malicious;
    }

    public void setMalicious(Integer malicious) {
        this.malicious = malicious;
    }

    public Integer getSuspicious() {
        return suspicious;
    }

    public void setSuspicious(Integer suspicious) {
        this.suspicious = suspicious;
    }

    public Integer getUndetected() {
        return undetected;
    }

    public void setUndetected(Integer undetected) {
        this.undetected = undetected;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

}
