package com.q1.www.myapp.gson;

/**
 * Created by ws on 2017/4/8.
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public  String pm25;
    }
}
