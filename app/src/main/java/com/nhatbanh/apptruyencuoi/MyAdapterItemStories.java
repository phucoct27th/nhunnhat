package com.nhatbanh.apptruyencuoi;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by le thanh ngoc on 6/24/2016.
 */
public class MyAdapterItemStories extends BaseAdapter{
    private static final String TAG = "MyAdapter";
    private LayoutInflater layoutInflater;
    private ItemTopic itemTopic;
    private boolean isFirst=true;

    public MyAdapterItemStories(Context context, int idTopic, String topicName, int idImage) {
        layoutInflater = LayoutInflater.from(context);
        itemTopic = new ItemTopic(idTopic, topicName, idImage);
        itemTopic.createItemStoriesForEachItemTopic();
    }

    @Override
    public int getCount() {
        return itemTopic.getItemStoryManager().getArrItemStory().size();
    }

    @Override
    public ItemStory getItem(int position) {
        return itemTopic.getItemStoryManager().getArrItemStory().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_story, null);
        }
        if(position==0 && isFirst){
            view.setBackgroundResource(R.color.orange);
            isFirst=false;
            Log.i(TAG, "setOnFirstView........2");
        }

        int index = position %2;
        switch (index) {
            case 0:
                view.setBackgroundResource(R.color.orange);
                break;
            case 1:
                view.setBackgroundColor(Color.WHITE);
                break;
           default:
               break;
        }

        ImageView imgFace = (ImageView) view.findViewById(R.id.iv_logo_type_story);
        TextView txtTitle = (TextView) view.findViewById(R.id.txt_title_type_story);
        imgFace.setImageResource(itemTopic.getItemStoryManager().getArrItemStory().get(position).getIdImg());
        txtTitle.setText(itemTopic.getItemStoryManager().getArrItemStory().get(position).getTitle());
        if(index==0) {
            txtTitle.setTextColor(Color.WHITE);
        }
        return view;
    }

}
