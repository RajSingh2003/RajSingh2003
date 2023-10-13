 

import java.io.*;
import java.util.*;

abstract class Staff {
    protected int id;
    protected String name;

    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class OfficeStaff extends Staff {
    String deptName;

    OfficeStaff(int id, String name, String deptName) {
        super(id, name);
        this.deptName = deptName;
        
    }

    public void display() {
        
            System.out.print("\n" + id + "\t" +name + "\t" + deptName);
    }
}

class seta2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of office staff: ");
        int n = sc.nextInt();
        OfficeStaff pl[] = new OfficeStaff[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter id: ");
            int r = sc.nextInt();
            System.out.print("Enter name: ");
            String nm = sc.next();
            System.out.print("Enter dept name: ");
            String dn = sc.next();

            pl[i] = new OfficeStaff(r, nm, dn);
        }
        
        System.out.print("\nid\tname\tdeptName");
        for (int i = 0; i < n; i++)
        {
            pl[i].display();
        } 
    }
}
