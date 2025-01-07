
package javaapplication8;
import java.util.Scanner;
import java.util.ArrayList;
    
public class JavaApplication8 {
   
    static ArrayList <Students> stu = new ArrayList<>();
    static ArrayList <workers> wor = new ArrayList<>();
    static ArrayList <Instructor> ins = new ArrayList<>();
    static ArrayList <administrators> adm = new ArrayList<>();
    static ArrayList <technicians> tech = new ArrayList<>();
    
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
      
      System.out.println("to add student press 1");
      System.out.println("to show student information press 2");
      System.out.println("to remove any information of student  press 3");
      System.out.println("to edit any information of student press 4");
      System.out.println("to add Worker press 5");
      System.out.println("to show Worker information press 6");
      System.out.println("to remove any information of Worker press 7");
      System.out.println("to edit any information of Worker press 8");
      System.out.println("to add Instructor press 9");
      System.out.println("to show  information of Instructor press 10");
      System.out.println("to remove any information of Instructor press 11");
      System.out.println("to edit any information of Instructor press 12");
      System.out.println("to add Administrators press 13");
      System.out.println("to show Administrators information press 14");
      System.out.println("to remove any information of Administrators,  press 15");
      System.out.println("to edit any information of Administratorsm press 16");
      System.out.println("to add Technicians, press 17");
      System.out.println("to show Technicians information, press 18");
      System.out.println("to remove any information of Technicians,  press 19");
      System.out.println("to edit any information of Technicians, press 20");
      System.out.println("to end ,Press 0");
      
      int menu=input.nextInt();
      while(true){
          
          System.out.println("to add student press 1");
      System.out.println("to show student information press 2");
      System.out.println("to remove any information of student  press 3");
      System.out.println("to edit any information of student press 4");
      System.out.println("to add Worker press 5");
      System.out.println("to show Worker information press 6");
      System.out.println("to remove any information of Worker press 7");
      System.out.println("to edit any information of Worker press 8");
      System.out.println("to add Instructor press 9");
      System.out.println("to show  information of Instructor press 10");
      System.out.println("to remove any information of Instructor press 11");
      System.out.println("to edit any information of Instructor press 12");
      System.out.println("to add Administrators press 13");
      System.out.println("to show Administrators information press 14");
      System.out.println("to remove any information of Administrators,  press 15");
      System.out.println("to edit any information of Administratorsm press 16");
      System.out.println("to add Technicians, press 17");
      System.out.println("to show Technicians information, press 18");
      System.out.println("to remove any information of Technicians,  press 19");
      System.out.println("to edit any information of Technicians, press 20");
      System.out.println("to end ,Press 0");
          
          
          
          if (menu==1){
              //To add student
              Students s = new Students();
              s.setName(input.next());
              s.setAge(input.nextInt());
              s.setNational_id (input.nextInt[]);
              s.setId (input.nextInt());
              s.setPhoneNumber(input.nextInt[]);
              s.setAddress (input.next());
              s.setNationality(input.next());
              s.setGpa(input.nextFloat());
              s.setLevel(input.nextInt());
              s.setSpecialization(input.next());
              stu.add(s);
              
         if (menu==2){
             //display
             try{
             for(int i=0;i<stu.size();i++)
             {
                 Students t=stu.get(i);
                 System.out.println(t.toString());
             }  
             }
             catch(Exception e){
                 System.out.println("Error");
                 System.out.println("Wrong input data");
             }
         } 
         
         if(menu==3)
         {
             //remove
              try{
             System.out.println("Enter the student ID to you want to remove : ");
             int y = input.nextInt();
             for(int i=0;i<stu.size();i++)
             {
                 Students k=stu.get(i);
                 if (k.getId()==y){
                     stu.remove(k);
                     break;
                     
                 }
             }
              }
              catch(Exception e){
                 System.out.println("Error");
                 System.out.println("Wrong input data");
             }
             }
         } 
         
         if(menu==4){
         //edit
         try{
            System.out.println("Enter the student ID to edit it's information : ");
             int y=input.nextInt();
             for(int i=0;i<stu.size();i++)
             {
                 Students n=stu.get(i);
                 if (n.getId()==y){
                     n.setName(input.next());
                     n.setAge(input.nextInt());
                     n.setNational_id (input.nextInt());
                     n.setId(input.nextInt());
                     n.setPhoneNumber( input.nextInt());
                     n.setAddress (input.next());
                     n.setNationality(input.next());
                     n.setGpa(input.nextFloat());
                     n.setLevel(input.nextInt());
                     n.setSpecialization(input.next()); 
                     
                     break;
                     
                     
                 }
             }
         }
         catch(Exception e){
                 System.out.println("Error");
                 System.out.println("Wrong input data");
             }
         
         
         
         
         
         
         
         
         //worker
         
         if (menu==5){
              //To add worker
              workers w = new workers();
              w.setName(input.next());
              w.setAge(input.nextInt());
              w.setNational_id (input.nextInt());
              w.setId (input.nextInt());
              w.setPhoneNumber( input.nextInt());
              w.setAddress (input.next());
              w.setNationality(input.next());
              w.setJob(input.next());
              w.setSalary(input.nextDouble());
              
             wor.add(w);
              
             
             
         if (menu==6){
             //display
             try{
             for(int i=0;i<wor.size();i++)
             {
                 workers x=wor.get(i);
                 System.out.println(x.toString());
             }  
             }
             catch(Exception e){
                 System.out.println("Error");
                 System.out.println("Wrong input data");
             }
         } 
         
         
         
         if(menu==7)
         {
             //remove
              try{
             System.out.println("Enter the worker ID to you want to remove : ");
             int y = input.nextInt();
             for(int i=0;i<wor.size();i++)
             {
                 workers g=wor.get(i);
                 if (g.getId()==y){
                     wor.remove(g);
                     break;
                     
                 }
             }
              }
              catch(Exception e){
                 System.out.println("Error");
                 System.out.println("Wrong input data");
             }
             }
             } 
         
         
         
         if(menu==8){
         //edit
         try{
            System.out.println("Enter the worker ID to edit it's information : ");
             int y=input.nextInt();
             for(int i=0;i<wor.size();i++)
             {
                 workers h=wor.get(i);
                 if (h.getId()==y){
                     h.setName(input.next());
                     h.setAge(input.nextInt());
                     h.setNational_id (input.nextInt());
                     h.setId(input.nextInt());
                     h.setPhoneNumber( input.nextInt());
                     h.setAddress (input.next());
                     h.setNationality(input.next());
                     h.setJob(input.next());
                     h.setSalary(input.nextDouble());
                     
                     
                     break;
                     
                 }
             }
         }
         catch(Exception e){
                 System.out.println("Error");
                 System.out.println("Wrong input data");
             }
          }
                      
     
         
          }
                      
     
       
    }
    
      }}

