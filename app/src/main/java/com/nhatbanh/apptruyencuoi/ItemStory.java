package com.nhatbanh.apptruyencuoi;

/**
 * Created by le thanh ngoc on 6/22/2016.
 */
public class ItemStory {
    private int idImg;
    private String title;
    private String content;
    private int typeStory;
    public ItemStory(int typeStory, int idImg, String title) {
        this.typeStory = typeStory;
        this.idImg = idImg;
        this.title = title;
    }

    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTypeStory() {
        return typeStory;
    }
}
