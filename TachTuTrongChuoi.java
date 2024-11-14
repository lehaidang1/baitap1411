package MangStringg;

import java.util.Arrays;
import java.util.Scanner;

public class TachTuTrongChuoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap vao chuoi: ");
        String s = scanner.nextLine();

        // tách các từ trong chuỗi s dựa trên khoảng trắng và lưu vào mảng mang
        String[] mang = s.split(" ");
        // hiển thị nội dung của mảng dưới dạng chuỗi và in ra màn hình.
        System.out.println(" mang chua cac tu : " + Arrays.toString(mang));

    }

}
