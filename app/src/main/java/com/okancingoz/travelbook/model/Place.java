package com.okancingoz.travelbook.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Place implements Serializable {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "place_name")
    public String placeName;

    @ColumnInfo(name = "latitude")
    public Double latitude;

    @ColumnInfo(name = "longitude")
    public Double longitude;

    @ColumnInfo(name="date")
    public String date;

    public Place(String placeName, Double latitude, Double longitude,String date) {
        this.placeName = placeName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
    }


}
