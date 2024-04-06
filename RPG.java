import java.util.ArrayList;
import java.util.Scanner;

// 플레이어 클래스
class Player {
    private String name;
    private int health; // 플레이어 체력
    private Weapon currentWeapon; // 현재 무기
    private ArrayList<Weapon> weapons; // 무기 리스트

    public Player(String name) {
        this.name = name; // 플레이어 이름 설정
        this.health = 100; // 초기 체력 설정
        this.weapons = new ArrayList<>(); // 무기 리스트
        this.weapons.add(new Weapon("검", 10)); // 초기 무기 "검" 추가
        this.currentWeapon = weapons.get(0); // get 메서드를 이용해 배열 인덱승 접근 후 현재 무기 설정
    }

    // 몬스터를 공격
    public void attack(Enemy enemy) {
        int damage = currentWeapon.getDamage();
        System.out.println("\n" + name + "가 " + enemy.getName() + "을(를) " + currentWeapon.getName() + "(으)로 공격하여 " + damage + "의 피해를 입혔습니다.");
        enemy.takeDamage(damage);
    }

    // 몬스터의 체력을 감소
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + "이(가) " + damage + "의 피해를 입었습니다.");
        if (health <= 0) {
            System.out.println(name + "이(가) 패배하였습니다!");
        }
    }
    
    // 몬스터를 죽일 때마다 새로운 무기 추가(public 클래스 main 메서드에 있는 무기 배열)
    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
        System.out.println(name + "이(가) " + weapon.getName() + "을(를) 얻었습니다!");
    }

    // 무기 선택
    public void selectWeapon() {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < weapons.size(); i++) {
            System.out.println((i + 1) + ". " + weapons.get(i).getName());
        }
        
        System.out.print("사용할 무기를 선택하세요: ");
        int choice = scanner.nextInt();
        this.currentWeapon = weapons.get(choice - 1); // 사용자가 선택한 번호의 무기 선택(배열이므로 -1한 값을 인덱싱, get 메서드는 위 참고)
    }
    
    // 방에 들어갈 때마다 체력 초기화
    public void resetHealth() {
        this.health = 100; // 체력 초기화
    }

    // 플레이어가 살아있는지 확인
    public boolean isAlive() {
        return health > 0; // 0 초과면 true, 0이하면 false
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}

// 적 클래스
class Enemy {
    private String name;
    private int health;
    private int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    // 몬스터가 피해를 입을 때 (== 플레이어가 공격했을 때)
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + "이(가) " + damage + "의 피해를 입었습니다.");
        if (health <= 0) {
            System.out.println(name + "이(가) 패배하였습니다!");
        }
    }
    
    public void attack(Player player) {
        System.out.println(name + "이(가) " + player.getName() + "을(를) 공격하여 " + damage + "의 피해를 입혔습니다.");
        player.takeDamage(damage);
    }

    // 무한 루프에서 사용할 조건. 체력이 0보다 크면 true 반환
    public boolean isAlive() {
        return health > 0;
    }
    
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}

// 무기 클래스
class Weapon {
	// 무기 이름과 데미지
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 플레이어 이름 받기
        System.out.print("플레이어 이름을 입력해주세요: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName); // 플레이어 객체 생성

        // Enemy 생성자를 통해 이름, 체력, 공격력 초기화
        Enemy[] enemies = {
            new Enemy("고블린", 20, 10),
            new Enemy("좀비", 30, 15),
            new Enemy("데몬", 50, 20),
            new Enemy("히드라", 70, 25),
            new Enemy("드레곤", 90, 27)
        };

        // 무기 리스트
        Weapon[] weapons = {
            new Weapon("검", 10),
            new Weapon("도끼", 15),
            new Weapon("활", 20),
            new Weapon("마법 지팡이", 25),
            new Weapon("전설의 검", 30)
        };

        // 방 번호 초기화
        int currentRoom = 0;

        // 플레이어 체력이 true(0보다 클 때)이고, 현재 방 번호가 적의 개수보다 작으면 반복
        while (player.isAlive() && currentRoom < enemies.length) {
            player.resetHealth(); // 방에 들어갈 때마다 플레이어의 체력 초기화

            // 적을 현재 방 번호의 적으로 설정
            System.out.println("=============================");
            Enemy enemy = enemies[currentRoom];
            System.out.println("방 번호: " + (currentRoom + 1));
            System.out.println(enemy.getName() + "을(를) 만났습니다!");
            System.out.println("=============================");
            player.selectWeapon(); // 전투 전 무기 선택

            // 몬스터와 플레이어 둘 다 살아 있을 때
            while (enemy.isAlive() && player.isAlive()) {
                System.out.println("===================");
                System.out.println(playerName + "의 체력: " + player.getHealth());
                System.out.println(enemy.getName() + "의 체력: " + enemy.getHealth());
                System.out.println("===================");
                System.out.println("1. 공격");
                System.out.println("2. 종료");
                System.out.print("행동을 선택하세요: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    player.attack(enemy);
                    if (enemy.isAlive()) {
                        enemy.attack(player);
                    }
                } else if (choice == 2) {
                    System.out.print("게임을 종료합니다.");
                    return; // main() 메서드 종료할 때 사용
                }
            }
            if (currentRoom < enemies.length - 1) {
                player.addWeapon(weapons[currentRoom + 1]); // 적 처치 후 새로운 무기 획득
            }
            currentRoom++;
        }
        System.out.print("!!축하드립니다. 게임을 전부 이겼습니다!!");
    }
}
