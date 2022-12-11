import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        //получить входящие данные
        String path = "";
        File file;//обязательно
        boolean fileExists;//обязательно
        boolean isDirectory;
        int i=0;
        for (; ; ) {
            System.out.println("Введите путь:");
            path = new Scanner(System.in).nextLine();
            file = new File(path);
            isDirectory=file.isDirectory();
            fileExists = file.exists();
            //выполнить операции
            if (isDirectory){
                System.out.println("указанный путь является путём к папке, а не к файлу");
                continue;
            }
            if (isDirectory==false&&fileExists==false) {
                System.out.println("файл/папка не существует");
                continue;
            }
            if (fileExists) {
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер "+(++i));
            }
        }
    }

}

