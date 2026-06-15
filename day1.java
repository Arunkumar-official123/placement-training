import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even=0;
        int odd=0;
       for(int i=0;i<n;i++){
           if(i%2==0){
               even++;
           }
           else{
               odd++;
           }
       }
       System.out.println("count of even number"+even);
       System.out.println("count of odd number"+odd);
       
    }
}