package com.redhat.bz;

import java.time.format.DateTimeFormatter;

public final class Configurations {

    public static final String DATETIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String JSON_DATETIME_FORMAT = DATETIME_FORMAT;
    public static final String JSON_DATE_FORMAT = DATE_FORMAT;
    public static final DateTimeFormatter JSON_DATETIME_FORMATTER = DateTimeFormatter.ofPattern(JSON_DATETIME_FORMAT);

    public static final String DATABASE_NAME = "sendbondb";
    public static final String DATABASE_JNDI_NAME = "java:jboss/datasources/BON_MYSQLDS";

    /**
     * For Metadata query
     */
    public static final String BONS_TABLE_NAME = "BONS";
    public static final String TABLE_DB_TYPE = "TABLE";


    public static final String HEALTHCHECK_NAME = "sendbon:backend";
    public static final String VERSION = "version";
    public static final String STARTUPT_IMESTAMP = "startupTimestamp";





    private Configurations() {
    }
}
