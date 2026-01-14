import java.util.Scanner;

public class BaiTapKha1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số lượng phần tử của mảng: ");
            int n = Integer.parseInt(sc.nextLine());
            int[] arr = new int[n];
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.println("Phần tử thứ " + (i + 1) + ": ");
                arr[i] = Integer.parseInt(sc.nextLine());
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("Mảng sau khi sắp xếp giảm dần:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        }
