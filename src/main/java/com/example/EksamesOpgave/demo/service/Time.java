package com.example.EksamesOpgave.demo.service;
import java.sql.Timestamp;
import java.time.Instant;

public class Time{
    public static Timestamp timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp;
    }
}

