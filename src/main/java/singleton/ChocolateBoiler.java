package singleton;

public class ChocolateBoiler {

    private boolean empty;

    private boolean boiled;

    private static ChocolateBoiler uniqueChocolateBoiler;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(uniqueChocolateBoiler == null){
            uniqueChocolateBoiler = new ChocolateBoiler();
        }
        return uniqueChocolateBoiler;
    }

}
