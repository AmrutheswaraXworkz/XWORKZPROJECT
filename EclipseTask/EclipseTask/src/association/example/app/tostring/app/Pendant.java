package association.example.app.tostring.app;

public class Pendant {
    private String material;
    private String gemstone;
    private double weight;
    private double length;
    private double width;
    private double depth;
    private String chainType;
    private String metalType;
    private String design;
    private boolean isEngraved;
    private boolean isCustomizable;
    private String specialFeatures;
    
    public Pendant() {
    	System.out.println("no parameters");
    }

    public Pendant(String material, String gemstone, double weight, double length, double width,
                   double depth, String chainType, String metalType, String design,
                   boolean isEngraved, boolean isCustomizable, String specialFeatures) {
    	super();
        this.material = material;
        this.gemstone = gemstone;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.depth = depth;
        this.chainType = chainType;
        this.metalType = metalType;
        this.design = design;
        this.isEngraved = isEngraved;
        this.isCustomizable = isCustomizable;
        this.specialFeatures = specialFeatures;
    }

    @Override
    public String toString() {
        return "Pendant{" +
                "material='" + material + '\'' +
                ", gemstone='" + gemstone + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", depth=" + depth +
                ", chainType='" + chainType + '\'' +
                ", metalType='" + metalType + '\'' +
                ", design='" + design + '\'' +
                ", isEngraved=" + isEngraved +
                ", isCustomizable=" + isCustomizable +
                ", specialFeatures='" + specialFeatures + '\'' +
                '}';
    }

  
}
