package com.easy.tools;

import android.app.Application;
import android.util.Log;

public class EasyTools {
    public static String TAG = EasyTools.class.getSimpleName();
    private static Application application;

    public static Application getApplication() {
        if (application == null) {
            Log.e(TAG, "you can not init EasyTools");
        }
        return application;
    }

    public static void init(Application application) {
        EasyTools.application = application;
    }
}
