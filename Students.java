package javaapplication8;

public class Students extends person {
    private float gpa;
    private int level;
    private String Specialization;

    public void setGpa(float gpa) {
         boolean flag = true;
         do{
         this.gpa = gpa;
         try{
         if(gpa>=0&&gpa<=4);
         }catch(Exception e){
               System.out.println("This GPA is invalid .");
               flag = false;
               System.out.println("Enter GPA again .");
         }}while(false);
    }

    public void setLevel(int level) {
         boolean flag = true;
        do{
         this.level = level;
         try{
         if(level>0&&level<=4);
         }catch(Exception e){
               System.out.println("This level is invalid .");
               flag = false;
               System.out.println("Enter level again .");
         }}while(false);
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public float getGpa() {
        return gpa;
    }

    public int getLevel() {
        return level;
    }

    public String getSpecialization() {
        return Specialization;
    }   
    
    public void grade(float gpa){
        if (gpa>= 3.7f && gpa<4){
            System.out.println("Your rate is : A ");
        }
        else if(gpa>=2.7 && gpa<3.7){
            System.out.println("Your rate is : B ");
        }
        else if(gpa>=1.7 && gpa<2.7){
            System.out.println("Your rate is : C ");
        }
        else if(gpa>=1 && gpa<1.7){
            System.out.println("Your rate is : D ");
        }
        else if (gpa>=0 && gpa<1){
            System.out.println("Your rate is : F ");
        }
        else {
            System.out.println("Your GPA is invalid");
        }
        }
             
    @Override
    public String toString(){
        return super.toString()+ " Level : " + this.level + " GPA : " + this.gpa + " Specialization :" + this.Specialization;
    }
        }
    

