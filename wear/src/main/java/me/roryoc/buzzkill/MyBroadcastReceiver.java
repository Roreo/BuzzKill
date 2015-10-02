package me.roryoc.buzzkill;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.util.Log;

import java.util.Calendar;

/**
 * Created by Rory on 30/09/2015.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());


        // Vibrate the mobile phone
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);

        long[] pattern = {0, 200, 50, 200, 50, 200};

        vibrator.vibrate(pattern, -1);

        Log.d("OUTPUT TIME", calendar.getTime().toString());



    }


}
