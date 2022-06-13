package com.ldh.gmail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    Context context;
    int layout;
    List<Item> arrayList;

    public Adapter(Context context, int layout, List<Item> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        TextView textTitle;
        TextView textContent;
        TextView textDate;
        TextView textAvatar;
        ImageView star;


    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            viewHolder = new ViewHolder();
            //mapping
            viewHolder.textTitle = (TextView)view.findViewById(R.id.textView_title);
            viewHolder.textContent = (TextView) view.findViewById(R.id.textView_content);
            viewHolder.textDate = (TextView) view.findViewById(R.id.textView_date);
            viewHolder.textAvatar = (TextView) view.findViewById(R.id.imageView_avatar);
            viewHolder.star = (ImageView) view.findViewById(R.id.imageView_star);
            view.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder)view.getTag();
        }
        //bind value
        viewHolder.textTitle.setText(arrayList.get(i).title);
        viewHolder.textContent.setText(arrayList.get(i).content_data);
        viewHolder.textDate.setText(arrayList.get(i).date_time);
        viewHolder.textAvatar.setText(arrayList.get(i).name_avatar);
        viewHolder.star.setImageResource(arrayList.get(i).image);
        viewHolder.star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewHolder.star.setBackgroundColor(R.drawable.custom_avatar);
            }
        });
        return view;
    }
}
