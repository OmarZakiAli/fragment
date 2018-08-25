package com.examble.omar.fragment;


import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.examble.omar.fragment.DataWork.Player;
import com.examble.omar.fragment.DataWork.PlayerAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class F1 extends Fragment {


    F1Listner f1Listner;
static  int span = 1;
    List<Player> ls=new ArrayList<>();
    public F1() {

    }


    @Override
    public void onAttach(Context context) {

        f1Listner=(F1Listner) context;

        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewroot=inflater.inflate(R.layout.f1,container,false);

        RecyclerView recyclerView=viewroot.findViewById(R.id.rec);
        GridLayoutManager manager=new GridLayoutManager(getActivity(),span);
        recyclerView.setLayoutManager(manager);
      PlayerAdapter playerAdapter=new PlayerAdapter(getDataSource(),getActivity());
      recyclerView.setAdapter(playerAdapter);

        return viewroot;
    }


     static F1 getInstance(int spa) {

        F1 f1=new F1();
         span=spa;

        return f1;
    }

    public List<Player> getDataSource(){

        ls.add(new Player("cris",R.drawable.cris,"desc"));
        ls.add(new Player("salah",R.drawable.salah,"desc"));
        ls.add(new Player("messi",R.drawable.messi,"desc"));
        ls.add(new Player("naymar",R.drawable.neym,"desc"));
        ls.add(new Player("kroos",R.drawable.kroos,"desc"));
        ls.add(new Player("modric",R.drawable.modric,"desc"));
        ls.add(new Player("gotze",R.drawable.gotze,"desc"));
        ls.add(new Player("bogba",R.drawable.bogba,"desc"));
        ls.add(new Player("isco",R.drawable.isco,"desc"));
        ls.add(new Player("assensio",R.drawable.assen,"desc"));


        return ls;
    }




    public interface F1Listner{


        void onF1update(String s,int x,String y);


}


}
