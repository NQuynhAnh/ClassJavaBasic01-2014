package Buoi3;

import java.util.Scanner;

public class KiemTraChanLe {
    public static void main(String[] args){
        // Khai báo biến số là n có kiểu dữ liệu là int
        int n;
        //Khai báo scanner để nhập số từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn vui lòng nhập số cần kiểm tra chẵn lẻ: ");
        n = scanner.nextInt();
        //Thực hiện câu lệnh if else để kiểm tra điều kiện nếu là số chẵn thì chia hết cho 2, còn lẻ thì không chia hết
        if(n%2 ==0){
            System.out.println(n+" là số chẵn");
        } else {
            System.out.println(n+" là số lẻ");
        }
    }
}
