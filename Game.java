import java.util.ArrayList;

public class Game {
	
	private Player player;
	private ArrayList<Enemy> enemies;
	private ArrayList<String> eventLog;
	
	public Game(Player player) {
		this.player = player;
		this.enemies = new ArrayList<>();
		this.eventLog = new ArrayList<>();
		eventLog.add("IGRS: Novi igrsc je; " + player.getName());

	}
	
	public Player getPlayer() {return player;}
	public ArrayList<Enemy> getEnemies() {return enemies;}
	public ArrayList<String> getEventLog() {return eventLog;}

    public boolean checkCollision(Player p, Enemy e) {
        return p.intersects(e);
    }
    public void decreaseHealth(Player p, Enemy e) {
        int currentHealth = p.getHealth();
        int damage;

        if (e instanceof BossEnemy) {
            damage = ((BossEnemy) e).getActualDamage();
        } else {
            damage = e.getDamage();
        }

        int newHealth = currentHealth - damage;
        if (newHealth < 0) {
            newHealth = 0;
        }

        p.setHealth(newHealth);

        String logEntry = "POCREDA: Igrac pogodjen od " + e.getType() + " za " + damage
                + " -> HP " + currentHealth + " -> " + newHealth;
        eventLog.add(logEntry);
    }

	
}