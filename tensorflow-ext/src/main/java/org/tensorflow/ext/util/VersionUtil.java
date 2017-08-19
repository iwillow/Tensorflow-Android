package org.tensorflow.ext.util;

import android.os.Build;

/**
 * Created by air on 2017/8/19.
 */

public class VersionUtil {

    public static boolean hasJellyBeanMr2() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2;
    }
}
