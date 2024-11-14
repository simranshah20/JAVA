class Cars {
    private String color,model;
    private double fuelLevel;
    private long costOfPurchage;

    public Cars(String color, String model, double fuelLevel, long costOfPurchage) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchage = costOfPurchage;
    }

    String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
}
