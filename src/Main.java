import com.sun.javaws.jnl.RContentDesc;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Lab[]=new int[3];
        for(int iteration=0;iteration<3;iteration++)
        {
            Lab[iteration]=scanner.nextInt();
        }
        int capacity=scanner.nextInt();
        int conditionCheck[]=new int[3];
        int minimum=2147483647;
        for(int iterator=0;iterator<3;iterator++)
        {
            conditionCheck[iterator]=capacity<Lab[iterator]?1:0;
            if(conditionCheck[iterator]==1 && minimum>Lab[iterator])
            {
                minimum=Lab[iterator];
            }

        }
        String result=(minimum==Lab[0])?"L1":(minimum==Lab[1])?"L2":"L3";
        System.out.println(result);





    }
}