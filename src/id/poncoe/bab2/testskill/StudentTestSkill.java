/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab2.testskill;

/**
 *
 * @author poncoe
 */
public class StudentTestSkill {
    
    String name;
    long studentId;
    Boolean isMale;
    double grade;
    
    public StudentTestSkill(String namee, long studentIdd, boolean isMalee, double gradee){
        this.name=namee;
        this.studentId=studentIdd;
        this.isMale=isMalee;
        this.grade=gradee;
    }
    
    public StudentTestSkill(String nameee, long studentIddd, boolean isMaleee){
        this.name=nameee;
        this.studentId=studentIddd;
        this.isMale=isMaleee;
    }
    
    public StudentTestSkill(String nameeee, long studentIdddd){
        this.name=nameeee;
        this.studentId=studentIdddd;
    }
    
    public void display() {
        System.out.println("Name: "+name);
        System.out.println("StudentID: "+studentId);
        if(isMale) {
            System.out.println("Sex: Male");
        } else {
            System.out.println("Sex: Female");
        }
        System.out.println("Grade: "+grade);
    }
    
    public static void main (String[] agrs){
        StudentTestSkill s1 = new StudentTestSkill("Max",321032,true,3.7);
        StudentTestSkill s2 = new StudentTestSkill("Anny",23331,true);
        StudentTestSkill s3 = new StudentTestSkill("Bobby",22122);
        System.out.println("Student 1");
        s1.display();
        System.out.println("");
        System.out.println("Student 2");
        s2.display();
        System.out.println("");
        System.out.println("Student 3");
        s3.display();
    }
    
}
