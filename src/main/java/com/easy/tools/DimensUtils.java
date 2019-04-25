package com.easy.tools;

import android.app.Application;

public class DimensUtils {

    /**
     * dp转换成px
     */
    public static int dp2px(float dpValue) {
        Application application = EasyTools.getApplication();
        if (application != null) {
            float scale = application.getResources().getDisplayMetrics().density;
            return (int) (dpValue * scale + 0.5f);
        }
        return 0;
    }

    /**
     * dp转换成px
     */
    public static int dp2px(int dpValue) {
        Application application = EasyTools.getApplication();
        if (application != null) {
            float scale = application.getResources().getDisplayMetrics().density;
            return (int) (dpValue * scale + 0.5f);
        }
        return 0;
    }
}
