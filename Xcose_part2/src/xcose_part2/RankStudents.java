//Name:Pooja Mahadev Soundalgekar
//National Institute of Technology Karnataka
//Input: Number of the students and then the details of the students
//Output:Number:Name in Ascending order of rank
//Resource:www.javapoint.com
//           www.w3schools.in

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xcose_part2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 *
 * @author Pooja M S
 */
public class RankStudents {
//array list for storing the student details
       private static ArrayList<Student> students;
       //array list for roll numbers to check that no duplicate roll numbers are entered
       private static ArrayList<Integer> roll_nos;
       public static void main(String[] args) throws Exception
       {
            System.out.print("Enter the number of students : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int numberOfStudents = Integer.parseInt(br.readLine());
            int i;
            students = new ArrayList();
            roll_nos = new ArrayList();
            for (i = 0 ;i < numberOfStudents;i++)
            {
                System.out.println("Enter the details of student "+ (i+1) + ":\n");
                String[] details = br.readLine().split(" ");
                String name = details[0];
                int roll_no = Integer.parseInt(details[1]);
                int lang1 = Integer.parseInt(details[2]);
                int lang2 = Integer.parseInt(details[3]);
                int math = Integer.parseInt(details[4]);
                int science = Integer.parseInt(details[5]);
                int evs = Integer.parseInt(details[6]);
                
                if(addStudent(name, roll_no, lang1, lang2, math, science, evs) == 0)
                    i--;
                
            }
            generateRankList();
            
       }
       //Search if the student already exists and if not then add the student to list of students
       private static int addStudent(String name, int roll_no, int lang1, int lang2, int math, int science, int evs)
       {
           if(Collections.binarySearch(roll_nos,roll_no)<0)
           {
                Student newStudent = new Student(name, roll_no, lang1, lang2, math, science, evs);
                students.add(newStudent);
                roll_nos.add(roll_no);
                return 1;
           }
           else
           {
               System.out.println("Roll Number is already taken");
               return 0;
           }
       }
       
       private static void generateRankList()
       {
          //standard comparing function to compare the marks to sort according to the conditions given in question
           Collections.sort(students, new Comparator() 
		{
			public int compare(Object o1, Object o2)
			{
				Student s1 = (Student)o1;
				Student s2 = (Student)o2;
				if ( compareInt(s1.getTotal(), s2.getTotal()) != 0 )
					return compareInt(s1.getTotal(), s2.getTotal());
				else if ( compareInt(s1.getmath(), s2.getmath()) != 0 )
					return compareInt(s1.getmath(), s2.getmath());
				else if ( compareInt(s1.getscience(), s2.getscience()) != 0 )
					return compareInt(s1.getscience(), s2.getscience());
				else if ( compareInt(s1.getevs(), s2.getevs()) != 0 )
					return compareInt(s1.getevs(), s2.getevs());
				else if ( compareInt(s1.getLang1(), s2.getLang1()) != 0)
					return compareInt(s1.getLang1(), s2.getLang1());
                                else if( compareInt(s1.getLang2(), s2.getLang2()) != 0)
					return compareInt(s1.getLang2(), s2.getLang2());
                                else
                                    return compareString(s1.getName(), s2.getName());
			}
		});
          
            for(Student student : students)
            {   
                System.out.println((students.indexOf(student)+ 1) + " : "+ student.getName());
            }
       }
       
       private static int compareInt(int o1,int o2)
       {
           if(o1 == o2)
               return 0;
           else if(o1 < o2)
               return 1;
           else
               return -1;
       }
       
       private static int compareString(String o1,String o2)
       {
           if(o1.equals(o2))
               return 0;
           else if(o1.compareTo(o2) < 0)
               return -1;
           else
               return 1;
       }
}
