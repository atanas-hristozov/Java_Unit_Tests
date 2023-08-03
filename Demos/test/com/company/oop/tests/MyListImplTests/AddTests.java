package com.company.oop.tests.MyListImplTests;

import com.company.oop.MyList;
import com.company.oop.MyListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddTests {
    private MyList<Integer> list;
    @BeforeEach
    public void initList(){
        list = new MyListImpl<>();
    }
    @Test
    public void constructor_Should_CreateEmptyList(){
//        MyList<Integer> list = new MyListImpl<>();
        Assertions.assertEquals(0,list.size());
    }
    @Test
    public void constructor_Should_UseDefaultCapacity(){
//        MyList<Integer> list = new MyListImpl<>();
        Assertions.assertEquals(5,list.capacity());
    }

    @Test
    public void get_Should_ThrowException_When_InvalidIndex(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()-> list.get(-3));
    }

    @Test
    public void constructor_Should_UseCustomCapacity_When_Specify(){
        MyList<Integer> list = new MyListImpl<>(5);
        Assertions.assertEquals(5,list.capacity());
    }

    @Test
    public void should_StoreElement_When_SingleElement() {
        MyList<Integer> myList = new MyListImpl<>();

        myList.add(5);

        Assertions.assertEquals(5, myList.get(0));
    }

    @Test
    public void should_StoreElement_When_MultipleElements() {
        MyList<Integer> myList = new MyListImpl<>();

        myList.add(5);
        myList.add(3);
        myList.add(7);

        Assertions.assertEquals(5, myList.get(0));
        Assertions.assertEquals(3, myList.get(1));
        Assertions.assertEquals(7, myList.get(2));
    }

    @Test
    public void should_UpdateSize_When_SingleElement() {
        MyList<Integer> myList = new MyListImpl<>();

        myList.add(5);

        Assertions.assertEquals(1, myList.size());
    }

    @Test
    public void should_UpdateSize_When_MultipleElements() {
        MyList<Integer> myList = new MyListImpl<>();

        myList.add(5);
        myList.add(3);
        myList.add(7);

        Assertions.assertEquals(3, myList.size());
    }

    @Test
    public void should_Resize_When_SizeReachCapacity() {
        MyList<Integer> myList = new MyListImpl<>(2);

        myList.add(1);
        myList.add(2);
        myList.add(3);

        Assertions.assertTrue(myList.capacity() > 2);
    }
}
