public class Student {
     //Attributes  
     public String name;
     public int age;
     public String group;
     // Main method
    public static void main(String[] args) {
        Student naphat = new Student();
      /*  naphat.name ="Naphat";
        naphat.age  = 20;
        naphat.group = "64/46";*/
        naphat.setData("Naphat", 20, "64/46");
        naphat.getData();
        /*naphat.printName();
        naphat.printage();
        naphat.printgroup();*/
    }
    
    public void setData(String name, int age,String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public void getData(){
        System.out.println(this.name + " is " + this.age + "years old and is in Group" + this.group);
    }
     //Methods
    public void printName(){
        System.out.println(" Student Name :" +this.name);
    }
        public void printage(){
        System.out.println(" Student Age :"+this.age);
    }
        public void printgroup(){
        System.out.println(" Student Grop :"+this.group);
    }
}
