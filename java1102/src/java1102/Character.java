package java1102;

public interface Character {
	void attack(Character target);
    void takeDamage(int damage);
    void counterAttack(Character target);
    int getDamage();
    int getHp();
    boolean isAlive();
}
