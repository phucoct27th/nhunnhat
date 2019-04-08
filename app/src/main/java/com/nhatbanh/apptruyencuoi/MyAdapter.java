package com.nhatbanh.apptruyencuoi;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by le thanh ngoc on 6/22/2016.
 */
public class MyAdapter extends BaseAdapter {
    private static final String TAG = "MyAdapter";
    private LayoutInflater layoutInflate;
    private ItemTopicManager itemTopicManager;
    private boolean isFirst=true;
    private setOnFirstView listen;

    public MyAdapter(Context context) {
        layoutInflate = LayoutInflater.from(context);
        itemTopicManager = new ItemTopicManager();
        itemTopicManager.initTopicStory();
        itemTopicManager.createItemStoriesForEachItemTopic();
    }

    public ItemTopicManager getItemTopicManager() {
        return itemTopicManager;
    }

    public void setOnFirstView(setOnFirstView listen){
        Log.i(TAG, "setOnFirstView........1");
        this.listen=listen;
    }

    @Override
    public int getCount() {
        return itemTopicManager.getArrayListTopic().size();
    }

    @Override
    public ItemTopic getItem(int position) {
        return itemTopicManager.getArrayListTopic().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            view = layoutInflate.inflate(R.layout.item_topic, null);
        }
        if(position==0 && isFirst){
            view.setBackgroundResource(R.color.orange);
            isFirst=false;
            Log.i(TAG, "setOnFirstView........2");
            listen.setView(view);
        }
        ImageView imgFace = (ImageView) view.findViewById(R.id.iv_logo_type_story);
        TextView txtTitle = (TextView) view.findViewById(R.id.txt_title_type_story);
        TextView txtNumberStories = (TextView) view.findViewById(R.id.txt_number_story);
        imgFace.setImageResource(itemTopicManager.getArrayListTopic().get(position).getIdImage());
        txtTitle.setText(itemTopicManager.getArrayListTopic().get(position).getTopicName());
        txtNumberStories.setText(itemTopicManager.getArrayListTopic().get(position).getNumberStoryInTopic()+"");
        return view;
    }

    public interface setOnFirstView{
        public void setView(View v);
    }
}
