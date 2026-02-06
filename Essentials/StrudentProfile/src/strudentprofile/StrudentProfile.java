// Thí nghiệm về nhập dữ liệu bàn phím
// app bị giết
package strudentprofile;

import java.util.Scanner;


public class StrudentProfile {

    
    public static void main(String[] args) {
        inputProfile();
    }
    // nhập thông tin sinh viên cơ bản và in ra 
    public static void inputProfile() {
        // không opp , chỉ cẩn hiểu về việc nhập info trước đã , ko chơi class Student
        String name , address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
       
        
        
        System.out.print("Input yob: ");
 //       yob = sc.nextInt(); // convert data từ bàn phím - là chuỗi thành số
 //       // để lại rác trong buffer, tệ nhất là enter, tệ hơn là rác dấu cách+enter.
 //       // xóa bộ đệm trước lệnh nhập chuỗi 
 //       //ADP
 //       sc.nextLine(); // tao đéo gán tao muốn hốt rác thôi , mẹo xóa bộ đệm
          String tmpNum = sc.nextLine();
          yob = Integer.parseInt(tmpNum); // phân rã/phân giải,hốt sạch buff đi,nextLine hốt sạch buff,loại bỏ enter
                                          // còn chuỗi số thành số. Nó chính là nextInt
          // class trai bao suger dady
          
        // chấm mà k cần new mà nó sủa đc đấy thì em sure với thầy chắc chắn là static.
                  
        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();
        
        System.out.println("Here is your profile: ");
        System.out.println("Name: "+name);
        
        System.out.println("Yob: "+yob);
        System.out.println("Address: "+address);
        // nhập số trước chữ bị trôi lệnh
        // thanh ram , khi app các bạn dc chạy nếu cói tương tác từ bàn phím :" app chạy vào trong ram
        //nhập dữ liệu từ bàn phím , dữ liệu bạn gõ k đi ngay vào biến đâu , phải đi vào 1 vùng ram app đó 
        // gọi là búp phờ ( buffer): vùng ram đi kèm với app và mỗi áp chứa vài ngàn kí tự nhằm nhập dữ liệu
        
        // nextLine ( sống tử tế hốt sạch) hốt sạch nút ENTER đi vào buff , chuẩn bị cho 
        //việc kết thucs nhập dữ liệu để gán
        // Toàn bộ dữ liệu này + ENTER sẽ hốt sạch toàn bộ trong buff, sẽ giục enter mà chảy vào name.
        
        // nextInt ( sống mất nết để lại rác) : buff hết rồi nó chờ mình gõ 2001 nếu tôi ấn enter luôn thì 2001 
        //và enter đang trong búc phơ 
        // thì đi vào , nextIn tao cần 1 số nguyên thôi , tao chỉ lấy phần đúng số nguyên tao để lại enter ở trong buff
        // nextLine là nguyên tắc line là 1 dòng , dòng là kết thúc bằng enter , tao có enter tao gửi cho mày nhé , dục enter 
        // đi phần còn lại éo là gì cả là rỗng , gán vào address , addr k có gì cả vì trôi lệnh . 
        
        // dấu cách trong lập trình từ bàn phím có ý nghĩa dùng để phân cách trong phần từ biến 
        // để chia cách phần value 
        
        // ko sợ trôi lệnh vì có cách xóa bộ đệm 
        // tôi đéo thích kiểu nớ
        
        // mình xài static 
        
        
        
       
        
        
        
    }
    
}
