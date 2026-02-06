
package studentmanagement;

import data.Student;
import java.awt.AWTEventMulticaster;
import java.util.*;


public class StudentManagement {

    public static void main(String[] args) {
        List<Student> arr = initData();
        // gọi hàm search với 4 bạn sv đã có 
        Student xxx = searchAsStudent(arr, "st333333");
        if (xxx == null) {
            System.out.println("NO FOUND!!!");
        }
        else {
            // lỡ tìm thấy update lại điểm số 
            xxx.showprofile(); // x đang trỏ vùng new 3.3
            xxx.setGpa(6868);
        }
        // ra hẳn ngoài if kjieemr tra có 6868 hay chưa
        System.out.println("Check var : ");
        for (Student student : arr) {
            student.showprofile();
        }
    }
    
//    public static void main(String[] args) {
//        //playWithArrayList();
//        //sortWithArrayListManually();
//        //playWithSet();
////        Student xx = getAStudent("ty7765");
////        if (xx!=null)
////           xx.showprofile();
////        else System.out.println("Not Found!!!");
//         //sortStudentList();
//         List<Student> result = initData();
//         System.out.println("The student list ");
//         for (Student x : result) {
//            x.showprofile();
//        }
//    }
    public static List<Student> initData() {
        // hàm trả về 1 cái túi có sẵn bên trong 1 nhóm sv
        // trả về tọa độ 1 cái túi ,vẫn là new túi mà , trong túi chứa thewr bài sv
        List<Student> arr = new ArrayList(); // đi mua cái túi
        // arr biến lô cồ là biến klhai báo trong hàm và chạy xong sẽ biến mất
        // vùng new đéo biến mất vì nằm trong vùng nhớ hẻap
        
        Student chin = new Student("T999999", "Chín Nguyễn", 2009, 9.9);
        
        arr.add(new Student("St2222", "Hai Pham", 2002, 2.2));
        arr.add(chin); 
        arr.add(new Student("St333333", "Ba LÊ", 2003, 3.3));
        arr.add(new Student("St555555", "TÁM Hồ", 2008, 8.8));
        return arr; // trong ram dẹp arr đi , new là arr trỏ , ar bắn cái cho tên hàm , tên hàm bắn cái cho result trỏ
        // ar mất con trỏ nhưng vùng new vẫn còn result trỏ đến
        
    }
    // ta search tìm kiếm 1 hồ sơ sv
    public static Student searchAsStudent(List<Student> arr, String id) {
        // arr là cái túi new đâu đó, tên biueens là con trỏ mà
        // trong túi này có 1 nhóm sv sẵn rồi, add rồi
        if (arr.isEmpty()) // túi k có thẻ bài, tức là size trả về 0
                return null;            // có sv nào dc tìm thấy đâu, trả về tọa độ đáy ram
        // CPU chạy xuống đâyu túi có thẻ bài rôiif, danh sách có người điền tên rồi
        // for hỏi từng thẻ 1
        for (int i = 0; i < arr.size(); i++) {
            Student t = arr.get(i);
            if (t.getId().equalsIgnoreCase(id)) return t; // return thẻ bài thứ i có trỏ vùng id tìm thấy
                                // arr.remove(i);                         // thẻ bài, con trỏ có lưu tọa độ, tao return tọa độ
        }
        // đi hết for mà k return dc , chắc chắn cũng éo thấy luôn, null đáy ram
        return null;
    }
    //---------------------------
    //Tử tế search sort, update
    //-------------------------------
    public static void sortStudentList() {
        List<Student> arr = new ArrayList(); // đi mua cái túi
        Student chin = new Student("T999999", "Chín Nguyễn", 2009, 9.9);
        
        arr.add(new Student("St2222", "Hai Pham", 2002, 2.2));
        arr.add(chin); 
        arr.add(new Student("St333333", "Ba LÊ", 2003, 3.3));
        arr.add(new Student("St555555", "TÁM Hồ", 2008, 8.8));
        
        System.out.println("The Student list: ");
        for (Student x : arr) {
            x.showprofile();
        }
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = i+1; j < arr.size(); j++) {
                // cuối so với áp cuối
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student t = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, t);
                    // set là thay đổi info của con teor , trỏ chỗ khác
                    // lấy thẻ bài ra khắc lại thông tin trỏ
                    
                }
            }
        }
        System.out.println("The Student list: ");
        for (Student x : arr) {
            x.showprofile();
        }
    }
    // Thử nghiệm hàm trả về 1 obj, thực chất là trả về tọa độ vùng new
    public static Student getAStudent(String id) {
        // đưa vào mã số SV muốn tìm, ta sẽ tìm trong giỏ, túi thẻ bài, coi có ai trùng mã số 
        // thì trả về thẻ bài, hồ sơ bạn sv đó, trả về tọa độ hồi sơ sv đó
        List<Student> arr = new ArrayList(); // đi mua cái túi
        Student binh = new Student("Ty7765", "Bình LÊ", 2003, 7.8);
        
        arr.add(new Student("St2222", "AnNguyen", 2000, 9.9));
        arr.add(binh); 
        
        Student tmpStudent = arr.get(1); // lấy được tọa độ sv 0
        // hỏi bạn í id là gì
        String tmpId = tmpStudent.getId();
        //if (tmpId == id) return tmpStudent
        
        if (tmpId.equalsIgnoreCase(id)) return tmpStudent;
        // hoàn toàn k có SV mới xuất hiện, chỉu tham chiếu tọa độ vùng new 
        // return get(0) thẻ bài 0, thẻ bài 0 trỏ vùng new An Nguyen
        return null; // k tìm thấy , trỏ dưới đáy
        
    }
    
    // Set : là 1 loại giỏ , túi, mà không cho phép đựng trùng món 
    // tức là k có món nào xuất hiện quá 1 lần
    // k cho phép trỏ trùng 1 vùng new
    // LIST: cứ có vào là đếm , quay lại vẫn đếm
    
    public static void playWithSet() {
        Set<Student> arr = new HashSet(); // Mua cái túi doremon
                                        // mở khóa để thao tác, . hàm()
         Student an = new Student("STED88", "ANBN", 2000, 9.0);
         arr.add(an);
         arr.add(an);
         Student binh = new Student("Ty7765", "Bình LÊ", 2003, 7.8);
         arr.add(binh);
         // k có hàm get vì giỏ này đưa đồ vào,
         // thì có 2 tình huống xảy ra : HashSet: để lộn xộn thẻ bài 
         //                                       để thẻ bài có thứ tự theo cách riêng của nó
         // khác hoàn toàn ARRAYLIST
         //ARRAYLIST là và trước , add trước ngồi trước
         // muoons lấy thì for each
         // thẻ bài đưia vô k giữu nguyên thứ tự như đưa vô
         System.out.println("The Stuydent ");
         for (Student x : arr) {
            // duyệt qua từng con trỏ, lấy tọa độ từng thẻ bài gán vào con trỏ x
            x.showprofile();
                 
        }
         // SET LÀ k chấp nhận con trỏ trỏ trùng vùng 
    }
    // ta tự sort danh sách sinh viên làm bằng tay
    // còn 1 cơ chế ta k cần dùng vòng for tự viết
    // hàm static: Collections
    public static void sortWithArrayListManually() {
        List<Student> arr = new ArrayList(); // đi mua cái túi
        Student binh = new Student("Ty7765", "Bình LÊ", 2003, 7.8);
        
        arr.add(new Student("St2222", "AnNguyen", 2000, 9.9));
        arr.add(binh); // mày đưa tao vùng new hoặc tọa độ vùng new 
        // có 2 tọa độ trong túi , 2 thẻ bài trong túi
        // get() từng thẻ bài thì được tọa độ vùng new
        // [i] dc tọa độ vùng new , y chang mảng , mỗi phần tử mảng là 1 tọa độ
        System.out.println("The student list: ");
        // mảng đang giảm dần về điểm , túi giảm dần về điểm
        // thẻ bài 1 trỏ vùng điểm cao , tọa độ 2 trỏ vùng điểm thấp
        for (Student x  : arr) { // trong ar là 1 đống con trỏ
            x.showprofile();
            
        }
        System.out.println("The student list truyền thống : ");
        for (int i = 0; i < arr.size(); i++) {
            Student xx = arr.get(i); // lấy tọa độ đang nằm trỏ thứ i
            xx.showprofile();
            // nhớ câu có tọa độ chấm luôn
        }
        // đổi dc 2 thằng thì đổi dc cái giỏ , 2 vòng for 
        Student tmp = arr.get(0); // tmp trỏ cùng An 9.9
        arr.set(0, arr.get(1)); // con trỏ thứ 0 trong giỏ , phải trỏ thằng bình 7.8 
        arr.set(1, tmp); // con trỏ 1 thay cách trỏ vào vùng tmp đang trỏ , tmnp đang trẻo An 9.9
        // vùng new Student vẫn nằm im chỉ có thẻ bài trong giỏ trot lại vùng new
        
        System.out.println("Sort: ");
        for (Student student : arr) {
            student.showprofile();
        }
        arr.remove(1);
        System.out.println("Sort: ");
        for (Student student : arr) {
            student.showprofile();
        }
    }
    public static void playWithArrayList() {
       // Student[]arr = new Student[500];
        //arr là 1 cái túi chứa sẵn 500 chỗ, 500 mons đồ cí thể bỏ vô 
        // món đồ phải đi mua , new
// tên mảng chính là má mì , quản lí nhiều đồ 
       // List arr = new ArrayList(); // đựng lộn xộn đủ loại con trỏ 
                   // đúng nghĩa túi DORA , món gì cũng đựng, đựng tham chiếu thôiii nha
                   
         // túi đồng nhất chỉ lưu con trỏ Student
       List<Student> arr = new ArrayList(); // túi đựng đồng nhất 1 loại
       // arr là cái túi chứa vô hạn chỗ , vô hạn con trỏ
       
       // nhét đồng nhất món đồ thì mới dễ chấm chung được , đa hình được
       
       // Mơer ngăn tủ , túi nhét đồ vô 
       //arr[i] = new Student(...)---> mảng
       //arr.add(new Student(...)); // lưu con trỏ thôi, new Student thoair mái bên ngoài vùng heap
       // lưu danh sách thôi 
       // danh sách chỉ phần tham chiếu, mày chỉ cần ngồi chỗ thôi tao có cách kết nối mày
       
       Student s1 = new Student("SE123456", "AN NGUYỄN", 2005, 8.9);
       Student s2 = new Student("SE123457", "Bình NGUYỄN", 2002, 9.9);
       
       // tao cần 1 con trỏ sinh viên , cần 1 tọa độ dc lưu trữ , cần 1 tham chiếu đến ai đó
       arr.add(s1); // giỏ vùng new ARRAYLIST , tủ có thêm 1 con trẻo, sinh ra 1 con trỏ
       arr.add(s2); // sinh ra thêm con trỏ nữa [1]
                    // add() vô tận, mảng [length-1] hết mức
                    // new cứ nằm HEAP, sinh viên cứ ở nhà , công nhân cứ ở xưởng, bệnh nhân cứ ở phòng bệnh\
        // add() mở khóa kéo , khóa dây nhét đồ vô, nhét tham chiếu , thẻ bài vô
        // sinh ra con trỏ 
        arr.add(s1); // add trùng nè 1 tên người vào danh sách, 
        // Set ko báo lỗi nhưng mà chỉ lấy một thôi
        arr.add(new Student("SE9439494", "CHIẾN", 2000, 9.9));
        // new cứ lên heap mà nằm bệnh nhân cứ về phòng , tớ nắm thẻ bài thôi
        // 1 con trỏ nữa lại được ép vào
        
        // hỏi xem cái túi có bao nhiêu đồ
        // arr.length hỏi túi mà , hỏi má mì mà , hỏi tên mảng mà
        System.out.println("The bag has: "+arr.size()+"món đồ");
        // 4sv in ra , nhưng thưcj ra chỉ có 3sv, do có người đếm trùng
        
        // in mọi người ra 
        // tủ có gì , chứa bên trong 1 đống con trỏ
        // mảng : [i].showProfile()
        // Tủ arrayList[contro, contro2....]
        // add đẩy vào 1 con trỏ, tọa độ
        // get(vị trí thẻ bài muốn lâyus), trả về tọa độ con trỏ thứ i
        //                                  trả về địa chỉ vùng new đang trỏ
        // [i] lấy được tham chiếu bạn thứ i
        // get(i) lấy được chỗ ngồi tham chiếu con trỏ thẻ bài thứ i
        // a, thẻ này trỏ bạn sinh viên kia kìa
        
        // in bạn đầu tiên
        Student xx = arr.get(0); // trả về tọa độ con trỏ thẻ bài thứ 0
        System.out.println("The student list: ");
        xx.showprofile();
       
        // bạm 1 thì get(1), có tọa độ chấm luôn cho rồi thêm biến làm cc gì 
        arr.get(1).showprofile();
       
        System.out.println("In xịn sò : ");
        for (Student x : arr) { //éo sợ null add đến đâu thêm con trỏ đến đó 
            // x = ar.get[i] = arr[i]
            x.showprofile();
        }
        System.out.println("In theo truyền thống");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showprofile();
        }
        // có hành động xóa 1 con trỏ , loại bỏ 1 thẻ bài , món đồ , gạch tên
        // 1 người khỏi danh sách 
        // vùng new Student bị mất hay không tùy vào mấy con trỏ trỏ nó 
        // size() giảm liền , mảng éo có , fixz cứng luppm
        // set() đảo con trỏ , đảo vị trí trỏ , trỏ sang vùng khác (get() hàm set() xưa nay
        
    }
}
