package com.example.hossein.mapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by hosein on 12/9/2017.
 */
public class kadr extends LinearLayout {
    LinearLayout linearLayout;
    public static TextView price;
    public static TextView pprice;

    public kadr(Context context) {
        super(context);
        init(context);
    }

    public kadr(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public kadr(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }
    public void  init(Context cont) {
        LayoutInflater Li=(LayoutInflater)cont.getSystemService(cont.LAYOUT_INFLATER_SERVICE);
        View view=Li.inflate(R.layout.product_amazing,this,true);
        //*******************

        price= (TextView) view.findViewById(R.id.lattt1);
        pprice= (TextView) view.findViewById(R.id.lonn);
        linearLayout= (LinearLayout) view.findViewById(R.id.linearA);


    }
}
