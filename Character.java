public class Character {
    String name;
    int hp;
    int atk;
    
    /* コンストラクタ */
    public Character(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    /* atk分だけ減少させるダメージ処理 */
    public void damege(int atk) {
        this.hp -= atk;
    }

    /* 指定されたキャラへの攻撃 */
    public void attack(Character c) {
        c.damege(this.atk);
    }

    /* ステータスの表示 */
    public void showStatus() {
        System.out.println("-----");
        System.out.println(this.name + "のステータス");
        System.out.println("HP: " + this.hp + " " + "ATK: " + this.atk);
        System.out.println("-----");
    }

    /* 上昇した攻撃をもとに戻す */
    public void resetStatus() {

    }
}