package visitorPattern;

public class FurnitureInformation implements ShippingDetails {

    @Override
    public String showFurnitureInformation(String furnitureType, String furnitureSize) {
        if (furnitureSize == "Lightweight") {
            
            String output = "";
            output = "You ordered " + furnitureType + ", a lightweight furniture. This will only have a flat shipping rate.";
            return output;

        } if (furnitureSize == "Heavyweight") {

            String output = "";
            output = "You ordered " + furnitureType + ", a heavyweight furniture. This will require an additional cost in shipping rate and will require additional care.";
            return output;

        } else {
            
            return "The furniture size can't be identified.";

        }
    }

}