package assignment;

/**
 * Test1 class to demonstrate the usage of PersonalPlan
 * by submitting a prompt and checking remaining prompts.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test1
{
    public static void main(String[] args) {
        // Create a PersonalPlan object with 5 prompts remaining
        PersonalPlan personal = new PersonalPlan("Gemini 2.0", 299.0, 1, "128k", 5);

        // Define a prompt and token counts
        String prompt = "Explain machine learning in simple words ?";
        int systemTokens = 300;   // tokens used by system instructions
        int inputTokens = 400;    // tokens used by user input
        int outputTokens = 200;   // tokens expected in AI output
        int totalTokens = systemTokens + inputTokens + outputTokens; // total token usage

        // Display the entered prompt and total token usage
        System.out.println("The Entered Prompt is " + prompt);
        System.out.println("The expected token length is " + totalTokens);

        // Submit the prompt using PersonalPlan
        personal.enterPrompt(prompt, totalTokens);

        // Display how many prompts are remaining after submission
        System.out.println("The remaining prompts is " + personal.getPromptsRemaining());
    }
}