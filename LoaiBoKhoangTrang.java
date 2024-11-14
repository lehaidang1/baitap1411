package MangStringg;

import java.util.Scanner;

public class LoaiBoKhoangTrang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao chuoi: ");
        String s = scanner.nextLine();
        // tạo một StringBuffer mới
        StringBuffer chuoi = new StringBuffer();
        // cho biến i chạy từng kí tự trong chuỗi
        for (int i = 0; i < s.length(); i++) {
            // cho biến dem = kí tự i
            char dem = s.charAt(i);
            // nếu biến dem != khoảng trắng thì thêm biến dem vào StringBuffer 
            if (!Character.isSpaceChar(dem)) {
                chuoi.append(dem);
            }

        }
        System.out.println(" chuoi sau khi bo khoang trong la: " + chuoi);
    }

}
