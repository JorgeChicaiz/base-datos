
package aj1;
import java.util.Scanner;
public class AJ1 {

    public static void main(String[] args) {
        int n1,n2,s;
        Scanner teclado=new Scanner(System.in);
        System.out.print("NUMERO 1");
        n1=teclado.nextInt();
        System.out.print("NUMERO 2");
        n2=teclado.nextInt();
        s=n1+n2;
        System.out.println("SUMA:"+s);
    }
    
}
