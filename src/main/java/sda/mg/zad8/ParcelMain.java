package sda.mg.zad8;

public class ParcelMain {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(29, 30, 40, 25, false);
        Validator validator = new ParcelValidator();
        try {
            validator.validateParcel(parcel);
        } catch (ParcelValidationException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ParcelNotDefined parcelNotDefined) {
            parcelNotDefined.printStackTrace();
        }

        System.out.println("---------------------");
        try {
            //OPCJONALNA obsluga bledu z grupy unchecked
            validator.validateUsingException(parcel);
        } catch (RuntimeException e) {
            System.out.println("Wlasna obsluga bledu z grupy unchecked exception: " + e.getMessage());
        }

    }
}
