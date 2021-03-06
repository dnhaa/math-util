/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hadn.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    //trong class này cung cấp cho ai đó nhiều hàm xử lí toán học
    //clone class Math của JDK
    //hàm thư viẹn xài chung cho ai đso mà k cần lưu trạng thái/gtri
    //chon thiết kế là hàm static
    
    //hàm tính giai thừa
    //n! = 1.2.3.4... n
    //k có gia thừa cho số âm
    //o! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về gtri
    //20 giai thừa 18 con sô s0, vừa kịp đủ kiểu long của java
    //21 giai thừa tràn kiểu long
    //bài này quy ước tính n! trong khoảng 0..20
//    public static long getFactorial (int n){
//        if (n < 0 || n > 20){
//            throw new IllegalArgumentException("Invalid argument. N must be b/w 0..20");
//        }
//        if (n == 0 || n == 1){
//            return 1; //kết thức cuộc chơi sớm nếu nhận giá trị đầu vào đặc biệt
//        }
//        long product = 1; //tích nhân dồn, thuật toán nhân dồn
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        return product;
//    }
    
    //học về đệ quy 30s
    //hiện tượng gọi lại chính mình với 1 quy mô khác
    //ví dụ: con búp bê Nga, giống nhau và lồng trong nhau
    //búp bê to, nhỏ hơn, nhỏ nhỏ hơn, nhỏ hươn nữa, ... điểm dừng
    //tính giùm tui 6 giai thừa
    //n! = 1.2.3.4.5.6. ... .n
    //6! = 6.5!
    //5! = 5.4!
    //4! = 4.3!
    //3! = 3.2!
    //2! = 2.1! điểm dừng
    //1! = 1;
    //quy ước 1! = 0! = 1
    
    //chốt hạ: n! = n * (n - 1)!
    
    public static long getFactorial (int n){
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid argument. N must be b/w 0..20");
        }
        if (n == 0 || n == 1){
            return 1; //kết thức cuộc chơi sớm nếu nhận giá trị đầu vào đặc biệt
        }
        return n * getFactorial(n - 1); //công thức đệ quy
    }
    
}
