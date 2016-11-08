package com.example.databindingdemo.utils;

import android.os.AsyncTask;

import com.example.databindingdemo.model.Movie;

public class ModifyInBackgroundTask extends AsyncTask<Movie, Void, Void> {
   @Override
   protected Void doInBackground(Movie... movies) {
      for (Movie movie : movies) {
         movie.setTitle(movie.getTitle() + " modified");
      }
      return null;
   }
}
