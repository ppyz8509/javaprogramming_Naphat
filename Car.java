public class Car {
    //Attributes  
    public int size;
    public String color;
    public String model;
    
    // Main method
    public static void main(String[] args) {
      //  moveBlackward();
      //  moveBlackward();
      //  stop();
      //  turnOnLight();
      //  turnOffLight();
      Car redCar = new Car();
      redCar.color = "red";
      redCar.model = "Benz";
      redCar.size  =  4;

      Car blueCar = new Car();
      blueCar.color = "blue";
      blueCar.model = "Supar";
      blueCar.size  =  2;

     /* System.out.println("Car color : " + redCar.color);
      System.out.println("Car model : " + redCar.model);
      System.out.println("Car size : " + redCar.size);*/
      redCar.moveFoorward();
     /* System.out.println("Car color : " + blueCar.color);
      System.out.println("Car model : " + blueCar.model);
      System.out.println("Car size : " + blueCar.size);*/
      blueCar.moveFoorward();
    

    }

    //Methods
    public  void moveFoorward(){
    System.out.println(this.color + " move Foorward");
}
    public  void moveBlackward(){
    System.out.println(this.color +" move Blackwar");
}
    public  void stop(){
    System.out.println(this.color +" stop");
}
    public  void turnOnLight(){
    System.out.println(this.color +" turnOnLight");
}
    public  void turnOffLight(){
    System.out.println(this.color +" turnOffLight");
}

}


