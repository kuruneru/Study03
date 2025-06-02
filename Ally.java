public class Ally extends Character{
    static int count = 0;
    private int id;

    /* コンストラクタ(IDも設定) */
    public Ally(String name, int hp, int atk) {
        super(name, hp, atk);
        this.id = count;
    }

    /* ステータスとIDを出力 */
    public void showStatus() {
        super.showStatus();
        System.out.println(super.name + "のID: " + this.id);
    }
}