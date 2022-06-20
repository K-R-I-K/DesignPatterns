package Proxy;

import java.util.ArrayList;

public class DataBase implements Proxy {

    ArrayList<String> db = new ArrayList<>();
    private boolean active;
    DataBase(){
        active = true;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public void setStatus(boolean b) {
        active = b;
    }

    @Override
    public boolean add(String info) {
        db.add(info);
        return true;
    }

    @Override
    public StringBuilder selectAll() {
        StringBuilder temp = new StringBuilder();
        for(String line : db){
            temp.append(line+"\n");
        }
        return temp;
    }

    @Override
    public boolean deleteAll() {
        db.clear();
        return true;
    }
}
