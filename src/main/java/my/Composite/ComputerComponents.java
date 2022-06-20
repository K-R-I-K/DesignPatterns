package Composite;

import AbstractFactory.VideoCard;

public enum ComputerComponents {

    CPU(300),
    VideoCard(230),
    RAM(130);

    private int price;

    ComputerComponents(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
