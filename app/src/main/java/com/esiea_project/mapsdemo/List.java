package com.esiea_project.mapsdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class List extends ArrayAdapter<String> {

    private Integer[] tab_images_pour_la_liste = {
            R.drawable.bercy,
            R.drawable.montsouris,
            R.drawable.luxembourg,
            R.drawable.monceau,
            R.drawable.tuileries,
            R.drawable.chaumont,
            R.drawable.plantes,
            R.drawable.floral,
            R.drawable.vincennes,
            R.drawable.mars,
            R.drawable.boulogne};

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        textView.setText(getItem(position));

        if(convertView == null )
            imageView.setImageResource(tab_images_pour_la_liste[position]);
        else
            rowView = (View)convertView;

        return rowView;
    }

    public List(Context context, String[] values) {
        super(context, R.layout.rowlayout, values);
    }
}
