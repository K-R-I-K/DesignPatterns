package Proxy;

public class DataBaseProxy implements Proxy {

    private DataBase dataBase;
    DataBaseProxy(DataBase dataBase){
        this.dataBase = dataBase;
    }

    @Override
    public boolean isActive() {
        return dataBase.isActive();
    }

    @Override
    public boolean add(String info) {
        if(dataBase.isActive()) {
            if (info.charAt(0) >= 97 && info.charAt(0) <= 122) {
                return dataBase.add(info);
            }
        }
        return false;
    }

    @Override
    public void setStatus(boolean b) {
        dataBase.setStatus(b);
    }

    @Override
    public StringBuilder selectAll() {
        if (dataBase.isActive()){
            return dataBase.selectAll();
        }
        return null;
    }

    @Override
    public boolean deleteAll() {
        if (dataBase.isActive()){
            return dataBase.deleteAll();
        }
        return false;
    }
}
