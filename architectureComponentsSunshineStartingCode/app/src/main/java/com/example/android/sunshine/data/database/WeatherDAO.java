package com.example.android.sunshine.data.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.Date;

@Dao
public interface WeatherDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE) // REPLACE STRATEGY - old valued get replaced by newest ones
    void bulkInsert(WeatherEntry... weather);

    @Query("SELECT * FROM weather WHERE date = :date")
    WeatherEntry getWeatherByDate(Date date);

}
