package com.example.gridapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

public class ImageAdaptor extends BaseAdapter {

    private List<Integer> mThumbIds;
    private Context mContext;

    public ImageAdaptor(List<Integer>mThumbIds,Context mContext) {
        this.mThumbIds=mThumbIds;
        this.mContext=mContext;
    }

    @Override
    public int getCount() {
        return mThumbIds.size();
    }//Method tells how many times will the adaptor work i.e. how many images will be shown

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return mThumbIds.get(position);
    }//Returns the id of the image

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=(ImageView) convertView;

        if (imageView==null){
            imageView=new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(350,450));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        imageView.setImageResource(mThumbIds.get(position));

        return imageView;
    }//Show how and what will be shown in the image in the grid view
}
