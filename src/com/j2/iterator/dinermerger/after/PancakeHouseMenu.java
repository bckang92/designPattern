package com.j2.iterator.dinermerger.after;

import java.util.ArrayList;


public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
    
           addItem("ũ�������ɟ�",
                "�������� ���ɟ������� �̷���� �ɟ�", true, 1.99);
        addItem("�������",
                "�ż��� ���Ⱑ �÷��� ����", false, 1.99);
        addItem("��纣������",
                "���� ����� ��纣���� �÷��� ����", false, 2.99);
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