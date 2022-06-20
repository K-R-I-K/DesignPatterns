package Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Application.init();
        DataBaseProxy dataBaseProxy = Application.getDataBaseProxy();
        dataBaseProxy.add("LOL");
        dataBaseProxy.add("apple");
        dataBaseProxy.add("pear");

        dataBaseProxy.setStatus(false);
        dataBaseProxy.deleteAll();
        dataBaseProxy.setStatus(true);
        System.out.println(dataBaseProxy.selectAll());
    }
}
