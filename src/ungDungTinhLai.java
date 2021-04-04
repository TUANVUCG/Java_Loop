import java.util.Scanner;

public class ungDungTinhLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền cho vay: ");
        double soTienChoVay = sc.nextDouble();
        System.out.println("Nhập tỷ lệ lãi xuất (% năm) : ");
        double tyLeLaiXuat = sc.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        double soThang = sc.nextDouble();
        double soTienLai = 0;
        for (int i = 0; i < soThang; i++) {
            soTienLai += soTienChoVay * tyLeLaiXuat / 100 / 12 * soThang;
        }
        System.out.println("Số tiền lãi là : "+soTienLai);
    }
}
