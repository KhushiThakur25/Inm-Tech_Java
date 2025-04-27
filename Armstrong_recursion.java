public class Armstrong_recursion {
    static int count_dig(int n,int count){
        if(n <= 0){
            return count;
        }
        return count_dig(n/10,count + 1);
    }
static int summation(int n,int count,int sum){
    if(n <= 0){
        return sum;
    }
    sum += (int)Math.pow(n%10, count);

    return summation(n/10, count, sum);
}

    static boolean isArmstrong(int n,int count){
        int sum = summation(n,count,0);
        return sum == n;
        
    }
    public static void main(String[] args) {
        int n = 145;
        int count = count_dig(n,0);
        if (isArmstrong(n,count)){
            System.out.println("Number is Armstrong..");
        }else{
            System.out.println("Number is not Armstrong..");
        }
    }
}
