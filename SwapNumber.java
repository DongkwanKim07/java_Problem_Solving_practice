public class SwapNumber {
    public static void main(String[] arg){
        int a = 10;
        int b = 20;

        System.out.println("a is " + a + " and b is " + b );
        a = a + b; // now a is sum of both the numbers
        b = a - b; // a - b = (a + b) - b = a ( b is swapped)
        a = a - b; // (a + b) - b = b (b is swapped)

        System.out.println("After swapping, a is " + a + " and b is "+ b );
    }
    
}
