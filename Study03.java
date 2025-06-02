public class Study03 {
    public static void main(String[] args) {
        Hero hero = new Hero("勇者", 150, 20);
        Knight knight = new Knight("騎士", 160, 25);
        Monk monk = new Monk("僧侶", 100, 5);
        Magician magician = new Magician("魔導士", 60, 10);
        Satan satan = new Satan("魔王", 250, 30);

        hero.showStatus();
        knight.showStatus();
        monk.showStatus();
        magician.showStatus();

        satan.showStatus();
    }
}