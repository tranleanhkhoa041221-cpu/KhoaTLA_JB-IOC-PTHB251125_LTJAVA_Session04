import java.util.Scanner;

public class BaiTapKha2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số hàng của mảng: ");
            int rows = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập số cột của mảng: ");
            int columns = Integer.parseInt(sc.nextLine());

            int[][] arr = new int[rows][columns];
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Phần tử [" + i + "][" + j + "]: ");
                    arr[i][j] = Integer.parseInt(sc.nextLine());
                }
            }
            int sumEven = 0;
            int sumOdd = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (arr[i][j] % 2 == 0) {
                        sumEven += arr[i][j];
                    } else {
                        sumOdd += arr[i][j];
                    }
                }
            }
            System.out.println("Tổng các số chẵn: " + sumEven);
            System.out.println("Tổng các số lẻ: " + sumOdd);

        }
    }

