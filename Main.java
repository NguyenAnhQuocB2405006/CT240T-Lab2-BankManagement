import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankManager manager = new BankManager();
        int choice;
        do {
            System.out.println("\n===== QUẢN LÝ TÀI KHOẢN NGÂN HÀNG =====");
            System.out.println("1. Thêm tài khoản");
            System.out.println("2. Tìm tài khoản");
            System.out.println("3. Chuyển tiền");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Thêm tài khoản");
                        break;
                    case 2:
                        System.out.println("Tìm tài khoản");
                        break;
                    case 3:
                        System.out.println("Chuyển tiền");
                        break;
                    case 4:
                        System.out.println("Thoát chương trình.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                choice = 0;
            }
        } while (choice != 4);
        scanner.close();
    }
}