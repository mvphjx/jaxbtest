package com.hisign.pu.abis.xmlconverters;

import java.sql.Timestamp;
import java.util.Calendar;

import javax.xml.bind.DatatypeConverter;

public class TimestampConverter
{
    private TimestampConverter()
    {
    }

    public static Timestamp parseDateTime(String s)
    {
        return Timestamp.valueOf(s);
    }

    public static String printDateTime(Timestamp dt)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        return DatatypeConverter.printDateTime(cal);
    }
}
