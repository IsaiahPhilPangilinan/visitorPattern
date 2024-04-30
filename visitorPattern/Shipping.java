package visitorPattern;

public interface Shipping {

    public String accept(ShippingDetails details, String furnitureSize);
    public double accept(ShippingCostCalculator calculator, double distance);
    public String getFurnitureType();
    public String getFurnitureSize();
    public double getPrice();
    public double getDistance();

} 