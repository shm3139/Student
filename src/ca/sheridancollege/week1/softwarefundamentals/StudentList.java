/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author man-l
 */
public class StudentList {
    
    public static void main(String[] args) {
        
        Student[] sList=new Student[5];
        //instantiated and created an array at the same time, stating length
        
        for (int i = 0; i <= sList.length-1; i++) {          
        sList[i]=new Student(); 
        //set instantiation for each floor
        sList[i].setName("Student "+(i+1));
        }
        //for setter
        for (Student s:sList) {
            //set s and created for each loop from 1 to 5 with sList instantiation
            System.out.println("Student name is: "+ s.getName());           
        }
        //for getter, returning
    }
}
