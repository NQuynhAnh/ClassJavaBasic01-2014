package Buoi3;

public class CauTrucReNhanh {
    public static void main(String[] args){
        //Dạng thiếu
        String a = "Anh IT";
        if (a == "Anh IT"){
            System.out.println("Chúng tôi là Anh IT team");
        }

        //Dạng đủ
        int tuoi = 18;
        if (tuoi >=18) {
            System.out.println("Bạn đã đủ tuổi đăng ký");
        } else {
            System.out.println("Bạn chưa đủ tuổi, vui lòng đăng ký khi đủ tuổi");
        }

        //Dạng đủ if else else if
        String role = "Học sinh";
        if (role == "Sinh viên") {
            System.out.println("Bạn đang là sinh viên, không thể join vào lớp học sinh");
        } else if (role == "Học sinh") {
            System.out.println("Bạn đang là học sinh, bạn có thể tham gia");
        } else {
            System.out.println("Không rõ role của bạn");
        }
    }
}
