package com.zuma.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.core.convert.converter.Converter;

public class DateConvert implements Converter<String, Date> {

	@Override
	public Date convert(String stringDate) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(StringUtils.isNotBlank(stringDate)){
			try {
	            return simpleDateFormat.parse(stringDate);
	        } catch (ParseException e) {
	        	simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        	try {
					return simpleDateFormat.parse(stringDate);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
	            e.printStackTrace();
	        }
		}
        return null;
	}
}
