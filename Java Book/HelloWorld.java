public class HelloWorld{

    public static void main(String[] args){
        System.out.println("Prime number!");
        System.out.println(isPrime(3));

    }


    static boolean isPrime(int num){

        int div;

        for(div = num - 1; div >= 2; div--){
                if(num % div == 0)
                    break;
        }
        if(div < 2)
            return true;
        else
            return false;
    }
}