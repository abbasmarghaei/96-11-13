package com.example.hossein.mapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.google.android.gms.maps.model.LatLng;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Timer;
import java.util.TimerTask;

public class mhyani extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    public static String kadrr="";
    public static String tst="";
    String lon2="2";
    String lat2="1";
    public static TextView price;
    public static TextView pprice;
    LinearLayout log_in_li,li_she;
   LinearLayout.LayoutParams layoutParams;
    EditText latt,lonn,name_k;
    kadr kadrrr;
    public static Context con;
    String lonnnn,lat1,tell;
    double latd,lond;
    Button ser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Toast.makeText(getBaseContext(), kadrr,Toast.LENGTH_SHORT).show();
        li_she = (LinearLayout) findViewById(R.id.shegeft);
        ShowAmazingProductt();
          ser = (Button) findViewById(R.id.btntst);

        price= (TextView) findViewById(R.id.lattt1);
        pprice= (TextView) findViewById(R.id.lonn);

        //*-****************************
        ser.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               new AsyncTasktimrt("http://mivefarangi.companynegin.com/lat.php").execute();

             //   ShowAmazingProduct();


//                pprice.setText(name);
//                price.setText(namk);

            }

        });
        //*******************************
    }
    //********************************
    public void CreateProductAmazingt( String lat3, String lon3) {
        kadrrr = new kadr(con);

        kadrrr.price.setText(lat3);
        kadrrr.pprice.setText(lon3);
        layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        li_she.addView(kadrrr);
    }
        public void creatCadr()
        {
            kadrrr =new kadr(con);
            layoutParams=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            li_she.addView(kadrrr);
        }

        //  layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        //  shegeft_txt.setText(picurl);


    //**********************************
    public void ShowAmazingProductt() {

        try {
            JSONArray jsonArray = new JSONArray(kadrr);
            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject object = jsonArray.getJSONObject(i);
                lat2 = String.valueOf(object.getDouble("lat"));
                lon2 = String.valueOf(object.getDouble("lanm"));

                CreateProductAmazingt( lat2, lon2);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
    ///////********************************************
    //*******************************************

    //**************************************************

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }
}
