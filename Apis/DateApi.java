package Apis;

import java.util.Date;

public class DateApi {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();

        java.sql.Date date1 = new java.sql.Date(time);
        System.out.println(date1);
    }
}
