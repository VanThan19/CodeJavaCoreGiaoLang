package than.main;

import than.util.MyToys;

public class Stage {
    // chứa sàn diễn
    
    

    public static void main(String[] args) {
        System.out.println("PI: "+MyToys.PI);
        MyToys.PI = 4.0;
        System.out.println("Pi: "+MyToys.PI);
        //int n = MyToys.getAnInteger();
        //System.out.println("Đáp án đúng: "+n);
        int thongBao;
        thongBao = MyToys.getAnInteger("Mời nhập lựa chọn của bạn: ");
        System.out.println("Lựa chọn của bạn là : "+thongBao);
        
        

    }
}
