package app.account;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.util.Log;

public class T_liability_account {
    private Integer id;
    private String name;
    private Integer amount;
    private Integer duetime;
    private String date;
    private Integer year, month, day;

    public T_liability_account() {

    }

    public T_liability_account(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getDueTime() {
        return duetime;
    }


    public void setDueTime(Integer duetime) {
        this.duetime = duetime;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String toString() {
        return "account [Id=" + id + ", Amount= " + amount + ", Name=" + name + "]";
    }


    public void setDate() {
        Calendar c = Calendar.getInstance();
        //ȡ��ϵͳ����:
        this.year = c.get(Calendar.YEAR);
        this.month = c.get(Calendar.MONTH);
        this.day = c.get(Calendar.DAY_OF_MONTH);
        //ȡ��ϵͳʱ�䣺
        /*
		hour = c.get(Calendar.HOUR_OF_DAY);
		minute = c.get(Calendar.MINUTE);
		*/
        Log.i("Time", "" + this.year + "/" + this.month + "/" + this.day);

    }

    public Integer getDate_year() {
        return this.year;
    }

    public Integer getDate_month() {
        return this.month;
    }

    public Integer getDate_day() {
        return this.day;
    }

    public void setDate_year(int year) {
        this.year = year;
    }

    public void setDate_month(int month) {
        this.month = month;
    }

    public void setDate_day(int day) {
        this.day = day;
    }
}