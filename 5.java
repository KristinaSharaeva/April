import java.util.ArrayList;

class task5 {
    
    static private ArrayList<String> removeEvenNumber (ArrayList<String> strings) {

        for (int i = 0; i < strings.size(); i++) {
            
            try {               
            int number_to_check = Integer.parseInt(strings.get(i));
            if (number_to_check % 2 == 0)  strings.remove(i);

         } catch (NumberFormatException e) {}
        }
        return strings;
    }

    static private ArrayList<String> removeIntegers (ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            
            try {               
            Integer.parseInt(strings.get(i));
            strings.remove(i);

         } catch (NumberFormatException e) {}
        }
               
        return strings;
    }
  
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        strings = removeEvenNumber(strings);
        strings = removeIntegers(strings);
        
        System.out.println(strings);

    }
}
