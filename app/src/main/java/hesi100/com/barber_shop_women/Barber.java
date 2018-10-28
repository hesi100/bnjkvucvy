package hesi100.com.barber_shop_women;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hesi100 on 11/21/2017.
 */

public class Barber {
    int id;
    Kind hair;
    Kind haircolor;
    Kind nakhon;
    List<Service> eplasion;
    List<Service> abro;
    List<Service> makeup;


    Barber(int id)
    {
        this.id=id;
        hair=  new Kind();
        haircolor=new Kind();
        nakhon=new Kind();
        abro=new ArrayList<Service>();
        eplasion=new ArrayList<Service>();
        makeup=new ArrayList<Service>();
    }

    public void setother()
    {
        setAbro();
        setArayesh();
        setEplasion();
        setbollandhair();
        setbollandhaircolor();
        setkutahhair();
        setkutahhaircolor();
        setmotavasethair();
        setmotavasethaircolor();
        setbollandnakhon();
        setmotavasetnakhon();
        setkutahnakhon();
    }
    public void setbollandhair()
    {
        //send query

        Service e1=new Service("شینیون",5000);
        Service e2=new Service("سشوار",4000);
        hair.boland.add(e1);
        hair.boland.add(e2);
        /*
            JSONObject jsonObject=null;
        List <Service> services;
        JSONObject jservice;
        int i=0;

        try {
            jservice=jsonObject.getJSONObject("service0");
            while(jservice!=null)
            {
                Service b=new Service(jservice.getString("name"), jservice.getInt("cost"));
                hair.boland.add(b);
                i++;
                jservice=jsonObject.getJSONObject("service"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        
          */
    }
    public void setmotavasethair()
    {
        //send query

        Service e1=new Service("شینیون",4000);
        Service e2=new Service("سشوار",3000);
        hair.motavaset.add(e1);
        hair.motavaset.add(e2);
         /*
            JSONObject jsonObject=null;
        List <Service> services;
        JSONObject jservice;
        int i=0;

        try {
            jservice=jsonObject.getJSONObject("service0");
            while(jservice!=null)
            {
                Service b=new Service(jservice.getString("name"), jservice.getInt("cost"));
                hair.motavaset.add(b);
                i++;
                jservice=jsonObject.getJSONObject("service"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        
          */
    }
    public void setkutahhair()
    {
        //send query

        Service e1=new Service("شینیون",3000);
        Service e2=new Service("سشوار",2000);
        hair.kuchak.add(e1);
        hair.kuchak.add(e2);
          /*
            JSONObject jsonObject=null;
        List <Service> services;
        JSONObject jservice;
        int i=0;

        try {
            jservice=jsonObject.getJSONObject("service0");
            while(jservice!=null)
            {
                Service b=new Service(jservice.getString("name"), jservice.getInt("cost"));
                hair.kuchak.add(b);
                i++;
                jservice=jsonObject.getJSONObject("service"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        
          */
    }
    public void setbollandhaircolor()
    {
        //send query

        Service e1=new Service("خارجی",8000);
        Service e2=new Service("داخلی",5000);
        haircolor.boland.add(e1);
        haircolor.boland.add(e2);
          /*
            JSONObject jsonObject=null;
        List <Service> services;
        JSONObject jservice;
        int i=0;

        try {
            jservice=jsonObject.getJSONObject("service0");
            while(jservice!=null)
            {
                Service b=new Service(jservice.getString("name"), jservice.getInt("cost"));
                haircolor.boland.add(b);
                i++;
                jservice=jsonObject.getJSONObject("service"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        
          */
    }
    public void setmotavasethaircolor()
    {
        //send query
        Service e1=new Service("خارجی",7000);
        Service e2=new Service("داخلی",4000);
        haircolor.motavaset.add(e1);
        haircolor.motavaset.add(e2);
         /*
            JSONObject jsonObject=null;
        List <Service> services;
        JSONObject jservice;
        int i=0;

        try {
            jservice=jsonObject.getJSONObject("service0");
            while(jservice!=null)
            {
                Service b=new Service(jservice.getString("name"), jservice.getInt("cost"));
                haircolor.motavaset.add(b);
                i++;
                jservice=jsonObject.getJSONObject("service"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

          */
    }
    public void setkutahhaircolor()
    {
        //send query

        Service e1=new Service("خارجی",6000);
        Service e2=new Service("داخلی",3000);
        haircolor.kuchak.add(e1);
        haircolor.kuchak.add(e2);
         /*
            JSONObject jsonObject=null;
        List <Service> services;
        JSONObject jservice;
        int i=0;

        try {
            jservice=jsonObject.getJSONObject("service0");
            while(jservice!=null)
            {
                Service b=new Service(jservice.getString("name"), jservice.getInt("cost"));
                haircolor.kuchak.add(b);
                i++;
                jservice=jsonObject.getJSONObject("service"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

          */
    }
    public void setbollandnakhon()
    {
        //send query

        Service e1=new Service("گل گلی",5000);
        Service e2=new Service("خاکی خاکی",5000);
        nakhon.boland.add(e1);
        nakhon.boland.add(e2);
         /*
            JSONObject jsonObject=null;
        List <Service> services;
        JSONObject jservice;
        int i=0;

        try {
            jservice=jsonObject.getJSONObject("service0");
            while(jservice!=null)
            {
                Service b=new Service(jservice.getString("name"), jservice.getInt("cost"));
                nakhon.boland.add(b);
                i++;
                jservice=jsonObject.getJSONObject("service"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

          */
    }
    public void setmotavasetnakhon()
    {
        //send query

        Service e1=new Service("گل گلی",4000);
        Service e2=new Service("خاکی خاکی",4000);
        nakhon.motavaset.add(e1);
        nakhon.motavaset.add(e2);
        /*
            JSONObject jsonObject=null;
        List <Service> services;
        JSONObject jservice;
        int i=0;

        try {
            jservice=jsonObject.getJSONObject("service0");
            while(jservice!=null)
            {
                Service b=new Service(jservice.getString("name"), jservice.getInt("cost"));
                nakhon.motavaset.add(b);
                i++;
                jservice=jsonObject.getJSONObject("service"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

          */
    }
    public void setkutahnakhon() {
        //send query

        Service e1=new Service("گل گلی",3000);
        Service e2=new Service("خاکی خاکی",3000);
        nakhon.kuchak.add(e1);
        nakhon.kuchak.add(e2);
        /*
            JSONObject jsonObject=null;
        List <Service> services;
        JSONObject jservice;
        int i=0;

        try {
            jservice=jsonObject.getJSONObject("service0");
            while(jservice!=null)
            {
                Service b=new Service(jservice.getString("name"), jservice.getInt("cost"));
                nakhon.kuchak.add(b);
                i++;
                jservice=jsonObject.getJSONObject("service"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

          */
    }
    public void setArayesh()
    {
        //send query

        Service e1=new Service("روزانه",8000);
        Service e2=new Service("شبانه",7000);
        makeup.add(e1);
        makeup.add(e2);
        /*
            JSONObject jsonObject=null;
        List <Service> services;
        JSONObject jservice;
        int i=0;

        try {
            jservice=jsonObject.getJSONObject("service0");
            while(jservice!=null)
            {
                Service b=new Service(jservice.getString("name"), jservice.getInt("cost"));
                makeup.add(b);
                i++;
                jservice=jsonObject.getJSONObject("service"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

          */
    }
    public void setAbro()
    {
        //send query

        Service e1=new Service("تتو",10000);
        Service e2=new Service("اصلاح",9000);
        abro.add(e1);
        abro.add(e2);
        /*
            JSONObject jsonObject=null;
        List <Service> services;
        JSONObject jservice;
        int i=0;

        try {
            jservice=jsonObject.getJSONObject("service0");
            while(jservice!=null)
            {
                Service b=new Service(jservice.getString("name"), jservice.getInt("cost"));
                abro.add(b);
                i++;
                jservice=jsonObject.getJSONObject("service"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

          */

    }
    public void setEplasion()
    {
        //send query

        Service e1=new Service("دست",5000);
        Service e2=new Service("پا",8000);
        eplasion.add(e1);
        eplasion.add(e2);
        /*
            JSONObject jsonObject=null;
        List <Service> services;
        JSONObject jservice;
        int i=0;

        try {
            jservice=jsonObject.getJSONObject("service0");
            while(jservice!=null)
            {
                Service b=new Service(jservice.getString("name"), jservice.getInt("cost"));
                eplasion.add(b);
                i++;
                jservice=jsonObject.getJSONObject("service"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

          */
    }
    public List<Service> getList(int daste,int size)
    {
        if((daste==0)&&(size==0))
            return hair.boland;
        else if((daste==0)&&(size==1))
            return hair.motavaset;
        else if((daste==0)&&(size==2))
            return hair.kuchak;
        if((daste==1)&&(size==0))
            return haircolor.boland;
        else if((daste==1)&&(size==1))
            return haircolor.motavaset;
        else if((daste==1)&&(size==2))
            return haircolor.kuchak;
        if((daste==2))
            return makeup;
        else if((daste==3))
            return abro;
        if((daste==4)&&(size==0))
            return nakhon.boland;
        else if((daste==4)&&(size==1))
            return nakhon.motavaset;
        else if((daste==4)&&(size==2))
            return nakhon.kuchak;
        else if((daste==5))
            return eplasion;
        return null;

    }
}