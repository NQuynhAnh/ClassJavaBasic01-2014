package Buoi2;

import java.util.Scanner;

public class dienTichHinhChuNhat {
    //Viết chương trình tính diện tích hình chữ nhật
    public static void main (String args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài hình chữ nhật: ");
        double chieuDai = sc.nextDouble();
        System.out.println("Nhập vào chiều rộng hình chữ nhật: ");
        double chieuRong = sc.nextDouble();

        //tính diện tích
        double dienTich = chieuDai*chieuRong;
        //in ra màn hình
        System.out.println("Diện tích hình chữ nhật với chiều dài và chiều rộng bạn vừa nhập là: "+dienTich);
    }
}
