package com.example.databindingdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.databindingdemo.databinding.ActivityHelloWorldBinding;
import com.example.databindingdemo.model.Greeting;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityHelloWorldBinding binding = DataBindingUtil.setContentView(this, R
                .layout.activity_hello_world);
        binding.setGreeting(new Greeting());
        binding.greetingBanner.setTextColor(Color.RED);
    }
}
