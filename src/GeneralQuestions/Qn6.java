abstract class Qn6_abstract{
    abstract protected void sayHello(); // abstract and protected, so user cant access it. But the child class can access this method. 


}


public class Qn6 extends Qn6_abstract{
        
    Qn6(){
        this.sayHello();
    }

    //Java Program to Show Abstraction in Class
    @Override
    protected void sayHello() {
        System.out.println("Java Program to Show Abstraction in Class -Hello from child class ");
    }



}


    

