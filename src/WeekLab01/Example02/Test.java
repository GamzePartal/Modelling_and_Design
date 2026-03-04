package WeekLab01.Example02;

public class Test {
    public static void main(String args[]){

        Subject subject =  new Subject();
        subject.callService(new ServiceClass());

        //local class
        class LocalService implements IService{
            @Override
            public void doSomething(){
                System.out.println("The local service is working");
            }
        };

        IService ls = new LocalService();
        subject.callService(ls);

        //Anonym class
        IService ac = new IService() {
            @Override
            public void doSomething() {
                System.out.println("The Anonym class is working");
            }
        };

        subject.callService(ac);

        //lambda expression
        IService lambdaService = () -> {
            System.out.println("The lambda class is working");
        };
        subject.callService(lambdaService);











    }
}
