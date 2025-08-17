import java.util.Scanner;
class MaxMin{
public static void main(String s[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number");

int n1=sc.nextInt();
//Scanner sc=new Scanner(System.in);
System.out.println("Enter 2nd number");



int n2 =sc.nextInt();
///Scanner sc=new Scanner(System.in);
System.out.println("Enter 3rd number");

int n3 =sc.nextInt();


if (n1>n2 && n1>n3){
System.out.println("greatest number is "+n1);
}
else if (n2>n3){
System.out.println("greatest number is "+n2);
}
else
System.out.println("greatest number is "+n3);



}
}