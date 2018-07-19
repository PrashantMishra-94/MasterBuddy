package com.example.tanmayagnihotri.masterbuddy.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.tanmayagnihotri.masterbuddy.ws.model.User;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.FAIL;
import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface VideoDao {

    @Query("Select * FROM video")
    List<Video> getAll();

    @Query("Select * From video where video_id = :id")
    Video getVideo(int id);

    @Insert(onConflict = FAIL)
    void insertUser(Video video);

    @Query("Delete from video where video_id = :id")
    void deleteVideo(int id);

}
