package ra.presentation;

import ra.entity.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManager {
    public static Map<String, Student> students = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("************************************MENU**********************************");
            System.out.println("1. Danh sách sinh viên");
            System.out.println("2. Thêm mới các sinh viên");
            System.out.println("3. Xóa sinh viên theo mã sinh viên");
            System.out.println("4. Tính điểm trung bình của tất cả sinh viên");
            System.out.println("5. In thông tin sinh viên có điểm trung bình lớn nhất");
            System.out.println("6. In thông tin sinh viên có tuổi nhỏ nhất");
            System.out.println("7. Thoát");
            System.out.println("Lựa chọn từ 1 - 7: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    dispalyData();
                    break;
                case 2:
                    addStudent(scanner);
                    break;
                case 3:
                    deleteStudent(scanner);
                    break;
                case 4:
                    calculateTotalSalary();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1 - 7");
            }
        } while (true);
    }

    public static void dispalyData() {
        System.out.println("Danh sách sinh viên: ");
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    public static void addStudent(Scanner scanner) {
        System.out.println("Nhập số lượng sinh viên cần thêm: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Student student = new Student("", "", 0, 0);
            student.inputData(scanner);
            students.put(student.getStudentId(), student);
        }
    }

    public static void deleteStudent(Scanner scanner) {
        System.out.print("Nhập mã sản sinh viên cần xóa: ");
        String studentId = scanner.next();

        if (students.remove(studentId) != null) {
            System.out.println("Sinh viên đã được xóa!");
        } else {
            System.out.println("Sinh viên không tồn tại.");
        }
    }

    public static void calculateTotalSalary() {
        float totalScore = 0;
        for (Student student : students.values()) {
            totalScore += student.getAverage();
        }
        float average = totalScore / students.size();
        System.out.println("Điểm trung bình của tất cả sinh viên: " + average);
    }


}
