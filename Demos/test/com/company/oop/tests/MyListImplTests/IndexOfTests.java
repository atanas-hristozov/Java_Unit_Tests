package com.company.oop.tests.MyListImplTests;

import com.company.oop.MyList;
import com.company.oop.MyListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IndexOfTests {
    private MyList<Integer> list;

    @BeforeEach
    public void before() {
        list = new MyListImpl<>();

        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    public void should_ReturnIndex_When_ElementExists() {
        Assertions.assertEquals(1, list.indexOf(2));
    }

    @Test
    public void should_ReturnMinusOne_When_ElementNotExist() {
        Assertions.assertEquals(-1, list.indexOf(4));
    }
}
