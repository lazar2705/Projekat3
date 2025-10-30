public class BossEnemy extends Enemy {

    public BossEnemy(int x, int y, int width, int height, String type, int damage, int health) {
        super(x, y, width, height, type, damage, health);
    }

    public int getActualDamage() {
        return getDamage() * 2;
    }

    @Override
    public String toString() {
        return "BossEnemy[" + getType() + "] @ (" + getX() + "," + getY() + ") "
               + getWidth() + "x" + getHeight() + " DMG=" + getDamage() + "x2 HP=" + getHealth();
    }
}