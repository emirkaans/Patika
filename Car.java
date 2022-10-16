class Car {

    //Nitelikler

    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    // Constructor Metot
    Car(String model, int speed, String color){
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit = 180;

    }

    //Overloading

    Car(){
        System.out.println("Boş Kurucu Metodu Oluştu!");
    }

    //Davranışlar

    void increaseSpeed(int increment){

        if((speed + increment) <= speedLimit){
            speed+=increment;
        }
    }
    int decreaseSpeed(int decrease){
        if(speed>0){
            speed-=decrease;
        }
        return speed;
    }

    void printSpeed(){
        System.out.println(model + " Hız : " + speed);
    }

    void printInfo(){
        System.out.println("Model \t:" + this.model);
        System.out.println("Color \t:" + this.color);
        System.out.println("Type \t:" + this.type);
        System.out.println("Speed \t:" + this.speed);

    }
}
