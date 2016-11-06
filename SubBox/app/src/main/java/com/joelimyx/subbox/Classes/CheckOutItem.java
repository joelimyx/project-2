package com.joelimyx.subbox.Classes;

/**
 * Created by Joe on 11/2/16.
 */

public class CheckOutItem {
    private int mItemId;
    private String mName;
    private int mCount;
    private double mPrice;
    private String mImgUrl;

    public CheckOutItem(int itemId, String name, int count, double price,String imgUrl) {
        mItemId = itemId;
        mName = name;
        mCount = count;
        mPrice = price;
        mImgUrl= imgUrl;
    }

    public int getItemId() {
        return mItemId;
    }

    public String getName() {
        return mName;
    }

    public int getCount() {
        return mCount;
    }

    public double getSubtotalPrice() {
        return mPrice*mCount;
    }

    public String getImgUrl() {
        return mImgUrl;
    }

    public void addOrMinusCount(char operation){
        switch (operation){
            case '-':
                mCount--;
                break;
            case '+':
                mCount++;
                break;
        }
    }
}
