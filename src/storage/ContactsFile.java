package storage;

import model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactsFile {
    private static ContactsFile INSTANCE;
    public ContactsFile() {
    }
    public static ContactsFile getINSTANCE() {
        if (INSTANCE==null){
            INSTANCE = new ContactsFile();
        }
        return INSTANCE;
    }
    public List<Contact> readFile(){
        List<Contact> contacList = new ArrayList<>();
        try {
            File file = new File("contacts.csv");

            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] infor = line.split(",");
                contacList.add(new Contact(infor[0],infor[1],infor[2],infor[3],infor[4],infor[5],infor[6]));
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contacList;
    }
    public void writeFile(Contact contact){
        try {
            FileWriter writer = new FileWriter("contacts.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(contact.toString());
            bufferedWriter.write(" \n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
