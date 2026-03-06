package week12;


/**
 * Write a description of class Students here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

class Student {
    private String name;
    private String group;
    private String phone;

    public Student(String name, String group, String phone) {
        this.name = name;
        this.group = group;
        this.phone = phone;
    }

    public String getName() { return name; }
    public String getGroup() { return group; }
    public String getPhone() { return phone; }

    public void setName(String name) { this.name = name; }
    public void setGroup(String group) { this.group = group; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return name + " | " + group + " | " + phone;
    }
}