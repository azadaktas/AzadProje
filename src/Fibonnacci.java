import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args) {
        //fibonacci
        //1 1 2 3 5 8 13 21 ....
       //  a b
        //     a+b=c
        Scanner tara = new Scanner(System.in);
        int n = tara.nextInt();
        int a = 1 ;
        int b = 1 ;
        int c ;

        for (int i = 0 ; i<n ; i++){
            c=a+b ;
            a=b;
            b=c;
            System.out.println(c);

        }
    }
}
