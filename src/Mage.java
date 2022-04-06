/*
Опишите класс Mage. В нем пропишите:

поле name (имя, строка);
поле level (уровень мага, число);
поле damage (урон, число);
поле type (тип магии, строка, может быть равен fire, ice, earth);
конструктор, инициализирующий данные поля (name, level, damage, type);
метод getInfo(), возвращающий строку вида {name, level, damage, type};

метод fight(Mage mage), этот метод должен вернуть имя мага-победителя.

 */

public class Mage{

    private String name;
    private int level;
    private int damage;
    private String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo() {
        return name + ", " + level + ", " + damage + ", " + type;
    }

    public String fight(Mage mage) {
        /*
        Кто из них победит решается следующем образом:
        ⚡ Маг огня побеждает мага льда, но проигрывает магу земли.
        ⚡ Маг льда побеждает мага земли, но проигрывает магу огня.
        ⚡ Маг земли побеждает мага огня, но проигрывает магу льда.
        ⚡Если же стихия магов одинаковая, то выигрывает более высокоуровневый маг,
        если же и уровни одинаковы, то тот, у которого больший урон,
        если же и урон одинаковый, то вернуть строку draw (ничья).
         */

        if(this.type == "fire"){

        } else if(this.type == "ice"){

        } else if(this.type == "earth"){

        }

        return mage.name;
    }

}

class Mail{
    public static void main(String[] args) {
        Mage m1 = new Mage("Herold", 10 , 1000, "fire");
        Mage m2 = new Mage("Gloria", 10 , 1000, "ice");
        Mage m3 = new Mage("Jaba", 10 , 1000, "earth");

        System.out.println(m1.fight(m2));

        //тест

    }
}