import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row,column;
        System.out.println("Welcome to MineField !");
        System.out.println("Please enter the dimensions you want to play with!");
        System.out.print("Number of Rows : ");
        row = scanner.nextInt();
        System.out.print("Number of Columns : ");
        column = scanner.nextInt();

        MayinTarlasi mayin = new MayinTarlasi(row,column);
        mayin.run();


    }
}
