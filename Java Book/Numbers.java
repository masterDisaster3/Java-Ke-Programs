
public class Numbers {
    
    public static void counter(){

        int counter = 1;

        while(counter <= 10){
            System.out.printf("%d ", counter);
            ++counter;
        }

        System.out.printf("\n");
    }

    public static void evenNumbers(int num){

        int counter = 1;

        while(counter <= num){
            if(counter % 2 == 0)
                System.out.printf("%d ", counter);
            ++counter;
        }

        System.out.printf("\n");
    }

    public static void primeNumbers(int num){

        int divider;
        for(divider = num - 1; divider >= 2; divider--){
            if(num % divider == 0){
                break;
            }     
        }
        if(divider < 2)
        System.out.printf("The number %d provided is prime!",num);
        else
        System.out.printf("The number %d is not prime!", num); 
    }

    public static void factorial(int num){
        int fact = 1;
        for(int multiplier = num; multiplier >= 2; multiplier--){
        
            fact *= multiplier;
        }
        System.out.println(fact);
    }
}
