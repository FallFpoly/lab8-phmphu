/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
public class XPoly {

//    Bài 1 (2 điểm) 
//Thêm một phương thức tĩnh có tên là sum() với tham số biến đổi kiểu double. 
//Viết mã cho phương thức này để thực hiện tính tổng các tham số truyền vào. 
    public static final double sum(double... x) {
        double tong = 0; // Biến để cộng dồn

        // Dùng vòng lặp for-each đơn giản để duyệt qua các số
        for (double so : x) {
            tong = tong + so; // Cộng số hiện tại vào tổng
        }
        
        return tong; // Trả về kết quả
    }
//    Bài 2 (2 điểm) 
//Bổ sung thêm 2 phương thức tĩnh để tìm số lớn nhất và nhỏ nhất từ tham số biến 
//đổi 
    //min
    public static final double min(double... x) {
        // Giả sử số đầu tiên là số nhỏ nhất
        double soMin = x[0];
        
        // Duyệt qua các số còn lại
        for (double so : x) {
            if (so < soMin) {
                soMin = so; // Nếu tìm thấy số nhỏ hơn, gán lại
            }
        }
        
        return soMin;
    }
    //max
    public static final double max(double... x) {
        // Giả sử số đầu tiên là số lớn nhất
        double soMax = x[0];

        // Duyệt qua các số còn lại
        for (double so : x) {
            if (so > soMax) {
                soMax = so; // Nếu tìm thấy số lớn hơn, gán lại
            }
        }
        
        return soMax;
    }
//    Bài 3 (2 điểm) 
//Bổ sung thêm 1 phương thức tĩnh toUpperFirstChar(String s) để chuyển đổi các ký 
//tự đầu tiên của mỗi từ sang ký tự hoa.
    public static String toUpperFirstChar(String s) {
        
        // 1. Tách chuỗi tham số theo ký tự trắng
        String[] words = s.split(" ");
        
        // 2. Duyệt các từ trong mảng words
        
        for (int i = 0; i < words.length; i++) {
            
            // Phải kiểm tra xem từ có rỗng không
            // (Nếu gõ 2 dấu cách "a  b" thì mảng sẽ là ["a", "", "b"])
            if (words[i].isEmpty()) {
                continue; // Bỏ qua, đi tiếp
            }

            // 3. Lấy ký tự đầu tiên
            char firstChar = words[i].charAt(0);
            
            // 4. Đổi sang ký tự hoa
            char upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0);
            
            // 5. Thay đổi từ cũ bằng từ đã chuyển đổi
            words[i] = upperFirstChar + words[i].substring(1);
        }
        
        // 6. Nối mảng các từ thành chuỗi
        
        String ketQua = String.join(" ", words);
        
        return ketQua; // Trả về chuỗi kết quả
    }
}
    

