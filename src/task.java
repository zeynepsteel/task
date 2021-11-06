import java.util.ArrayList;
import java.util.Arrays;

public class task {
    public static void main(String[] args) {
     Integer num=78324;
     boolean flag=true;

   int count=0;
       while (num>0) {
           num /= 10;
           count++;

       }
        System.out.println("the length of the number is "+count);



}}
