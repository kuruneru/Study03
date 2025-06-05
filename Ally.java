public class Ally extends Character{
    private int id;

    /* コンストラクタ(IDも設定)←しなかった */
    public Ally(String name, int hp, int atk) {
        super(name, hp, atk);
    }

    /* セッター */
    public void setId(int id) {
        this.id = id;
    }

    /* ステータスとIDを出力 */
    public void showStatus() {
        super.showStatus();
        System.out.println(super.name + "のID: " + this.id);
    }
}