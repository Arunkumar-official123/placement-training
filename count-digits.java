class Solution {
    public static int countDigits(int n) {
        int s=0;
        while(n>0){
            int b=n%10;
            s++;
            n=n/10;
        }
        return s;
    }
}