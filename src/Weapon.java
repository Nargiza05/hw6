public class Weapon {
    private WeaponType type;  // Тип оружия
    private String name;      // Название оружия

    // Конструктор для создания объекта Weapon
    public Weapon(WeaponType type, String name) {
        this.type = type;
        this.name = name;
    }

    // Геттер для получения типа оружия
    public WeaponType getType() {
        return type;
    }

    // Сеттер для установки типа оружия
    public void setType(WeaponType type) {
        this.type = type;
    }

    // Геттер для получения названия оружия
    public String getName() {
        return name;
    }

    // Сеттер для установки названия оружия
    public void setName(String name) {
        this.name = name;
    }
}
