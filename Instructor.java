
package javaapplication8;
import java.util.ArrayList;

public class Instructor extends person {
    private double salary;
    private double yearlySalary;
    private int numberOfCourses;
   // private ArrayList<String> courses = new ArrayList<String>();

    public void setSalary(double salary) {
        boolean flag = true;
        do{
         this.salary = salary;
         try{
         if(salary>0);
         }catch(Exception e){
               System.out.println("This salary is invalid .");
               flag = false;
               System.out.println("Enter salary again .");
         }}while(false);
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        boolean flag = true;
        do{
        this.numberOfCourses = numberOfCourses;
         try{
         if(numberOfCourses>=0);
         }catch(Exception e){
               System.out.println("The number of courses is invalid .");
               flag = false;
               System.out.println("Enter number of courses again .");
         }}while(false);
    }
    
    public double getSalary() {
        return salary;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }
   
    public double Instructor1(double salary) {
        double raise;
        double yearlySalary;
        raise = salary*12*0.1;
        yearlySalary = salary*12 + raise;
        return yearlySalary;
    }
    
   @Override
    public String toString(){
        return super.toString()+ " The salary is :" + this.salary + " The yearly salary is :" + this.yearlySalary +
                " The number of courses is :" + numberOfCourses;
    }
}
