package com.stackroute.junit;

import java.util.Comparator;

class StudentSorter implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        if (a.getAge() == b.getAge())  //checking if age is equal
        {
            if (a.getName().equals(b.getName()))  //checking if names are equal
            {
                return a.getId().compareTo(b.getId()); //comparing based on id's
            } else
                return a.getName().compareTo(b.getName()); //comparing based on names

        }
        else
            return a.getAge() - b.getAge(); //comparing based on age
    }

}