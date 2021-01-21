package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts() {
        return (List<Post>) postRepository.findAll();
    }

    public void createNewPost(String title, String url) {
        postRepository.save(new Post(title, url));
    }

    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    public void upvote(Optional<Post> post) {
        post.ifPresent(x -> x.setRating(x.getRating() + 1));
        post.ifPresent(postRepository::save);
    }

    public void downvote(Optional<Post> post) {
        post.ifPresent(x -> x.setRating(x.getRating() - 1));
        post.ifPresent(postRepository::save);
    }

    public List<Post> trendingPosts() {
        List<Post> postList = (List<Post>) postRepository.findAll();
        return postList.stream().sorted(Comparator.comparing(Post::getRating).reversed()).collect(Collectors.toList());
    }
}
