package association.example.app.tostring.app;

public class Cave {
    private String name;
    private double temperature;
    private int depth;
    private boolean hasStalactites;
    private boolean hasStalagmites;
    private boolean hasWaterfall;
    private int numBats;
    private int numFish;
    private boolean isExplored;
    private boolean isHazardous;
    
    public Cave() {
    	System.out.println("no parameters");
    }

    public Cave(String name, double temperature, int depth, boolean hasStalactites, boolean hasStalagmites,
                boolean hasWaterfall, int numBats, int numFish, boolean isExplored, boolean isHazardous) {
    	super();
        this.name = name;
        this.temperature = temperature;
        this.depth = depth;
        this.hasStalactites = hasStalactites;
        this.hasStalagmites = hasStalagmites;
        this.hasWaterfall = hasWaterfall;
        this.numBats = numBats;
        this.numFish = numFish;
        this.isExplored = isExplored;
        this.isHazardous = isHazardous;
    }

    @Override
    public String toString() {
        return "Cave{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", depth=" + depth +
                ", hasStalactites=" + hasStalactites +
                ", hasStalagmites=" + hasStalagmites +
                ", hasWaterfall=" + hasWaterfall +
                ", numBats=" + numBats +
                ", numFish=" + numFish +
                ", isExplored=" + isExplored +
                ", isHazardous=" + isHazardous +
                '}';
    }


}

