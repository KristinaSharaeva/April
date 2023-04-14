import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


class task {
    public static void main(String[] args) {
      try {
        File file = new File("file.txt");
        if (file.createNewFile()) {
            FileWriter writer = new FileWriter(file);
            for (int i=0; i<100; i++) writer.write("TEXT");          
            writer.close();
            System.out.println("Создан файл и записано в файл слово TEXT 100 раз");


        } else {
          System.out.println("файл уже создан, ничего делать не надо");
        }
      } catch (IOException e) {
        System.out.println("Ошибка");
        e.printStackTrace();
      }
    }
  }