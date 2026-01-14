import java.util.Scanner;

public class BaiTapXuatSac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        int choice2 = 0 ;
           while (true) {
               System.out.println(""" 
                       --- QUẢN LÝ ĐIỂM SINH VIÊN --- 
                       1. Xem tất cả điểm 
                       2. Sắp xếp điểm 
                       3. Tìm kiếm điểm 
                       4. Thống kê điểm 
                       5. Thoát 
                       Lựa chọn của bạn: """);
               int choice = Integer.parseInt(sc.nextLine());
               switch (choice) {
                   case 1: {
                       System.out.println("Danh sách điểm: ");
                       for (int i = 0; i < arr.length; i++) {
                           System.out.println("Sinh viên " + (i + 1) + ": " + arr[i]);
                       }
                   }
                   break;
                   case 2: {
                       System.out.println("Chọn cách sắp xếp:\n1. Tăng dần\n2. Giảm dần");
                       choice2 = Integer.parseInt(sc.nextLine());
                       if (choice2 == 1) {
                           for (int i = 0; i < n - 1; i++) {
                               for (int j = 0; j < n - i - 1; j++) {
                                   if (arr[j] > arr[j + 1]) {
                                       int temp = arr[j];
                                       arr[j] = arr[j + 1];
                                       arr[j + 1] = temp;
                                   }
                               }
                           }
                           System.out.println("Mảng sau khi sắp xếp tăng dần:");
                           for (int num : arr) {
                               System.out.print(num + " ");
                           }
                           System.out.println();
                           System.out.println("Đã sắp xếp tăng dần");

                       } else if (choice2 == 2) {
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
                           System.out.println("Đã sắp xếp giảm dần");
                       }
                   }
                   break;
                   case 3: {
                       System.out.print("Nhập điểm cần tìm: ");
                       int target = Integer.parseInt(sc.nextLine());
                       int linearIndex = -1;
                       for (int i = 0; i < n; i++) {
                           if (arr[i] == target) {
                               linearIndex = i;
                               break;
                           }
                       }
                       if (linearIndex != -1) {
                           System.out.println("Tìm kiếm tuyến tính: Điểm " + target + " có tại vị trí " + linearIndex);
                       } else {
                           System.out.println("Tìm kiếm tuyến tính: Không tìm thấy điểm " + target);
                       }
                       int left = 0;
                       int right = n - 1;
                       int binaryIndex = -1;
                       while (left <= right) {
                           int mid = (left + right) / 2;
                           if (arr[mid] == target) {
                               binaryIndex = mid;
                               break;
                           }
                           if (choice2 == 1) {
                               if (arr[mid] < target) {
                                   left = mid + 1;
                               } else {
                                   right = mid - 1;
                               }
                           } else if (choice2 == 2) {
                               if (arr[mid] < target) {
                                   right = mid - 1;
                               } else {
                                   left = mid + 1;

                               }
                           }
                       }
                       if (binaryIndex != -1) {
                           System.out.println("Tìm kiếm nhị phân: Điểm " + target + " có tại vị trí " + binaryIndex);
                       } else {
                           System.out.println("Tìm kiếm nhị phân: Không tìm thấy điểm " + target);
                       }
                   }
                       break;
                   case 4: {
                       double sum = 0;
                       int min = arr[0], max = arr[0];
                       for (int i = 0; i < arr.length; i++) {
                           sum += arr[i];
                           if (arr[i] > max) {
                               max = arr[i];
                           }
                           if (arr[i] < min) {
                               min = arr[i];
                           }
                       }
                       double average = sum / arr.length;
                       int countAboveAverage = 0;
                       for (int score : arr) {
                           if (score > average) {
                               countAboveAverage++;
                           }
                       }
                       System.out.printf("Diểm trung bình: %.2f \n", average);
                       System.out.printf("Diểm cao nhất: %d \n", max);
                       System.out.printf("Diểm thấp nhất: %d \n", min);
                       System.out.printf("Số sinh viên có điểm trên trung bình: %d \n", countAboveAverage);
                   }
                   break;
                   case 5: {
                       System.out.println("Thoát chương trình.");
                       System.exit(0);

                   }
                   default:
                       System.out.println("Lựa chọn không hợp lệ!");
               }
                       }
                       }
                   }





