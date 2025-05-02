package com.laura.fragment_bottom_recycle.clases;

public class News {
    private String title;
    private String image;
    private String desc;

    public News(String title, String image, String desc) {
        this.desc = desc;
        this.image = image;
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
