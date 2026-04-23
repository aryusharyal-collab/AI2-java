package week19;
import javax.swing.*;
import java.awt.*;

public class StudentForm extends JFrame {
    private JPanel headerPanel,formPanel;
    private JPanel sidebarPanel;
    private JLabel studentRegisterFormLabel,nameLabel,genderLabel,courselabel,hobbiesLabel;
    private JPanel row1 , row2,row3,row4,row5;
    private JTextField nameTextField;
    private JRadioButton maleRadio,femaleRadio;
    private JComboBox<String> courseComboBox;
    private JCheckBox[] hobbiesCheckBoxes;
    private JButton submitButton;
    
    


    public  StudentForm() {
        setTitle("Student Form");
        setSize(450,300);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(5,5));

        headerPanel = new JPanel();
        headerPanel.setLayout( new FlowLayout());
        studentRegisterFormLabel = new JLabel("Student Register Form");
        studentRegisterFormLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        headerPanel.add(studentRegisterFormLabel);
        add(headerPanel,BorderLayout.NORTH);

        sidebarPanel = new JPanel();
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));
        String[] buttons = {"edit","delete","submit","reset"};
        for(String buttonname :buttons){
            JButton button = new JButton(buttonname);
            button.setMaximumSize(new Dimension(80, 25));
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            sidebarPanel.add(Box.createVerticalStrut(10));
            sidebarPanel.add(button);


        }
        sidebarPanel.add(Box.createHorizontalGlue());
        add( sidebarPanel,BorderLayout.WEST);
        //form Panel
        formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel,BoxLayout.Y_AXIS));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        //row1 Panel
        row1 = new JPanel();
        row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
        row1.setAlignmentX(Component.LEFT_ALIGNMENT);
        nameLabel = new JLabel("Name:");
        nameTextField = new JTextField();
        row1.add(nameLabel);
        row1.add(Box.createVerticalStrut(10));
        row1.add(nameTextField);
        formPanel.add(row1);
        formPanel.add(Box.createVerticalStrut(10));
        //row2 Panel
        row2 = new JPanel();
        row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
        row2.setAlignmentX(Component.LEFT_ALIGNMENT);
        genderLabel = new JLabel("Gender:");
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");

        row2.add(genderLabel);
        row2.add(maleRadio);
        row2.add(femaleRadio);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        formPanel.add(row2);
        formPanel.add(Box.createVerticalStrut(10));

        //row3
        row3 = new JPanel();
        row3.setLayout(new BoxLayout(row3, BoxLayout.X_AXIS));
        row3.setAlignmentX(Component.LEFT_ALIGNMENT);
        courselabel = new JLabel("Courses:");
        String[] courses={"BBA","AI","Multi Media","Economics"};
        courseComboBox = new JComboBox<>(courses);
        row3.add(courselabel);
        row3.add(courseComboBox);
        formPanel.add(row3);
        formPanel.add(Box.createVerticalStrut(10));
        row4 = new JPanel();
        row4.setLayout(new BoxLayout(row4, BoxLayout.X_AXIS));
        row4.setAlignmentX(Component.LEFT_ALIGNMENT);
        hobbiesLabel = new JLabel("Hobbies:");
        String[] hobbies={"Reading","Coding","Gaming"};
        hobbiesCheckBoxes=new JCheckBox[hobbies.length];
        row4.add(hobbiesLabel);
        for(int i=0; i<hobbies.length; i++){
            hobbiesCheckBoxes[i] = new JCheckBox(hobbies[i]);
            row4.add(hobbiesCheckBoxes[i]);
        }
        formPanel.add(row4);
        formPanel.add(Box.createVerticalStrut(10));

        //row5
        row5 = new JPanel();
        row5.setLayout(new BoxLayout(row5, BoxLayout.X_AXIS));
        row5.setAlignmentX(Component.LEFT_ALIGNMENT);
        submitButton = new JButton("Submit");
        row5.add(submitButton);
        formPanel.add(row5);
        formPanel.add(Box.createVerticalStrut(10));




        add(formPanel,BorderLayout.CENTER);



        










    }
    


    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new StudentForm().setVisible(true);
        });

    }


}