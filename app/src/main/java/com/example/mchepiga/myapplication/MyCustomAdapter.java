package com.example.mchepiga.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mchepiga on 2/14/2017.
 */

public class MyCustomAdapter extends BaseAdapter {

    String[] descriptions;
    int [] images;
    Context context;

    public MyCustomAdapter(MainActivity c, String[] d, int[] i){
        context = c;
        descriptions = d;
        images = i;
    }

    @Override
    public int getCount() {
        return descriptions.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row;
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row = inflater.inflate(R.layout.custom_list, null);
        TextView textView = (TextView)row.findViewById(R.id.textView);
        textView.setText(descriptions[position]);
        ImageView imageView = (ImageView)row.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);
        row.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(context, descriptions[position], Toast.LENGTH_LONG).show();
            }
        });


        return row;
    }
}
