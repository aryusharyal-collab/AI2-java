package assignment;

/**
 * Test3 class to demonstrate PersonalPlan prompt usage,
 * exhausting the monthly quota, and purchasing additional prompts.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test3
{
    public static void main(String[] args) {
        // Create a PersonalPlan object with 3 prompts initially
        PersonalPlan personal = new PersonalPlan("Gemini 2.0", 299.0, 1, "128k", 3);

        // Display starting number of prompts
        System.out.println("Starting prompts: " + personal.getPromptsRemaining());

        // Use prompts one by one
        System.out.println(personal.enterPrompt("Task A", 700));
        System.out.println(personal.enterPrompt("Task B", 600));
        System.out.println(personal.enterPrompt("Task C", 500));

        // Attempt to submit a prompt when quota is exhausted
        System.out.println("Trying another prompt with zero quota:");
        System.out.println(personal.enterPrompt("Task D (should be blocked)", 400));

        // Purchase additional prompts
        System.out.println(personal.buyAdditioinalPrompts(2));

        // Submit a prompt after buying more prompts
        System.out.println(personal.enterPrompt("Task E (after purchase)", 800));

        // Display final remaining prompts
        System.out.println("Final prompts remaining: " + personal.getPromptsRemaining());
    }
}