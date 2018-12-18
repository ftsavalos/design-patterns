package design.disambiguation;

public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    public void getServiceType() {
        this.myService.getServiceType();
    }

}
