import java.util.*;

interface Marker {
}

class Product implements Marker {
    int id, quantity;
    String name;
    double cost;

    Product() {
        id = 0;
        quantity = 0;
        name = "";
        cost = 0;
    }

    Product(int id, String name, int quantity, double cost) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    void disp() {
        System.out.println(id + "\t" + name + "\t" + quantity + "\t" + cost);
    }

    public static void main(Stirng arg[]) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Limit::");
        int n = sc.nextInt();
        Product p[] = new Product[n];
        System.out.println(("Enter product details::"));
        for (int i = 0; i < n; i++) {
            System.out.println("enter id name cost quantity::");
            int id = nextInt();
            String name = next();
            double cost = sc.nextDouble();
            int quantity = sc.nextInt();

            p[i] = new Product(id, name, quantity, cost);
            c++;
        }
        System.out.println("ID\tName\tQuantity\tCost");
        for (int i = 0; i < n; i++)
            p[i].disp();
        System.out.println("Object count=" + c);
    }
}