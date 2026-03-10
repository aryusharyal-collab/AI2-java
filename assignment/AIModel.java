package assignment;

/**
 * Write a description of class AIModel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AIModel
{
    // Name of the AI model
    private String modelName;
    
    // Price per 1 Lakh tokens
    private double price;  
    
    // Number of parameters in billions
    private int parameterCount;  
    
    // Maximum number of tokens the model can process at once
    private String contextWindow;

    // Constructor to initialize the AI model with its details
    public AIModel(String modelName, double price, int parameterCount, String contextWindow)
    {
        this.modelName = modelName;
        this.price = price;
        this.parameterCount = parameterCount;
        this.contextWindow = contextWindow;
    }

    // Returns the name of the model
    public String getModelName()
    {
        return modelName;
    }

    // Returns the price of the model
    public double getPrice()
    {     
        return price;
    }

    // Returns the total number of parameters
    public int getParameterCount() 
    {    
        return parameterCount;  
    }

    // Returns the context window size
    public String getContextWindow() 
    {    
        return contextWindow; 
    }
    
    // Returns a string summarizing all model details
    public String display()
    {      
        return "Model: " + modelName +    
        ", Price (per 1 Lakh tokens): " + price +      
        ", Parameters (B): " + parameterCount +        
        ", Context Window: " + contextWindow; 
    }
}