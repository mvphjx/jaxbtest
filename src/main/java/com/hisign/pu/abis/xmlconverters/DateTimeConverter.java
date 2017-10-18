package com.hisign.pu.abis.xmlconverters;

import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.DatatypeConverter;

public class DateTimeConverter
{
    private DateTimeConverter()
    {
    }

    public static Date parseDateTime(String s)
    {
        return DatatypeConverter.parseDateTime(s).getTime();
    }

    public static String printDateTime(Date dt)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        return DatatypeConverter.printDateTime(cal);
    }
}
