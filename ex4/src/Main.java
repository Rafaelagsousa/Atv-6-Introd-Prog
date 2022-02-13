
import java.util.Scanner;

class Main {

    public static boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
    if (n % i == 0) {
    return false;
    }
    }
    return true;
    }

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
        scanner.close();

    if (isPrime(n) == true && n != 1) {
     System.out.println("primo");
    } else {
     System.out.println("nao e primo");
    }
    }
}
