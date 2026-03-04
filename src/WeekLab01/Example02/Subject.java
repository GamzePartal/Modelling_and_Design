package WeekLab01.Example02;

public class Subject {

    IService service;
    void callService(IService service){
        service.doSomething();
    }

}
