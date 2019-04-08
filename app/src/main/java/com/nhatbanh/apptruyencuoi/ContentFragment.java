package com.nhatbanh.apptruyencuoi;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class ContentFragment extends Fragment {
	private View rootView;
	private LayoutInflater layoutInflate;
	private ImageView imgContent;
	private TextView txtContent;
	private Button mBtnReadData;

	public ContentFragment(Context context) {
		layoutInflate=LayoutInflater.from(context);
		rootView = layoutInflate.inflate(R.layout.content_layout, null);
		imgContent = (ImageView) rootView.findViewById(R.id.imgContent);
		txtContent = (TextView) rootView.findViewById(R.id.txtContent);
		mBtnReadData = (Button) rootView.findViewById(R.id.btn_read_item_topic);
	}

	public Button getmBtnReadData() {
		return mBtnReadData;
	}

	public void changeContent(String title, int idImage) {
		txtContent.setText(title);
		imgContent.setImageResource(idImage);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return rootView;
	}
}
