import java.util.Scanner;

public class BaiTapGioi2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số lượng phần tử của mảng: ");
            int n = Integer.parseInt(sc.nextLine());
            if (n <= 0) {
                System.out.println("Mảng không có phần tử");
            } else {
            int[] arr = new int[n];
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.println("Phần tử thứ " + (i + 1) + ": ");
                arr[i] = Integer.parseInt(sc.nextLine());
            }
            int[] result = new int[n];
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    result[index++] = arr[i];
                }
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    result[index++] = arr[i];
                }
            }
            System.out.println("Mảng sau khi sắp xếp:");
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }

}
