package assignment;

/**
 * Test4 class to demonstrate ProPlan usage,
 * showing unlimited prompts and team slots.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test4
{
    public static void main(String[] args) {
        // Create a ProPlan object with 3 available team slots
        ProPlan pro = new ProPlan("GPT-4.1", 1999.0, 1, "128k", 3);

        // Display introductory message
        System.out.println("Starting Pro Plan Test");
        System.out.println("Pro Plans have unlimited prompts.");

        // Submit several prompts; note that no quota is reduced
        System.out.println(pro.enterPrompt("Generate ideas", 8000));
        System.out.println(pro.enterPrompt("Explain cloud computing", 6000));
        System.out.println(pro.enterPrompt("Write an outline", 7000));

        // Display model details including available team slots
        System.out.println("Checking team slots: " + pro.display());

        // Confirm prompts are unlimited
        System.out.println("Prompts were used but no count was reduced.");
    }
}