package com.okancingoz.travelbook.roomdb;

import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.okancingoz.travelbook.model.Place;

@Database(entities = {Place.class}, version = 3)

public abstract class PlaceDatabase extends RoomDatabase {
    public abstract PlaceDao placeDao();
}
