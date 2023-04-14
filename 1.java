class HelloWorld {
    private static int[] Array(){
    int[]a;
    a = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    for (int i=0; i < a.length; i++)   {
        a[i] = a[i]==0 ? 1 : 0;
        } 
    return a;
    }

    private static int[] ctArray(){
        int[]b;
        b = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i < b.length; i++)   {
            b[i] = b[i]<6 ? b[i]*2 : b[i];
            } 
        return b;
    }
public static void main(String[] args) {
    for (int i=0; i <  Array().length; i++)   {
        System.out.print( Array()[i]);
        } 
        System.out.println(' ');
    for (int i=0; i <  ctArray().length; i++)   {
        System.out.println( ctArray()[i]);
        } 
}
}