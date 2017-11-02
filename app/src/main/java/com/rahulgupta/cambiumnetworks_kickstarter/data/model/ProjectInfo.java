package com.rahulgupta.cambiumnetworks_kickstarter.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Gupta on 28/10/17.
 */

public class ProjectInfo {

    @SerializedName("s.no")
    @Expose
    private Integer sNo;
    @SerializedName("amt.pledged")
    @Expose
    private Integer amtPledged;
    @SerializedName("blurb")
    @Expose
    private String blurb;
    @SerializedName("by")
    @Expose
    private String by;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("end.time")
    @Expose
    private String endTime;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("percentage.funded")
    @Expose
    private Integer percentageFunded;
    @SerializedName("num.backers")
    @Expose
    private String numBackers;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("url")
    @Expose
    private String url;

    private ProjectInfo() {
    }

    public Integer getsNo() {
        return sNo;
    }

    public Integer getAmtPledged() {
        return amtPledged;
    }

    public String getBlurb() {
        return blurb;
    }

    public String getBy() {
        return by;
    }

    public String getCountry() {
        return country;
    }

    public String getCurrency() {
        return currency;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getLocation() {
        return location;
    }

    public Integer getPercentageFunded() {
        return percentageFunded;
    }

    public String getNumBackers() {
        return numBackers;
    }

    public String getState() {
        return state;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }


    private ProjectInfo(Builder builder) {

        this.amtPledged = builder.amtPledged;
        this.blurb = builder.blurb;
        this.by = builder.by;
        this.country = builder.country;
        this.currency = builder.currency;
        this.endTime = builder.endTime;
        this.sNo = builder.sNo;
        this.title = builder.title;
        this.location = builder.location;
        this.percentageFunded = builder.percentageFunded;
        this.numBackers = builder.numBackers;
        this.state = builder.state;
        this.url = builder.url;
        this.type = builder.type;

    }

    public static class Builder {

        private int sNo = 0;

        private int amtPledged = 0;

        private String blurb = "";

        private String by = "";

        private String country = "";

        private String currency = "";

        private String endTime = "";

        private String location = "";

        private int percentageFunded = 0;

        private String numBackers = "";

        private String state = "";

        private String title = "";

        private String type = "";

        private String url = "";


        public Builder(String title, String projectBy) {
            this.title = title;
            this.by = projectBy;

        }

        public void State(String state) {
            this.state = state;
        }

        public void Type(String type) {
            this.type = type;
        }

        public void Url(String url) {
            this.url = url;
        }

        public void sNo(int sNo) {
            this.sNo = sNo;
        }

        public void AmtPledged(int amtPledged) {
            this.amtPledged = amtPledged;
        }

        public void Blurb(String blurb) {
            this.blurb = blurb;
        }

        public void Country(String country) {
            this.country = country;
        }

        public void Currency(String currency) {
            this.currency = currency;
        }

        public void EndTime(String endTime) {
            this.endTime = endTime;
        }

        public void Location(String location) {
            this.location = location;
        }

        public void PercentageFunded(int percentageFunded) {
            this.percentageFunded = percentageFunded;
        }

        public void NumBackers(String numBackers) {
            this.numBackers = numBackers;
        }
    }

}
