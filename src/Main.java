public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");

        // Accessing make and model using getter methods
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());

        // Changing the make using setter method
        myCar.setMake("Honda");
        System.out.println("New Make: " + myCar.getMake());
    }
}