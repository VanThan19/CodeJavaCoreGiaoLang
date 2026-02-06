/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.Student;

/**
 *
 * @author GF63
 */
public class Stage {
    
    public static void main(String[] args) {
//        Student ahihi = checkObjv8(); // ahihi lưu tọa độ của An trong hàm thảy ra ngoài
//        ahihi.showProfile();
          checkObjv8();
    }
    // hàm trả về 1 obj 
    // hàm trả về 1 tọa độ của obj nào đó , vì trả dc tọa độ nghĩa là sờ dc obj
    // có tọa độ chấm là tới obj
     public static Student checkObjv8() {
        
        Student x;
        x = new Student("SE12345", "An Nguyen", 2005, 8.9);
        return x; // vietsub: x đang lưu tọa độ vùng clone AN
                  // thảy tọa độ đó cho tên hàm
        
        
        
        
      
        
       
        
        
          
        
    }
     public static void checkObjv7() {
        
        Student x;// khai báo biến, khai báo con trỏ , nhưng chưa trỏ ai
        x = new Student("SE12345", "An Nguyen", 2005, 8.9);
        
        
        
      
        
       
        
        
          
        
    }
    public static void checkObjv6() {
        // câu chuyện sinh ra rồi chết non
        // câu chuyện vô danh tên 
        //obj k thèm, k có tên gọi, vẫn hành xử dc,
        
        //Student s1 = new Student("SE12345", "An Nguyen", 2005, 8.9);
        //            đã tương đương tọa độ rồi, thảy tọa độ đó đi đâu thôi
        //             hãy  cho biến obj nào đó giữ giùm tọa độ
        // biến đó mà chấm nghĩa là tọa độ chấm , nghĩa là NEW chấm luôn
        // vì biến có tọa độ từ new. CHỐT HẠ: NEW NẮM TỌA ĐỘ
        //Student x = s1; // mày là biến lưu tọa độ vùng new, cho taotọa độ đi
        // chấm là vào trong tọa độ xem có cái gì , trong obj có gì 
        
        new Student("SE12345", "An Nguyen", 2005, 8.9).showProfile();
        // k thèm đặt tên cho obj để giao tiếp, để obj tự giao 
        // OBJ VÔ DANH
        //Xuất hiện xong, gáy xong phát hiện k có con trỏ=>> giết, clear
        // muốn re-use lại vùng new, tối thiểu ít nhất 1 tên gọi, 1 biến obj
        // để còn chấm tiếp
        
        
      
        
       
        
        
          
        
    }
    
    public static void checkObjv5() {
        // câu chuyện 2 chàng 1 nàng
        Student s1 = new Student("SE12345", "An Nguyen", 2005, 8.9);
        Student x = s1;
        s1.showProfile();
        x.showProfile();
        // chàng 1 tát , chàng 2 thấy
        s1.setName("Mình chơi trốn tiu");
        
        x.showProfile();
        
        // nhiều tên cùng tham chiều 1 obj 
        // tí , tèo --> (Mình..)
        // hoàng , gl, xàm. đa cấp--->(Tui)
        
        // cùng 1 tên mà ám chỉ nhiều obj khác
        // sếp = sơn tùng
        //sếp = gã trả lương
        //THAY ĐỔI VALUE CỦA BIẾN
        
        // MỘT OBJ CÓ NHIỀU NGƯỜI NGƯỚC NHÌN, THAM 
        
        
          
        
    }
    public static void checkObjv4() {
        Student s1 = new Student("SE12345", "An Nguyen", 2005, 8.9);
        Student x = s1; // mày là biến lưu tọa độ vùng new cho tao tọa độ đi 
                           // nếu tao tự new như mày , hok lẽ, sai, ra vùng clone mới
        // tao muốn lấy value của mày 
        
        
        s1 = new Student("SE1234", "Loc Nguyen", 2005, 8.9);
        
        
        s1.showProfile();
        x.showProfile(); // An đã trở, backup tọa độ new vào 1 biến khác cùng  
        
    }
    public static void checkObjv3() {
        Student s1 = new Student("SE12345", "An Nguyen", 2005, 8.9);
        
        s1 = new Student("SE1234", "Loc Nguyen", 2005, 8.9);
        // s1 li dị vùng clone AN, chuyển sang kết nối với Lộc
        // ống dòm dòm qua chỗ mới , con trỏ lưu tọa độ mới, biến thay đổi value, lưu value gần 
        
        // con diều An đứt dây, vì sợi dây nối với diều Lộc
        

         // s1 là biền obj
        // tui cần lắm luôn 1 tọa độ vùng new , vùng clone student
        
        
        s1.showProfile();
        // mất tọa độ vùng clone AN
        // vùng ram k có ai trỏ tới, thì định kì khi chạy app, JVM sẽ kiểm soát
        // app bạn nó sẽ giết/ clear vùng clone k có con trỏ
        // Giống như con chó chạy ngoài đừng k chủ, bị trộm chó hack luôn
        
        System.gc(); // gom rác 
        
        
        // 1 new 1 clone, 2 sv khác nhau, 2 vùng ram khác 
    }

    
    public static void checkObjv2() {
        Student s1 = new Student("SE12345", "An Nguyen", 2005, 8.9);
        
        Student s2 = new Student("SE12345", "An Nguyen", 2005, 8.9);
        s1.setName("Ai Roi Cung Khac");
        
        s1.showProfile();
        s2.showProfile();
        // 1 new 1 clone, 2 sv khác nhau, 2 vùng ram khác 
    }
    
   
    public static void checkObj() {
         
        Student s1 = new Student("SE7474983", "An", 2005, 8.9);
       
        s1.showProfile();
        // s1 đang nắm / lưu tọa độ vùng ram obj trong HEAP 
        // new làm nhiều việc: clone khuôn / gọi phễu đổ data vào vùng clone 
        // chốt lại tọa độ vùng new vừa rồi, đem tọa độ nó đi gán biến con trỏ
        
        // s1 là biến , vậy nó cỏ thể thay đổi value 
        Student x = s1; // 2 con trỏ trỏ cùng vùng new, 2 chàng trỏ 1 nàng
        
        s1= new Student("GHHS", "Binh Le", 3332, 5.6);
        s1.showProfile();
        
        System.out.println("An s1 từ chối chơi");
        x.showProfile();
        
        // An Nguyễn k còn ai trỏ, k còn cách nào lấy lại dc vùng ram này 
        // tọa độ new cũ ta k giữ lại
        
        // biến obj là tay cầm con diều, new chính là con diều 
        // khi tay cầm nối dây con diều mới , con diều cũ k còn chơi nữa hay là bị đứt sợi dây.
        
        // 1 vùng ram new obj mà k còn ai trỏ tới , JVM có chương trình ngầm gọi là 
        //Người gom rác đi gom những vùng new mồ côi k con trỏ , dọn free ram, free heap 
        // trả lại ram k xài cho new sau này
        
        // 1 biến có quyền trỏ vùng new, giữ lại An dc k, mà vẫn có Bình
        // lưu tọa độ thôi mà 
        
        
    }
}
