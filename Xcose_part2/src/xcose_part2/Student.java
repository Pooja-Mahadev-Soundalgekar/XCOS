/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xcose_part2;

/**
 *
 * @author Pooja M S
 */
//Student class 
public class Student {

    /**
     * @param args the command line arguments
     */
    private String name;
    private int roll_no;
    private int lang1;
    private int lang2;
    private int math;
    private int science;
    private int evs;
    
    public Student(String name,int roll_no, int lang1, int lang2, int math, int science, int evs) 
    {
            this.name = name;
            this.roll_no = roll_no;
            this.lang1 = lang1;
            this.lang2 = lang2;
            this.math = math;
            this.science = science;
            this.evs = evs;
    }
    
    public String getName()
    {
            return this.name;
    }
    public void setName(String name)
    {
            this.name = name;
    }
   
    public int getRollNo()
    {
            return this.roll_no;
    }
    public void setRollNo(int rollno)
    {
            this.roll_no = rollno;
    }
    
    public int getLang1()
    {
            return this.lang1;
    }
    public void setLang1(int lang1)
    {
            this.lang1 = lang1;
    }
    
    public int getLang2()
    {
            return this.lang2;
    }
    public void setLang2(int lang2)
    {
            this.lang2 = lang2;
    }
    
    public int getmath()
    {
            return this.math;
    }
    public void setmath(int maths)
    {
            this.math = maths;
    }
    
    public int getscience()
    {
            return this.science;
    }
    public void setscience(int science)
    {
            this.science = science;
    }
    
    public int getevs()
    {
            return evs;
    }
    public void setevs(int evs)
    {
            this.evs = evs;
    }
    
    public Integer getTotal()
    {
            return lang1+lang2+math+science+evs;
    }
}
