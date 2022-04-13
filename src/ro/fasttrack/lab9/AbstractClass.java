package ro.fasttrack.lab9;

/**
 * @author flo
 * @since 13.04.2022.
 */
public abstract class AbstractClass {
    public abstract void a1();
    public abstract int a2();
    public abstract double a3();

    public static void main(String[] args) {
        AbstractClass ac = new Child();
    }
}

abstract class Child2 extends AbstractClass {

    @Override
    public void a1() {

    }

    @Override
    public int a2() {
//        super.a2();
        return 0;
    }
}

class Child extends Child2 {

    @Override
    public void a1() {

    }

    @Override
    public int a2() {
        super.a2();
        return 0;
    }

    @Override
    public double a3() {
        return 0;
    }
}
