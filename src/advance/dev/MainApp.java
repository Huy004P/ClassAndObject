package advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
        Student[] students = input();
        print(students);
    }

    public static Student[] input() {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i+1));
            System.out.print("Tên: ");
            String name = scanner.nextLine();
            System.out.print("Tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Địa chỉ: ");
            String address = scanner.nextLine();
            System.out.print("Số điện thoại: ");
            String phone = scanner.nextLine();
            System.out.print("Điểm trung bình: ");
            float gpa = scanner.nextFloat();
            scanner.nextLine();
            Student student = new Student(name, age, address, phone, gpa);
            students[i] = student;
        }
        scanner.close();
        return students;
    }

    public static void print(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Sinh viên thứ " + (i+1));
            System.out.println("Tên: " + students[i].getName());
            System.out.println("Tuổi: " + students[i].getAge());
            System.out.println("Địa chỉ: " + students[i].getAddress());
            System.out.println("Số điện thoại: " + students[i].getPhone());
            System.out.println("Điểm trung bình: " + students[i].getGpa());
            System.out.println();
        }
    }
}

