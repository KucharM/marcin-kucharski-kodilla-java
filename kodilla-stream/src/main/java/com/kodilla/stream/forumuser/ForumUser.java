package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPublishedPosts;

    public ForumUser(final int userID, final String userName, final char sex,
                      int yearOfBirth, int monthOfBirth, int dayOfBirth, final int numberOfPublishedPosts) {

        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.numberOfPublishedPosts = numberOfPublishedPosts;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getNumberOfPublishedPosts() {
        return numberOfPublishedPosts;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPublishedPosts=" + numberOfPublishedPosts +
                '}';
    }
}
