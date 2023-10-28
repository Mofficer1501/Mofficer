import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String stroka = scan.nextLine();
        String[] str = stroka.split(" ");
        boolean flag=false;

        for (int i = 0; i <= str.length; i++) {
            if (str[i].length() > 3 && str[i].charAt(0) == 'а'){
                System.out.println(str[i]);
                flag=true;
            }
        }
        if (flag==false) System.out.println("Слов на 'а' больше 3 символов не найдено");
        scan.close();
    }
}