package com.nhatbanh.apptruyencuoi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by le thanh ngoc on 6/24/2016.
 */
public class ListItemStories extends Activity implements AdapterView.OnItemClickListener {
    public static final String FILE_NAME = "FILE_NAME";
    public static final String TITLE_NAME = "TITLE_NAME";
    private ListView mListView;
    private MyAdapterItemStories myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_stories);
        initView();
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.lv_item_stories);
        Intent intentResult = getIntent();
        Bundle bundleResult = intentResult.getBundleExtra(MainActivity.BUNDLE_STRING);
        int idTopic = bundleResult.getInt(MainActivity.ID_ITEM_TOPIC);
        String topicName = bundleResult.getString(MainActivity.NAME_TOPIC);
        int idImage = bundleResult.getInt(MainActivity.ID_IMAGE);

        myAdapter = new MyAdapterItemStories(this,idTopic,topicName,idImage);
        mListView.setOnItemClickListener(this);
        mListView.setAdapter(myAdapter);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ItemStory itemStory = (ItemStory) parent.getAdapter().getItem(position);
//        Toast.makeText(ListItemStories.this, itemStory.getTypeStory()+""+position+"", Toast.LENGTH_SHORT).show();
        String fileName = itemStory.getTypeStory()+""+position+"";
        String title = itemStory.getTitle();
        Intent intent = new Intent(ListItemStories.this, ContentStoryActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(FILE_NAME, fileName);
        bundle.putString(TITLE_NAME, title);
        intent.putExtras(bundle);

        startActivity(intent);
    }

}
