import Menu.Menu;
import entities.Account;
import service.LoginService;
import service.RegisterService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        Account account = new Account();
        LoginService login = new LoginService();
        RegisterService register = new RegisterService();
        Menu menu = new Menu();
        menu.menuDisplay(scanner, accounts, login, register,account);
    }
}
