public class Main {
    public static void main(String[] args) {
        //Encapsulation says all private fields and methods should not be accessible by main method or by end user directly
        Player player1=new Player("suhas",200,"sword");
        System.out.println(player1.getWeapon());
        player1.loseHealth(20);

    }
}
