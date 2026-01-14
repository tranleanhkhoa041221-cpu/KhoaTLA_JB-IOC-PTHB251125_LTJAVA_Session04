import java.util.Scanner;

public class BaiTapGioi1 {
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
        System.out.println();
        System.out.println("Nhập số cần tìm: ");
        int target = Integer.parseInt(sc.nextLine());
        int linearIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                linearIndex = i;
                break;
            }
        }
        if (linearIndex != -1) {
            System.out.println("Tìm kiếm tuyến tính: Số " + target + " có tại vị trí " + linearIndex);
        } else {
            System.out.println("Tìm kiếm tuyến tính: Không tìm thấy số " + target);
        }
        int left = 0;
        int right = n - 1;
        int binaryIndex = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                binaryIndex = mid;
                break;
            } else if (arr[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (binaryIndex != -1) {
            System.out.println("Tìm kiếm nhị phân: Số " + target + " có tại vị trí " + binaryIndex);
        } else {
            System.out.println("Tìm kiếm nhị phân: Không tìm thấy số " + target);
        }
    }
}
