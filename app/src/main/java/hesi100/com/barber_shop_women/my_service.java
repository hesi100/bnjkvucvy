package hesi100.com.barber_shop_women;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.List;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class my_service extends AppCompatActivity {
    List<Service> listhair;
    Barber barber;
    CheckBox boland;
    CheckBox motavaset;
    CheckBox kutah;
    LinearLayout[] options;
    LinearLayout select_andaze;
    int position;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_service);
        position=0;
        options= new LinearLayout[6];
        options[0]= (LinearLayout) findViewById(R.id.hair);
        options[1]= (LinearLayout) findViewById(R.id.haircolor);
        options[2]= (LinearLayout) findViewById(R.id.makeup);
        options[3]= (LinearLayout) findViewById(R.id.abro);
        options[4]= (LinearLayout) findViewById(R.id.naxon);
        options[5]= (LinearLayout) findViewById(R.id.eplasion);
        boland= (CheckBox) findViewById(R.id.bolnad);
        motavaset= (CheckBox) findViewById(R.id.motavaset);
        motavaset.setChecked(true);
        kutah= (CheckBox) findViewById(R.id.kutah);
        barber =new Barber(-1);
        barber.setother();
        setAdap(position,barber.hair.b,barber.hair.m,barber.hair.k);
        select_andaze= (LinearLayout) findViewById(R.id.select_andaze);
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
        final ImageView back= (ImageView) findViewById(R.id.finish);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
    public void selectit(View v)
    {
        int i;
        int t=Integer.parseInt(v.getTag().toString());
        for (i=0;i<6;i++)
        {
            options[i].setBackground(getResources().getDrawable(R.drawable.select));
        }
        options[t].setBackground(getResources().getDrawable(R.drawable.selected));
        if((t==0)||(t==1)||(t==4))
        {
            select_andaze.setVisibility(View.VISIBLE);

        }
        else
            select_andaze.setVisibility(View.GONE);
        int id = v.getId();
        switch (id)
        {
            case R.id.hair :
                barber.hair.setcheckbox(boland,motavaset,kutah);
                setAdap(t,barber.hair.b,barber.hair.m,barber.hair.k);
                position=t;
                break;
            case R.id.haircolor :
                barber.haircolor.setcheckbox(boland,motavaset,kutah);
                setAdap(t,barber.haircolor.b,barber.haircolor.m,barber.haircolor.k);
                position=t;
                break;
            case R.id.makeup :
                position=t;
                setAdap(t,false,false,false);
                break;
            case R.id.abro :
                setAdap(t,false,false,false);
                position=t;
                break;
            case R.id.naxon :
                barber.nakhon.setcheckbox(boland,motavaset,kutah);
                setAdap(t,barber.nakhon.b,barber.nakhon.m,barber.nakhon.k);
                position=t;
                break;
            case R.id.eplasion :
                setAdap(t,false,false,false);
                position=t;
                break;
        }

    }
    public void setsize(View v)
    {
        int size=Integer.parseInt(v.getTag().toString());
        boolean b = false;
        boolean m=false;
        boolean k = false;
        if(size==0) {b=true; m=false; k=false;}
        if(size==1) {m=true; b=false; k=false;}
        if(size==2) {k=true; m=false; b=false;}
        if(boland.isChecked()|| motavaset.isChecked() || kutah.isChecked()) {
            switch (position) {
                case 0:
                    barber.hair.setsize(size);
                    setAdap(position, b, m, k);
                    break;
                case 1:
                    barber.haircolor.setsize(size);
                    setAdap(position, b, m, k);
                    break;
                case 2:
                    setAdap(position, false, false, false);
                    break;
                case 3:
                    setAdap(position, false, false, false);
                    break;
                case 4:

                    barber.nakhon.setsize(size);
                    setAdap(position, b, m, k);
                    break;
                case 5:
                    setAdap(position, false, false, false);
                    break;
            }


        }
        else
        {

            switch (position) {
                case 0:
                    barber.hair.setsize(-1);

                    break;
                case 1:

                    barber.haircolor.setsize(-1);

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    barber.nakhon.setsize(-1);

                    break;
                case 5:

                    break;
            }
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_service);
            recyclerView.setVisibility(View.GONE);

        }
        if(size==0)
        {
            motavaset.setChecked(false);
            kutah.setChecked(false);
        }
        else if(size==1)
        {
            boland.setChecked(false);
            kutah.setChecked(false);
        }
        else
        {
            motavaset.setChecked(false);
            boland.setChecked(false);
        }

    }
    public void setAdap(int t,boolean b,boolean m,boolean k)
    {
        int a=-1;
        if(b) {
            a = 0;

        }
        if(m) {
            a = 1;

        }
        if(k) {
            a = 2;

        }
            List<Service> emkanats = barber.getList(t , a);
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_service);
            recyclerView.setVisibility(View.VISIBLE);
            final adapter_hair adapter = new adapter_hair(getApplicationContext(), emkanats);
            LinearLayoutManager mLinearLayoutManagerVertical = new LinearLayoutManager(getApplicationContext());
            mLinearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(mLinearLayoutManagerVertical);
            recyclerView.setAdapter(adapter);

    }
    public void addservice(View v)
    {
        int a=-1;
        if(boland.isChecked()) {
            a = 0;

        }
        if(motavaset.isChecked()) {
            a = 1;

        }
        if(kutah.isChecked()) {
            a = 2;

        }
        List<Service> emkanats = barber.getList(position , a);
        Service emk=new Service("",0);
        emkanats.add(emk);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_service);
        recyclerView.setVisibility(View.VISIBLE);
        final adapter_hair adapter = new adapter_hair(getApplicationContext(), emkanats);
        LinearLayoutManager mLinearLayoutManagerVertical = new LinearLayoutManager(getApplicationContext());
        mLinearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLinearLayoutManagerVertical);
        recyclerView.setAdapter(adapter);

    }
}
