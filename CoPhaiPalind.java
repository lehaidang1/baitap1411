package MangStringg;

import java.util.Scanner;

public class CoPhaiPalind {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap vao chuoi ban muon kiem tra Palindrome: ");
        String input = scanner.next();

        int dau = 0, cuoi = input.length() - 1;
        boolean Palindrome = true; // tạo một biến logic Palondrome và gán giá trị là 
                                   // nếu có điểm sai trong vòng lặp thì giá trị sẽ thay đổi thành false.

        while (dau < cuoi) { // vòng lặp while sẽ chạy miễn là vị trí đầu (dau) < vị trí cuối (cuoi)
                             // quá trình sẽ dừng lại nếu (dau) va (cuoi) gặp nhau 
                             
            if (input.charAt(dau) != input.charAt(cuoi)) {   // nếu kí tự (dau) != kí tự cuối (cuoi) thì dừng vòng lặp 
                Palindrome = false; // chuyển giá trị của Palindrome thành false
                break;
            }
            dau++; // tăng kí tự đầu thêm 1 đơn vị 
            cuoi--; // giảm kí tự cuối đi một đơn vị

        }
        if (Palindrome) {
            System.out.println(input + " la mot Palindrome");
        } else {
            System.out.println(input + " khong la mot Palindrome");
        }

    }
}
