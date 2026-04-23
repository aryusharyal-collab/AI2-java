package assignment;

 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;

public class SubscriptionGUI extends JFrame implements ActionListener {

    // Store all plans
    private ArrayList<AIModel> plans = new ArrayList<>();

    // Input fields
    private JTextField modelNameField, priceField, paramField, contextField;
    private JTextField tokensOrSlotsField, promptField, expectedTokensField, indexField;

    // Buttons
    private JButton addPersonalBtn, addProBtn, promptBtn, teamBtn;
    private JButton displayBtn, saveBtn, loadBtn, clearBtn;

    // Output area
    private JTextArea outputArea;

    public SubscriptionGUI() {

        setTitle("AI Subscription Management System");
        setSize(900, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // INPUT PANEL 
        JPanel inputPanel = new JPanel(new GridLayout(8, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Plan & Prompt Details"));

        modelNameField = new JTextField();
        priceField = new JTextField();
        paramField = new JTextField();
        contextField = new JTextField();
        tokensOrSlotsField = new JTextField();
        promptField = new JTextField();
        expectedTokensField = new JTextField();
        indexField = new JTextField();

        inputPanel.add(new JLabel("Model Name:"));
        inputPanel.add(modelNameField);

        inputPanel.add(new JLabel("Price:"));
        inputPanel.add(priceField);

        inputPanel.add(new JLabel("Parameters (B):"));
        inputPanel.add(paramField);

        inputPanel.add(new JLabel("Context Window:"));
        inputPanel.add(contextField);

        inputPanel.add(new JLabel("Tokens (Personal) / Team Slots (Pro):"));
        inputPanel.add(tokensOrSlotsField);

        inputPanel.add(new JLabel("Prompt Text:"));
        inputPanel.add(promptField);

        inputPanel.add(new JLabel("Expected Output Tokens:"));
        inputPanel.add(expectedTokensField);

        inputPanel.add(new JLabel("Plan Index:"));
        inputPanel.add(indexField);

        add(inputPanel, BorderLayout.NORTH);

        //  OUTPUT AREA 
        outputArea = new JTextArea(15, 60);
        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Output Area"));

        add(scrollPane, BorderLayout.CENTER);

        //  BUTTON PANEL 
        JPanel buttonPanel = new JPanel(new GridLayout(2, 4, 10, 10));
        buttonPanel.setBorder(BorderFactory.createTitledBorder("Actions"));

        addPersonalBtn = new JButton("Add Personal Plan");
        addProBtn = new JButton("Add Pro Plan");
        promptBtn = new JButton("Enter Prompt");
        teamBtn = new JButton("Add Team Member");
        displayBtn = new JButton("Display All Plans");
        saveBtn = new JButton("Save to File");
        loadBtn = new JButton("Load from File");
        clearBtn = new JButton("Clear All Fields");

        buttonPanel.add(addPersonalBtn);
        buttonPanel.add(addProBtn);
        buttonPanel.add(promptBtn);
        buttonPanel.add(teamBtn);
        buttonPanel.add(displayBtn);
        buttonPanel.add(saveBtn);
        buttonPanel.add(loadBtn);
        buttonPanel.add(clearBtn);

        add(buttonPanel, BorderLayout.SOUTH);

        // Register actions
        addPersonalBtn.addActionListener(this);
        addProBtn.addActionListener(this);
        promptBtn.addActionListener(this);
        teamBtn.addActionListener(this);
        displayBtn.addActionListener(this);
        saveBtn.addActionListener(this);
        loadBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setVisible(true);
    }

    //  BUTTON LOGIC
    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            if (e.getSource() == addPersonalBtn) {

                PersonalPlan p = new PersonalPlan(
                        modelNameField.getText(),
                        Double.parseDouble(priceField.getText()),
                        Integer.parseInt(paramField.getText()),
                        Integer.parseInt(contextField.getText()),
                        Integer.parseInt(tokensOrSlotsField.getText())
                );

                plans.add(p);
                outputArea.setText("Personal Plan added successfully.");
            }

            else if (e.getSource() == addProBtn) {

                ProPlan p = new ProPlan(
                        modelNameField.getText(),
                        Double.parseDouble(priceField.getText()),
                        Integer.parseInt(paramField.getText()),
                        Integer.parseInt(contextField.getText()),
                        Integer.parseInt(tokensOrSlotsField.getText())
                );

                plans.add(p);
                outputArea.setText("Pro Plan added successfully.");
            }

            else if (e.getSource() == displayBtn) {

                outputArea.setText("All Plans:\n\n");
                for (int i = 0; i < plans.size(); i++) {
                    outputArea.append(i + " -> " + plans.get(i).display() + "\n\n");
                }
            }

            else if (e.getSource() == promptBtn) {

                int index = Integer.parseInt(indexField.getText());
                AIModel plan = plans.get(index);

                if (plan instanceof PersonalPlan) {
                    PersonalPlan pp = (PersonalPlan) plan;
                    outputArea.setText(
                            pp.enterPrompt(
                                    promptField.getText(),
                                    Integer.parseInt(expectedTokensField.getText()))
                    );
                } else {
                    outputArea.setText("Prompt is allowed only for Personal Plans.");
                }
            }

            else if (e.getSource() == teamBtn) {

                int index = Integer.parseInt(indexField.getText());
                AIModel plan = plans.get(index);

                if (plan instanceof ProPlan) {
                    ProPlan pr = (ProPlan) plan;
                    outputArea.setText(pr.addTeamMember("New Member"));
                } else {
                    outputArea.setText("Team management is available only for Pro Plans.");
                }
            }

            else if (e.getSource() == saveBtn) {

                PrintWriter pw = new PrintWriter("Assignment/plans.txt");
                for (AIModel m : plans) {
                    pw.println(m.display());
                }
                pw.close();

                outputArea.setText("Plans saved to file successfully.");
            }

            else if (e.getSource() == loadBtn) {

                BufferedReader br = new BufferedReader(
                        new FileReader("Assignment/plans.txt"));

                outputArea.setText("Loaded Data:\n\n");
                String line;
                while ((line = br.readLine()) != null) {
                    outputArea.append(line + "\n");
                }
                br.close();
            }

            else if (e.getSource() == clearBtn) {

                modelNameField.setText("");
                priceField.setText("");
                paramField.setText("");
                contextField.setText("");
                tokensOrSlotsField.setText("");
                promptField.setText("");
                expectedTokensField.setText("");
                indexField.setText("");

                outputArea.setText("All input fields cleared.");
            }

        }
        catch (Exception ex) {
            outputArea.setText("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new SubscriptionGUI();
    }
}
