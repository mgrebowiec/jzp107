package sda.mg.zad8;

public class ParcelValidator implements Validator {
    @Override
    public boolean validate(Parcel parcel) {
        // weryfikować czy suma wymiarów (x, y, z) nie przekracza 300
        if (parcel.getxLength() + parcel.getyLength() + parcel.getzLength() > 300) {
            System.out.println("Suma wszystkich dlugosci wieksza niz 300!");
            return false;
        }

        //czy każdy z rozmiarów nie jest mniejszy niż 30
        if (parcel.getxLength() < 30) {
            System.out.println("x mniejsze niz 30!");
            return false;
        }

        if (parcel.getyLength() < 30) {
            System.out.println("y mniejsze niz 30!");
            return false;
        }

        if (parcel.getzLength() < 30) {
            System.out.println("z mniejsze niz 30!");
            return false;
        }

        //czy waga nie przekracza 30.0 dla isExpress=false lub 15.0 dla isExpress=true
        if ((parcel.isExpress() && parcel.getWeight() > 15)
                || (!parcel.isExpress() && parcel.getWeight() > 30)) {
            System.out.println("waga przekroczona!");
            return false;
        }

        return true;
    }

    @Override
    public void validateUsingException(Parcel parcel) {
        // weryfikować czy suma wymiarów (x, y, z) nie przekracza 300
        if (parcel.getxLength() + parcel.getyLength() + parcel.getzLength() > 300) {
            throw new IllegalStateException("Suma wszystkich dlugosci wieksza niz 300!");
        }

        //czy każdy z rozmiarów nie jest mniejszy niż 30
        if (parcel.getxLength() < 30) {
            throw new IllegalStateException("x mniejsze niz 30!");
        }

        if (parcel.getyLength() < 30) {
            throw new IllegalStateException("y mniejsze niz 30!");
        }

        if (parcel.getzLength() < 30) {
            throw new IllegalStateException("z mniejsze niz 30!");
        }

        //czy waga nie przekracza 30.0 dla isExpress=false lub 15.0 dla isExpress=true
        if ((parcel.isExpress() && parcel.getWeight() > 15)
                || (!parcel.isExpress() && parcel.getWeight() > 30)) {
            throw new IllegalStateException("waga przekroczona!");
        }
    }

    @Override
    public void validateParcel(Parcel parcel) throws ParcelValidationException, ParcelNotDefined {

        if (parcel == null) {
            throw new ParcelNotDefined("Nie mozemy dokonac walidacji nie istniejacego obiektu!!!");
        }

        // weryfikować czy suma wymiarów (x, y, z) nie przekracza 300
        if (parcel.getxLength() + parcel.getyLength() + parcel.getzLength() > 300) {
            throw new ParcelValidationException("Suma wszystkich dlugosci wieksza niz 300!");
        }

        //czy każdy z rozmiarów nie jest mniejszy niż 30
        if (parcel.getxLength() < 30) {
            throw new ParcelValidationException("x mniejsze niz 30!");
        }

        if (parcel.getyLength() < 30) {
            throw new ParcelValidationException("y mniejsze niz 30!");
        }

        if (parcel.getzLength() < 30) {
            throw new ParcelValidationException("z mniejsze niz 30!");
        }

        //czy waga nie przekracza 30.0 dla isExpress=false lub 15.0 dla isExpress=true
        if ((parcel.isExpress() && parcel.getWeight() > 15)
                || (!parcel.isExpress() && parcel.getWeight() > 30)) {
            throw new ParcelValidationException("waga przekroczona!");
        }
    }


}
