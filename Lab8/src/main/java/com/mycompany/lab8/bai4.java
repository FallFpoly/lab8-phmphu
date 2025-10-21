/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
        // --- Bài 1 ---
        System.out.println("--- Bai 1: ham sum() ---");
        
        double ketQuaTong = XPoly.sum(5, 6.5, 9, 10);
        System.out.println("Tong la: " + ketQuaTong); 

        // --- Bài 2 ---
        System.out.println("\n--- Bai 2: ham min() va max() ---");
        double[] mangSo = {1.5, 9, -3, 5, 8.5};
        
        double soNho = XPoly.min(mangSo); 
        double soLon = XPoly.max(mangSo); 
        System.out.println("So nho nhat: " + soNho);
        System.out.println("So lon nhat: " + soLon);

        // --- Bài 3 ---
        System.out.println("\n--- Bai 3: ham toUpperFirstChar() ---");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap ho ten: ");
        
        String hoTen = sc.nextLine();
        
        String hoTenHoa = XPoly.toUpperFirstChar(hoTen);
        System.out.println("Ho ten sau khi sua: " + hoTenHoa); 
    }
}
