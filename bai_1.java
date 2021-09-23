package test_java;

import java.util.HashMap;
import java.util.Scanner;

public class bai_1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> map = new HashMap<>();
        String name, numberPhone;

        while(true) {
            System.out.println("Name: ");
            name = sc.nextLine();
            System.out.println("Number phone: ");
            numberPhone = sc.nextLine();
            map.put(name,numberPhone);
            if (numberPhone.equals("x") || numberPhone.equals("X")) {
                System.out.println(map);
                break;
            }
        }
    }
}
