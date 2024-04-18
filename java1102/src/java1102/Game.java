package java1102;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character warrior = new Warrior();
        Character wizard = new Wizard();
        Character monster = new Monster();
        Character currentCharacter = warrior; // 시작은 전사로

        while (warrior.isAlive() && wizard.isAlive() && monster.isAlive()) { // 모든 캐릭터가 생존한 경우에만 게임 진행
            System.out.println("현재 차례 : " + currentCharacter.getClass().getSimpleName());
            System.out.println("전사 데미지: " + warrior.getDamage());
            System.out.println("마법사 데미지: " + wizard.getDamage());
            System.out.println("전사 HP: " + warrior.getHp());
            System.out.println("마법사 HP: " + wizard.getHp());
            System.out.println("몬스터 HP: " + monster.getHp());
            System.out.print("공격하려면 'a'를, 턴을 바꾸려면 'tag'를 입력하세요: ");
            String input = scanner.nextLine();

            if ("a".equals(input)) {
                if (currentCharacter == warrior) {
                    currentCharacter.attack(monster);
                    System.out.println("전사가 몬스터를 공격했습니다.");
                } else if (currentCharacter == wizard) {
                    currentCharacter.attack(monster);
                    System.out.println("마법사가 몬스터를 공격했습니다.");
                }
            } else if ("tag".equals(input)) {
                if (currentCharacter instanceof Warrior) {
                    currentCharacter = wizard;
                    System.out.println("턴이 마법사로 변경되었습니다.");
                } else if (currentCharacter instanceof Wizard) {
                    currentCharacter = warrior;
                    System.out.println("턴이 전사로 변경되었습니다.");
                }
            } else {
                System.out.println("잘못된 입력입니다. 'a' 또는 'tag'을 입력하세요.");
            }
        }

        
        System.out.println("게임 오버");
    }
}