package WeekLab02.Example01.Composition;

public class Text {
    public static void main(String[] args) {

        Vehicle car =  new Car(new IColorBlue());
        car.sayYourColor();

        Vehicle car2 = new Bicycle(() -> System.out.println("ı have red color"));
        car2.sayYourColor();





    }
}
