import java.util.Scanner;

   class Factorial{
public static void main(String s[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :- ");
int num =sc.nextInt();

System.out.println("Factorial o f"+num);

System.out.println("For GitHub");


for(int i=num-1;i>=1;i--){
 num *= i ;

}

System.out.println("Factorial is "+num);

}
}