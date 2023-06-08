import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap 1 so: ");
        int moi = scanner.nextInt();
        int[] mangGoc = {1, 2, 3, 4, 5};
        int[] mangMoi = new int[mangGoc.length + 1];
        for (int i = 0; i < mangGoc.length; i++) {
            mangMoi[i] = mangGoc[i];
        }
        mangMoi[mangMoi.length - 1] = moi;
        System.out.println("Mang moi: " + Arrays.toString(mangMoi));
    }
}