package hesi100.com.barber_shop_women;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hesi100 on 3/18/2018.
 */

public class customer {
    String name;
    String date;
    String time;
    String spendtime;
    String hair;
    String haircolor;
    String nakhon;
    String makeup;
    String abro;
    String eplasion;
    String reservation;
    String comment;
    String idreserve;
    int hazine;
    String id;
    customer(String id,String name,String date,String time,String reservation)
    {
        this.reservation=reservation;
        this.id=id;
        this.date=date;
        this.name=name;
        this.time=time;
    }

        public void setOthers(String idreserve)
        {
            hair="شینیون";
            haircolor="خارجی";
            nakhon="گلی ";
            makeup=" روزانه";
            abro="تتو";
            eplasion="---";
            comment=" عالی بود";
            hazine=19000;
        }
    public void getinforeserv(String idreserve) throws JSONException {
        JSONObject jsonObject = null;
        hair=jsonObject.getString("hair");
        haircolor=jsonObject.getString("haircolor");
        nakhon=jsonObject.getString("nakhon");
        makeup=jsonObject.getString("makeup");
        abro=jsonObject.getString("abro");
        eplasion=jsonObject.getString("eplasion");
        comment=jsonObject.getString("comment");
        hazine=jsonObject.getInt("hazine");
        spendtime=jsonObject.getString("time");

    }


}

