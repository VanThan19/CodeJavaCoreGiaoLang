package data;

import java.util.*;

public class Cabinet {

    // tủ thì sẽ có nhiều món đồ. Ta xài mảng , arraylist,collection
    private List<Student> arr = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    // làm biếng làm phễu luôn , mõi thứ sẽ là default , túi từ từ dc add vô
    // mình k chơi trò mua tủ có sẵn luôn 1 cái túi, troing túi có sẵn hồ sơ
    // nếu muốn làm thì new sẵn túi bên ngoài có sẵn sv đưa vào trong tủ
    // default/empty constructror không làm gì cả
    // k cần phễu, vì kl cần gán gì cả, có  sẵn hết rồi
    // arr là biến con trỏ, cần trỏ vùng new cái túi, tao cần túi trước đã
    // éo quan tâm trong túi có gì, add từ từ cũng dc
    // phễu để đổ value có value sẵn thì cần gì phễu
    public Cabinet() {
        // đổ value rồi thì cần đéo j nựa
    }

    // hành động của cái tủ là thêm hồ sơ, timf hồ sơ, sắp xếp hồ sơ, xóa hồ sơ
    public void addAsStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Input Student profile #" + (arr.size() + 1) + ":");

        while (true) {

            System.out.println("Input id: ");
            id = sc.nextLine().trim().toUpperCase(); // cắt trắng dư, đổi qua Hoa
            // vừa gõi id xong, check liền coi trùng không, có, chửi bắt nhập
            Student xxx = searchAsStudent(id);
            if (xxx == null) {
                break; //k thấy cói sv nào ứng với id vừa gõ này, k trùng
                // break để nhập tiếng ìno còn lại
            } else {
                System.out.println("Trùng id, nhập lại");
            }

        }

        System.out.println("Input name: ");
        name = sc.nextLine().trim().toUpperCase();
        System.out.println("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.println("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr.add(new Student(id, name, yob, gpa));
        System.out.println("The new student has been added successfully");

    }

    public void printStudentList() {
        if (arr.isEmpty()) {
            System.out.println("The student list is empty. Nothing to print: ");
            return;
        }
        System.out.println("There is/are " + arr.size() + "student(s)");
        for (Student student : arr) {
            student.showProfile();
        }
    }

    // tim kiem ho so 
    public Student searchAsStudent(String id) { // đưa id trả sv
        if (arr.isEmpty()) {
            return null;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) {
                return arr.get(i);
            }
        }
        return null;
    }

    // hàm này bao hàm trên lại, dùng lại, cung cấp id, nhìn ra nbgoaif tủ
    // thấy có 2 cách sợt , bạn đưa id hăocj bạn nhập id
    public void searchAsStudent() {
        String id;
        System.out.println("Input a student id that you want to search: ");
        id = sc.nextLine().trim();
        Student xxx = searchAsStudent(id);
        if (xxx == null) {
            System.out.println("NOT FOUND!!!");
            return;
        } else {
            System.out.println("Student FOR!!!Here she/he is");
            xxx.showProfile();
        }
    }

    public void upadateAsStudent(String id, double newGPA) {
        Student xxx = searchAsStudent(id);

        if (xxx == null) {
            System.out.println("Student not found! nothing to upadate");

        } else {
            System.out.println("Before update");
            xxx.showProfile();
            // mời nhập điểm mới/ giá tiền mới

            xxx.setGpa(newGPA);

            System.out.println("After update");
            xxx.showProfile();
        }

    }

    public void upadateAsStudent() {
        String id;
        double newGPA;
        System.out.println("Input the student iud that you want to update profile: ");
        id = sc.nextLine().trim();
        Student xxx = searchAsStudent(id);
        // có thamn chiếu trỏ đến vùng new student cóp id cần tìm

        if (xxx == null) {
            System.out.println("Student not found! nothing to upadate");

        } else {
            System.out.println("Before update");
            xxx.showProfile();
            // mời nhập điểm mới/ giá tiền mới
            System.out.println("Input new gpa");
            newGPA = Double.parseDouble(sc.nextLine());

            xxx.setGpa(newGPA);
            System.out.println("After update");
            xxx.showProfile();
        }
    }

    public void removeAsStudent() {
        String xid;
        System.out.println("Nhap id cua sinh vien bạn muon xoa ");
        xid = sc.nextLine().trim();
        Student xxx = searchAsStudent(xid);

        if (xxx == null) {
            System.out.println("Khong tim thay sinh vien nao");
        } else {

            System.out.println("ĐÃ Xóa");
            xxx.showProfile();

        }
    }
}
