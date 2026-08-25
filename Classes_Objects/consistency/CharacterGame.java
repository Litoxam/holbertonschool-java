public class CharacterGame {
    private int currentHealth;
    private String name;
    private String status;

    public CharacterGame(int currentHealth, String name){
        this.name = name;
        setCurrentHealth(currentHealth);
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
        if (currentHealth > 0) {
            this.status = "alive";
        }
        else {
            this.status = "dead";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) {
            return;
        }
        this.name = name;
    }

    public void takeDamage(int damageAmount) {
        int newHealth = currentHealth - damageAmount;
        if (newHealth < 0) {
            newHealth = 0;
        }
        setCurrentHealth(newHealth);
    }

    public void receiveHealing(int healingAmount) {
        int newHealth = currentHealth + healingAmount;
        if (newHealth > 100) {
            newHealth = 100;
        }
        setCurrentHealth(newHealth);
    }

    public String getStatus() {
        return status;
    }
}