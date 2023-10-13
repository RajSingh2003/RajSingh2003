

import java.io.*;
import java.util.*;

abstract class Order {
    public int id;
    public String description;
}

class Purchase extends Order {
    String customerName;

    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.print("\nEnter id: ");
        super.id = sc.nextInt();
        System.out.print("Enter description: ");
        super.description = sc.next();
        System.out.print("Enter customer name: ");
        customerName = sc.next();
    }

    public void display() {
        System.out.print("\n" + id + "\t" + description + "\t\t" + customerName);
    }
}

class Sales extends Order {
    String vendorName;

    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.print("\nEnter id: ");
        super.id = sc.nextInt();
        System.out.print("Enter customer name: ");
        super.description = sc.next();
        System.out.print("Enter vendor name: ");
        vendorName = sc.next();
    }

    public void display() {
        System.out.print("\n" + id + "\t" + description + "\t\t" + vendorName);
    }
}

class setb1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of purchase and sales orders: ");
        int n = sc.nextInt();
        Purchase[] pl = new Purchase[n];
        Sales[] s = new Sales[n];

        for (int i = 0; i < n; i++) {
            pl[i] = new Purchase();
            pl[i].accept();
        }

        System.out.println("\nPurchase order details:");
        System.out.println("\nid\tdescription\tcust_name");
        for (int i = 0; i < n; i++)
            pl[i].display();

        System.out.println("\nSales order:");
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            s[i] = new Sales();
            s[i].accept();
        }

        System.out.println("\nSales order details:");
        System.out.println("\nid\tcust_name\tvendor_name");
        for (int i = 0; i < n; i++)
            s[i].display();
    }
}
