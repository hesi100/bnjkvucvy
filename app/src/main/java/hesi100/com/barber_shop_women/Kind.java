package hesi100.com.barber_shop_women;

import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hesi100 on 3/21/2018.
 */

public class Kind {
    List<Service> boland;
    public boolean b;
    List<Service> motavaset;
    public boolean m;
    List<Service> kuchak;
    public boolean k;
    Kind()
    {
        b=false;
        m=true;
        k=false;
        boland = new ArrayList<>();
        motavaset = new ArrayList<>();
        kuchak = new ArrayList<>();
    }
    public void setcheckbox(CheckBox boland, CheckBox motavaset, CheckBox kuchak)
    {
        boland.setChecked(b);
        motavaset.setChecked(m);
        kuchak.setChecked(k);
    }
    public void setsize(int s)
    {

        if(s==0)
        {
            b=true;
            m=false;
            k=false;
        }
        else if(s==1)
        {
            m=true;
            b=false;
            k=false;
        }
        else if(s==2)
        {
            k=true;
            m=false;
            b=false;
        }
        else {
            k = false;
            m = false;
            b = false;
        }
    }



    public void setBoland(List<Service> boland)
    {
        this.boland = boland;
    }

    public void setMotavaset(List<Service> motavaset)
    {

        this.motavaset = motavaset;
    }

    public void setKuchak(List<Service> kuchak) {
        this.kuchak = kuchak;
    }
}
