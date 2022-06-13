/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.hadn.mathutil.test.core;

import com.hadn.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
//câu lệnh này Junit báo hiện rằng sẽ cần loop qua tập data để lấy cặp data input/expected ngồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //@Test = public static void main
    @Parameterized.Parameters //Junit ngầm chạy lôp qua từng dòng của mảng đế lấy cặp data input/expected
    //tên hàm k quan trọng, quna trọng là @
    public static Object[][] initData(){ //trả về mảng 2 chiều gồm nhiều cặp EXP|input
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 100}
        };
    }
    
    //giả sử loop qua từng dòng của mảng, ta vẫn cần gán từng value của cột vào biết tương ứng input/expected
    //để lát hồi feed vô hàm
   //chỗ này k có static, bên trên cần static để lấy cụm data tĩnh
    
    @Parameterized.Parameter(value = 0) //value = 0 là map với mảnh data
    public int n; //biến map với value cột 0 của mảng
    
    @Parameterized.Parameter(value = 1)
    public long expected; //kiểu long vì gtri trả về của hàm getF() là long
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
    
}
