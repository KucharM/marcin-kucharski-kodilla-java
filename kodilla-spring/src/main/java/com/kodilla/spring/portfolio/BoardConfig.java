package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("todo")
    TaskList toDoTask;

    @Autowired
    @Qualifier("inprog")
    TaskList inProgTask;

    @Autowired
    @Qualifier("done")
    TaskList doneTask;

    @Bean
    public Board board() {
        return new Board(toDoTask, inProgTask, doneTask);
    }

    @Bean("todo")
    @Scope("prototype")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean("inprog")
    @Scope("prototype")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean("done")
    @Scope("singleton")
    public TaskList doneList() {
        return new TaskList();
    }
}
