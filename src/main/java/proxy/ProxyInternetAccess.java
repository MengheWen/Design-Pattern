package proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {

    private String employeeName;

    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grandInternetAccess() {
        if(getRole(employeeName) > 4){
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grandInternetAccess();
        }
        else {
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }

    public int getRole(String employeeName){
        return 9;
    }
}
