package com.examble.omar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class F2 extends Fragment {

String name;
int image;
String desc;
    public F2() {

    }

    public static F2 getInstance(String name,int image,String desc) {

        F2 f2=new F2();
        f2.name=name;
        f2.image=image;
        f2.desc=desc;

        return  f2;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View viewroot= inflater.inflate(R.layout.f2,container,false);
        ImageView imageView=viewroot.findViewById(R.id.imsf2);
        TextView tname=viewroot.findViewById(R.id.namef2);
        TextView tdes=viewroot.findViewById(R.id.descf2);

        imageView.setImageResource(image);
        tname.setText(name);
        tdes.setText(desc);

        return viewroot;
    }

}
