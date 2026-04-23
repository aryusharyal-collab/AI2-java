package assignment;





// Parent class for all AI models
public abstract class AIModel {

    // Common variables for all plans
    private String modelName;
    private double price;
    private int parameterCount;
    private int contextWindow;

    // Constructor
    public AIModel(String modelName, double price, int parameterCount, int contextWindow) {
        this.modelName = modelName;
        this.price = price;
        this.parameterCount = parameterCount;
        this.contextWindow = contextWindow;
    }

    // Getter methods
    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }

    public int getParameterCount() {
        return parameterCount;
    }

    public int getContextWindow() {
        return contextWindow;
    }

    // Display method to be implemented by child classes
    public abstract String display();
}
