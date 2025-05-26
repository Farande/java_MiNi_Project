import java.util.*;
;public class CreateFun {
    public int addNumber(int a,int b){
        return a+b;
    }
    public int subNumber(int a,int b){
        return a-b;
    }
    public int mulNumbers(int a,int b){
        return a*b;
    }
    public double divNumber(int a,int b){
        if(b==0){
            return 0;
        }
        else{
            return a/b;
        }
    }
    public static void main(String[] args) {
       CreateFun c=new CreateFun();
       Scanner sc=new Scanner(System.in);
       
       System.out.println("enter first number::");
       int x=sc.nextInt();
       
       System.out.println("enter second number::");
       int y=sc.nextInt();

    System.out.println("the aadition of two numbers is:"+c.addNumber(x,y));
    System.out.println("the subtraction of two numbers is:"+c.subNumber(x,y));
    System.out.println("the multiplication of two numbers is:"+c.mulNumbers(x,y));
    System.out.println("the division of two numbers is:"+c.divNumber(x,y));

        }

    
}