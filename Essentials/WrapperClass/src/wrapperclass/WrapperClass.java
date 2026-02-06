
package wrapperclass;


public class WrapperClass {

    
    public static void main(String[] args) {
        //playWithInteger();
        //playWithPointers();
        playWithPools();
    }
    
    public static void playWithPools() {
        // hồ bơi : nhiều chàng trỏ 1 nàng , share chung vùng new Wrapper
        Integer n1 = new Integer("2003");
        Integer n2 = new Integer(2003); // ko khuyễn khichs dùng
        Integer n3 = new Integer(2003);
        
        Integer n4 = 2003; //boxing, đóng hộp
        Integer n5 = 2003;
        
        // n1 có bằng n2 k
        System.out.println("");
        //n2 có bằng n3 ko
        //n4 có bằng n5 k
        
        Integer n6 = 100; // boxing đóng hộp new ngầm
        Integer n7 = 100;
        
        //  CHỐT HẠ : KO CARE VIỆC SO SÁNH 2 BIẾN OBJ DÙNG ===
        // VÌ KẾT QUẢ ĐÚNG SAI KO BIẾT CHÍNH XÁC, LIÊN QUAN ĐẾN POOL VÀ KO POLL
        // ĐÚNG CHUẨN LÀ PHẢI : CHẤM ĐỂ VÀO BÊN TRONG VÙNG NEW MÀ LẤY VALUE RA SO SÁNH
        // MỖI OBJ/CLASS NÊN LÀM LUÔN SẴN HÀM SO SÁNH VỚI CÙNG ĐỒNG LOẠI
        // SO XEM MÌNH CÓ EQUALS (NGƯỜI KIA KHÔNG)
        // SO XEM MÌNH TƯƠNG QUAN THẾ NÀO COMPARETO (NGƯỜI KIA)
        
    }
    public static void playWithPointers() {
        Integer num0 = 2000;
        Integer num1 = 2000;
        // MUỐN SO SÁNH 2 OBJ THÌ PHẢI VÀO VÙNG NEW , PHẢI CHẤM
        if (num0.equals(num1)) { // so sánh 2 địa chỉ làm đéo chi, phải so sánh bên trong num1 và mum2 lõi là data chúng mày có bằng nhau ko
            System.out.println("hai đứa num0 và num1 bằng nhau");
        }
        else {
            System.out.println("num0 éo bằng num1");
        }
        
        System.out.println("So sánh lõi num0 và num1: " + num0.equals(num1));
        
    }
    
    public static void playWithInteger() {
        int num0 = 2003; // 4 byte 
        Integer num1 = new Integer("2003"); 
        Integer num2 = new Integer(2003); // trò này đừng nên chơi ở jdk 10 trở đi
        Integer num3 = 2003;  // new ngầm , không nói rõ lệnh new , bản chất vẫn là new 
                              // nhìn tự nhiên
        // in thử
        
        System.out.println("num0: "+num0); // xài luôn cùng ram
        System.out.println("num1: "+num1); // biến con trỏ , gọi thầm tên em 
        System.out.println("num2: "+num2.toString());
        System.out.println("num3: "+num3.intValue());
        // vào bên trong lấy value lõi ra mà xài, lõi chính là int 4 byte 
        // gói 4 byte thành hộp bự obj, ta gọi là boxing, đóng hôipj primitive
        //Boxing là hiện tượng : primitive ----> obj
        // gán primitive vào biến obj --> new trước rồi nhét value vào trong hạt nhân
        
        int num4 = num3; // con trỏ mà chơi được với primitive sao 
                         // địa chỉ gán primitive sao ???
                         // đừng lo, nó vào vùng new của num3 lôi ra cấy lõi chính là 
                         // chính là 1 con int value = 2003 thảy sang num4, ổn ngay
                       // KHUI HỘP, khui thùng, khui quà, lấy lõi thảy sang pri
                       //UNBOXING: GÁN TỪ WRAPPER OBJECT SANG PRIMITIVE
        System.out.println("num4:"+num4);
        
        //Integer num3 = 2003
        
        System.out.println("Check num3: "+num3);
        num3 = 2022; // điều gì xảy ra trong ram 
                     // new ngầm , 1 vùng new Integer mới (2022 đổ vào)
                     // móa vùng new Integer cũ của lõi 2003 ở trên kia bị giết, dọn dẹp
          // WRAPPER CLASS ÉO CÓ HÀM SET, CHỈ CÓ HÀM GET
          // CLASS NÀY OBJECT NÀY GIỐNG KIỂU TỨC LÀ 1 KHI ĐÃ NEW RA ĐÚC RA, KO SỬA LẠI SẢN PHẨM
          // CLASS NÀO TRONG CUỘC ĐỜI BẠN LÀM RA + ĐÁM WRAPPER NÀY MÀ KHÔNG CHO
          // SỬA GIÁ TRỊ ĐỔ VÀO, NGƯỜI TA GỌI ĐÓ LÀ IMMUTABLE CLASS
          // CLASS K CHO PHÉP HIỆU CHỈNH INFO, MÚN HIỆU CHỈNH NEW MỚI
          
          // MUTABLE LÀ CLASS CÓ HÀM SET , SỬA DC VALUE LÕI/ ĐẶC ĐIỂM
          
    }
    //WRAPPER CLASS LÀ NHỮNG CLASS SINH RA ĐỂ BAO CÁI PRIMITIVE LẠI THÀNH 1 OBJECT
    // LÕI CỦA OBJECT NÀY CHÍNH LÀ CHỈ CÓ 1 BIẾN THÔI, BIẾN PRIMITIVE
    // CẢ THẾ GIỚI LÚC NÀY LÀ OBJECT . DO ĐÓ CÁI TÚI COLLECTION/SET/MAP/LIST SẴN SÀNG
    // CHỨA CÁC CON SỐ, 1 MÌNH CON SỐ, THEO KIỂU TRỎ VÀO VÙNG NEW WRAPPER CLASS
    // LÕI CHÍNH LÀ SỐ CẦN LƯU
    // LÕI KHÁC MẢNG[] 2 LOẠI MẢNG PRI VÀ MẢNG OBJ
    
    // WRAPPER CLASS : BYTE  SHORT INTEGER  LONG  FLOAT   DOUBLE   BOOLEAN  CHARACTER
    //                 byte  short  int     long   float  double   boolean   char
    
}
