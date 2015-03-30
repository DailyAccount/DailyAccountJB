package app.account;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.util.Log;

public class T_expenditure_account 
{
	private Integer id;
    private String account;
    private Integer amount;
    private Integer totalAmount;
    private Integer year,month,day;
    
    public T_expenditure_account()
    {

    }
    	
    public T_expenditure_account(String account, int amount)//, int totalAmount) 
    {
		// TODO Auto-generated constructor stub
    	this.account = account;
    	this.amount = amount;
    	this.totalAmount = totalAmount;
	}

	public Integer getId()
	{
		return id;
	}
    
    public void setId(Integer id)
    {
    	this.id = id;
    }
    
    public String getAccount()
    {
    	return account;
    }
    
    public void setAccount(String account)
    {
    	this.account = account;
    }
    
    public void setTotalAmount(Integer amount)
    {
    	this.totalAmount = amount;
    }
    
    public Integer getAmount()
    {
    	return amount;
    }
    
    public void setAmount(Integer amount)
    {
    	this.amount = amount;
    }
    
    public String toString()
    {
    	return "account [AccountId="+id+", Amount= "+amount+", Account="+account+"]";
    }
	public Integer getTotalAmount() 
	{
		return totalAmount;
	}
 
	public void setTotalAmount(int amount) 
	{
		this.totalAmount = amount;
		
	}
	public void setDate() 
	{
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
		Log.i("Time", ""+this.year+"/"+this.month+"/"+this.day);
		
	}

	public Integer getDate_year() 
	{
		return this.year;
	}

	public Integer getDate_month() {
		return this.month;
	}

	public Integer getDate_day() {
		return this.day;
	}
	
	public void setDate_year(int year) 
	{
		this.year = year;
	}

	public void setDate_month(int month) 
	{
		this.month = month;
	}

	public void setDate_day(int day) 
	{
		this.day = day;
	}
}
