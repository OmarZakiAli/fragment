package com.examble.omar.fragment;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent =getIntent();


//
//        Toast.makeText(this,intent.getStringExtra("name"),Toast.LENGTH_LONG).show();
//       // Toast.makeText(this,intent.getStringExtra("image").toString(),Toast.LENGTH_LONG).show();
//        Toast.makeText(this,intent.getStringExtra("desc"),Toast.LENGTH_LONG).show();


      FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flay2,F2.getInstance(intent.getStringExtra("name"),intent.getIntExtra("image",R.drawable.cris),intent.getStringExtra("desc")));
        fragmentTransaction.commit();

    }
}
