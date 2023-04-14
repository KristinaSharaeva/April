import java.util.Scanner;
import java.util.ArrayList;

class anothertask {
    public static void main(String[] args) {
        
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
        
        Scanner myObj = new Scanner(System.in);
        
        String input = myObj.nextLine();
        
        if (input.equals("print")) {
            for (int i = strings.size()-1; i >= 0; i--) System.out.println(strings.get(i));
            continue;
        }
        if (input.equals("revert")) {
            strings.remove(strings.size()-1);
            continue;
        }
        
        strings.add(input);      
    }
}
}
