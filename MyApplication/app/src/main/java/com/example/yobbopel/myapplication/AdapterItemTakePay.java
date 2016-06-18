package com.example.yobbopel.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by YobboPEL on 18/06/2016.
 */
public class AdapterItemTakePay extends ArrayAdapter<ItemTakePay> {

    Context context;

    public AdapterItemTakePay(Context context, int resourceId,
                       List<ItemTakePay> items) {
        super(context, resourceId, items);
        this.context = context;
    }

    private class ViewHolder{
        ImageView img;
        TextView title;
        TextView date;
        TextView money;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        ItemTakePay rowItem = getItem(position);
        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if(convertView ==null){
            convertView = mInflater.inflate(R.layout.item_take_pay_layout, null);
            holder = new ViewHolder();
//            holder.txtDesc = (TextView) convertView.findViewById(R.id.desc);
//            holder.txtTitle = (TextView) convertView.findViewById(R.id.title);
//            holder.imageView = (ImageView) convertView.findViewById(R.id.icon);

            holder.img = (ImageView)convertView.findViewById(R.id.imageView);
            holder.title = (TextView)convertView.findViewById((R.id.textView2));
            holder.date = (TextView)convertView.findViewById((R.id.textView3));
            holder.money = (TextView)convertView.findViewById((R.id.textView));

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.img.setBackgroundResource(rowItem.getImg());
        holder.money.setText(String.valueOf(rowItem.getMoney()));
        holder.title.setText(rowItem.getTitle());
        holder.date.setText(rowItem.getTitle());
        return convertView;
    }

}
