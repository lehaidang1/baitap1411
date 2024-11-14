package MangStringg;

import java.util.Scanner;

public class DaoNguoc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap vao chuoi ban muon dao nguoc: ");
        String input = scanner.next();

        StringBuffer s = new StringBuffer(input);
        String daonguoc = s.reverse().toString();
        System.out.println(" chuoi ban dau la: " + input);
        System.out.println(" chuoi sau khi dao nguoc la: " + daonguoc);

    }

}
