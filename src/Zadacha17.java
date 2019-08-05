import java.io.*;

public class Zadacha17 {

        public static void main(String[] args) {
            String input;

            BufferedReader ff = new BufferedReader (new InputStreamReader(System.in));

            try(FileWriter s = new FileWriter ("text.txt")) {

                System.out.println("Наберите текст для записи в файл. Для окончания ввода текста наберите строку 'стоп': "); // это указание для пользователя, тестирующего программу по принципу "черного ящика"
            do {
                input = ff.readLine();
            if (input.compareTo("стоп") == 0) break;

            input = input + "\r\n";
            s.write(input);

            }

            while(
                input.compareTo("стоп") != 0
                );
            }
            catch(IOException exc){

                System.out.println("Ошибка! " + exc);
            }

        }
}
