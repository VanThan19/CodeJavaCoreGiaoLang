
package studentmanagementv2;

import data.Cabinet;


public class StudentManagementv2 {

    public static void main(String[] args) {
        Cabinet se = new Cabinet(); // có cái tủ tribf cáu tủ có cái túi --- ngăn trống
        se.addAsStudent();
        se.addAsStudent();
        se.printStudentList();
//        se.searchAsStudent();
//        se.searchAsStudent();
//        se.upadateAsStudent(); // giả bộ tìm k thấy
//        se.upadateAsStudent();
        se.removeAsStudent();
       
        
        
    }
    
//    public static void main(String[] args) {
//        Cabinet se = new Cabinet();
//        System.out.println("Input SE add student: ");
//        se.addAsStudent();
//        se.addAsStudent();
//        Cabinet ia = new Cabinet();
//        System.out.println("Input IA add student: ");
//        ia.addAsStudent();
//        
//        System.out.println("SE in :");
//        se.printStudentList();
//        System.out.println("IA in ");
//        ia.printStudentList();
//    }
    
}
