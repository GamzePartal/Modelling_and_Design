package WeekLab01.Example01;

public class Test {
   public static void  main(String[] args){

        Car c = (SportCar)(new SportCar());

        ((SportCar)c).doubleSpeed();

        Factory f = new Factory();
        f.cars = new Car[]{new Car(), new SportCar(), new SedanCar()};
        System.out.println(f.getTotalPrice());
        System.out.println(f.getAdditionalPriceOfSportCar());









    }
}
