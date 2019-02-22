package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        TaskList doneList = board.getDoneList();
        TaskList inProgressList = board.getInProgressList();
        TaskList toDoList = board.getToDoList();

        doneList.getTasks().add("done");
        inProgressList.getTasks().add("in progress");
        toDoList.getTasks().add("to do");

        //Then
        System.out.println(doneList.getTasks());
        System.out.println(inProgressList.getTasks());
        System.out.println(toDoList.getTasks());
    }
}
