package visitorPattern;

public class ShippingCost implements ShippingCostCalculator {

    double shippingRate = 15.0;
    double shippingCost;
    double price;

    @Override
    public double calculateShippingCost(String furnitureType, double distance) {
        if (furnitureType == "Chair") {

            price = 400;
            shippingCost = price + shippingRate;
            return shippingCost;

        } 
        if (furnitureType == "Sofa") {

            price = 3000;
            shippingCost = price + (distance * shippingRate);
            return shippingCost;

        }
        if (furnitureType == "Bed") {

            price = 7000;
            shippingCost = price + (distance * shippingRate);
            return shippingCost;

        }
        if (furnitureType == "Desk") {

            price = 600;
            shippingCost = price + shippingRate;
            return shippingCost;

        }
        else {

            return distance;

        }
    }

}