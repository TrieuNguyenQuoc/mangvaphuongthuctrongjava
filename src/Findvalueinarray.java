import java.util.Scanner;

public class Findvalueinarray {
    public static void main(String[] args) {
        String[] students = {"huy", "quân", "tùng", "nguyên", "lực", "hoàng", "nam", "phúc", "tân", "tuấn", "đoàn", "triệu"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập tên học viên :");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("vị trí của học viên " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("không tìm thấy" + input_name + " trong danh sách .");
        }
    }
}

