package com.example.reganthomas.projectapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(@NonNull Context context, String[] parts) {
        super(context, R.layout.custom_row, parts);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myInflator = LayoutInflater.from(getContext());
        View customView = myInflator.inflate(R.layout.custom_row, parent, false);

        String singlePart = getItem(position);
        TextView listTitle = (TextView) customView.findViewById(R.id.listTitle);
        ImageView listImage = (ImageView) customView.findViewById(R.id.listImage);
        listTitle.setText(singlePart);
        switch(position){
            case 0:
                listImage.setImageResource(R.drawable.ic_menu_send);
                break;
            case 1:
                listImage.setImageResource(R.drawable.ic_menu_slideshow);
                break;
            case 2:
                listImage.setImageResource(R.drawable.ic_menu_camera);
                break;
            case 3:
                listImage.setImageResource(R.drawable.ic_menu_share);
                break;
            case 4:
                listImage.setImageResource(R.drawable.ic_menu_manage);
                break;
            case 5:
                listImage.setImageResource(R.drawable.news);
                break;
            case 6:
                listImage.setImageResource(R.drawable.calc);
                break;
            case 7:
                listImage.setImageResource(R.drawable.ic_menu_gallery);
                break;
            case 8:
                listImage.setImageResource(R.drawable.ic_menu_send);
                break;
            case 9:
                listImage.setImageResource(R.drawable.ic_menu_slideshow);
                break;
            case 10:
                listImage.setImageResource(R.drawable.ic_menu_camera);
                break;
            case 11:
                listImage.setImageResource(R.drawable.ic_menu_share);
                break;
            case 12:
                listImage.setImageResource(R.drawable.ic_menu_manage);
                break;
            case 13:
                listImage.setImageResource(R.drawable.news);
                break;
            case 14:
                listImage.setImageResource(R.drawable.calc);
                break;
            case 15:
                listImage.setImageResource(R.drawable.ic_menu_gallery);
                break;
            case 16:
                listImage.setImageResource(R.drawable.ic_menu_send);
                break;
            case 17:
                listImage.setImageResource(R.drawable.ic_menu_slideshow);
                break;
            case 18:
                listImage.setImageResource(R.drawable.ic_menu_camera);
                break;
            case 19:
                listImage.setImageResource(R.drawable.ic_menu_share);
                break;
            case 20:
                listImage.setImageResource(R.drawable.ic_menu_manage);
                break;
            case 21:
                listImage.setImageResource(R.drawable.news);
                break;
            case 22:
                listImage.setImageResource(R.drawable.calc);
                break;
            case 23:
                listImage.setImageResource(R.drawable.ic_menu_gallery);
                break;
            case 24:
                listImage.setImageResource(R.drawable.ic_menu_send);
                break;
            case 25:
                listImage.setImageResource(R.drawable.ic_menu_slideshow);
                break;
            case 26:
                listImage.setImageResource(R.drawable.ic_menu_camera);
                break;
            case 27:
                listImage.setImageResource(R.drawable.ic_menu_share);
                break;
            case 28:
                listImage.setImageResource(R.drawable.ic_menu_manage);
                break;
            case 29:
                listImage.setImageResource(R.drawable.news);
                break;
        }

        return customView;
    }
}
