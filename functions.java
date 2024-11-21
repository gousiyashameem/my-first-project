// public class functions {
//     public static void PrintMyname(string name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//         scanner sc = new scanner(system.in);
//         string name = sc.next();

//         printmyname(name);
        
//     }
     
// }
import java.util.Scanner;

public class functions {
    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();

        printMyName(name);
        
        sc.close(); // Close the scanner to avoid resource leak
    }
}