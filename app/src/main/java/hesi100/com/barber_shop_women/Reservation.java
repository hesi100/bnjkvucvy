package com.example.hesi100.barber_women;

/**
 * Created by hesi100 on 3/16/2018.
 */

public class Reservation {
    String idreserve;
    String idbarber;
    String hair;
    String haircolor;
    String nakhon;
    String makeup;
    String abro;
    String eplasion;
    String comment;
    String status;
    int puan;
    int cost;
    Reservation( String idreserve,String idbarber,String status)
    {
        this.idreserve=idreserve;
        this.idbarber=idbarber;
        this.status=status;

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
        puan=4;
        cost=19000;
    }
}
