package com.q1.www.myapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ws on 2017/4/8.
 */
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
