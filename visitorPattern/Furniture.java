package visitorPattern;

public class Furniture implements Shipping {

    private String furnitureType;
    private String furnitureSize;
    private double price;
    private double distance;

    public Furniture(String furnitureType, String furnitureSize, double price, double distance) {

        this.furnitureType = furnitureType;
        this.furnitureSize = furnitureSize;
        this.price = price;
        this.distance = distance;

    }

    @Override
    public String accept(ShippingDetails details, String furnitureSize) {
        this.furnitureSize = furnitureSize;
        return details.showFurnitureInformation(furnitureType, furnitureSize);
    }

    @Override
    public double accept(ShippingCostCalculator calculator, double distance) {
        this.distance = distance;
        return calculator.calculateShippingCost(furnitureType, distance);
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureSize(String furnitureSize) {
        this.furnitureSize = furnitureSize;
    }

    public String getFurnitureSize() {
        return furnitureSize;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

}