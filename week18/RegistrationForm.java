package week18;
import javax.swing.*;

/**
 * Write a description of class RegistrationForm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RegistrationForm
{
    



    JFrame frame;
    JTextField idField, nameField, skillField;
    JComboBox<String> courseBox;
    JRadioButton male, female, other;
    JTable table;
    JButton addBtn, resetBtn, searchBtn, deleteBtn;

    public RegistrationForm() {

        frame = new JFrame("Student Registration System");
        frame.setSize(600, 600);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Student ID:");
        l1.setBounds(40, 40, 100, 30);
        frame.add(l1);

        idField = new JTextField();
        idField.setBounds(150, 40, 150, 30);
        frame.add(idField);

        JLabel l2 = new JLabel("Name:");
        l2.setBounds(40, 90, 100, 30);
        frame.add(l2);

        nameField = new JTextField();
        nameField.setBounds(150, 90, 150, 30);
        frame.add(nameField);

        JLabel l3 = new JLabel("Course:");
        l3.setBounds(40, 140, 100, 30);
        frame.add(l3);

        String[] courses = {"BSc", "BBA", "BIT"};
        courseBox = new JComboBox<>(courses);
        courseBox.setBounds(150, 140, 150, 30);
        frame.add(courseBox);

        JLabel l4 = new JLabel("Gender:");
        l4.setBounds(40, 190, 100, 30);
        frame.add(l4);

        male = new JRadioButton("Male");
        male.setBounds(150, 190, 70, 30);

        female = new JRadioButton("Female");
        female.setBounds(220, 190, 80, 30);

        other = new JRadioButton("Other");
        other.setBounds(300, 190, 80, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(other);

        frame.add(male);
        frame.add(female);
        frame.add(other);

        JLabel l5 = new JLabel("Skill:");
        l5.setBounds(40, 240, 100, 30);
        frame.add(l5);

        skillField = new JTextField();
        skillField.setBounds(150, 240, 150, 30);
        frame.add(skillField);

        addBtn = new JButton("Add");
        addBtn.setBounds(50, 300, 100, 30);
        frame.add(addBtn);

        resetBtn = new JButton("Reset");
        resetBtn.setBounds(160, 300, 100, 30);
        frame.add(resetBtn);

        searchBtn = new JButton("Search");
        searchBtn.setBounds(270, 300, 100, 30);
        frame.add(searchBtn);

        deleteBtn = new JButton("Delete");
        deleteBtn.setBounds(380, 300, 100, 30);
        frame.add(deleteBtn);

        String[] columns = {"ID", "Name", "Gender", "Skill", "Course"};
        Object[][] data = {};

        table = new JTable(data, columns);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(40, 350, 500, 180);
        frame.add(scroll);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
