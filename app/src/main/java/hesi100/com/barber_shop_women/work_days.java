package hesi100.com.barber_shop_women;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class work_days extends AppCompatActivity {
    View vi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_days);
        final ImageView back= (ImageView) findViewById(R.id.finish);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ImageView im= (ImageView) findViewById(R.id.navigation);
        final DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.mDrawerLayout);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mDrawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                    mDrawerLayout.closeDrawer(Gravity.RIGHT);
                } else {
                    mDrawerLayout.openDrawer(Gravity.RIGHT);
                }
            }
        });

    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    public void settime(View v) {
        // TODO Auto-generated method stub
        begirV(v);
        Calendar mcurrentTime = Calendar.getInstance();
        int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
        int minute = mcurrentTime.get(Calendar.MINUTE);
        TimePickerDialog mTimePicker;
        mTimePicker = new TimePickerDialog(work_days.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                String minute;
                if(selectedMinute<10)
                {
                    minute="0"+selectedMinute;
                }
                else
                {
                    minute=""+selectedMinute;
                }

                String s=""+selectedHour+" : "+minute;
                setwhichtext(bedeV(),s);

            }
        }, hour, minute, true);//Yes 24 hour time
        mTimePicker.setTitle("زمان خود را انتخاب کنید.");
        mTimePicker.show();

    }



    public void begirV(View v)
    {
        vi=v;
    }
    public View bedeV()
    {
        return vi;
    }
    public void setwhichtext(View v,String s)
    {
        TextView t;
        switch (v.getId()) {
            case R.id.saturday_shift1_1:
                t = (TextView) findViewById(R.id.saturday_shift1_1);
                t.setText(s);
                break;
            case R.id.saturday_shift1_2:
                t = (TextView) findViewById(R.id.saturday_shift1_2);
                t.setText(s);
                break;
            case R.id.saturday_shift2_1:
                t = (TextView) findViewById(R.id.saturday_shift2_1);
                t.setText(s);
                break;
            case R.id.saturday_shift2_2:
                t = (TextView) findViewById(R.id.saturday_shift2_2);
                t.setText(s);
                break;
            case R.id.sunday_shift1_1:
                t = (TextView) findViewById(R.id.saturday_shift1_1);
                t.setText(s);
                break;
            case R.id.sunday_shift1_2:
                t = (TextView) findViewById(R.id.saturday_shift1_2);
                t.setText(s);
                break;
            case R.id.sunday_shift2_1:
                t = (TextView) findViewById(R.id.saturday_shift2_1);
                t.setText(s);
                break;
            case R.id.sunday_shift2_2:
                t = (TextView) findViewById(R.id.saturday_shift2_2);
                t.setText(s);
                break;
            case R.id.monday_shift1_1:
                t = (TextView) findViewById(R.id.monday_shift1_1);
                t.setText(s);
                break;
            case R.id.monday_shift1_2:
                t = (TextView) findViewById(R.id.monday_shift1_2);
                t.setText(s);
                break;
            case R.id.monday_shift2_1:
                t = (TextView) findViewById(R.id.monday_shift2_1);
                t.setText(s);
                break;
            case R.id.monday_shift2_2:
                t = (TextView) findViewById(R.id.monday_shift2_2);
                t.setText(s);
                break;
            case R.id.tuesday_shift1_1:
                t = (TextView) findViewById(R.id.tuesday_shift1_1);
                t.setText(s);
                break;
            case R.id.tuesday_shift1_2:
                t = (TextView) findViewById(R.id.tuesday_shift1_2);
                t.setText(s);
                break;
            case R.id.tuesday_shift2_1:
                t = (TextView) findViewById(R.id.tuesday_shift2_1);
                t.setText(s);
                break;
            case R.id.tuesday_shift2_2:
                t = (TextView) findViewById(R.id.tuesday_shift2_2);
                t.setText(s);
                break;
            case R.id.wednesday_shift1_1:
                t = (TextView) findViewById(R.id.wednesday_shift1_1);
                t.setText(s);
                break;
            case R.id.wednesday_shift1_2:
                t = (TextView) findViewById(R.id.wednesday_shift1_2);
                t.setText(s);
                break;
            case R.id.wednesday_shift2_1:
                t = (TextView) findViewById(R.id.wednesday_shift2_1);
                t.setText(s);
                break;
            case R.id.wednesday_shift2_2:
                t = (TextView) findViewById(R.id.wednesday_shift2_2);
                t.setText(s);
                break;
            case R.id.thursday_shift1_1:
                t = (TextView) findViewById(R.id.thursday_shift1_1);
                t.setText(s);
                break;
            case R.id.thursday_shift1_2:
                t = (TextView) findViewById(R.id.thursday_shift1_2);
                t.setText(s);
                break;
            case R.id.thursday_shift2_1:
                t = (TextView) findViewById(R.id.thursday_shift2_1);
                t.setText(s);
                break;
            case R.id.thursday_shift2_2:
                t = (TextView) findViewById(R.id.thursday_shift2_2);
                t.setText(s);
                break;
            case R.id.friday_shift1_1:
                t = (TextView) findViewById(R.id.friday_shift1_1);
                t.setText(s);
                break;
            case R.id.friday_shift1_2:
                t = (TextView) findViewById(R.id.friday_shift1_2);
                t.setText(s);
                break;
            case R.id.friday_shift2_1:
                t = (TextView) findViewById(R.id.friday_shift2_1);
                t.setText(s);
                break;
            case R.id.friday_shift2_2:
                t = (TextView) findViewById(R.id.friday_shift2_2);
                t.setText(s);
                break;
        }
    }
}
