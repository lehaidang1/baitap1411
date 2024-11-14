package MangStringg;

import java.util.Scanner;

public class TuDaiNhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao chuoi: ");
        String s = scanner.nextLine();

        // tạo một biến tudaiNhat để lưu từ dài nhất 
        String tuDaiNhat = "";

        // tách các từ trong chuõii dừa theo khoảng trắng để so sánh độ dài
        String[] tu = s.split("\\s+");

        // lặp lại các từ trong mảng tu sau khi tách vào chuỗi saoChep.
        for (String saoChep : tu) {
            // mỗi lần lặp nếu độ dài của saoChep > tuDaiNhat thì gán giá trị của saoChep cho tuDaiNhat
            // ( từ nào dài nhất sẽ cập nhật biến tuDaiNhat thành từ đó)
            if (saoChep.length() > tuDaiNhat.length()) {
                tuDaiNhat = saoChep;
            }

        }
        System.out.println("tu dai nhat trong chuoi vua nhap la: " + tuDaiNhat);

    }
}
