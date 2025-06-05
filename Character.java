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
        System.out.println(this.name + "に" + atk +"ダメージ");
        if (this.hp <= 0) {
            this.hp = 0;
            System.out.println(this.name + "は倒れた");
        }
        System.out.println(this.name + "の残りHP: " + this.hp);
    }

    /* 指定されたキャラへの攻撃 */
    public void attack(Character c) {
        System.out.print(">> " + this.name + "の攻撃! \n");
        c.damege(this.atk);
    }

    /* ステータスの表示 */
    public void showStatus() {
        System.out.println(this.name + "のステータス");
        System.out.println("HP: " + this.hp + " " + "ATK: " + this.atk);
    }

    /* 上昇した攻撃をもとに戻す */
    public void resetStatus() {
        if (this instanceof Hero) {
            this.atk = 20;
        } else if (this instanceof Knight) {
            this.atk = 25;
        } else if (this instanceof Monk) {
            this.atk = 5;
        } else if (this instanceof Magician) {
            this.atk = 10;
        }
    }
}