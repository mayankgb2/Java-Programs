#https://www.facebook.com/lakshay.gulati.5/posts/3439658002768650
# subscribed by Lakshay

import java.util.Scanner;

public class isbn {

    public static void main(String[] args) {
        System.out.println("enter the 10 digit ISBN");
        long store[];
        long sum=0;
        store = new long[10];
        Scanner scan = new Scanner(System.in);
        String num= scan.next();
        long num1 = Long.parseLong(num);
        if(num.length()==10){
            for (int i=9;i>=0;i--){
                store[i]=(num1%10);
                num1=(num1/10);
                sum=sum+(store[i]*(i+1));
            }
            System.out.println(sum);
           if ((sum%11)==0) {
               System.out.println("Legal ISBN");
           }
            else{
                System.out.println("Illegal ISBN");
            }

        }
        else{
            System.out.println("Illegal ISBN");
        }
    }
}
