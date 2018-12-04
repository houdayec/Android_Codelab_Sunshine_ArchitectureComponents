package com.example.android.sunshine.data.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "weather", indices = {@Index(value = {"date"}, unique = true)})
public class Weather {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private int weatherIconId;
    private Long date;
    private double min;
    private double max;
    private double humidity;
    private double pressure;
    private double wind;
    private double degrees;
}
