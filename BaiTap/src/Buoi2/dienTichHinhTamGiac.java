package Buoi2;

import java.util.Scanner;

public class dienTichHinhTamGiac {
    public static void main(String[] args){
        //nhap chieu cao va canh day
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao cua hinh tam giac: ");
        double chieuCao = sc.nextDouble();
        System.out.print("Nhap canh day cua hinh tam giac: ");
        double canhDay = sc.nextDouble();

        //dien tich tam giac
        double dienTich = canhDay*chieuCao*0.5;
        System.out.println("Dien tich tam giac la "+dienTich);
    }
}
