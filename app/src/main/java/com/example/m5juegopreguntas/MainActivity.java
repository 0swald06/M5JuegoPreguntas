package com.example.m5juegopreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.m5juegopreguntas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        StartFragment startFragment= new StartFragment();


        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, startFragment).commit();
    }
}