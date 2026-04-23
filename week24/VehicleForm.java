package week24;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.io.BufferedWriter;

public class VehicleForm extends JFrame implements ActionListener {

    private JRadioButton carBtn, bikeBtn;
    private JPanel formPanel, topPanel, bottomPanel, btnPanel;

    private JTextField nameField, speedField, seatsField, fuelField, gearField, tankField, distanceField;
    private JCheckBox carrierBox;

    private JButton submitBtn, saveBtn, loadBtn, displayBtn, clearBtn;
    private JButton serializeBtn, deserializeBtn;

    private JTable table;
    private DefaultTableModel model;

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private String selectedType = "";

    public VehicleForm() {

        setTitle("Vehicle File Handling System");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        topPanel = new JPanel();
        carBtn = new JRadioButton("Car");
        bikeBtn = new JRadioButton("Bike");

        ButtonGroup bg = new ButtonGroup();
        bg.add(carBtn);
        bg.add(bikeBtn);

        topPanel.add(new JLabel("Select Type:"));
        topPanel.add(carBtn);
        topPanel.add(bikeBtn);

        add(topPanel, BorderLayout.NORTH);

        carBtn.addActionListener(e -> showForm("Car"));
        bikeBtn.addActionListener(e -> showForm("Bike"));

        formPanel = new JPanel();
        add(formPanel, BorderLayout.CENTER);

        model = new DefaultTableModel(
            new String[]{"Type", "Name", "Speed", "Fuel / Gear", "Tank / Distance"}, 0);

        table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(800, 150));

        bottomPanel = new JPanel(new BorderLayout());
        btnPanel = new JPanel();

        submitBtn = new JButton("Add");
        saveBtn = new JButton("Save");
        loadBtn = new JButton("Load");
        displayBtn = new JButton("Display");
        clearBtn = new JButton("Clear");

        serializeBtn = new JButton("Serialize");
        deserializeBtn = new JButton("Deserialize");

        btnPanel.add(submitBtn);
        btnPanel.add(saveBtn);
        btnPanel.add(loadBtn);
        btnPanel.add(displayBtn);
        btnPanel.add(clearBtn);

        btnPanel.add(serializeBtn);
        btnPanel.add(deserializeBtn);

        JScrollPane tableScroll = new JScrollPane(table);

        bottomPanel.add(btnPanel, BorderLayout.NORTH);
        bottomPanel.add(tableScroll, BorderLayout.CENTER);

        add(bottomPanel, BorderLayout.SOUTH);

        submitBtn.addActionListener(this);
        saveBtn.addActionListener(e -> saveToFile());
        loadBtn.addActionListener(e -> loadFromFile());
        displayBtn.addActionListener(e -> displayTable());
        clearBtn.addActionListener(e -> clearForm());

