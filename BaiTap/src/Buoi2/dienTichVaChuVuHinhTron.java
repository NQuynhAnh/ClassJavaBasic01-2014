package Buoi2;

import java.util.Scanner;

public class dienTichVaChuVuHinhTron {
    public static void main(String[] args){
        //Nhap ban kinh r cua hinh tron
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        double r = sc.nextDouble();
        //Tinh dien tich s
        double s = r*r*3.14;
        System.out.println("Dien tich hinh tron la "+ s);
        //Tinh chu vi c
        double c = r*2*3.14;
        System.out.println("Chu vi hinh trong la "+c);
    }
}
