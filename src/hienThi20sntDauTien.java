import java.util.Scanner;

public class hienThi20sntDauTien {
    public static boolean kiemTraSoNguyenTo(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int nhap = sc.nextInt();
        for (int i = 0; ; i++) {
            if(kiemTraSoNguyenTo(i)){
                System.out.print(i+ " ");
                count ++;
            }if(count>=nhap){
                break;
            }
        }
    }
}
