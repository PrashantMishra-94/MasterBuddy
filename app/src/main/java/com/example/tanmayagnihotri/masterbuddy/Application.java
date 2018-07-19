package com.example.tanmayagnihotri.masterbuddy;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.multidex.MultiDexApplication;

import com.example.tanmayagnihotri.masterbuddy.room.AppDatabase;
import com.example.tanmayagnihotri.masterbuddy.room.VideoDataSource;
import com.example.tanmayagnihotri.masterbuddy.utils.PermissionUtils;

/**
 * Created by tanmay.agnihotri on 1/7/18.
 */

public class Application extends MultiDexApplication {

    public SharedPreferences sharedPreferences;
    public PermissionUtils permissionUtils;
    public VideoDataSource mVideoDataSource;

    @Override
    public void onCreate() {
        super.onCreate();
        sharedPreferences = getSharedPreferences(Constants.MY_SHARED_PREFERENCES, Context.MODE_PRIVATE);
        permissionUtils = new PermissionUtils();
        createDataBase();
    }



    private void createDataBase() {
        AppDatabase database = AppDatabase.getAppDatabase(this);
        mVideoDataSource = new VideoDataSource(database, this);
    }

}

