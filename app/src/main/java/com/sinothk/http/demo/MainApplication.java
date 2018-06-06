package com.sinothk.http.demo;

import android.app.Application;

import com.sinothk.http.okHttp.HttpHelper;

/**
 * Created by 梁玉涛 on 2017/11/25.
 * 功能：
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        HttpHelper.init(this);
//        HttpManager.init(this);
//        OHttpManager.init(this, BaseData.class);
    }
}
