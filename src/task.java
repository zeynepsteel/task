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

ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(10);
        arr.add(15);
        arr.add(17);
        arr.add(100);
        Integer max=arr.get(0);
        Integer second=arr.get(1);
        for (Integer a:arr) {
           if(a>max){
               max=a;
           }else if(max>a){
               second=max;
            }
        }
        System.out.println(max);
        System.out.println(second);
}}
