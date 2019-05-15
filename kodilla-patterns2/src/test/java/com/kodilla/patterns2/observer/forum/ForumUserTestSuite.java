package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaTollsForum = new JavaToolsForumTopic();
        ForumUser john = new ForumUser("john");
        ForumUser ivone = new ForumUser("ivone");
        ForumUser jessie = new ForumUser("jessie");

        javaHelpForum.registerObserver(john);
        javaHelpForum.registerObserver(jessie);
        javaTollsForum.registerObserver(ivone);
        javaTollsForum.registerObserver(jessie);

        //When
        javaHelpForum.addPost("help with the loop");
        javaHelpForum.addPost("using while loop");
        javaTollsForum.addPost("mysql problem");
        javaTollsForum.addPost("git command");
        javaHelpForum.addPost("for loop insteed");

        //Then
        Assert.assertEquals(3, john.getUpdateCount());
        Assert.assertEquals(2, ivone.getUpdateCount());
        Assert.assertEquals(5, jessie.getUpdateCount());
    }
}