        serializeBtn.addActionListener(e -> serializeToFile());
        deserializeBtn.addActionListener(e -> deserializeFromFile());
    }

    private void showForm(String type) 
    {

        selectedType = type;
        formPanel.removeAll();
        formPanel.setLayout(new GridLayout(0, 2, 10, 10));

        nameField = new JTextField();
        speedField = new JTextField();

        formPanel.add(new JLabel("Name"));
        formPanel.add(nameField);

        formPanel.add(new JLabel("Speed"));
        formPanel.add(speedField);

        if (type.equals("Car")) 
        {

            seatsField = new JTextField();
            fuelField = new JTextField();
            tankField = new JTextField();

            formPanel.add(new JLabel("Seats"));
            formPanel.add(seatsField);

            formPanel.add(new JLabel("Fuel"));
            formPanel.add(fuelField);

            formPanel.add(new JLabel("Tank"));
            formPanel.add(tankField);

        } 

        else
        {

            gearField = new JTextField();
            carrierBox = new JCheckBox("Carrier");
            distanceField = new JTextField();

            formPanel.add(new JLabel("Gear"));
            formPanel.add(gearField);

            formPanel.add(new JLabel(""));
            formPanel.add(carrierBox);

            formPanel.add(new JLabel("Distance"));
            formPanel.add(distanceField);
        }

        formPanel.revalidate();
        formPanel.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        try
        {
            String name = nameField.getText().trim();
            int speed = Integer.parseInt(speedField.getText().trim());

            if (selectedType.equals("Car")) 
            {
                int seats = Integer.parseInt(seatsField.getText().trim());
                double fuel = Double.parseDouble(fuelField.getText().trim());
                double tank = Double.parseDouble(tankField.getText().trim());

                vehicles.add(new Car(name, speed, seats, fuel, tank));
            } 

            else 
            {
                int gear = Integer.parseInt(gearField.getText().trim());
                boolean carrier = carrierBox.isSelected();
                double distance = Double.parseDouble(distanceField.getText().trim());

                vehicles.add(new Bike(name, speed, carrier, gear, distance));
            }

            JOptionPane.showMessageDialog(this, "Vehicle Added!");
            clearForm();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input!");
        }
    }

    private void saveToFile()
    {
        // PART 1: Write an arraylist data into textfiles
        try(BufferedWriter bufferWriter = new BufferedWriter(new FileWriter("week24"+ File.separator+"vehicle.txt")))
        {
            String header = String.format
                (
                    "%-10s %-15s %-10s %-10s %-10s %-10s%n",
                    "Type", "Name", "Speed", "Seats", "Fuel", "Tank"
                );

            bufferWriter.write(header);

            for(Vehicle v : vehicles)
            {
                if (v instanceof Car c)
                {
                    String line = String.format(

                            "%-10s %-15s %-10d %-10d %-10.2f %-10.2f%n",

                            "Car",

                            c.getName(),

                            c.getSpeed(),

                            c.getSeats(),

                            c.getFuel(),

                            c.getTank()

                        );

                    bufferWriter.write(line);

                }
                else if (v instanceof Bike b )
                {
                    String line = String.format(

                            "%-10s %-15s %-10d %-10s %-10d %-10.2f%n",

                            "Bike",

                            b.getName(),

                            b.getSpeed(),

                            b.hasCarrier(),

                            b.getGear(),

                            b.getDistance()

                        );

                    bufferWriter.write(line);
                }
            }
        }

        catch(IOException e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    private void loadFromFile() 
    {
        // PART 2: Read from textfiles back to arraylist
        vehicles.clear(); // clear current list before loading

        try (BufferedReader reader = new BufferedReader(new FileReader("week24" + File.separator + "vehicle.txt")))
        {
            String line;
            boolean firstLine = true;

            while ((line = reader.readLine()) != null)
            {
                if (firstLine) 
                {
                    firstLine = false;
                    continue;
                }

                if (line.trim().isEmpty()) continue; 

                String[] parts = line.trim().split("\\s+"); 

                String type = parts[0];

                if (type.equals("Car"))
                {
                    String name    = parts[1];
                    int speed      = Integer.parseInt(parts[2]);
                    int seats      = Integer.parseInt(parts[3]);
                    double fuel    = Double.parseDouble(parts[4]);
                    double tank    = Double.parseDouble(parts[5]);

                    vehicles.add(new Car(name, speed, seats, fuel, tank));
                }
                else if (type.equals("Bike"))
                {
                    String name       = parts[1];
                    int speed         = Integer.parseInt(parts[2]);
                    boolean carrier   = Boolean.parseBoolean(parts[3]);
                    int gear          = Integer.parseInt(parts[4]);
                    double distance   = Double.parseDouble(parts[5]);

                    vehicles.add(new Bike(name, speed, carrier, gear, distance));
                }
            }

            JOptionPane.showMessageDialog(this, "Loaded " + vehicles.size() + " vehicles!");
            displayTable(); 

        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(this, "Error loading file: " + e.getMessage());
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "File format error: " + e.getMessage());
        }
    }

    private void serializeToFile()
    {
        // PART 3: Write the objects data into serialize files

    }

    private void deserializeFromFile()
    {
        // PART4: Read from serialized file back to ArrayList
    }

    private void displayTable() 
    {
        model.setRowCount(0);

        for (Vehicle v : vehicles) 
        {

            if (v instanceof Car c)
            {

                model.addRow(new Object[]{"Car", c.getName(), c.getSpeed(), c.getFuel(), c.getTank()});

            } 
            else if (v instanceof Bike b) 
            {
                model.addRow(new Object[]{"Bike", b.getName(), b.getSpeed(), b.getGear(), b.getDistance()});
            }
        }
    }

    private void clearForm()
    {
        if (nameField != null) nameField.setText("");
        if (speedField != null) speedField.setText("");
        if (seatsField != null) seatsField.setText("");
        if (fuelField != null) fuelField.setText("");
        if (tankField != null) tankField.setText("");
        if (gearField != null) gearField.setText("");
        if (distanceField != null) distanceField.setText("");
        if (carrierBox != null) carrierBox.setSelected(false);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> new VehicleForm().setVisible(true));
    }
}