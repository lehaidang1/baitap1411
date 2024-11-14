package MangStringg;

import java.util.Scanner;

public class SoLanXuatHien {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao chuoi: ");
        String s = scanner.nextLine();
        int dem = 0;
        for (int i = 0; i < s.length(); i++) { // i < s.length() vì ở dưới lấy kí tự theo vị trí trong chuỗi
            char so = s.charAt(i); // lấy kí tự của chuỗi s ở vị trí i
            if (so == 'n') { // nếu kí tự được lấy == với kí tự cần 'n' thì tăng biến dem thêm 1.
                ++dem;
            }
        }
        System.out.println(" so lan xuat hien cua ki tu (n) la: " + dem);

    }

}
