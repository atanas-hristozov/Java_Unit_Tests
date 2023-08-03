package com.company.oop.tests.MyListImplTests;

import com.company.oop.MyList;
import com.company.oop.MyListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructorTests {
    @Test
    public void should_CreateEmptyList() {
        MyList<Integer> list = new MyListImpl<>();

        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void should_UseDefaultCapacity() {
        MyList<Integer> list = new MyListImpl<>();

        Assertions.assertEquals(5, list.capacity());
    }

    @Test
    public void should_UseCustomCapacity_When_Specified() {
        MyList<Integer> list = new MyListImpl<>(10);

        Assertions.assertEquals(10, list.capacity());
    }
}
