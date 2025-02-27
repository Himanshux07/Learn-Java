import java.util.Scanner;

public class BinaryComplement {
    public static int findComplement(int num) {
        int mask = 1;
        while (mask < num) {
            mask = (mask << 1) | 1;
        }
        return num ^ mask;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        int complement = findComplement(num);
        System.out.println("Binary complement: " + complement);
    }
}
