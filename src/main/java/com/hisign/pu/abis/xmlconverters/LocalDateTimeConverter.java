package com.hisign.pu.abis.xmlconverters;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.xml.bind.DatatypeConverter;

public class LocalDateTimeConverter
{
    static ZoneId localZone = ZoneId.systemDefault();

    private LocalDateTimeConverter()
    {
    }

    public static LocalDateTime parseLocalDateTime(String s)
    {
        Date d = DatatypeConverter.parseDateTime(s).getTime();
        return LocalDateTime.ofInstant(d.toInstant(), localZone);
    }

    public static String printLocalDateTime(LocalDateTime dt)
    {
        ZonedDateTime zdt = dt.atZone(localZone);
        return zdt.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
}
