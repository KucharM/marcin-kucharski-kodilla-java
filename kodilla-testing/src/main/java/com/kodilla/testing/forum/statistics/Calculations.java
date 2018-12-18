package com.kodilla.testing.forum.statistics;

public class Calculations {

    private Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private int averagePostsNumberPerUser;
    private int averageCommentsNumberPerUser;
    private int averageCommentsNumberPerPost;

    public Calculations(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        this.averagePostsNumberPerUser = calculateAvgPostNumberPerUser();
        this.averageCommentsNumberPerUser = calculateAvgCommentsNumberPerUser();
        this.averageCommentsNumberPerPost = calculateAvgCommentsPerPost();
    }

    private int calculateAvgPostNumberPerUser() {
        if (statistics.usersNames().size() > 0)
            return statistics.postsCount() / statistics.usersNames().size();
        else
            return 0;
    }

    private int calculateAvgCommentsNumberPerUser() {
        if (statistics.usersNames().size() > 0)
            return statistics.commentsCount() / statistics.usersNames().size();
        else
            return 0;
    }

    private int calculateAvgCommentsPerPost() {
        if (statistics.postsCount() > 0)
            return statistics.commentsCount() / statistics.postsCount();
        else
            return 0;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getAveragePostsNumberPerUser() {
        return averagePostsNumberPerUser;
    }

    public int getAverageCommentsNumberPerUser() {
        return averageCommentsNumberPerUser;
    }

    public int getAverageCommentsNumberPerPost() {
        return averageCommentsNumberPerPost;
    }

    public String showStatistics() {
        return "Number of users: " + this.numberOfUsers +
                "\nNumber of posts: " + this.numberOfPosts +
                "\nNumber of comments: " + this.numberOfComments +
                "\nAverage number posts per user: " + this.averagePostsNumberPerUser +
                "\nAverage number comments per user: " + this.averageCommentsNumberPerUser +
                "\nAverage number comments per post: " + this.averageCommentsNumberPerPost;
    }
}
