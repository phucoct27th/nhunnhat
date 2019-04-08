package com.nhatbanh.apptruyencuoi;

import java.util.ArrayList;

/**
 * Created by le thanh ngoc on 6/22/2016.
 */
public class ItemStoryManager {
    private ArrayList<ItemStory> arrItemStory = new ArrayList<ItemStory>();
    private int idItemStoryManager;

    public ItemStoryManager(int idItemStoryManager) {
        this.idItemStoryManager = idItemStoryManager;
    }

    public ArrayList<ItemStory> getArrItemStory() {
        return arrItemStory;
    }

    public void initArrayItemStoryDependID() {
        switch (idItemStoryManager) {
            case ItemTopicManager.TRUYEN_CUOI_TINH_YEU:
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_TINH_YEU,R.drawable.smile,"Cua gái không thành"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_TINH_YEU,R.drawable.smile_2,"Hẹn hò với nha sĩ"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_TINH_YEU,R.drawable.smile,"Anh có muốn vui vẻ ko"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_TINH_YEU,R.drawable.smile_2,"Cô gái đẹp nhất thế giới"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_TINH_YEU,R.drawable.smile,"Tuyệt chiêu mai mối"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_TINH_YEU,R.drawable.smile_2,"Sữa tươi tiệt trùng"));
                break;
            case ItemTopicManager.TRUYEN_CUOI_TINH_BAN:
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_TINH_BAN,R.drawable.smile,"Tưởng bay được"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_TINH_BAN,R.drawable.smile_2,"Cái kết bất ngờ"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_TINH_BAN,R.drawable.smile,"Mặc nhầm quần"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_TINH_BAN,R.drawable.smile_2,"Chiếc máy gây ấn tượng phụ nữ"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_TINH_BAN,R.drawable.smile,"Bí mật"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_TINH_BAN,R.drawable.smile_2,"Điều ước nhỏ nhoi"));
                break;
            case ItemTopicManager.TRUYEN_CUOI_GIA_DINH:
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_GIA_DINH,R.drawable.smile,"Để ảnh vợ trong ví để có thêm sức mạnh"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_GIA_DINH,R.drawable.smile_2,"Chuyện nhỏ mà"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_GIA_DINH,R.drawable.smile,"Cảnh báo"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_GIA_DINH,R.drawable.smile_2,"Thử làm vợ"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_GIA_DINH,R.drawable.smile,"Hạnh phúc là gì"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_GIA_DINH,R.drawable.smile_2,"Bệnh đa nghi"));
                break;
            case ItemTopicManager.TRUYEN_CUOI_HOC_DUONG:
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_HOC_DUONG,R.drawable.smile,"20/11 là ngày gì?"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_HOC_DUONG,R.drawable.smile_2,"Thiếu gì thì nhặt thứ ấy"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_HOC_DUONG,R.drawable.smile,"Ai là tác giả chuyện kiều"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_HOC_DUONG,R.drawable.smile_2,"Ai thay đổi lịch sử"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_HOC_DUONG,R.drawable.smile,"Mơ ước có đôi"));
                arrItemStory.add(new ItemStory(ItemTopicManager.TRUYEN_CUOI_HOC_DUONG,R.drawable.smile_2,"Lên thẳng đại học"));
                break;
            case ItemTopicManager.TRUYEN_CUOI_NGU_NGON:

                break;
            case ItemTopicManager.TRUYEN_CUOI_TIEU_LAM:

                break;
            default:

                break;

        }
    }
}
