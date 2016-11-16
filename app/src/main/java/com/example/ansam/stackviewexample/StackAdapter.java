package com.example.ansam.stackviewexample;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ansam on 11/16/2016.
 */

public class StackAdapter extends ArrayAdapter<stackItem> {
    private List<stackItem> items;
    private Context context;

    public StackAdapter(Context context, int resource, List<stackItem>list) {
        super(context, resource, list);
        this.items=list;
        this.context=context;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = layoutInflater.inflate(R.layout.stack_item, null);
        }
        stackItem stackItem = items.get(position);
        if (stackItem != null) {
            TextView textView = (TextView) itemView.findViewById(R.id.princess);
            ImageView imageView = (ImageView) itemView.findViewById(R.id.image);
            if (textView != null) {
                textView.setText(stackItem.getItemText());
                String imageName= stackItem.getImageName();
                int resId= this.getDrawableResIdByName(imageName);
                imageView.setImageResource(resId);
                imageView.setBackgroundColor(Color.rgb(211,204,188));
            }

        }
        return itemView;
    }

    public int getDrawableResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        int resID = context.getResources().getIdentifier(resName, "drawable", pkgName);
        return resID;
    }


}
