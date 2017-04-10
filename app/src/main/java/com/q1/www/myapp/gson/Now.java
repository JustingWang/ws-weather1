package com.q1.www.myapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ws on 2017/4/8.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

  public class More {
        @SerializedName("txt")
        public String info;

    }
}
