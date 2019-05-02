package edu.miracostacollege.cs134.mcccoursefinder.model;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.ContentHandler;

import static org.junit.Assert.*;

public class DBHelperTest {

    private static DBHelper mDB;
    private static Context mContext;

    private Course testCourse;

    @BeforeClass
    public static void setUp() throws Exception {
        mContext = InstrumentationRegistry.getTargetContext();
        mDB = new DBHelper(mContext);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
    }

    @Test
    public void onUpgrade() {
    }

    @Test
    public void addCourse() {
        mDB.deleteAllCourses();
        testCourse = new Course("CS", "999", "Recursive Recursion");
        mDB.addCourse(testCourse);
        // Asset that size is now 1
        assertEquals("Testing size of database for addCourse().", 1, mDB.getAllCourses().size());
        assertEquals("Testing the id of the testCourse.", 1, testCourse.getId());

        Course testCourseDB = mDB.getCourse(1);
        assertEquals("Testing the Course object is equals.", testCourse, testCourseDB);
    }

    @Test
    public void getAllCourses() {
    }

    @Test
    public void deleteCourse() {
    }

    @Test
    public void deleteAllCourses() {
    }

    @Test
    public void updateCourse() {
    }

    @Test
    public void getCourse() {
    }

    @Test
    public void addInstructor() {
    }

    @Test
    public void getAllInstructors() {
    }

    @Test
    public void deleteInstructor() {
    }

    @Test
    public void deleteAllInstructors() {
    }

    @Test
    public void updateInstructor() {
    }

    @Test
    public void getInstructor() {
    }

    @Test
    public void addOffering() {
    }

    @Test
    public void getAllOfferings() {
    }

    @Test
    public void deleteOffering() {
    }

    @Test
    public void deleteAllOfferings() {
    }

    @Test
    public void updateOffering() {
    }

    @Test
    public void getOffering() {
    }

    @Test
    public void importOfferingsFromCSV() {
    }

    @Test
    public void importCoursesFromCSV() {
    }

    @Test
    public void importInstructorsFromCSV() {
    }
}