import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    private PhoneBook phoneBook;
    @BeforeEach
    public void setUp(){
        phoneBook = new PhoneBook();

    }

    @Test
    public void testThatPhoneBookExists(){

        assertNotNull(phoneBook);
    }

    @Test
    public void testThatNameOfContactHasName(){

        phoneBook.setContactName("Seyi");
        ArrayList<String> newArrayList= phoneBook.getContactName();
        assertNotEquals(0,newArrayList.size());
    }

    @Test
    public void testThatPhoneNumbersHasNumber(){

        phoneBook.setPhoneNumbers("08106317491");
        ArrayList<String> newArrayList = phoneBook.getPhoneNumbers();
        assertNotEquals(0, newArrayList.size());
    }

    @Test
    public void testThatContactHasBeenSaved(){

    }
    @Test
    public void testThatValidatePhoneNumber(){
        assertFalse(phoneBook.isValidPhoneNumber("-0873993"));
        assertFalse(phoneBook.isValidPhoneNumber("0810oeoyt"));
        assertTrue(phoneBook.isValidPhoneNumber("08033339112"));

    }

    @Test
   public void testThatCheckIfContactHasBeenDeleted(){

      phoneBook.addContact("Sue", "08106317491");
      phoneBook.addContact("Sam", "2346067819");
      phoneBook.addContact("Seth", "08033339112");

      phoneBook.deleteContact("Seth");

        assertEquals(2, phoneBook.getContactName().size());
        assertEquals(2, phoneBook.getPhoneNumbers().size());

        assertEquals("Sue", phoneBook.getContactName().get(0));
    }

    @Test
    public void deleteContactThatDoesNotExist_phoneBookRemainsTheSameTest(){

        assertEquals(0, phoneBook.getContactName().size());

        phoneBook.addContact("Sola", "081317491");
        phoneBook.addContact("Sam", "2346067819");
        phoneBook.deleteContact("Sonny");

        assertEquals(2, phoneBook.getContactName().size());
        assertEquals(2, phoneBook.getPhoneNumbers().size());
    }

    @Test
    public void editNameAndNumber_nameAndNumberIsEditedTest(){
        phoneBook.addContact("Joy", "0290018");
        assertEquals("Joy", phoneBook.getContactName1(1));

        assertEquals("Contact has been edited", phoneBook.editContact("Joy",
                "Sharon", "0290018", "1112"));

    }

    @Test
    public void editNameOnly_onlyNameIsEditedTest(){
        phoneBook.addContact("Joy", "0290018");
        assertEquals("Joy", phoneBook.getContactName1(1));

        assertEquals("Contact has been edited", phoneBook.editContact("Joy",
                "Sharon", "0290018", "0290018"));

    }

    @Test
    public void editNumberOnly_onlyNumberIsEditedTest(){
        phoneBook.addContact("Joy", "0290018");
        assertEquals("Joy", phoneBook.getContactName1(1));

        assertEquals("Contact has been edited", phoneBook.editContact("Joy",
                "Joy", "0290018", "08109149434"));

    }

    @Test
    public void viewContact_contactDisplaysTest() {
        phoneBook.addContact("Joy", "0290018");
        phoneBook.addContact("Amy", "765");

        String contacts = """
                            Joy	0290018
                            Amy	765
                            """;

        assertEquals(contacts, phoneBook.viewContact());
    }



    @Test
    public void searchExistingContact_contactIsDisplayedTest(){
        phoneBook.addContact("Joy", "08033339112");
        phoneBook.addContact("Bank pin", "7650");

        String searchedContact = """
                   Bank pin\t7650
                   """;

        assertEquals(searchedContact, phoneBook.searchContact("Bank pin"));
    }

    @Test
    public void searchNonExistingContact_contactIsDisplayedTest(){
        phoneBook.addContact("Joy", "08033339112");
        phoneBook.addContact("Bank pin", "7650");

        String searchedContact = "Contact does not exist";


        assertEquals(searchedContact, phoneBook.searchContact("Sope"));
    }
}