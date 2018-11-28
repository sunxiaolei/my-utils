package sunxl8.myutils;

import android.content.Context;

/*
 * @author sun
 * @emil sunxl8@centaline.com.cn
 * create at 18-7-26
 * description:
 */
public class Utils {

    private static Context context;

    public static void init(Context context) {
        Utils.context = context.getApplicationContext();
        KvUtils.init(context);
    }

    public static Context getContext() {
        if (context != null) return context;
        throw new NullPointerException("Should init Utils first");
    }
}
