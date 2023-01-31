
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            ArrayList<String> section = new ArrayList<String>();
            section.add("Иван Владимирович");
            section.add("сборка");
            section.add("тесты");
            section.add("склад");

            ArrayList<String> defensCodeArray = new ArrayList<String>();
            defensCodeArray.add("7440иванвладимирович");
            defensCodeArray.add("7441сборка");
            defensCodeArray.add("7442тесты");
            defensCodeArray.add("7443склад");

            System.out.println("Пожалуйста, введите пароль");

            String codeStr = scan.next();
            String codeNorm = codeStr.replaceAll("[^\\d.]", ""); //Удаляет все символы алвавита
            if (codeNorm.equals("")) {System.out.println("Пароль не содержит цифр. Закрытие программы");}
            int code = Integer.parseInt(codeNorm);

            if (code == 7441 | code == 7442 | code == 7443 | code == 7440 ) {
                switch (code) {
                    case 7440:
                        System.out.println("Добрый день " + section.get(0));
                        break;
                    case 7441:
                        System.out.println("Добрый день отдел " + section.get(1));
                        break;
                    case 7442:
                        System.out.println("Добрый день отдел " + section.get(2));
                        break;
                    case 7443:
                        System.out.println("Добрый день отдел " + section.get(3));
                        break;
                    default:
                        System.out.println("Ошибка ИТ");
                }
            }
            else {System.out.println("Пожалуйста, введите ваш пароль и название отдела БЕЗ ПРОБЕЛОВ. Пример: [5244Кухня]");
                String defensCodeStr = scan.next();
                String defensCode = defensCodeStr.toLowerCase(Locale.ROOT);

                if (defensCode.equals(defensCodeArray.get(0)) || defensCode.equals(defensCodeArray.get(1)) || defensCode.equals(defensCodeArray.get(2)) || defensCode.equals(defensCodeArray.get(3))) {
                    System.out.println("Пароль принят. Добро пожаловать");}

                else {System.out.println("Иван Владимирович вошёл в вас");}
            }

        }
    }


