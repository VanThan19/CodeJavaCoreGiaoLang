package data;




import data.Student; // mượn đồ để dùng 
import data.Student;
import java.util.Scanner;


public class StudentManagement {

    
    public static void main(String[] args) {
        saveAStudent();
        //inputAStudent();
    }
    // nhập từ bàn phím 
    // cần scanner obj bàn phím 
    // máy Cam , scanner tiệm photto , bàn phím --> nhóm quét dữ liệu đưa vào 
    // máy tính , class scanner xuất hiện. Xài phải new để cho nó hành xử từ bàn 
    // phím đi vào ream , do đó phải có biến hứng value
    public static void inputAStudent() {
        String id,name;
        int yob;
        double gpa;
        Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.print("Input id: ");
        id = banPhimCuaTui.nextLine();
        System.out.print("Input name: "); // CHUỖI TRƯỚC SỐ BỊ TRÔI LỆNH/lạc trôi 
        name = banPhimCuaTui.nextLine();
        System.out.print("Input yob: ");
        yob = banPhimCuaTui.nextInt();
        System.out.print("Input gpa: ");
        gpa = banPhimCuaTui.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
    }
    public static void saveAStudent() {
        
        Student binh = new Student("SE7457", "Binh Le", 2006, 7.9);
        Student than = new Student("SE7474983", "Nguyễn Văn Thân", 2005, 8.9);
       // Student binh = new Student("SE7457", "Binh Le", 2006, 7.9);
        
        than.showProfile();
        binh.showProfile();
        
        // chấm xổ gì , Access Modifier
        System.out.println("THÂN name (directly): "+than.name);
        // vì sờ đc trực tiếp cái name (biến/instance variable), ta có thể get và set 
        than.name = "Học Giỏi";
        System.out.println("Thân name again : "+than.name);
      //  Student cuong = new Student("SE6666", "Cường Võ", 1996, 6.6);
        
        than.showProfile();
       // cuong.showProfile();
        System.out.println("Using static :");
       than.sayHi();
       binh.sayHi();
       Student.sayHi(); // tên class chấm static vì nó là đồ chung cho multiple obj
    }
}
