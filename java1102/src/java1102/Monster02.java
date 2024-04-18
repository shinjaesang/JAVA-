package java1102;

public class Monster02 implements Character{
	private int hp;
	private int defense;
	
	public Monster02() {
		this.hp = 100;
		this.defense = 0;
	}
	
	@Override
	public void attack(Character target) {
		int damage = (int) (Math.random() * 6) + 5;
		target.takeDamage(damage);
		target.counterAttack(this);
	}
	
	@Override
	public void takeDamage(int damage) {
		int actualDamage =  (int) (Math.random() * damage);
		hp -= actualDamage;
	}
	
	@Override
	public void counterAttack(Character target) {
		
	}
}
