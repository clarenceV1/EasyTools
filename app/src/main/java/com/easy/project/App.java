package com.easy.project;

import android.app.Application;

import com.easy.tools.EasyTools;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        EasyTools.init(this);
    }
}
