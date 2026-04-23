package assignment;

// Personal plan class
public class PersonalPlan extends AIModel {

    private int availableTokens;

    // Constructor
    public PersonalPlan(String modelName, double price, int parameterCount,
                        int contextWindow, int availableTokens) {
        super(modelName, price, parameterCount, contextWindow);
        this.availableTokens = availableTokens;
    }

    // Method to enter a prompt
    public String enterPrompt(String promptText, int expectedTokens) {

        int inputTokens = promptText.split(" ").length;
        int totalTokens = inputTokens + expectedTokens;

        if (totalTokens > getContextWindow()) {
            return "Error: Token limit exceeds context window.";
        }

        if (availableTokens >= totalTokens) {
            availableTokens -= totalTokens;
            return "Prompt submitted.\nText: " + promptText +
                   "\nTokens used: " + totalTokens +
                   "\nRemaining tokens: " + availableTokens;
        } else {
            return "Not enough available tokens.";
        }
    }

    // Display plan information
    @Override
    public String display() {
        return "Model: " + getModelName() +
               ", Price: " + getPrice() +
               ", Parameters: " + getParameterCount() +
               ", Context Window: " + getContextWindow() +
               ", Available Tokens: " + availableTokens;
    }
}