import java.io.*;
import java.net.SocketOption;
import java.util.*;

public class Main {
    private static String current;
    public static void main(String[] args) {

        System.out.println("Please, login");
        try {
            chooseUsers();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String chooseUsers() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your speciality");
        System.out.println("(1) Director");
        System.out.println("(2) Marketer");
        System.out.println("(4) Manager");
        System.out.println("(5) Worker");
        System.out.println("(6) SalesManager");
        System.out.println("(0) close");

        do {
            System.out.print("Your choice ");
            String choose = sc.nextLine();
            switch (choose.toLowerCase(Locale.ROOT)) {
                case "Director":
                case "1":
                    current="Director";
                    System.out.println("Welcome, Director");
                    System.out.println("Enter your username and password");
                    directorInputLgPw();
                    break;
                case "Marketer":
                case "2":
                    current="Marketer";
                    System.out.println("Welcome, Marketer");
                    System.out.println("Enter your username and password");
                    marketerInputLgPw();
                    break;
                case "Manager":
                case "4":
                    current="Manager";
                    System.out.println("Welcome, provider");
                    System.out.println("Enter your username and password");
                    managerInputLgPw();
                    break;
                case "Worker":
                case "5":
                    current="Worker";
                    System.out.println("Welcome, provider");
                    System.out.println("Enter your username and password");
                    workerInputLgPw();
                    break;
                case "SalesManager":
                case "6":
                    current="SalesManager";
                    System.out.println("Welcome, provider");
                    System.out.println("Enter your username and password");
                    salesmanagerInputLgPw();
                    break;
                default:
                    System.out.println("Who are you?");
                    System.out.print("Do you want to log out[1] or repeat[0]? ");
                    int ex = sc.nextInt();
                    if (ex == 0){
                        chooseUsers();
                    }
                    else if(ex == 1){
                        System.exit(0);
                    }
            }
            break;
        } while (true);
        return "";
    }

    public static void directorInputLgPw() {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("director");
        loginArrayList.add("marketer");
        loginArrayList.add("HR");
        loginArrayList.add("manager");
        loginArrayList.add("worker");
        loginArrayList.add("salesmanager");
        passwordArrayList.add("dirPass");
        passwordArrayList.add("marPass");
        passwordArrayList.add("hrPass");
        passwordArrayList.add("manPass");
        passwordArrayList.add("worPass");
        passwordArrayList.add("salPass");

        do {
            System.out.print("Enter your username: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Director, you loged in successfully!");
                directorsActions();
                break;
            } else {
                System.out.println("Repeat again");
            }
        } while (true);
    }

    public static void marketerInputLgPw() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("director");
        loginArrayList.add("marketer");
        loginArrayList.add("HR");
        loginArrayList.add("manager");
        loginArrayList.add("worker");
        loginArrayList.add("salesmanager");
        passwordArrayList.add("dirPass");
        passwordArrayList.add("marPass");
        passwordArrayList.add("hrPass");
        passwordArrayList.add("manPass");
        passwordArrayList.add("worPass");
        passwordArrayList.add("salPass");

