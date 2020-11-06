package com.abhitech.sa;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MoneyFragment extends Fragment {
    ImageView image1,image2,image3,image4;
    public MoneyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_money, container, false);
        image1=v.findViewById(R.id.image1);
        image2=v.findViewById(R.id.image2);
        image3=v.findViewById(R.id.image3);
        image4=v.findViewById(R.id.image4);


        return v;
    }
}
