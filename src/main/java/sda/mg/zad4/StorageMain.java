package sda.mg.zad4;

public class StorageMain {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("jeden", "aa");
        storage.addToStorage("jeden", "bb");
        storage.addToStorage("dwa", "aa");
        storage.addToStorage("dwa", "cc");
        storage.addToStorage("trzy", "dd");
        storage.addToStorage("trzy", "ee");

        storage.findValues("aa");
        storage.printValues("trzy");
    }
}
