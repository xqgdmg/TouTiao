package com.chaychan.news.model.entity;

public class Channel{
    public static final int TYPE_MY_CHANNEL = 3;

    public String title;
    public String channelCode;

    public Channel(String title, String channelCode) {
        this(TYPE_MY_CHANNEL, title, channelCode);
    }

    public Channel(int type, String title, String channelCode) {
        this.title = title;
        this.channelCode = channelCode;
    }
}