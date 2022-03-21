package com.example.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class attributes1 {
//    @SerializedName("regional_internet_registry")
//    @Expose
//    private String regionalInternetRegistry;
//    @SerializedName("network")
//    @Expose
//    private String network;
//    @SerializedName("tags")
//    @Expose
//    private List<Object> tags = null;
//    @SerializedName("country")
//    @Expose
//    private String country;
//    @SerializedName("as_owner")
//    @Expose
//    private String asOwner;
    @SerializedName("last_analysis_stats")
    @Expose
    private LastAnalysisStats lastAnalysisStats;
    @SerializedName("asn")
    @Expose
    private Integer asn;
//    @SerializedName("whois_date")
//    @Expose
//    private Integer whoisDate;
//    @SerializedName("last_analysis_results")
//    @Expose
//    private LastAnalysisResults lastAnalysisResults;

//    public String getRegionalInternetRegistry() {
//        return regionalInternetRegistry;
//    }
//
//    public void setRegionalInternetRegistry(String regionalInternetRegistry) {
//        this.regionalInternetRegistry = regionalInternetRegistry;
//    }
//
//    public String getNetwork() {
//        return network;
//    }
//
//    public void setNetwork(String network) {
//        this.network = network;
//    }
//
//    public List<Object> getTags() {
//        return tags;
//    }
//
//    public void setTags(List<Object> tags) {
//        this.tags = tags;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getAsOwner() {
//        return asOwner;
//    }
//
//    public void setAsOwner(String asOwner) {
//        this.asOwner = asOwner;
//    }
//
    public LastAnalysisStats getLastAnalysisStats() {
        return lastAnalysisStats;
    }

    public void setLastAnalysisStats(LastAnalysisStats lastAnalysisStats) {
        this.lastAnalysisStats = lastAnalysisStats;
    }

    public Integer getAsn() {
        return asn;
    }

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

//    public Integer getWhoisDate() {
//        return whoisDate;
//    }
//
//    public void setWhoisDate(Integer whoisDate) {
//        this.whoisDate = whoisDate;
//    }
//
//    public LastAnalysisResults getLastAnalysisResults() {
//        return lastAnalysisResults;
//    }
//
//    public void setLastAnalysisResults(LastAnalysisResults lastAnalysisResults) {
//        this.lastAnalysisResults = lastAnalysisResults;
//    }

}
