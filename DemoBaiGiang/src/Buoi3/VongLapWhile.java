package Buoi3;

public class VongLapWhile {
    public static void main(String[] args){
        //Vòng lặp while: xét điều kiện rồi mới thực hiện. Nếu điều kiện đúng thì sẽ thực hiện câu lệnh, sai thì dừng thực thi kết thúc vòng lặp
        int i = 0;
        while (i<10){
            System.out.println(i);
            i+=1;
        }

        //Vòng lặp do while: thực thi câu lệnh trước rồi mớ xét điều kiện dừng vòng lặp.
        int a = 0;
        do{
            System.out.println(a);
            a+=1;
        } while (a<10);
    }
}
