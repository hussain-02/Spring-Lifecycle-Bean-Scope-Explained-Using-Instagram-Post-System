package com.example.SocialMedia;

public class SimpleUser implements User{
    String userName;
    PostList postList;
    @Override
    public void SetUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setPostList(PostList postList) {
        this.postList = postList;
    }

    @Override
    public PostList getPostList() {
        return postList;
    }
}
