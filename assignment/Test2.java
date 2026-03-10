package assignment;

/**
 * Test2 class to demonstrate how token limits are checked
 * before submitting a prompt in PersonalPlan.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test2
{
    public static void main(String[] args) {
        // Create a PersonalPlan object with 5 prompts remaining
        PersonalPlan personal = new PersonalPlan("Gemini 2.0", 299.0, 1, "128k", 5);

        // Define the context limit and token usage
        int contextLimit = 128000; // maximum tokens model can handle
        int systemTokens = 60000;  // tokens used by system instructions
        int inputTokens = 50000;   // tokens used by user input
        int outputTokens = 30000;  // tokens expected for AI output

        // Calculate total token requirement
        int total = systemTokens + inputTokens + outputTokens;

        // Display all token information
        System.out.println("Context Limit: " + contextLimit);
        System.out.println("System Tokens: " + systemTokens);
        System.out.println("Input Tokens: " + inputTokens);
        System.out.println("Output Tokens: " + outputTokens);
        System.out.println("Total Required: " + total);

        // Check if total tokens exceed the context window
        if (total > contextLimit) {
            System.out.println("Result: Prompt rejected because the total token requirement exceeds the available context.");
        } else {
            System.out.println("Result: Prompt accepted (within context).");
        }
    }
}