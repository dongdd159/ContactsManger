package model;

import javax.xml.crypto.Data;
import java.util.Date;

public class Contact {
    String name;
    String phonenum;
    String group;
    String gender;
    String address;
    String birth;
    String email;
    public Contact(String phonenum, String group, String name, String gender, String address, String birth, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.group = group;
        this.gender = gender;
        this.address = address;
        this.birth = birth;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhonenum() {
        return phonenum;
    }
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getBirth() {
        return birth;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return  phonenum + "," + group + "," + name + "," + gender + "," + address + "," + birth + "," + email + "," ;
    }
}
