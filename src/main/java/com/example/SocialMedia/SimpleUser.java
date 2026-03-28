package com.example.SocialMedia;

public class SimpleUser implements User{
    String userName;
    PostList postList;

    public void init(){
        System.out.println("DB connection is Done");
    }

    public void destory(){
        System.out.println("All the resource are closed");
    }
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
