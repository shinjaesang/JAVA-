package java1102;
import java.util.Random;

public class Monster implements Character {
    private int hp;
    private int defense;

    public Monster() {
        this.hp = 100;
        this.defense = 0;
    }

    @Override
    public void attack(Character target) {
        int damage = (int) (Math.random() * 6) + 5; // 5에서 10 사이의 랜덤한 데미지
        target.takeDamage(damage);
        target.counterAttack(this);
    }

    @Override
    public void takeDamage(int damage) {
        int actualDamage = Math.max(damage, 0);
        hp -= actualDamage;
    }
    
    public void counterAttack(Character target) {
    	 Random random = new Random();
    	int damage = random.nextInt(6) + 5; // 5에서 10 사이의 랜덤한 데미지
        target.takeDamage(damage);
        System.out.println("몬스터가 반격하여 " + damage + "의 데미지를 입혔습니다.");
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }

	@Override
	public int getDamage() {
		return 0;
	}

	@Override
	public int getHp() {
		return hp;
	}
}