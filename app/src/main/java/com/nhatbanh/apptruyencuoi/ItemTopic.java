package com.nhatbanh.apptruyencuoi;


/**
 * Created by le thanh ngoc on 6/22/2016.
 */
public class ItemTopic {
    private int idItemTopic;
    private String topicName;
    private int numberStoryInTopic;
    private ItemStoryManager itemStoryManager;
    private int idImage;

    public ItemTopic(int idItemTopic, String topicName, int idImage) {
        this.idItemTopic = idItemTopic;
        this.topicName = topicName;
        this.idImage = idImage;
    }

    public void createItemStoriesForEachItemTopic() {
        itemStoryManager = new ItemStoryManager(idItemTopic);
        itemStoryManager.initArrayItemStoryDependID();
        countNumberStoryInTopic();
    }

    public int getIdItemTopic() {
        return idItemTopic;
    }

    public int getIdImage() {
        return idImage;
    }

    public String getTopicName() {
        return topicName;
    }

    public ItemStoryManager getItemStoryManager() {
        return itemStoryManager;
    }

    public int getNumberStoryInTopic() {
        return numberStoryInTopic;
    }

    public void countNumberStoryInTopic() {
        this.numberStoryInTopic = itemStoryManager.getArrItemStory().size();
    }

    //    public int getNumberStoryInTopic() {
//        return numberStoryInTopic;
//    }
//
//    public void setNumberStoryInTopic(int numberStoryInTopic) {
//        this.numberStoryInTopic = numberStoryInTopic;
//    }
}
