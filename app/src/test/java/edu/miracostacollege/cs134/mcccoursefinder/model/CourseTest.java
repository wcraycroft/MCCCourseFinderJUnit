package edu.miracostacollege.cs134.mcccoursefinder.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest {

    private Course testCourse;

    @Before   // invoke before every test method
    public void setUp() throws Exception {
        testCourse = new Course("CS", "999", "Recursive Recursion");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getId() {
        assertEquals("Testing getId() method.", -1, testCourse.getId());
    }

    @Test
    public void setId() {
        testCourse.setId(321);
        assertEquals("Testing setId() method.", 321, testCourse.getId());
    }

    @Test
    public void getAlpha() {
        assertEquals("Testing getAlpha() method.", "CS", testCourse.getAlpha());
    }

    @Test
    public void getNumber() {
        assertEquals("Testing getNumber() method.", "999", testCourse.getNumber());
    }

    @Test
    public void getTitle() {
        assertEquals("Testing getTitle() method.", "Recursive Recursion", testCourse.getTitle());
    }

    @Test
    public void setTitle() {
        testCourse.setTitle("Recursive AI");
        assertEquals("Testing setTitle() method.", "Recursive AI", testCourse.getTitle());
    }

    @Test
    public void getFullName() {
    }

    @Test
    public void testToString() {
    }
}