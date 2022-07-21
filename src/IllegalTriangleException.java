import java.util.Scanner;
public class IllegalTriangleException extends Throwable {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = scanner.nextInt();
            System.out.println("Enter b: ");
            int b = scanner.nextInt();
            System.out.println("Enter c: ");
            int c = scanner.nextInt();
            if(a<0 || b<0 || c<0 || (a+b)<c || (b+c)<a || (a+c)<b)
                throw new IllegalTriangleException();
        } catch (IllegalTriangleException e) {
            System.out.println("can't form a triangle");
        }
    }
}
