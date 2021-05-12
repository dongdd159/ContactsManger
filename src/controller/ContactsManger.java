package controller;

import model.Contact;
import storage.ContactsFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContactsManger {
    ContactsFile contactsFile = ContactsFile.getINSTANCE();
    private static List<Contact> contactList = new ArrayList<>();
    public ContactsManger() {
    }
    public static List<Contact> getContactList() {
        ContactsFile contactsFile = ContactsFile.getINSTANCE();
        contactList = contactsFile.readFile();
        return contactList;
    }
    public static void setContactList(List<Contact> contactList) {
        ContactsManger.contactList = contactList;
    }
    public void writeFile(){
        for (Contact contact:contactList) {
            contactsFile.writeFile(contact);
        }
    }
    public void addCon(Contact contact) {
        contactList.add(contact);
        contactsFile.writeFile(contact);
    }
    public Contact findbyPhoneNumber(String phonenum){
        for (Contact contact:contactList) {
            if (phonenum==contact.getPhonenum()){
                return contact;
            }
        }
        return null;
    }
    public void removeCon(String phonenum){
        contactList.remove(findbyPhoneNumber(phonenum));
        writeFile();
    }
    @Override
    public String toString() {
        return "ContactsManger{" +
                "contactsFile=" + contactsFile +
                '}';
    }
}
