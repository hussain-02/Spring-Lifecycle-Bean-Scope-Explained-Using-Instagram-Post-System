package com.example.SocialMedia;

public interface User {

    void SetUserName(String userName);

    String getUserName();

    void setPostList(PostList postList);

    PostList getPostList();
}
