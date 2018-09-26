import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int size = arrayExample.getSize();
        int[] array = arrayExample.createRandomArray(size);
        arrayExample.displayArray(array);
        arrayExample.getElement(array);
    }

    public int getSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kích thước của mảng: ");
        int size = scanner.nextInt();
        return size;
    }

    public int[] createRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        return array;
    }

    public void displayArray(int[] array) {
        System.out.println("Mảng vừa tạo là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public void getElement(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập vào vị trí của phần tử trong mảng: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Phần tử thứ " + index + " là: " + array[index - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ngoại lệ: Vượt quá giới hạn của mảng " + e.getMessage());
        }
    }

}
