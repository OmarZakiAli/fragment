package com.examble.omar.fragment;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import com.examble.omar.fragment.DataWork.Player;
import com.examble.omar.fragment.DataWork.PlayerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements F1.F1Listner {

    F1 f1=F1.getInstance(1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.flay,f1);
        fragmentTransaction.commit();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }



    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getItemId()==R.id.item_lin){

            f1=F1.getInstance(1);

            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.flay,f1);
            fragmentTransaction.commit();

        }


        else if(item.getItemId()==R.id.item_grid){

            f1=F1.getInstance(2);

            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.flay,f1);
            fragmentTransaction.commit();
        }



        return super.onOptionsItemSelected(item);
    }


    public void onF1update(String s, int x, String y) {


        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("name",s);
        intent.putExtra("image",x);
        intent.putExtra("desc",y);
startActivity(intent);

    }





}
