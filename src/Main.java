public class Main {
    public static void main(String[] args) {


                // Создаем оружие для босса
                Weapon bossWeapon = new Weapon(WeaponType.AXE, "Berserker's Axe");

                // Создаем экземпляр босса и устанавливаем его свойства
                Boss boss = new Boss("Boss", 1000, 50, bossWeapon);

                // Выводим информацию о боссе
                System.out.println("Boss Info:");
                System.out.println(boss.printInfo());

                // Создаем два экземпляра скелетов и устанавливаем их свойства
                Skeleton skeleton1 = new Skeleton("Skeleton1", 100, 10, bossWeapon, 20);
                Skeleton skeleton2 = new Skeleton("Skeleton2", 80, 8, bossWeapon, 15);

                // Выводим информацию о скелетах
                System.out.println("\nSkeleton 1 Info:");
                System.out.println(skeleton1.printInfo());

                System.out.println("\nSkeleton 2 Info:");
                System.out.println(skeleton2.printInfo());
            }
        }
