package app.account;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.util.Log;

public class T_item_account
{
	
	private Integer id;
	private String name;
	private Integer status;
	    
	public  T_item_account() 
	{
	}
	public  T_item_account(String name, Integer status)//, int totalAmount) 
	{
	   	this.name = name;
	   	this.status = status;
	}

	public Integer getId()
	{
		return id;
	}
	   
	public void setId(Integer id)
	{
	   	this.id = id;
	}

	public String getName()
	{
	   	return name;
	}
	    
	public void setName(String name)
	{
	   	this.name = name;
	}
	    
	public Integer getStatus()
	{
	   	return status;
	}
	    
    public void setStatus(int status)
	{
	   	this.status = status;
	}
	    
	public String toString()
	{
	   	return ("account [Id=" +id+ ", Name= " +name+ "status"+status+"]");
	}
		 
}