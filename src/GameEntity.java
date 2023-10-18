public class GameEntity {
    private String name;  // Имя сущности
    private int health;   // Здоровье сущности
    private int damage;   // Урон сущности

    // Конструктор для создания объекта GameEntity
    public GameEntity(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    // Геттер для получения имени сущности
    public String getName() {
        return name;
    }

    // Сеттер для установки имени сущности
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для получения здоровья сущности
    public int getHealth() {
        return health;
    }

    // Сеттер для установки здоровья сущности
    public void setHealth(int health) {
        this.health = health;
    }

    // Геттер для получения урона сущности
    public int getDamage() {
        return damage;
    }

    // Сеттер для установки урона сущности
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
