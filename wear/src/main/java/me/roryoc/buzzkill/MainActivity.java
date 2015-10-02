package me.roryoc.buzzkill;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private TextView mTextView;
    private PendingIntent pendingIntent;
    protected Boolean alarmOn;

    private Context mContext;
    private AlarmWrapper wrappedAM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        wrappedAM = new AlarmWrapper(mContext);

        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
            }
        });
    }



    public void buzz(View view) {



        wrappedAM.buzzOn(MainActivity.this);


//            Intent intent = new Intent(this, MyBroadcastReceiver.class);
//
//            pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(), 234324243  ,intent, 0);
//
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTimeInMillis(System.currentTimeMillis());
//            calendar.add(Calendar.SECOND, 10);//starts after 10 seconds
//
//            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
//
//            //The problem is that I am using setRepeating which was made inexact after API 19 so in order to get a precise
//            //alarm every 5 minutes I need to use setExact and figure out how to manually repeat it every 5 minutes
//            //I need to make a wrapper class
//            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 5 * 1000 * 60, pendingIntent);
//
            Toast.makeText(this, "Alarm On", Toast.LENGTH_SHORT).show();
//
//            alarmOn = true;

    }

    public void cancelBuzz(View view) {

        wrappedAM.buzzOff(MainActivity.this);

//
//            Intent intent = new Intent(this, MyBroadcastReceiver.class);
//
//            pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(), 0, intent, 0);
//
//            AlarmManager manager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
//            manager.cancel(pendingIntent);
            Toast.makeText(this, "Alarm Canceled", Toast.LENGTH_SHORT).show();
//            alarmOn = false;
//
   }
}


//adb forward tcp:4444 localabstract:/adb-hub
//adb connect localhost:4444
