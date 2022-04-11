package sda.mg.zad8;

public interface Validator {
    boolean validate(Parcel parcel);
    void validateUsingException(Parcel parcel);
    void validateParcel(Parcel parcel) throws ParcelValidationException, ParcelNotDefined;
}
