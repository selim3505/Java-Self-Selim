package Array;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int odd = 0;
        int even = 0;
        for(int eachNumber:numbers){
            System.out.println(eachNumber);
            if(eachNumber%2==0){
                even++;

            }else
                odd++;
        }
        System.out.println("Even numbers: "+even + " Odd numbers: "+odd);
    }
}

