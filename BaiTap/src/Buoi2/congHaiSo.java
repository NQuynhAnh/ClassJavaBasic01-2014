package Buoi2;

import java.util.Scanner;

public class congHaiSo {
    public static void main(String args){
        //Bạn hãy viết chương trình cộng hai số được nhập từ bàn phím người dùng, thực hiện phép tính cộng và in ra màn hình
        //Khai báo biến số là num1 và num2, tổng hai số là sum
        //Tổng hai số nguyên, bài tập là cộng hai số không nguyên
        float num1, num2, sum;
        //Khai báo scanner để nhập từ bàn phím vào
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        num1 = sc.nextFloat();

        System.out.println("Nhập vào số thứ hai: ");
        num2 = sc.nextFloat();

        //Đóng lại đối tượng scanner
        sc.close();

        //Tính tổng
        sum = num1 + num2;

        //In kết quả ra màn hình
        System.out.println("Tổng hai số là: "+sum);
    }
}
