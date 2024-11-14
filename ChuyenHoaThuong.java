package MangStringg;

import java.util.Scanner;

public class ChuyenHoaThuong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao mot chuoi: ");
        String s = scanner.next();

        String ketQua = ""; // tạo một chuỗi trống để thêm kí tự đã chuyển đổi vào

        for (int i = 0; i < s.length(); i++) { // cho i chạy từng vị trí của chuỗi
            char c = s.charAt(i); // thêm kí tự c = kí tự trong chuỗi s - vị trí i

            if (Character.isUpperCase(c)) { // nếu kí tự c là một chữ in hoa -> chữ thường
                ketQua = ketQua + Character.toLowerCase(c); // cộng chữ đã chuyển đổi vào chuỗi

            } else if (Character.isLowerCase(c)) { // nếu kí tự c là một chữ thường -> chữ hoa
                ketQua = ketQua + Character.toUpperCase(c); // cộng chữ đã chuyển đổi vào chuỗi

            }
        }
        System.out.println(" chuoi sau khi chuyen doi la: " + ketQua);

    }
}
