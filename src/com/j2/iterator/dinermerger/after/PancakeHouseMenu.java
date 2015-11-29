package com.j2.iterator.dinermerger.after;

import java.util.ArrayList;


public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
    
           addItem("크레이프케잌",
                "여러겹의 핫케잌층으로 이루어진 케잌", true, 1.99);
        addItem("딸기와플",
                "신선한 딸기가 올려진 와플", false, 1.99);
        addItem("블루베리와플",
                "직접 재배한 블루베리가 올려진 와플", false, 2.99);
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    public String toString() {
        return "Objectville Pancake House Menu";
    }
    // other menu methods here
}