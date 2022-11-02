package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expectedGender = "";
        Integer expectedPhone = Integer.MAX_VALUE;
        String expectedCity = "";
        String expectedState = "";
        Integer expectedId = Integer.MAX_VALUE;
        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualGender = person.getGender();
        Integer actualPhone = person.getPhone();
        String actualCity = person.getCity();
        String actualState = person.getState();
        Integer actualId = person.getId();


        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedPhone, actualPhone);
        Assert.assertEquals(expectedCity, actualCity);
        Assert.assertEquals(expectedState, actualState);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGender() {
        //Given
        Person person = new Person();
        String expected = "male";

        //When
        person.setGender(expected);
        String actual = person.getGender();

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetPhone() {
        //Given
        Person person = new Person();
        Integer expected = 843-632-4328;

        //When
        person.setPhone(expected);
        Integer actual = person.getPhone();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetCity() {
        //Given
        Person person = new Person();
        String expected = "Manhattan";

        //When
        person.setCity(expected);
        String actual = person.getCity();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetState() {
        //Given
        Person person = new Person();
        String expected = "New York";

        //When
        person.setState(expected);
        String actual = person.getState();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetId() {
        //Given
        Person person = new Person();
        Integer expected = 234563432;

        //When
        person.setId(expected);
        Integer actual = person.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
