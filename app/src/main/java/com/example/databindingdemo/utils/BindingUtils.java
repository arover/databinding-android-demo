package com.example.databindingdemo.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class BindingUtils {

   @BindingAdapter ({"bind:imageUrl"})
   public static void loadImage(ImageView view, String url) {
      Glide.with(view.getContext()).load(url).centerCrop().into(view);
   }
}
