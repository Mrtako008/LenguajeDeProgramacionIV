import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("agrega un numero para x: ");
        double x = sc.nextDouble();
        System.out.print("agrega un numero para y: ");
        double y = sc.nextDouble();
        double res = (x/y);
        System.out.print(res);
    }
}
