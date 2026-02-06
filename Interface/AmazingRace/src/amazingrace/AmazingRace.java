
package amazingrace;

import data.*;
import java.util.Random;


public class AmazingRace {

   
    public static void main(String[] args) {
        runToDead();
    }
    
    public static void runToDead() {
        
        // CÓ MYX NHÂN NGƯ CỦA CHÂU TRỊNH TRI NHẢY VÀO
        // OBJ ON THE GO , CẦN CÓ HÀM ĐUA VÀ GÁY THÀNH TÍCH LÀ XONG, ÉO LÀM CLASS
        Dua m = new Dua() {
            // VÙNG KHÔNG GIAN CỦA CLASS RỜI MÀ TA LÀM BIẾNG LÀM RIÊNG
            // VÙNG NÀY CHÍNH LÀ PHẦN MỞ RỘNG CỦA CHA/CLB
            // BA SẼ LÀ CÁNH CHIM (NEW SUPPER() NEW ĐUA)
            // ĐƯA CON EXTENDS/IMPLEMENTS THẬT XA THẬT NHIỀU @OVERRIDE
            // TA CÓ QUYỀN LÀM NHƯ TRUYỀN THỐNG , THÊM ĐẶC ĐIỂM
            // ĐỪNG LÀMJ DỤNG, ON THE GO THÌ QUAN TÂM PHẦN ĐANG THAM GIA
            public static final double MAX_SPEED = 1000.0;
            @Override 
            public double runToDead() {
                return new Random().nextDouble()*MAX_SPEED*3;
            }
            // ANONY LÀM BIẾNG TẠO CLASS RỜI CHO CẢ ABS VÀ INT
            // BÊN ABS CLASS THÌ TA CÒN CÓ ĐẶC ĐIỂM CỦA CHA CHO ĐỂ XÀI 
            // ANNO CỦA INT , ĐUA THÌ ĐUA ĐI, HỎI HAN LÀM CHI, K CÓ INFO

            @Override
            public void showHowToDead() {
               System.out.printf("|%-10s|%-10s|%4s|%4s|%4.1f|\n","Gà-Đua","CHOI","","",runToDead()); 
            }
        };
        Dog d1 = new Dog("NGAO DA", 2005, 50.0);
        // chấm full hàm của con, đủ code hàm cha
        Pet d2 = new Dog("Vàng Ơi", 1999, 10.0);
        // chấm ful hàm cha, khai cha, chạy k sợ vì đa hình con qua mặt
        // tổ lái con trỏ dc , new dog
        Dua d3 = new Dog("Mực", 2000, 20.0);
        Motor m1 = new Motor("EXCITER", "150.0cm3", "37K1-68686");
        Dua m2 = new Motor("Winner", "150.0cm3", "37K2-99999");
        
        Dua a[] = {d1,(Dog)d2,d3,m1,m2,m};
        for (Dua x : a) {
            x.showHowToDead();
        }
    }
}
