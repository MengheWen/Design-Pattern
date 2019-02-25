package adapter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.print("Quack");
    }

    @Override
    public void fly() {
        System.out.print("I am flying");
    }
}
