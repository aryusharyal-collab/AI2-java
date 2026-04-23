package assignment;

// Pro plan class
public class ProPlan extends AIModel {

    private int availableTeamSlots;

    // Constructor
    public ProPlan(String modelName, double price, int parameterCount,
                   int contextWindow, int availableTeamSlots) {
        super(modelName, price, parameterCount, contextWindow);
        this.availableTeamSlots = availableTeamSlots;
    }

    // Method to add team member
    public String addTeamMember(String memberName) {
        if (availableTeamSlots > 0) {
            availableTeamSlots--;
            return "Added team member: " + memberName +
                   ". Slots remaining: " + availableTeamSlots;
        } else {
            return "No available team slots.";
        }
    }

    // Display plan information
    @Override
    public String display() {
        return "Model: " + getModelName() +
               ", Price: " + getPrice() +
               ", Parameters: " + getParameterCount() +
               ", Context Window: " + getContextWindow() +
               ", Available Team Slots: " + availableTeamSlots;
    }
}
