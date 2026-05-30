abstract class Foodorder {
    String customerName;
    int quantity;
    double price;

    Foodorder(String name, int quantity, double price) {
        this.customerName = name;
        this.quantity = quantity;
        this.price = price;
    }

    abstract void orderFood();

    void generateBill() {
        double total = quantity * price;

        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total Bill    : " + total);
        System.out.println("--------------------------");
    }
}

class PizzaOrder extends Foodorder {
    PizzaOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    void orderFood() {
        System.out.println("Pizza order placed successfully!");
    }
}

class DosaOrder extends Foodorder {
    DosaOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    void orderFood() {
        System.out.println("Dosa order placed successfully!");
    }
}

class BurgerOrder extends Foodorder {
    BurgerOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    void orderFood() {
        System.out.println("Burger order placed successfully!");
    }
}

class SandwichOrder extends Foodorder {
    SandwichOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    void orderFood() {
        System.out.println("Sandwich order placed successfully!");
    }
}

class PastaOrder extends Foodorder {
    PastaOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    void orderFood() {
        System.out.println("Pasta order placed successfully!");
    }
}

class NoodlesOrder extends Foodorder {
    NoodlesOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    void orderFood() {
        System.out.println("Noodles order placed successfully!");
    }
}

class RiceOrder extends Foodorder {
    RiceOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    void orderFood() {
        System.out.println("Rice order placed successfully!");
    }
}

class CoffeeOrder extends Foodorder {
    CoffeeOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    void orderFood() {
        System.out.println("Coffee order placed successfully!");
    }
}

class IceCreamOrder extends Foodorder {
    IceCreamOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    void orderFood() {
        System.out.println("Ice Cream order placed successfully!");
    }
}

class MomosOrder extends Foodorder {
    MomosOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    void orderFood() {
        System.out.println("Momos order placed successfully!");
    }
}

public class main{
    public static void main(String[] args) {

        PizzaOrder p = new PizzaOrder("Lokesh", 2, 250);
        DosaOrder d = new DosaOrder("Rev", 3, 80);
        BurgerOrder b = new BurgerOrder("Ajay", 2, 120);
        SandwichOrder s = new SandwichOrder("Harsha", 1, 90);
        PastaOrder pa = new PastaOrder("Bob", 2, 150);
        NoodlesOrder n = new NoodlesOrder("Ramana", 3, 130);
        RiceOrder r = new RiceOrder("Rudhra", 2, 140);
        CoffeeOrder c = new CoffeeOrder("Arjun", 2, 70);
        IceCreamOrder i = new IceCreamOrder("Mahesh", 4, 50);
        MomosOrder m = new MomosOrder("Nani", 3, 110);

        p.orderFood();
        p.generateBill();

        d.orderFood();
        d.generateBill();

        b.orderFood();
        b.generateBill();

        s.orderFood();
        s.generateBill();

        pa.orderFood();
        pa.generateBill();

        n.orderFood();
        n.generateBill();

        r.orderFood();
        r.generateBill();

        c.orderFood();
        c.generateBill();

        i.orderFood();
        i.generateBill();

        m.orderFood();
        m.generateBill();
    }
}
