package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public void createNewPost(String title, String url) {
        postRepository.save(new Post(title, url));
    }

    public List<Post> findAll() {
        return (List<Post>) postRepository.findAll();
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
        List<Post> postList = findAll();
        return postList.stream().sorted(Comparator.comparing(Post::getRating).reversed()).collect(Collectors.toList());
    }

    public List<Integer> numberOfPages() {
        List<Integer> numbers = new ArrayList<>();
        List<Post> postList = (List<Post>) postRepository.findAll();
        int numberOfPosts = postList.size();
        int counter = 1;
        for (int i = 0; i < numberOfPosts; i++) {
            if (i % 2 == 0) {
                numbers.add(counter);
                counter++;
            }
        }
        return numbers;
    }

    public List<Post> postPerPage(Integer page) {
        List<Post> postList;
        postList = trendingPosts().stream().skip(page * 2).limit(2).collect(Collectors.toList());
        return postList;
    }
}
