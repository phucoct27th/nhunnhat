package com.nhatbanh.apptruyencuoi;

import java.util.ArrayList;

/**
 * Created by le thanh ngoc on 6/22/2016.
 */
public class ItemTopicManager {
    public static final String TRUYEN_CUOI_TINH_YEU_STRING ="Truyện cười tình yêu";
    public static final String TRUYEN_CUOI_TINH_BAN_STRING ="Truyện cười tình bạn";
    public static final String TRUYEN_CUOI_GIA_DINH_STRING ="Truyện cười gia đình";
    public static final String TRUYEN_CUOI_NGU_NGON_STRING ="Truyện cười Vova";
    public static final String TRUYEN_CUOI_HOC_DUONG_STRING ="Truyện cười học đường";
    public static final String TRUYEN_CUOI_TIEU_LAM_STRING ="Truyện cười tiếu lâm";

    public static final int TRUYEN_CUOI_TINH_YEU = 0;
    public static final int TRUYEN_CUOI_TINH_BAN = 1;
    public static final int TRUYEN_CUOI_GIA_DINH = 2;
    public static final int TRUYEN_CUOI_HOC_DUONG = 3;
    public static final int TRUYEN_CUOI_NGU_NGON = 4;
    public static final int TRUYEN_CUOI_TIEU_LAM = 5;

    private ArrayList<ItemTopic> arrayListTopic = new ArrayList<ItemTopic>();

    public ArrayList<ItemTopic> getArrayListTopic() {
        return arrayListTopic;
    }

    public void initTopicStory() {
        arrayListTopic.add(new ItemTopic(TRUYEN_CUOI_TINH_YEU,TRUYEN_CUOI_TINH_YEU_STRING,R.drawable.love_1));
        arrayListTopic.add(new ItemTopic(TRUYEN_CUOI_TINH_BAN,TRUYEN_CUOI_TINH_BAN_STRING,R.drawable.friend));
        arrayListTopic.add(new ItemTopic(TRUYEN_CUOI_GIA_DINH,TRUYEN_CUOI_GIA_DINH_STRING,R.drawable.giadinh));
        arrayListTopic.add(new ItemTopic(TRUYEN_CUOI_HOC_DUONG,TRUYEN_CUOI_HOC_DUONG_STRING,R.drawable.hocduong));
        arrayListTopic.add(new ItemTopic(TRUYEN_CUOI_NGU_NGON,TRUYEN_CUOI_NGU_NGON_STRING,R.drawable.ngungon));
        arrayListTopic.add(new ItemTopic(TRUYEN_CUOI_TIEU_LAM,TRUYEN_CUOI_TIEU_LAM_STRING,R.drawable.tieulam));
    }

    public void createItemStoriesForEachItemTopic() {
        for (int i =0 ; i< arrayListTopic.size(); i++) {
            arrayListTopic.get(i).createItemStoriesForEachItemTopic();
        }
    }

}
