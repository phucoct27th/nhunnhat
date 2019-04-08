package com.nhatbanh.apptruyencuoi;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends Activity implements DrawerLayout.DrawerListener,
        View.OnClickListener, AdapterView.OnItemClickListener, MyAdapter.setOnFirstView {
    private static final int MENU_FULL = 0;
    private static final int MENU_HALF = 1;

    private static final String TAG = "MainActivity";
    public static final String ID_ITEM_TOPIC = "ID_ITEM_TOPIC";
    public static final String BUNDLE_STRING = "BUNDLE_STRING";
    public static final String NAME_TOPIC = "NAME_TOPIC";
    public static final String ID_IMAGE = "ID_IMAGE";

    private ListView mList;
    private MyAdapter myAdapter;
    private LevelListDrawable levelListD;
    private ImageView imgMenu;
    private DrawerLayout drawerLayout;
    private ContentFragment contentFrag;
    private View currentView = null;
    private ItemTopic item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawerLayout.setDrawerListener(this);

        mList = (ListView) findViewById(R.id.listView);
        myAdapter = new MyAdapter(this);

        myAdapter.setOnFirstView(this);

        Log.i(TAG, "setOnFirstView........3");

        mList.setAdapter(myAdapter);
        mList.setOnItemClickListener(this);

        item = new ItemTopic(ItemTopicManager.TRUYEN_CUOI_TINH_YEU,ItemTopicManager.TRUYEN_CUOI_TINH_YEU_STRING,R.drawable.love);
        imgMenu = (ImageView) findViewById(R.id.imgMenu);
        imgMenu.setOnClickListener(this);
        levelListD = (LevelListDrawable) imgMenu.getDrawable();
        contentFrag = new ContentFragment(this);
        getFragmentManager().beginTransaction().add(R.id.content, contentFrag)
                .commit();
        contentFrag.changeContent(myAdapter.getItemTopicManager().getArrayListTopic().get(0).getTopicName(), myAdapter.getItemTopicManager().getArrayListTopic().get(0).getIdImage());
        contentFrag.getmBtnReadData().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListItemStories();
            }
        });
    }

    private void openListItemStories() {
        Intent intent = new Intent(MainActivity.this, ListItemStories.class);
        Bundle bundle = new Bundle();
        bundle.putInt(ID_ITEM_TOPIC,item.getIdItemTopic());
        bundle.putString(NAME_TOPIC, item.getTopicName());
        bundle.putInt(ID_IMAGE, item.getIdImage());
        intent.putExtra(BUNDLE_STRING,bundle);
        startActivity(intent);
    }

    @Override
    public void onDrawerClosed(View arg0) {
        levelListD.setLevel(MENU_FULL);
    }

    @Override
    public void onDrawerOpened(View arg0) {
        levelListD.setLevel(MENU_HALF);
    }

    @Override
    public void onDrawerSlide(View arg0, float arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onDrawerStateChanged(int arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onClick(View v) {
        if (levelListD.getLevel() == MENU_FULL)
            drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_OPEN);
        else if (levelListD.getLevel() == MENU_HALF)
            drawerLayout
                    .setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
        if (currentView == null) {
            view.setBackgroundResource(R.color.orange);
            currentView = view;
        } else {
            currentView.setBackgroundColor(Color.WHITE);

            view.setBackgroundResource(R.color.orange);
            currentView = view;
        }
        item = (ItemTopic) parent.getAdapter().getItem(position);
        contentFrag.changeContent(item.getTopicName(), item.getIdImage());
        drawerLayout.closeDrawers();
    }

    @Override
    public void setView(View v) {
        Log.i(TAG, "setOnFirstView........4");
        currentView = v;
    }
}
