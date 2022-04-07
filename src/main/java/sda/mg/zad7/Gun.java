package sda.mg.zad7;

import java.util.ArrayList;
import java.util.List;

public class Gun {
    private List<String> bullets = new ArrayList<>();
    private final int maxBulletsCount;

    public Gun(int maxBulletsCount) {
        this.maxBulletsCount = maxBulletsCount;
    }

    public void loadBullet(String bullet) {
        if (bullets.size() < maxBulletsCount) {
            bullets.add(bullet);
        } else {
            System.out.println("Magazynek jest pelny!");
        }
    }

    public boolean isLoaded() {
        return !bullets.isEmpty();
    }

    public void shot() {
        if (!isLoaded()) {
            System.out.println("Magazynek jest pusty!");
        } else {
            System.out.println("Strzelamy nabojem: " + bullets.remove(bullets.size() - 1));
        }
    }
}
