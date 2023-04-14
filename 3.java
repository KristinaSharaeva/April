

class c {
    
    static String createstring(int n, char a, char b)  {
        String res = ""; 
        for (int i=0; i<=n;) {
           String temp;
           temp = Character.toString(a) + Character.toString(b);
           res = res + temp; 
            i=i+2;

            
        }          
        

        return res;
    }

        public static void main(String[] args) {
    

                System.out.println(createstring(6,'a','b'));

          }   
  }
