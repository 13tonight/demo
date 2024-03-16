package mar16;

import java.awt.*;
import java.util.Scanner;

public class icheckmain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ICheck icheck = (value) -> value % 2 == 0;
        int a = sc.nextInt();
        System.out.println(icheck.checkVariable(a));

    }
}
