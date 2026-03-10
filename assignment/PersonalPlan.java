package assignment;

/**
 * Write a description of class PersonalPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonalPlan extends AIModel
{
    // Number of prompts the user can still use this month
    private int promptsRemaining;

    // Constructor to initialize PersonalPlan with model details and initial prompt count
    public PersonalPlan(String modelName, double price, int parameterCount, String contextWindow, int promptsRemaining)
    {
        super(modelName, price, parameterCount, contextWindow); // call AIModel constructor
        this.promptsRemaining = promptsRemaining; // set initial prompt quota
    }

    // Returns how many prompts are left for the user
    public int getPromptsRemaining()
    {      
        return promptsRemaining;  
    }

    // Buy additional prompts and add them to remaining quota
    public String buyAdditioinalPrompts(int count)
    {
        // Check for invalid input
        if (count < 0 )
        {
            return "Error: Enter a positive number of prompts or upgrade to Pro plan ";
        }

        // Add purchased prompts to quota
        promptsRemaining += count;     
        return "Purchased " + count + " prompts. New quota: " + promptsRemaining;
    }

    // Submit a prompt to the AI model
    public String enterPrompt(String promptText, int expectedTokens)
    {
        // Check if there are prompts left
        if (promptsRemaining > 0)
        {       
            promptsRemaining -= 1; // use one prompt     
            return "Prompt submitted.\nText: " + promptText +    
            "\nExpected tokens: " + expectedTokens +               
            "\nPrompts remaining: " + promptsRemaining;     
        } 
        else 
        {  
            return "Monthly plan limit reached. No prompts remaining.";  // quota exhausted
        }  
    }
    
    // Display model details along with remaining prompts
    @Override   
    public String display() 
    {    
        return super.display() + ", Prompts Remaining: " + promptsRemaining; 
    }
}