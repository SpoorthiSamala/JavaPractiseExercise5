package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentSorterTest {
    StudentSorter studentSorter;
    @Before
    public void setUp(){
        studentSorter=new StudentSorter();
    } //creating an object
    @Test
    public void givenListOfStudentsReturnsListSortingByAge(){
        List<Student> arrayList=new ArrayList<Student>();
        arrayList.add(new Student("111","Teju",21));
        arrayList.add(new Student("121","Teju",21));
        arrayList.add(new Student("131","Bindu",22));
        arrayList.add(new Student("130","spoorthi",22));
        arrayList.add(new Student("160","spoorthi",21));
        Collections.sort(arrayList,new StudentSorter());
        Collections.reverse(arrayList);
        List<Student> expected=new ArrayList<Student>();
        expected.add(new Student("130","spoorthi",22));
        expected.add(new Student("131","Bindu",22));
        expected.add(new Student("160","spoorthi",21));
        expected.add(new Student("121","Teju",21));
        expected.add(new Student("111","Teju",21));
        assertEquals(expected.toString(), arrayList.toString());
    }
    @Test
    public void givenListOfStudentsReturnsListSortingById(){
        List<Student> arrayList=new ArrayList<Student>();
        arrayList.add(new Student("111","Spoorthi",20));
        arrayList.add(new Student("121","Teju",21));
        arrayList.add(new Student("131","Bindu",22));
        arrayList.add(new Student("135","Teju",21));
        arrayList.add(new Student("129","Bindu",22));
        Collections.sort(arrayList,new StudentSorter());
        Collections.reverse(arrayList);
        List<Student> expected=new ArrayList<Student>();
        expected.add(new Student("131","Bindu",22));
        expected.add(new Student("129","Bindu",22));
        expected.add(new Student("135","Teju",21));
        expected.add(new Student("121","Teju",21));
        expected.add(new Student("111","Spoorthi",20));
        assertEquals(expected.toString(), arrayList.toString());
    }
    @After
    public void tearDown()
    {
        studentSorter=null;
    }

}