import java.util.Scanner;

public class hienThiCacSoNguyenToNhoHon100 {
    public static boolean kiemTraSoNguyenTo(int number){
        if(number < 2){
            return false;
        }
        for(int i =2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int nhap = sc.nextInt();
        for(int i =2; i < nhap;i++){
            if(kiemTraSoNguyenTo(i)){
                System.out.print(i+ " ");
            }
        }
    }
}
