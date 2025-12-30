package week8;

/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class ElectricityBill 
{
    private String consumerName;
    private int unitsConsumed;

    public ElectricityBill(String consumerName, int unitsConsumed) 
    {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed)
    {
        this.unitsConsumed = unitsConsumed;
    }

    public int getUnitsConsumed() 
    {
        return unitsConsumed;
    }

    public double calculateBill() 
    {
        int firstSlab = Math.min(unitsConsumed, 100);
        int remaining = Math.max(unitsConsumed - 100, 0);
        return firstSlab * 5.0 + remaining * 8.0;
    }

    public String getConsumerName()
    {
        return consumerName;
    }
}

