interface Qn3_interface{
    int a = 1;
    void sayHello();
}

public class Qn3 implements Qn3_interface{

    Qn3()
    {
        this.sayHello();
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from class!");
    }
}
