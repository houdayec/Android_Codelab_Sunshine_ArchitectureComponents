package com.example.android.sunshine.data.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface WeatherDAO {

    @Insert
    void bulkInsert(WeatherEntry... weather);

}
