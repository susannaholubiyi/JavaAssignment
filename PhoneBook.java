import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PhoneBook {

    private static ArrayList<String> contactNames = new ArrayList<>();
    private static ArrayList<String> phoneNumbers = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    public PhoneBook (){
        contactNames.clear();
        phoneNumbers.clear();
    }
    public static ArrayList getContactName(){
        return contactNames;
    }
    public static String getContactName1(int num){
        return contactNames.get(num - 1);
    }

    public static void setContactName(String name) {
        contactNames.add(name);
    }

    public static ArrayList getPhoneNumbers(){
        return phoneNumbers;
    }

    public static void setPhoneNumbers(String phoneNumber){
        phoneNumbers.add(phoneNumber);
    }

    public static boolean isValidPhoneNumber(String phoneNumber){
        for(int index = 0; index < phoneNumber.length(); index ++){
            int digit = phoneNumber.charAt(index) - '0';
            if (digit < 0 || digit > 9){
                return false;
            }
        }
        return true;
    }

    public static void addContact(String name, String number){
        contactNames.add(name);
        phoneNumbers.add(number);
    }

    public void deleteContact(String name){
        for(int index = 0; index < contactNames.size(); index++) {
            if (contactNames.get(index) == name) {
                contactNames.remove(index);
                phoneNumbers.remove(index);
            }
        }
    }

    public String viewContact(){
        String contacts = "";

        for(int index = 0; index < contactNames.size(); index++){
           contacts += contactNames.get(index) + "\t" + phoneNumbers.get(index) + "\n";
        }

        return contacts;

    }

    public String editContact(String oldName, String newName, String oldNumber, String newNumber) {
        String outputMessage = null;
        for (int index = 0; index < contactNames.size(); index++) {

            if (Objects.equals(contactNames.get(index), oldName)) {
                contactNames.remove(index);
                contactNames.add(newName);

                phoneNumbers.remove(index);
                phoneNumbers.add(newNumber);
                outputMessage = "Contact has been edited";

            } else
                outputMessage = "Contact does not exist!";
        }
        return outputMessage;
    }

    public String searchContact (String contactName){
        String searchedContact =  "";
        boolean contactFound = false;
        for(int index = 0; index < contactNames.size(); index++){
            if(contactName.equals(contactNames.get(index))){

                searchedContact += contactNames.get(index) + "\t" + phoneNumbers.get(index) +"\n";
                contactFound = true;
                break;
            }
        }
        if (!contactFound) {
            searchedContact = "Contact does not exist";
        }

        return searchedContact;
    }
}

