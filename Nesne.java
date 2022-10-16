public class Nesne {
    public static void main(String[] args) {

        Car audi = new Car("Audi",10,"Blue");
        audi.printInfo();

        Car mercedes = new Car();
        mercedes.model = "Mercedes";



        /*
        Car bmw = new Car();

        bmw.model = "BMW";
        bmw.speed = 15;
        bmw.increaseSpeed(60);
        bmw.decreaseSpeed(20);
        bmw.printSpeed();

        Car mercedes = new Car();

        mercedes.model = "Mercedes";
        mercedes.speed = 20;
        mercedes.increaseSpeed(80);
        mercedes.decreaseSpeed(20);
        mercedes.printSpeed();


         */
    }
}
