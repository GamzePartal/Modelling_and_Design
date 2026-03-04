package WeekLab02.Example01.Composition;

public class Vehicle {
    IColor icolor;
    Vehicle(IColor color){
        icolor= color;
    }

    void sayYourColor(){
        icolor.colorVehicle();
    }
}
