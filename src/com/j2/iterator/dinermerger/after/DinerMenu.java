package com.j2.iterator.dinermerger.after;
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 3;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
 
         addItem("크레이프케잌",
                "여러겹의 핫케잌층으로 이루어진 케잌", true, 1.99);
        addItem("딸기와플",
                "신선한 딸기가 올려진 와플", false, 1.99);
        addItem("블루베리와플",
                "직접 재배한 블루베리가 올려진 와플", false, 2.99);
   
 }
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
    // other menu methods here
}