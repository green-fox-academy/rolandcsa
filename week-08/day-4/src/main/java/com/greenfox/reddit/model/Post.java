package com.greenfox.reddit.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String url;
    private Integer rating = 0;

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
    }
    public void increaseRating(Post post){
        post.setRating(rating++);
    }
}
