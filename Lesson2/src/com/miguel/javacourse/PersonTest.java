package com.miguel.javacourse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){
        Person miguel = new Person();
        assertEquals("Hello World",miguel.helloWorld() );
    }
    @Test
    public void shouldReturnHelloMarcus(){
        Person person = new Person();
        assertEquals("Hello Angel",person.hello("Angel"));
    }
    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1=new Person();
        Person person2=new Person();
        Person myPerson=new Person();
        assertEquals(3,Person.numberOfPersons());
    }
}
