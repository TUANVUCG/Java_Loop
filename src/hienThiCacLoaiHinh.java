import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("Nhập lựa chọn của bạn: ");
        System.out.println("1. In hình chữ nhật");
        System.out.println("2. In hình tam giác vuông");
        System.out.println("3. In hình tam giác cân");
        System.out.println("4. Thoát");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1: {
                System.out.println("Nhập cạnh hình chữ nhật");
                System.out.printf("Chiều cao : ");
                int a = sc.nextInt();
                System.out.printf("Chiều rộng : ");
                int b = sc.nextInt();
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < b; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
            case 2: {
                System.out.println("In hình tam giác vuông");
                System.out.println("Nhập cạnh đáy: ");
                int canhDay = sc.nextInt();
                for (int i = 0; i < canhDay; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }System.out.println(" ");
                }
            }
            case 3:{
                System.out.println("In hình tam giác cân");
                System.out.println("Nhập chiều dài: ");
                int chieuDai = sc.nextInt();
                for(int i = 0; i<chieuDai; i++){

                }
            }
        }
    }
}
