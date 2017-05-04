package com.diaopg.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class StringTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String string = "2017-3";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm");
		Date date = simpleDateFormat.parse(string);
		String string2 = simpleDateFormat.format(date);

		System.out.println(string2);

		// DecimalFormat df = new DecimalFormat("######.##");
		// DecimalFormat decimalFormat = new DecimalFormat(pattern);
		// float f = (float) 1.02345;
		
		BigDecimal bg;
		Float f;
		bg = new BigDecimal("1234.123486");
		f = bg.floatValue();
		DecimalFormat df = new DecimalFormat("0.0");
		String str = df.format((float) f * 100) + "%";
		System.out.println(str);
		

		System.out.println(StringTest.getDecimalFormatString(bg));
		
		System.out.println(StringTest.getDecimalFormatDouble(bg));
	}
	
	private static float getDecimalFormatDouble(BigDecimal bd) {
		Float f;
		f = bd.floatValue();
		DecimalFormat df = new DecimalFormat("0.0");
		String str = df.format((float) f * 100);
		return new Float(str);
	}	
	
	public static String getDecimalFormatString(BigDecimal bigDecimal){
		String formatedString="";
		Float f;
		f = bigDecimal.floatValue();
		DecimalFormat df = new DecimalFormat("0.0");
		formatedString = df.format((float) f * 100) + "%";
		return formatedString;
	}

}