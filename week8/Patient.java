package week8;


/**
 * Write a description of class Patient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class Patient
 {
    private String patientName;
    private int age;
    private int daysAdmitted;
    private double dailyCharge;

    public Patient(String patientName, int age, int daysAdmitted, double dailyCharge)
    {
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public void setDaysAdmitted(int daysAdmitted)
    {
        this.daysAdmitted = daysAdmitted;
    }

    public int getDaysAdmitted() 
    {
        return daysAdmitted;
    }

    public double calculateTotalBill()
    {
        double total = daysAdmitted * dailyCharge;
        if (daysAdmitted > 7) {
            total = total - (total * 0.10);
        }
        return total;
    }

    public String getPatientName()
    {
        return patientName;
    }

    public int getAge()
    {
        return age;
    }

    public double getDailyCharge() 
    {
        return dailyCharge;
    }

    public void displayDetails() 
    {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Daily Charge: " + dailyCharge);
    }
}