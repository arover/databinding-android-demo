package com.example.databindingdemo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.databindingdemo.BR;

import java.util.Date;

public class Movie extends BaseObservable {

   private String genre;
   private String imageUrl;
   private Date publicationDate;
   private String title;
   private int id;

   public Movie(int id) {
      this.id = id;
   }

   @Bindable
   public String getGenre() {
      return genre;
   }

   public Movie setGenre(String genre) {
      this.genre = genre;
      notifyPropertyChanged(BR.genre);
      return this;
   }

   @Bindable
   public String getImageUrl() {
      return imageUrl;
   }

   public Movie setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
      notifyPropertyChanged(BR.imageUrl);
      return this;
   }

   @Bindable
   public Date getPublicationDate() {
      return publicationDate;
   }

   public Movie setPublicationDate(Date publicationDate) {
      this.publicationDate = publicationDate;
      notifyPropertyChanged(BR.publicationDate);
      return this;
   }

   @Bindable
   public String getTitle() {
      return title;
   }

   public Movie setTitle(String title) {
      this.title = title;
      notifyPropertyChanged(BR.title);
      return this;
   }

   public int getId() {
      return id;
   }
}