        do {
            System.out.print("Enter your username: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Marketer, you loged in successfully!");
                marketersActions();
                break;
            } else {
                System.out.println("Repeat again");
            }
        } while (true);
    }

    public static void salesmanagerInputLgPw() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("director");
        loginArrayList.add("marketer");
        loginArrayList.add("HR");
        loginArrayList.add("manager");
        loginArrayList.add("worker");
        loginArrayList.add("salesmanager");
        passwordArrayList.add("dirPass");
        passwordArrayList.add("marPass");
        passwordArrayList.add("hrPass");
        passwordArrayList.add("manPass");
        passwordArrayList.add("worPass");
        passwordArrayList.add("salPass");

        do {
            System.out.print("Enter your username: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("SalesManager, you loged in successfully!");
                salesManagersActions();
                break;
            } else {
                System.out.println("Repeat again");
            }
        } while (true);
    }




    public static void managerInputLgPw() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("director");
        loginArrayList.add("marketer");
        loginArrayList.add("HR");
        loginArrayList.add("manager");
        loginArrayList.add("worker");
        loginArrayList.add("salesmanager");
        passwordArrayList.add("dirPass");
        passwordArrayList.add("marPass");
        passwordArrayList.add("hrPass");
        passwordArrayList.add("manPass");
        passwordArrayList.add("worPass");
        passwordArrayList.add("salPass");

        do {
            System.out.print("Enter your username: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Manager, you have logged in successfully!");
                managersActions();
                break;
            } else {
                System.out.println("Repeat again!");
            }
        } while (true);
    }
    public static void workerInputLgPw() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("director");
        loginArrayList.add("marketer");
        loginArrayList.add("HR");
        loginArrayList.add("manager");
        loginArrayList.add("worker");
        loginArrayList.add("salesmanager");
        passwordArrayList.add("dirPass");
        passwordArrayList.add("marPass");
        passwordArrayList.add("hrPass");
        passwordArrayList.add("manPass");
        passwordArrayList.add("worPass");
        passwordArrayList.add("salPass");

        do {
            System.out.print("Enter your username: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Provider, you have logged in successfully!");
                workersActions();
                break;
            } else {
                System.out.println("Repeat again!");
            }
        } while (true);
    }

    //Actions

    public static void directorsActions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, director! Choose the number of your work bellow. If you finished your work write 0.");

        System.out.println("1. Show a list of all customer coverage areas by region");
        System.out.println("2. Show list of budget categories");
        System.out.println("3. Show allocated budget for a specific category of marketing slots");
        System.out.println("4. Show Current Marketing Tools");
        System.out.println("5. Show the total budget required for salary");
        System.out.println("6. Raise an employee's salary");
        System.out.println("7. Reduce an employee's salary");
        System.out.println("8. Show a list of equipment for the construction of facilities");
        do {
        System.out.print("Your choice: ");
        String chooseAction = sc.nextLine();

        switch (chooseAction.toLowerCase(Locale.ROOT)) {
            case "action1":
            case "1":
                System.out.println("Action 1");
                Marketer.coverage();
                directorsActions();
                break;
            case "action2":
            case "2":
                System.out.println("Action 2");
                System.out.println("Categories of budjet \nMarketting\nSalary");
                directorsActions();
                break;
            case "action3":
            case "3":
                System.out.println("Action 3");
                System.out.println("Enter  a category: \n[1] Instagram \n[2] Facebook\n[3] Youtube");
                String n1 = sc.nextLine();
                switch (n1) {
                    case "1":
                    case "Instagram":
                        Marketer.totalBudjet("Instagram");
                    case "2":
                    case "Facebook":
                        Marketer.totalBudjet("Facebook");
                    case "3":
                    case "Youtube":
                        Marketer.totalBudjet("Youtube");
                }
                directorsActions();
                break;
            case "action4":
            case "4":
                System.out.println("Action 4");
                Marketer.budjet();
                directorsActions();
                break;
            case "action5":
            case "5":
                System.out.println("Action 5");
                Marketer.budjet();
                directorsActions();
                break;
            case "6":
                System.out.println("Action 6");
                System.out.println("Enter the name of the worker: ");
                String n = sc.nextLine();
                System.out.println("Sum of raise: ");
                int n2 = sc.nextInt();
                Marketer.raiseSalary(n, n2);
                directorsActions();
                break;
            case "7":
                System.out.println("Action 7");
                System.out.println("Action 6");
                System.out.println("Enter the name of the worker: ");
                String n3 = sc.nextLine();
                System.out.println("Sum of raise: ");
                int n4 = sc.nextInt();
                Marketer.reduceSalary(n3, n4);
                directorsActions();
                break;
            case "8":
                System.out.println("Action 8");
                directorsActions();
                break;
            default:
                System.out.println("There is no action like that in the list!");
                directorsActions();
                break;
            case "n":
                try {
                    chooseUsers();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            case "action0":
            case "Action0":
            case "0":
                System.out.println("Exit");
                break;
        }break;
    } while (true);

    }


    public static void salesManagersActions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, salesmanager! Choose the number of your work bellow. If you finished your work write 0.");

        System.out.println("Menu:");
        System.out.println("1. Show list of all clients");
        System.out.println("2. Customer search:");
        System.out.println("3. Show available apartments for shopping");
        System.out.println("4. Show sold apartments");
        System.out.println("5. Show the most expensive apartment");
        System.out.println("6. Show the cheapest apartment");
        System.out.println("7. Exit");
        do {
            System.out.print("Your choice: ");
            String chooseAction = sc.nextLine();
            switch (chooseAction.toLowerCase(Locale.ROOT)) {
                case "action1":
                case "1":
                    System.out.println("Action 1");
                    Salesmanager.allClients();
                    salesManagersActions();
                    break;
                case "action2":
                case "2":
                    System.out.println("Action 2");
                    System.out.println("Enter the name of the client: ");
                    Salesmanager.search(sc.nextLine());
                    salesManagersActions();
                    break;
                case "action3":
                case "3":
                    System.out.println("Action 3");
                    Salesmanager.empty();
                    salesManagersActions();
                    break;
                case "action4":
                case "4":
                    System.out.println("Action 4");
                    Salesmanager.max();
                    salesManagersActions();
                    break;
                case "action5":
                case "5":
                    System.out.println("Action 5");
                    Salesmanager.min();
                    salesManagersActions();
                    break;
                default:
                    System.out.println("There is no action like that in the list!");
                    salesManagersActions();
                    break;
                case "n":
                    try {
                        chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case "action0":
                case "Action0":
                case "0":
                    System.out.println("Exit");
                    break;
            }
            break;
        } while (true);
    }

    public static void managersActions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, manager! Choose the number of your work bellow. If you finished your work write 0.");

        System.out.println("1. Show list of employees");
        System.out.println("3. Show list of works");
        System.out.println("3. Show a list of instructions to employees");
        System.out.println("4. Show a list of all coverage areas");
        System.out.println("5. Exit");
        do {
            System.out.print("Your choice: ");
            String chooseAction = sc.nextLine();
            switch (chooseAction.toLowerCase(Locale.ROOT)) {
                case "action1":
                case "1":
                    System.out.println("Action 1");
                    Manager.workersList();
                    salesManagersActions();
                    break;
                case "action2":
                case "2":
                    System.out.println("Action 2");
                    System.out.println("Enter the name of the worker:");
                    String name = sc.nextLine();
                    System.out.println("Enter the task");
                    String task = sc.nextLine();
                    Manager.addTask(name,task);
                    salesManagersActions();
                    break;
                case "action3":
                case "3":
                    System.out.println("Action 3");
                    Manager.taskShow();
                    salesManagersActions();
                    break;
                case "action4":
                case "4":
                    System.out.println("Action 4");
                    Manager.coverage();
                    salesManagersActions();
                    break;
                case "n":
                    try {
                        chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case "action0":
                case "Action0":
                case "0":
                    System.out.println("Exit");
                    break;
            }
            break;
        } while (true);
    }

    public static void marketersActions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, marketer! Choose the number of your work bellow. If you finished your work write 0.");

        System.out.println("1. Show a list of all customer coverage areas by region");
        System.out.println("2. Show list of categories for marketing");
        System.out.println("3. Show allocated budget for a specific category of marketing slots");
        System.out.println("4. Show total budget for marketing");
        System.out.println("5. Spend a budget on promotion:");
        System.out.println("6. Exit");
        do {
            System.out.print("Your choice: ");
            String chooseAction = sc.nextLine();
            switch (chooseAction.toLowerCase(Locale.ROOT)) {
                case "action1":
                case "1":
                    System.out.println("Action 1");
                    Marketer.coverage();
                    salesManagersActions();
                    break;
                case "action2":
                case "2":
                    System.out.println("Action 2");
                    Marketer.socialMedia();
                    salesManagersActions();
                    break;
                case "action3":
                case "3":
                    System.out.println("Action 3");
                    Marketer.budjet();
                    salesManagersActions();
                    break;
                case "action4":
                case "4":
                    System.out.println("Action 4");
                    Marketer.holeBudjet();
                    salesManagersActions();
                    break;
                case "action5":
                case "5":
                    System.out.println("Action 5");
                    System.out.println("Choose platform for promotion \n[1] Instagram\n[2] Facebook\n[3] Youtube");
                    String n = sc.nextLine();
                    System.out.println("Enter the amount you want to spend: ");
                    int n1 = sc.nextInt();
                    switch (n) {
                        case "1":
                        case "Instagram":
                            Marketer.spend("Instagram", n1);
                        case "2":
                        case "Facebook":
                            Marketer.spend("Facebook", n1);
                        case "3":
                        case "Youtube":
                            Marketer.spend("Youtube", n1);
                    }
                    salesManagersActions();
                    break;
                default:
                    System.out.println("There is no action like that in the list!");
                    salesManagersActions();
                    break;
                case "n":
                    try {
                        chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case "action0":
                case "Action0":
                case "0":
                    System.out.println("Exit");
                    break;
            }
            break;
        }while (true);
    }


    public static void workersActions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, worker! Choose the number of your work bellow. If you finished your work write 0.");

        System.out.println("1. Show a list of tasks assigned to me.");
        System.out.println("2. Show a list of completed directions.");
        System.out.println("3. Show the list of tasks I'm working on.");
        System.out.println("4. Show salary");
        System.out.println("5. Exit");
        do {
            System.out.print("Your choice: ");
            String chooseAction = sc.nextLine();
            switch (chooseAction.toLowerCase(Locale.ROOT)) {
                case "action1":
                case "1":
                    System.out.println("Action 1");
                    System.out.println("Your tasks are: ");
                    Worker.myTasks(current);
                    salesManagersActions();
                    break;
                case "action2":
                case "2":
                    System.out.println("Action 2");
                    Worker.finished(current);
                    salesManagersActions();
                    break;
                case "action3":
                case "3":
                    System.out.println("Action 3");
                    Worker.inProgress(current);
                    salesManagersActions();
                    break;
                case "action4":
                case "4":
                    System.out.println("Action 4");
                    Worker.salary(current);
                    salesManagersActions();
                    break;
                default:
                    System.out.println("There is no action like that in the list!");
                    salesManagersActions();
                    break;
                case "n":
                    try {
                        chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case "action5":
                case "Action5":
                case "5":
                    System.out.println("Exit");
                    break;
            }
            break;
        }while (true);
    }

    public static void Menu() throws IOException{
        System.out.println("1. Show all the kind of fabrics in the market");
        System.out.println("2. Search for fabric");
        System.out.println("3. Show the report about fabrics");
        System.out.println("4. Order a fabric");
        System.out.println("5. Look at the list of fabrics");
        System.out.println("6. Show the fabrics that we lack");
        System.out.println("7. Delete from order");
        System.out.println("8. Exit");
        ShowMenu();
    }
    public static void ShowMenu() throws IOException{
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("(Чтобы увидеть меню снова, нажмите [0]) Введите-->");
            var action = input.nextLine();
            switch(action){
                case "0": Menu(); break;
                case "1":
                    System.out.println("ShowFullList()");
                    break;
                case "2":
                    System.out.println("Search();");
                    break;
                case "3":
                    System.out.println("ShowReport();");
                    break;
                case "4":
                    System.out.println("Order();");
                    break;
                case "5":
                    System.out.println("OrderList();");
                    break;
                case "6":
                    System.out.println("Lack();");
                    break;
                case "7":
                    System.out.println("Delete();");
                    break;
                case "8": System.out.println("Exit()"); System.exit(1);
                break;
                case "n":
                    try {
                        chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                default: System.out.print("Пожалуйста, введите номера из меню.");
            }
        }
    }
}