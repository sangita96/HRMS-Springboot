package com.hrms.services;

import java.sql.Timestamp;
import java.util.Date;

public class GeneralServices {
	public Timestamp getCurrentTimestamp() {
		Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime());  
        return ts;
	}

}
