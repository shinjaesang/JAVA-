package java1116;
import java.util.*;

class Dog {
    String name;
    int age;
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class DogHotel {
    private Dog[] rooms = new Dog[2];
    private List<Dog> dogs = new ArrayList<>(Arrays.asList(
        new Dog("가", 1),
        new Dog("나", 2),
        new Dog("다", 3),
        new Dog("라", 4),
        new Dog("마", 5)
    ));

    public void checkIn(String name) {
        Dog dogToCheckIn = null;
        for (Dog dog : dogs) {
            if (dog.name.equals(name)) {
                dogToCheckIn = dog;
                break;
            }
        }
        if (dogToCheckIn == null) {
            System.out.println("리스트에 없는 강아지입니다.");
            return;
        }
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = dogToCheckIn;
                dogs.remove(dogToCheckIn);
                System.out.println(dogToCheckIn.name + ", 나이: " + dogToCheckIn.age + " 체크인 완료");
                return;
            }
        }
        System.out.println("방이 모두 차있습니다.");
    }

    public void checkOut(String name) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null && rooms[i].name.equals(name)) {
                dogs.add(rooms[i]);
                System.out.println(rooms[i].name + ", 나이: " + rooms[i].age + " 체크아웃 완료");
                rooms[i] = null;
                return;
            }
        }
        System.out.println("해당 이름의 강아지가 없습니다.");
    }

    public void showGuests() {
        for (Dog dog : rooms) {
            if (dog != null) {
                System.out.println("투숙중인 강아지: " + dog.name + ", 나이: " + dog.age);
            }
        }
    }

    public static void main(String[] args) {
        DogHotel hotel = new DogHotel();
        Scanner input = new Scanner(System.in);
        String action, name;
        while (true) {
            System.out.println("체크인, 체크아웃, 확인 중 하나를 입력하세요. 종료하려면 '종료'를 입력하세요.");
            action = input.nextLine();
            if (action.equalsIgnoreCase("체크인")) {
                System.out.println("강아지 이름을 입력하세요: ");
                name = input.nextLine();
                hotel.checkIn(name);
            } else if (action.equalsIgnoreCase("체크아웃")) {
                System.out.println("강아지 이름을 입력하세요: ");
                name = input.nextLine();
                hotel.checkOut(name);
            } else if (action.equalsIgnoreCase("확인")) {
                hotel.showGuests();
            } else if (action.equalsIgnoreCase("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
        input.close();
    }
}