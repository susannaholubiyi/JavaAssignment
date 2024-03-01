package diary;


import javax.swing.*;

public class MainDiary {
    private static final String smiley = "\uD83D\uDE00";
    private static Diary diary;
    private static void print(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    private static String input(String prompt){
        return JOptionPane.showInputDialog(prompt + " ");
    }

    private static void mainMenu(){
        String menu = """
                **************** Welcome to your Diary ****************

                Enter any of the following numbers to carry out an action
                1-> Create diary
                2-> Unlock diary
                3-> Create entry
                4-> Find entry by Id
                5-> Update entry
                6-> Delete entry
                7-> Exit App
                """;
        String choice = input(menu);

        String password;
        switch (choice) {
            case "1" -> {
                String userName = input("Enter your name:");
                password = input("Enter your desired password:");
                Diaries.add(userName, password);
                print("Your diary has been created");
                print("Always remember your password. Happy writing" + smiley);
                mainMenu();
            }
            case "2" -> {
                password = input("Enter your password:");
                try {
                    diary.unlockDiary(password);
                    print("Your diary has been unlocked" + smiley);
                }
                catch (Exception e){
                    print(e.getMessage());
                }
                finally {
                    mainMenu();
                }

            }
            case "3" -> {
                String title = input("Enter the title of your new entry:");
                String body = input("Enter the body of your new entry:");
                try {
                    diary.createEntry(title, body);
                    print("your ID is" + diary.getNumberOfEntries());
                    print("Your entry has been added" + smiley);
                }
                catch (Exception e){
                    print(e.getMessage());
                }
                finally {
                    mainMenu();
                }
            }
            case  "4" -> {
                String id = input("Enter your Id:ny");
                try {
                   var entry  =diary.findEntryById(Integer.parseInt(id));
                   print(String.valueOf(entry));
                } catch (Exception e) {
                    print(e.getMessage());
                } finally {
                    mainMenu();
                }
            }
            case "5" ->{
                 String id = input("Enter your id:");
                 String newTitle = input("Enter the new title:");
                 String newBody = input("Enter the new body");
                 try {
                     diary.updateEntry(Integer.parseInt(id), newTitle, newBody);
                 }
                 catch (Exception e) {
                     print(e.getMessage());
                 }
                 finally {
                     mainMenu();
                 }
            }
            case "6"->{
                String id = input("Enter your id:");
                try {
                    diary.deleteEntry(Integer.parseInt(id));
                }
                catch (Exception e){
                    print(e.getMessage());
                }
                finally {
                    mainMenu();
                }
            }
            case "7"-> System.exit(69);
            default -> mainMenu();

        }

    }

    public static void main(String[] args) {
        mainMenu();
    }
}
