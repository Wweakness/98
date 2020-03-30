import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String[] a1=str1.split(" ");
        int n=Integer.parseInt(a1[0]);
        int m=Integer.parseInt(a1[1]);
        int k=Integer.parseInt(a1[2]);
        String[] a2=str2.split(" ");
        int[] a=new int[a2.length];
        for(int i=0;i<a2.length;i++){
            a[i]=Integer.parseInt(a2[i]);
        }
        Arrays.sort(a);
        int result=0;
        for(int i=0;i<a.length;i++){
            if(i==a.length-1){
                result=result+(a[a.length-1]+k*m)/2;
            }
            else{
                result=result+(a[i]+k*m);
            }
        }
        System.out.println(result);

    }
}
