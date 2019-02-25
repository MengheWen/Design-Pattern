package adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.print("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.print("I can only fly a short distance... ");
    }
}
