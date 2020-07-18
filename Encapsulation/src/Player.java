public class Player {
    private String name;
    private int health=100;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if(health>0 & health<100){
            this.health = health;
        }
        this.weapon = weapon;
    }

    private void getenemeySecret(){
        System.out.println("Enemy can be defeated with kai sword");
    }
    public void loseHealth(int damage){
        this.health-=damage;
        System.out.println("player health reduced to"+health);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        getenemeySecret();
        return weapon;
    }
}

