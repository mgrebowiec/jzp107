package sda.mg.zad7;

public class GunMain {
    public static void main(String[] args) {
        Gun gun = new Gun(2);
        gun.loadBullet("1");
        gun.loadBullet("2");
        gun.loadBullet("3");

        gun.shot();
        gun.shot();
        gun.shot();
    }
}
