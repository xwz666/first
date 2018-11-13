package com.xwz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Chair {
	
	
	public static void main(String[] args) {
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");  
		 Calendar c = Calendar.getInstance();
		 
		 
		
		
		 	c.setTime(new Date());
	        c.add(Calendar.YEAR,-1);
	        Date y = c.getTime();
	        String year = sdf.format(y);
	        System.out.println("过去一年："+year);
		
	        c.setTime(new Date());
	        c.add(Calendar.MONTH, -1);
	        Date m = c.getTime();
	        String mon = sdf.format(m);
	        System.out.println("过去一个月："+mon);
	        
			c.setTime(new Date());
	        c.add(Calendar.YEAR, -1);
	        Date z = c.getTime();
	        String starttime = sdf.format(z);
	        System.out.println("默认开始时间"+starttime);

	}
}
