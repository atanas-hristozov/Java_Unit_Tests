package com.company.oop.tests.MyListImplTests;

import com.company.oop.MyList;
import com.company.oop.MyListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RemoveTests {
    private MyList<Integer> list;

    @BeforeEach
    public void before() {
        list = new MyListImpl<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }

    @Test
    public void should_RemoveElement_When_ElementExists() {
        list.remove(2);

        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(3, list.get(1));
        Assertions.assertEquals(4, list.get(2));
    }

    @Test
    public void should_DecreaseSize_When_ElementExists() {
        list.remove(2);

        Assertions.assertEquals(3, list.size());
    }

    @Test
    public void should_ReturnTrue_When_ElementExists() {
        Assertions.assertEquals(true, list.remove(2));
    }

    @Test
    public void should_ReturnFalse_When_ElementNotExists() {
        Assertions.assertEquals(false, list.remove(5));
    }
}
