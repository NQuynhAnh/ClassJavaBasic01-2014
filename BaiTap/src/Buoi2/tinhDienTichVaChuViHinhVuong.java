package Buoi2;

import java.util.Scanner;

public class tinhDienTichVaChuViHinhVuong {
    public static void main (String[] args){
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng hình vuông:");
        double chieuRong = sc.nextDouble();

        //dien tich
        double dienTich = chieuRong*chieuRong;
        System.out.println("Diên tích hình vuông là "+dienTich);

        //chu vi
        double chuVi = chieuRong*3.14;
        System.out.println("Chu vi hình vuông là "+chuVi);
    }
}
