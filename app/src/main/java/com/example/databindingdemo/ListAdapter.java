package com.example.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databindingdemo.databinding.ListItemBinding;
import com.example.databindingdemo.model.Movie;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

   public static class ViewHolder extends RecyclerView.ViewHolder {
      private final ListItemBinding binding;

      ViewHolder(final ListItemBinding binding) {
         super(binding.getRoot());
         this.binding = binding;
      }
   }

   private final List<Movie> movies;
   private LayoutInflater layoutInflater;
   private View.OnClickListener onItemClickListener;

   public ListAdapter(List<Movie> movies) {
      this.movies = movies;
   }

   @Override
   public int getItemCount() {
      return movies.size();
   }

   @Override
   public void onBindViewHolder(ViewHolder viewHolder, int position) {
      Movie movie = movies.get(position);
      viewHolder.binding.setMovie(movie);
      viewHolder.binding.getRoot().setTag(movie);
      viewHolder.binding.setClicklistener(onItemClickListener);
   }

   @Override
   public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
      if (layoutInflater == null) {
         layoutInflater = LayoutInflater.from(viewGroup.getContext());
      }
      final ListItemBinding binding =
            DataBindingUtil.inflate(layoutInflater, R.layout.list_item, viewGroup, false);
      return new ViewHolder(binding);
   }

   public void setOnItemClickListener(View.OnClickListener onItemClickListener) {
      this.onItemClickListener = onItemClickListener;
   }
}
