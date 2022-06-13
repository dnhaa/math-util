/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hadn.mathutil.main;

import com.hadn.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ///thử nghiệm hàm tính gia thừa coi chạy đúng như thiết kế k
        //ta phải đưa các tính huống sử dụng hàm trong thực tế
        // ví dụ: -5 coi tính đc k
        // 0 coi tính đc k
        // 20 coi tính ra mấy
        // 21 coi tính ra mấy
        //TEST CASE: một tình huống hàm/app/tính năng đc sử dụng
        //giả lập hành vi xài của ai đó
        
        //TEST CASE: 1 tình huống sử dụng app, hàm mà bao hàm
        //INPUT: DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        //OUTPUT ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM/CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG ĐẦU VÀO ĐỂ XỬ LÍ
        //KÌ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPYT Ở TRÊN
        //SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG K
        
        long expected = 120; //tao kì ovnjg hàm ói về 120 nếu tính 5
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("expected 5! = " + expected);
        System.out.println("actual 5! = " + actual);
    }
}
