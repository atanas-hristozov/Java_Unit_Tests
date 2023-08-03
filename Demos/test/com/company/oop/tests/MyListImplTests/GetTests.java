package com.company.oop.tests.MyListImplTests;

import com.company.oop.MyList;
import com.company.oop.MyListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GetTests {
    private MyList<Integer> list;

    @BeforeEach
    public void before() {
        list = new MyListImpl<>();

        list.add(3);
        list.add(2);
        list.add(7);
        list.add(5);
    }

    @Test
    public void should_ReturnElement_When_ElementExists() {
        Assertions.assertEquals(7, list.get(2));
    }

    @Test
    public void should_ThrowException_When_ElementNotExists() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(4));
    }

    @Test
    public void should_ThrowException_When_InvalidIndex() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(-3));
    }
}
