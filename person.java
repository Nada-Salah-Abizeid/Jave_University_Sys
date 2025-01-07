
package javaapplication8;
public class person {
   private String name;
   private int age;
   private int [] national_id = new int[14];
   private int [] phoneNumber = new int [11];
   private int id;
   private String address;
   private String nationality ;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        boolean flag = true;
        do{
         this.age = age;
         try{
         if(age>17&&age<=60);
         //{flag = true;}
         }catch(Exception e){
               System.out.println("This age is invalid .");
               flag = false;
               System.out.println("Enter age again .");
         }}while(false);
    }

    public void setNational_id(int[] national_id) {
        boolean flag = true;
        do{
        this.national_id = national_id;
        try{
        if(national_id.length==14);
         }catch(Exception e){
               System.out.println("This National ID is invalid .");
               flag = false;
               System.out.println("Enter National ID again .");
         }}while(false);
    }

   

    public void setPhoneNumber(int[] phoneNumber) {
         boolean flag = true;
       do{
        this.phoneNumber = phoneNumber;
        try{
        if(phoneNumber.length==11);
         }catch(Exception e){
               System.out.println("This Pthone number is invalid .");
               flag = false;
               System.out.println("Enter Pthone number again .");
         }}while(false);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int[] getNational_id() {
        return national_id;
    }

    public int[] getPhoneNumber() {
        return phoneNumber;
    }

        public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

    public int getId() {
        return id;
    }
    
   
   public String toString(){
       return "Name :" + this.name + "Age :" + this.age + "National ID :" + this.national_id + "Phone number :" + this.phoneNumber
               + "ID :" + this.id  + "Address :" + this.address +"Nationality : "+ this.nationality;
   }
}

