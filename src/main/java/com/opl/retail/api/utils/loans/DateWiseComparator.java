package com.opl.retail.api.utils.loans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
  * @auther : Maaz Shaikh
  * @Time : 07-Aug-2019 - 6:07:36 PM
  */
public class DateWiseComparator implements Comparator{

	private final Logger logger = LoggerFactory.getLogger(DateWiseComparator.class);
	final SimpleDateFormat displayFormate=new SimpleDateFormat("MMM yy");
	final SimpleDateFormat monthFormat=new SimpleDateFormat("MM");
	
	@Override
	public int compare(Object o1, Object o2) {

        try {
            Date d1 = convertToDate(o1);
            Date d2 = convertToDate(o2);
            if (d1.after(d2))
                return 1;
            else if (d1.before(d2))
                return -1;
            else
                return 0;
        } catch (Exception e) {
            logger.error(CommonUtils.EXCEPTION ,e);
        }
        return 0;
    }

    Date convertToDate(Object o1) throws ParseException {
        String dateStr = "";
        String mainStr = String.valueOf(o1);
        String date = "01";
        String month = "";
        String year = "";
        
        Date parse = displayFormate.parse(o1.toString());
//        month = mainStr.split(" ")[0];
        month = monthFormat.format(parse);
        System.out.println("month  formated :=>"+month );
        /*if (mainStr.length() == 6) {
            month = mainStr.substring(0, 2);
            year = mainStr.substring(2, mainStr.length());
        } else {
            month = mainStr.substring(0, 1);
            year = mainStr.substring(1, mainStr.length());
        }*/
        dateStr = date + "/" + parse.getMonth()+ "/" + parse.getYear();
        return new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
    }

}
