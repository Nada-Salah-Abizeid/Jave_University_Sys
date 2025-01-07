
package javaapplication8;
public class technicians extends person {
     private String job ;
    private double salary;
    private double yearly_salary;

    
    public void setJob(String job) {
        this.job = job;
    }

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

   
    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }

    public double getYearly_salary() {
        return yearly_salary;
    }

   
     public double technicians1(double salary){
         double raise;
         double yearlySalary;
        raise = salary*12*0.1;
        yearlySalary = salary*12 + raise;
        return yearlySalary;
     }
    

    @Override
    public String toString(){
        return super.toString()+ " The salary is :" + this.salary + " The yearly salary is :" + this.yearly_salary;
    }
}



    

