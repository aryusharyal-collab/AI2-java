package assignment;

/**
 * Write a description of class ProPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProPlan extends AIModel
{
    // Number of team slots available for adding members
    private int availableTeamSlots;

    // Constructor to initialize ProPlan with model details and available team slots
    public ProPlan(String modelName, double price, int parameterCount, String contextWindow, int availableTeamSlots)
    {
        super(modelName, price, parameterCount, contextWindow); // call AIModel constructor
        this.availableTeamSlots = availableTeamSlots; // set initial team slots
    }

    // Adds a team member if there is an available slot
    public String addTeamMember(String memberName)
    {  
        if (availableTeamSlots > 0) 
        {         
            availableTeamSlots -= 1; // use one slot       
            return "Added team member: " + memberName + ". Slots remaining: " + availableTeamSlots;  
        } 
        else 
        {    
            return "Error: No available team slots."; // no slots left
        }  
    }

    // Removes a team member and frees up a slot
    public String removeTeamMember(String memberName)
    {   
        availableTeamSlots += 1; // free a slot    
        return "Removed team member: " + memberName + ". Slots remaining: " + availableTeamSlots;  
    }

    // Submit a prompt for Pro plan users (unlimited, so no quota)
    public String enterPrompt(String promptText, int expectedTokens) 
    {
        return "[Pro] Prompt accepted (unlimited). Text: " + promptText + " | Expected tokens: " + expectedTokens;
    }

    // Display model details along with available team slots
    @Override 
    public String display() 
    {     
        return super.display() + ", Available Team Slots: " + availableTeamSlots; 
    }
}