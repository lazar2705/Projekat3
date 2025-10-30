public class Enemy extends GameObject {
    private String type;
    private int damage;
    private int health;

    public Enemy(int x, int y, int width, int height, String type, int damage, int health) {
        super(x, y, width, height);
        setType(type);
        setDamage(damage);
        setHealth(health);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            System.out.println("Naziv tipa neprijatelja ne smije biti prazan");
            this.type = "Unknown";
        } else {
            this.type = type.trim();
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage < 0) {
            System.out.println("Damage ne može biti manji od 0");
            this.damage = 0;
        } else if (damage > 100) {
            System.out.println("Damage ne može biti veći od 100");
            this.damage = 100;
        } else {
            this.damage = damage;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            System.out.println("Health ne može biti manji od 0");
            this.health = 0;
        } else if (health > 100) {
            System.out.println("Health ne može biti veći od 100");
            this.health = 100;
        } else {
            this.health = health;
        }
    }

    public boolean contains(String keyword) {
        if (keyword == null) {
            return false;
        }
        return type.toLowerCase().contains(keyword.toLowerCase().trim());
    }

    @Override
    public String toString() {
        return "Enemy[" + type + "] @ (" + getX() + "," + getY() + ") "
               + getWidth() + "x" + getHeight() + " DMG=" + damage + " HP=" + health;
    }
}