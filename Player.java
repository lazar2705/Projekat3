public class Player extends GameObject {
	private String name;
	private int health;

	public Player (int x, int y, int width, int height, String name, int health) {
		super(x, y, width, height);
		setName(name);
		setHealth(health);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
            System.out.println("Ime igraca ne smije biti prazno");
            this.name = "Nepoznato";
        } else {
        	this.name = formatName(name);
        }
	}
	private String formatName (String ime) {
		name = name.trim().replaceAll("\\s+", " ");
        String[] words = name.split(" ");
        StringBuilder formatted = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                formatted.append(Character.toUpperCase(words[i].charAt(0)));
                if (words[i].length() > 1) {
                    formatted.append(words[i].substring(1).toLowerCase());
                }
                if (i < words.length - 1) {
                    formatted.append(" ");
                }
            }
        }
        return formatted.toString();
        }
	public int getHealth() {
	return health;

	}
	public void setHealth(int health) {
		if (health < 0) {
            System.out.println("Health ne moce biti manji od 0");
            this.health = 0;
        } else if (health > 100) {
           System.out.println("Health ne moze biti veci od 100");
            this.health = 100;
        } else {
            this.health = health;
        }
	}
	@Override
    public String toString() {

        return "Player[" + name + "] @ (" + getX() + "," + getY() + ") "
               + getWidth() + "x" + getHeight() + " HP=" + health;

    }
}