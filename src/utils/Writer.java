package utils;

public class Writer {

    public float saveInches(String inputInches){
        return Float.parseFloat(inputInches);
    }
    public String convertedInches(float convertedIn){ return "Converted to: " +convertedIn; }
}
