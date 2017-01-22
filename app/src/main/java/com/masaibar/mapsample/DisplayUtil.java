package com.masaibar.mapsample;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

public class DisplayUtil {

    public static Point getWindowSize(Context context) {
        Point size = new Point();
        getDisplay(context).getSize(size);
        return size;
    }

    private static Display getDisplay(Context c) {
        return ((WindowManager) c.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
    }
}
