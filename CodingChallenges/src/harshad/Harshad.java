package harshad;

public class Harshad {
	
    public static int getSum(int num) {
        if(num%10 == num) {
            return num;
        } else {
            return num%10+getSum(num/10);
        }
    }
    
    public static boolean isHarshad(int num) {
        return num % getSum(num) == 0;
    }
    
    public static void main(String args[]) {
        System.out.println(Harshad.isHarshad(75));  // false
        System.out.println(Harshad.isHarshad(171)); // true
        System.out.println(Harshad.isHarshad(481)); // true
        System.out.println(Harshad.isHarshad(89));  // false
        System.out.println(Harshad.isHarshad(516)); // true
        System.out.println(Harshad.isHarshad(200)); // true
    }

}
