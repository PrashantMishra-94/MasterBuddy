package com.example.tanmayagnihotri.masterbuddy.ws.model;

import com.example.tanmayagnihotri.masterbuddy.ws.model.VideoItem;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by tanmay.agnihotri on 5/18/18.
 */

public class SelectVideoResponse {

    @SerializedName("videoList")
    public ArrayList<VideoItem> videoList;

    @SerializedName("totalNoOfVideos")
    public Long totalNoOfVideos;

}
