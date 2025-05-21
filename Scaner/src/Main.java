import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.print("agrega un texto: ");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        System.out.print(texto);
    }
}
