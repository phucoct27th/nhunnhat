package com.nhatbanh.apptruyencuoi;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by le thanh ngoc on 6/24/2016.
 */
public class ContentStoryActivity extends Activity {
    private TextView mTxtTitle, mTxtContent;
    private String fileName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story_funny_layout);
        initView();
    }

    private void initView() {
        mTxtTitle = (TextView) findViewById(R.id.txt_title_funny_story);
        mTxtContent = (TextView) findViewById(R.id.txt_content_funny_story);

        Intent intentResult = getIntent();
        Bundle bundle = intentResult.getExtras();
        fileName = bundle.getString(ListItemStories.FILE_NAME);
        String title = bundle.getString(ListItemStories.TITLE_NAME);

        mTxtTitle.setText(title);
        readToTextViewContent();

    }

    private void readToTextViewContent() {
        AssetManager assetManager = ContentStoryActivity.this.getAssets();
        try {
            InputStream inputStream = assetManager.open(fileName+".txt");
            String content = "";
            int length;
            byte b[] = new byte[1024];
            length = inputStream.read(b);
            while (length>0) {
                content += new String(b,0,length);
                length = inputStream.read(b);
            }

            mTxtContent.setText(content);

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
