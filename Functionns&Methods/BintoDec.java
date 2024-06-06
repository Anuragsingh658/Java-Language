public class BintoDec {
    public static void BintoDec(int BinNum){
        int myNum = BinNum;
        int pow = 0;
        int DecNum = 0;
        while (BinNum > 0) {
            int lastdigit = BinNum%10;
            DecNum=DecNum+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            BinNum = BinNum/10;
        }
        System.out.println("decimal of"+myNum+"="+DecNum);
    }
    public static void main(String args[]){
        BintoDec(101);
    }
}