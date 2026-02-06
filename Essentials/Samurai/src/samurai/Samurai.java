// tự sát
package samurai;

import java.util.Scanner;

public class Samurai {

    public static void main(String[] args) {
        //inputProfile();
        inputProfileXinSo();
    }

    public static void inputProfileXinSo() {
        // không opp , chỉ cẩn hiểu về việc nhập info trước đã , ko chơi class Student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        // vòng lặp vô cực
        while (true) { // cuộc chiến vvoo cực , while điều gì luôn đúng thì tiếp tục
            try {
                // lệnh cà chớn nằm đây
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                // alt shift f : căn cốt đẹp trai
                break;
            } catch (Exception e) {

                System.out.println("So ku know to iput a positive nummber? ");

            }

        }
// nếu nhập đúng thì gặp break , nếu nhập sai thì đéo gặp break bay vèo xuống đây gặp câu chửi 
// chửi xong gặp vòng lặp vô tận đi lên
        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile: ");
        System.out.println("Name: " + name);

        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }

    // nhập thông tin sinh viên cơ bản và in ra 
    public static void inputProfile() {
        // không opp , chỉ cẩn hiểu về việc nhập info trước đã , ko chơi class Student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        // mặc định JVM sẽ giết app nếu có cà chớn xảy ra để đảm bảo an toàn cho app, xử lí data
        // đưa cho ta 1 cơ chế tự xử khi có cà chớn , chuyền quyền giết chóc cho mình
        // báo cho JVM biết đừng giết , tao tự xử , nhốt các câu lệnh cà chớn lại
        try {
            // lệnh cà chớn nằm đây
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
            // alt shift f : căn cốt đẹp trai
        } catch (Exception e) {
            //CPU sẽ chạy đến chỗ này khi có cà chớn xảy ra 
            // JVM k giết app như truyền thống nữa 
            // chỗ này là chỗ xử lý hậu quả cà chớn
            // k có cà chớn thì k vaò đây
            // chữ e là lá thư mà JVM gửi cho mình báo rằng có lỗi nè/ cà chớn nè làm gì thì làm 
            //Exception e = new Exeception( nộik dung lỗi màu đỏ đây nè..)
            // về lí : e.xem lỗi

            // phương pháp xử lý :
            // dèault value (k hay) 
            yob = 69;
            // hay : bắt nhập lại

        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile: ");
        System.out.println("Name: " + name);

        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }

}
