import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library System");
            System.out.println("1. Login sebagai admin");
            System.out.println("2. Login sebagai mahasiswa");
            System.out.println("3. Keluar");
            System.out.println("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // keluar dari loop

            switch (choice) {
                case 1:
                    loginAdmin(scanner);
                    break;
                case 2:
                    loginMahasiswa(scanner);
                    break;
                case 3:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan salah");
            }

            if (choice == 3) {
                break;
            }
        }

        scanner.close();
    }

    private static void loginAdmin(Scanner scanner) {
        System.out.println("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.println("Masukkan password: ");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Login admin berhasil!");
        } else {
            System.out.println("Username atau password salah!");
        }
    }

    private static void loginMahasiswa(Scanner scanner) {
        System.out.println("Masukkan NIM: ");
        String nim = scanner.nextLine();

        if (nim.length() == 15) {
            System.out.println("Login mahasiswa berhasil!");
        } else {
            System.out.println("Panjang NIM harus 15 karakter!");
        }
    }
}