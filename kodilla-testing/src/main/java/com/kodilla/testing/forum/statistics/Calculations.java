package com.kodilla.testing.forum.statistics;

public class Calculations {

    private Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsNumberPerUser;
    private double averageCommentsNumberPerUser;
    private double averageCommentsNumberPerPost;

    public Calculations(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averagePostsNumberPerUser = (double)statistics.postsCount() / statistics.usersNames().size();
        averageCommentsNumberPerUser = (double)statistics.commentsCount() / statistics.usersNames().size();
        averageCommentsNumberPerPost = (double)statistics.commentsCount() / statistics.postsCount();
    }

    public String showStatistics() {
        return "Number of users: " + numberOfUsers +
                "\nNumber of posts: " + numberOfPosts +
                "\nNumber of comments: " +numberOfComments +
                "\nAverage number posts per user: " + averagePostsNumberPerUser +
                "\nAverage number comments per user: " + averageCommentsNumberPerUser +
                "\nAverage number comments per post: " + averageCommentsNumberPerPost;
    }
}
