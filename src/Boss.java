public class Boss extends GameEntity {
    private Weapon weapon;  // Оружие босса

    // Конструктор для создания объекта Boss
    public Boss(String name, int health, int damage, Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;
    }

    // Геттер для получения оружия босса
    public Weapon getWeapon() {
        return weapon;
    }

    // Сеттер для установки оружия босса
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Переопределенный метод для вывода информации о боссе
    public String printInfo() {
        return "Boss Name: " + getName() + "\nHealth: " + getHealth() + "\nDamage: " + getDamage()
                + "\nWeapon Type: " + weapon.getType() + "\nWeapon Name: " + weapon.getName();
    }
}

