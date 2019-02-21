package proxy;

public class ProxyPatternClient {

    public static void main(String[] args){
        OfficeInternetAccess access = new ProxyInternetAccess("Maggie Wen");
        access.grandInternetAccess();
    }

    // No Internet access granted. Your job level is below 5
}
