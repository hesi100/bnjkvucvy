package hesi100.com.barber_shop_women;

import android.app.Application;
import android.content.Context;

/**
 * Created by hesi100 on 11/26/2017.
 */

public class app extends Application{

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
