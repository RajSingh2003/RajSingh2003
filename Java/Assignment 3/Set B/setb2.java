


import java.io.*;
import java.util.*;

interface Products {
}

class Product implements Products {
    int id, quantity, cost;
    String name;
    public static int objectCount = 0;

    Product() {
        id = 0;
        name = null;
        quantity = 0;
        cost = 0;
    }

    Product(int id, String name, int quantity, int cost) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        objectCount++;
    }

    public void display() {
        System.out.print("\n" + id + "\t" + name + "\t" + quantity + "\t\t" + cost);
    }
}

class setb2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of products: ");
        int n = sc.nextInt();
        Product[] pr = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter product id: ");
            int r = sc.nextInt();
            System.out.print("Enter product name: ");
            String nm = sc.next();
            System.out.print("Enter product quantity: ");
            int q = sc.nextInt();
            System.out.print("Enter product cost: ");
            int c = sc.nextInt();

            pr[i] = new Product(r, nm, q, c);
        }

        System.out.print("\npr_id\tpr_name\tpr_quantity\tpr_cost");
        for (int i = 0; i < n; i++)
            pr[i].display();
        
        System.out.print("\n\nObject count: " + Product.objectCount);
    }
}
