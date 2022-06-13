/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hadn.mathutil.test.core;

//import org.junit.jupiter.api.Test;

import com.hadn.mathutil.core.MathUtil;

import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    
    //đây là class sẽ sửu dụng các hàm của thư viện/framework junit
    //để kiểm thử/kiểm tra code chính - hàm tính giai thừa
    //bên class cỏe.MathUtil
    //viết code để test code chính bên kia
    
    //có nhiều quy tắc đăt tên hàm kiểm thử
    //nhưng thường là nói lên mục đích các case/tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại
    
    //hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    //@test Junit sẽ phối hợp với JVM để chạy hàm này
   //@test phía hậu trường chính là public static void main()
    //có nhiều @test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0; //test thửu tình huống tử tế đầu vào, mày phải chayj đúng
        long expected = 1;
        long actual = MathUtil.getFactorial(n); //gọi hàm cần test bên core/app chính/code chính
        
        //so sánh EX vs ACT dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);
        
        //gộp thêm vái case thành công, đưa dầu vào ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1)); //tui mún 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); //tui mún 2! == 2
        Assert.assertEquals(6, MathUtil.getFactorial(3)); //tui mún 3! == 6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); //tui mún 4! == 24
        Assert.assertEquals(120, MathUtil.getFactorial(5)); //tui mún 5! == 120
        Assert.assertEquals(720, MathUtil.getFactorial(6)); //tui mún 6! == 720
        
        //hàm giúp so sán 2 gtri nào đó có giống nhau không
        //giống nhau -> thảy màu xanh đèn đường - đường thông, code ngon
                    //ít nhất cho cái case đang test
        //k giống nhau -> thảy màu đỏ đèn đường 
    }               //hàm Ý EX và ACT k giống nhau
    
    //hàm getF() thiết kê có 2 tình huống xử lí
    //1. đưa data tử tế [0..20] - tính đúng đc n! - done
    //2. đưa data vào cà chớn, amm, > 20; thiết kế của hàm là NÉM RA NGOẠI LỆ
    //TAO KÌ VÒN NGOẠI LỆ XUẤT HIỆN KHI N < 0 || N> 20
    //rất mong ngoại lẹ xuất hiện với n cà chớn này
    
    //nếu hàm nhận vào n < 0 ||n > 20 vào hàm ném ra ngoại lệ -> HÀM CHẠY ĐÚNG THIẾT KẾ
    //--> XANH PHẢI XUẤT HIỆN
    
    //NẾU HÀM NHẬN VÀO n < 0 || n > 20 vào hàm éo ném ngoại lệ
    //sure hàm chạy sai thiết kế, sai kì vọng , MÀU ĐỎ
    
    //test case:
    //input: -5
    //expected: IllegalArgumentException xuất hiện
    //tình huống bất thường,ngoại lệ, dự tính không thể đo lường so sánh theo kiểu value 
    //mà chỉ có thể đo lường = cách chúng có xuất hiện k
    //AssertEquals() k dùng để so sánh 2 ngoại lệ
    //equals() là bằng nhau hay k trên value
    
    
    //màu đỏ đó em, do hàm đúng là có ném ngoại lệ nhưng k phaỉ ngoại lệ như kì vọng
    //chứ k phải hàm ném sai
    
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongtArgumentThrowsException(){
//        MathUtil.getFactorial(-5); //hàm @TEst chạy, hay hàm getF() chạy sẽ ném ngọai lệ NumberFormat...
//        
//    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongtArgumentThrowsException(){
        MathUtil.getFactorial(-5); //hàm @TEst chạy, hay hàm getF() chạy sẽ ném ngọai lệ NumberFormat...
        
    }
    
    //cách khác bắt ngoại lệ, viết tự nhiên hơn
    //xài lambda
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //tui cần thấy màu xanh khi với 21!
    @Test 
    public void testGetFactorialGivenWrongtArgumentThrowsException_LambdaVersion(){
//        Assert.assertThrows(tham số 1: ngoại lệ mún so sánh , 
//                            tham số 2: đoạn code chạy văng ra runnable);

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            MathUtil.getFactorial(-5); //lập trình hàm, đưa hàm vào 1 hàm khác 
        });
    }
    
    
    //bắt ngoại lệ, xem hàm có ném về ngoại lệ hay k khi nhận n cà chớn
    //có ném, tức là hàm chạy đúng thiết kế -> xanh
    @Test 
    public void testGetFactorialGivenWrongtArgumentThrowsException_TryCatch(){
        //chủ động kiểm soát ngoại lệ
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //bắt try catch là JUnit sẽ ra màu xnah do đã chủ động kiểm soát ngoại lệ
            //nhưng k chắc ngoại lệ cần có xuất hiện hay k
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException
            Assert.assertEquals("Invalid argument. N must be b/w 0..20", e.getMessage());
        }
        
    }
    //clean : xóa sạch thư mục cũ, biên dịch lại thành class (JDK)
    //build: đóng gói thành war/jar (Ant/Maven/Grandle)
} 
