
package than.util;

import java.util.Scanner;

/**
 *
 * @author GF63
 */

// đây là Class là khuôn chứa , có đặc điểm và hành động/ chứa các món đồ chơi dùng chung cho mọi nơi
// vì nó k nhớ cái gì cho riêng tư của nó
// gọi là LIBRARY - chứa các hàm/biến(data) và dùng chung cho nhiều công việc khác nhau của các dự án khác nhau
public class MyToys {
    
    // chứa các đặc điểm/hành vi mà là static , cho người khác sờ thì thêm cái public
    // ko nhớ cái gì của riêng mình 
    // một class bình thường thì vẫn có thể vừa static vừa non-static, tùy nhu cầu, tùy cách thức
    // Math: hầu hết static 
    //String : vừa NON-static, vừa static
    //System: hầu hết là static
    
    public static final double PI= 3.1415 ;
    public static final double VAT=0.1;
    public static final int Max= 600 ;
    // final - hằng só , biến k cho thay đổi value, trừ lần đầu tiên khai báo 
     
    //Dependency Injection
    // đẩy Scanner ra ngoài xài chung cho các hàm static của chúng ta
    private static Scanner sc = new Scanner(System.in); // private cho nhu cầu dùng nội bộ bên trong
     public static int getAnInteger(String thongBao) {
        int n; // hứng từ bàn phím gõ gì
        
        do {
            try {
                System.out.println(thongBao);
                n = Integer.parseInt(sc.nextLine());
                if (n>=1&&n<=7)
                return n;
            } catch (Exception e) {
                System.out.println("Dcm. nhập số nguyên ");
            }
        }while(true);
        
    
        
    }
    // trong quá trình làm app, việc nhập số là gặp lại nhiều lần
    //mỗi cú nhập, biến nhập, kèm theo: trôi lệnh, cà chớn - trycatch-dowhile
    // tách việc nhập số nguyên thành một hàm , goi việc chửi bới , trôi lệnh, nhập lại vào một chỗ 
    // ta hứng kết quả trả về từ hàm, lấy để dùng, MyToys nhớ con số này làm gì
    //Math.sqrt(4)--> mình dùng, math k cần nhớ , k cần nonstatic
    
    public static int getAnInteger() {
        int n; // hứng từ bàn phím gõ gì
        
        do {
            try {
                System.out.println("Nhập vào số nguyên: ");
                n = Integer.parseInt(sc.nextLine());
                //if chửi ngoài biên
                return n;
            } catch (Exception e) {
                System.out.println("Dcm. nhập số nguyên ");
            }
        }while(true);
        
    
        
    }
    
}
