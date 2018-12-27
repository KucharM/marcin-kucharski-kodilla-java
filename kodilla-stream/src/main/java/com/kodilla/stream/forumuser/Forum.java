package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
<<<<<<< HEAD
=======

>>>>>>> 0c0da7baad286d90cad7106767461a6a3dad4abe
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(111, "jacek", 'M', 2000,
                12, 20, 1));
        forumUserList.add(new ForumUser(234, "janusz", 'M', 2000,
                5, 3, 99));
        forumUserList.add(new ForumUser(555, "marcin", 'M', 1988,
                6, 15, 222));
        forumUserList.add(new ForumUser(333, "jozek", 'M', 1990,
                9, 22, 78));
        forumUserList.add(new ForumUser(356, "romek", 'M', 1985,
                2, 10, 332));
        forumUserList.add(new ForumUser(278, "kasia", 'F', 1991,
                11, 8, 100));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
