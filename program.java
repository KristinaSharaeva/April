

class Homework {

    private static boolean isSumBetween10And20(int a, int b) {
        int sum = a+b;
        boolean c = 10 <= sum & sum <= 20 ;
    return c;
     }

     private static boolean isPositive (int x) {
        return x > 0 ? true : false;
        
    }

    private static void printString(String source, int repeat) {
        for (int i=0; i<repeat; i++) {
        System.out.println(source);
        }
    }

    private static boolean isLeapYear(int year) {
        if (year%4 == 0 && year%100!=0 || year%400==0)
            return true;
        else 
            return false;
    }

    private static int[] createArray(int len, int initialValue) {
        int[]createArray;
        createArray = new int[len];
        for (int i=0; i < len; i++)   {
            createArray[i] = initialValue;
            } 
        return createArray;
        }

public static void main(String[] args) {
    System.out.println(isSumBetween10And20(5,37));
    System.out.println(isPositive (10));    
    printString ("ghg", 7);
    System.out.println(isLeapYear(1800));
    for (int i=0; i < createArray(4,8).length; i++)   {
        System.out.println(createArray(4,8)[i]);
        } 
}
}
