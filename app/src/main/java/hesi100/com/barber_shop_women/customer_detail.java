package hesi100.com.barber_shop_women;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;
public class customer_detail extends AppCompatActivity {
    TextView cust_name;
    TextView time;
    TextView date;
    TextView hair;
    TextView haircolor;
    TextView nakhon;
    TextView makeup;
    TextView abro;
    TextView eplasion;
    TextView reserve;
    EditText worktime;
    Button button;
    Button buttonlaghv;
    TextView end_time;
    LinearLayout reject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_detail);
        cust_name= (TextView) findViewById(R.id.cust_name);
        reject= (LinearLayout) findViewById(R.id.lay_reject);
        time= (TextView) findViewById(R.id.time);
        date= (TextView) findViewById(R.id.date);
        hair=(TextView) findViewById(R.id.hair);
        haircolor=(TextView) findViewById(R.id.haircolor);
        nakhon=(TextView) findViewById(R.id.nakhon);
        makeup=(TextView) findViewById(R.id.arayesh);
        abro=(TextView) findViewById(R.id.abro);
        eplasion=(TextView) findViewById(R.id.eplasion);
        reserve= (TextView) findViewById(R.id.reserve);
        worktime= (EditText) findViewById(R.id.worktime);
        end_time= (TextView) findViewById(R.id.end_time);
        button= (Button) findViewById(R.id.button);
        buttonlaghv= (Button) findViewById(R.id.buttonlaghv);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        String  id= b.getString("id");
        String name=b.getString("name");
        String begin_time=b.getString("time");
        String date_cust=b.getString("date");
        String reserv=b.getString("reservation");
        customer c=new customer(id,name,date_cust,begin_time,reserv);
        c.setOthers(id);
        cust_name.setText(name);
        time.setText(begin_time);
        date.setText(date_cust);
        reserve.setText(reserv);
        abro.setText(c.abro);
        hair.setText(c.hair);
        haircolor.setText(c.haircolor);
        eplasion.setText(c.eplasion);
        makeup.setText(c.makeup);
        nakhon.setText(c.nakhon);
        switch (reserv) {
            case "request" :
                button.setText(" تایید ");
                reject.setVisibility(View.VISIBLE);
                buttonlaghv.setVisibility(View.VISIBLE);
                reserve.setText(" در انتظار تایید ");
                break;
            case "confirm" :
                worktime.setEnabled(false);
                button.setText(" اتمام ");
                reserve.setText(" اصلاح نشده ");
                break;

            case "finish" :
                worktime.setEnabled(false);
                button.setText(" ok ");
                reserve.setText(" اصلاح شده ");
                break;
        }
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
}
