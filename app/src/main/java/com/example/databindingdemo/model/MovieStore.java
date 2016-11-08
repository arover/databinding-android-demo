package com.example.databindingdemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovieStore {

    private static List<Movie> ALL_MOVIES;

    public static List<Movie> getAllMovies() {
        return ALL_MOVIES;
    }

    static {
        ALL_MOVIES = new ArrayList<>(20);
        ALL_MOVIES.add(new Movie(0).setTitle("星际迷航3：超越星辰").setGenre("科幻")
                .setPublicationDate(new Date(821923200000L))
                .setImageUrl("https://img3.doubanio.com/view/photo/photo/public/p2377612906.jpg"));
        ALL_MOVIES.add(new Movie(1).setTitle("超凡蜘蛛侠2").setGenre("动作 / 科幻 / 冒险")
                .setPublicationDate(new Date(1341360000000L))
                .setImageUrl("https://img3.doubanio.com/view/photo/photo/public/p2173636903.jpg"));
        ALL_MOVIES.add(new Movie(2).setTitle("奇异博士").setGenre("动作 / 科幻 / 奇幻 / 冒险")
                .setPublicationDate(new Date(678326400000L))
                .setImageUrl("https://img3.doubanio.com/view/photo/photo/public/p2368517405.jpg"));
        ALL_MOVIES.add(new Movie(3).setTitle("复仇者联盟2：奥创纪元").setGenre("动作")
                .setPublicationDate(new Date(1430438400000L)).setImageUrl(
                        "https://img1.doubanio.com/view/photo/photo/public/p2243579957.jpg"));
        ALL_MOVIES.add(new Movie(4).setTitle("蜡笔小新：梦境世界大突击").setGenre("动画")
                .setPublicationDate(new Date(1423180800000L))
                .setImageUrl("https://img1.doubanio.com/view/photo/photo/public/p2394332387.jpg"));
    }
}
