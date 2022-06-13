package com.ldh.gmail;

public class Item {
    public String title, content_data, date_time, name_avatar;
    public int image;

    public Item(String title, String content_data, String date_time, String name_avatar, int image) {
        this.title = title;
        this.content_data = content_data;
        this.date_time = date_time;
        this.name_avatar = name_avatar;
        this.image = image;
    }
}
