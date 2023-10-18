public class   Skeleton extends Boss {
    private int arrowCount;  // Количество стрел

    // Конструктор для создания объекта Skeleton
    public Skeleton(String name, int health, int damage, Weapon weapon, int arrowCount) {
        super(name, health, damage, weapon);
        this.arrowCount = arrowCount;
    }

    // Геттер для получения количества стрел
    public int getArrowCount() {
        return arrowCount;
    }

    // Сеттер для установки количества стрел
    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    // Переопределенный метод для вывода информации о скелете
    @Override
    public String printInfo() {
        return "Skeleton Name: " + getName() + "\nHealth: " + getHealth() + "\nDamage: " + getDamage()
                + "\nWeapon Type: " + getWeapon().getType() + "\nWeapon Name: " + getWeapon().getName()
                + "\nArrow Count: " + arrowCount;
    }
}

