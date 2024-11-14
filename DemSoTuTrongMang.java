package MangStringg;

import java.util.Scanner;

public class DemSoTuTrongMang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi: ");
        String s = scanner.nextLine();

        // .split("\\s+") là tách chuỗi dựa trên 1 hoặc nhiều dấu cách và in vào mảng word
        // ví dụ chuỗi là "nguyen phan vinh" sẽ trở thành mảng ["nguyen"," phan"," vinh"]
        String[] word = s.split("\\s+");
        int soTu = 0;
        // lặp lại các từ trong mảng word vào chuỗi i, mỗi lần lặp lại một từ biến soTu sẽ thêm 1 đơn vị
        for (String i : word) {
            ++soTu;
        }
        System.out.println(" so tu trong chuoi vua nhap la: " + soTu);

    }

}
