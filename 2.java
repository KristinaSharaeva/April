

class Hello {
    
    private static int[][] Array(int n){
        int[][] ar = new int[n][n];
        for (int i=0; i<n; i++) {
            ar[i][i]=1;
            ar[i][n-i-1]=1;

        }
       return ar; 
    }

public static void main(String[] args) {
    int n = 7;
    Array(n);

    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
        System.out.print(Array(n)[i][j]);  
        }
        System.out.println();
    }        
  }
}