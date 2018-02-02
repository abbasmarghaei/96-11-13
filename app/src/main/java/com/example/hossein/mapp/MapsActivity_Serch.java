package com.example.hossein.mapp;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapsActivity_Serch extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapsda);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
     //   Toast.makeText(MainActivity.con, MainActivity.citytype, Toast.LENGTH_SHORT).show();
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(32.679898, 51.691757);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        ;  LatLng sydney5 = new LatLng(32.698799, 51.507501);
        LatLng sydney1 = new LatLng(32.698701, 51.509268);
      //  mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        Address add=adrees(MyLocationActivity.citytype);
       LatLng tt = new LatLng(add.getLatitude(),add.getLongitude());
        LatLng ttt = new LatLng(add.getLatitude()+0.003000,add.getLongitude());
        LatLng ttt1 = new LatLng(add.getLatitude()+0.006000,add.getLongitude());
        mMap.addMarker(new MarkerOptions().position(ttt1).icon(BitmapDescriptorFactory.fromResource(R.drawable.markkk)).title("Marker in Sydney"));

        mMap.addMarker(new MarkerOptions().position(tt).icon(BitmapDescriptorFactory.fromResource(R.drawable.markkk)).title("lat"+add.getLatitude()+"lan"+add.getLongitude()+""));
        mMap.addMarker(new MarkerOptions().position(ttt).icon(BitmapDescriptorFactory.fromResource(R.drawable.markkk)).title("Marker in Sydney"));

        //LatLng tt = new LatLng(add.getLatitude(),add.getLongitude());
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tt, 15));

    }
    public Address adrees(String adresss)
    {
        Geocoder ge=new Geocoder(this);
        List<Address> list=null;
        try {
            list=ge.getFromLocationName(adresss,1);
            if (list.size()>0)
            {
                Address add =list.get(0);
                return add;
            }
            else
                return null;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
