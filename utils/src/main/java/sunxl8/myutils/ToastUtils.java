package sunxl8.myutils;

import android.widget.Toast;

/**
 * Toast
 */

public class ToastUtils {

    public static void longShow(String msg) {
        Toast.makeText(Utils.getContext(), msg, Toast.LENGTH_LONG).show();
    }

    public static void shortShow(String msg) {
        Toast.makeText(Utils.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
