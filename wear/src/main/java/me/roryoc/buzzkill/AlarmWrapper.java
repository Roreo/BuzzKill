package me.roryoc.buzzkill;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import java.util.Calendar;

/**
 * Created by Rory on 02/10/2015.
 */
public class AlarmWrapper {




    private AlarmManager am;
    private PendingIntent pendingIntent;

    public AlarmWrapper(Context context){

        am = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
    }

    public void buzzOn(Context context){

        Intent intent = new Intent(context, MyBroadcastReceiver.class);

        pendingIntent = PendingIntent.getBroadcast(context, 234324243, intent, 0);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(Calendar.MINUTE, 5);//starts after 10 seconds

        am.setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);


    }

    public void buzzOff(Context context){
        Intent intent = new Intent(context, MyBroadcastReceiver.class);

        pendingIntent = PendingIntent.getBroadcast(context, 234324243, intent, 0);

        am.cancel(pendingIntent);

    }

}
