public class DecToBin {
    public static void DecToBin(int n){
        int MyNum = n;
        int Pow = 0;
        int BinNum = 0;
        while(n>0){
            int rem = n%2;
            BinNum = BinNum + (rem*(int)Math.pow(10, Pow));
            Pow++;
            n = n/2;
        }
        System.out.println("binary form of" + MyNum + "="+ BinNum);
    }
    public static void main(String args[]){
        DecToBin(7);
    }
}
