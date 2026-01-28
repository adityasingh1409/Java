import java.util.Scanner;
class avgfunction{
    int avg(int a,int b, int c){
        int average=(a+b+c)/3;
        return average;
    }
    public  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.print("average is"+ avg(3,6,9));
        
        
    }
}