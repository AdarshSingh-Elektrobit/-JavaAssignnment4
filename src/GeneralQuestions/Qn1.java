abstract class Qn1_Abstract {


abstract void abstractFn();

}


public class Qn1 extends Qn1_Abstract
{
    Qn1() {
        this.abstractFn();
    }

    @Override
    void abstractFn() {
        System.out.println("Hello from Child Class!");
    }
}
