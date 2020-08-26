package br.com.zuphub;

import java.time.LocalDate;

public class Post {
    private String postImage;
    private String postTitle;
    private String postText;
    private String postAuthor;
    private LocalDate createdAt;
    private long id;

    public Post(String postImage, String postTitle, String postText, String postAuthor, LocalDate createdAt, long id) {
        this.postImage = postImage;
        this.postTitle = postTitle;
        this.postText = postText;
        this.postAuthor = postAuthor;
        this.createdAt = createdAt;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}


