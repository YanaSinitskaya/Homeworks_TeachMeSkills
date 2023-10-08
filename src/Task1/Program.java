package Task1;

public class Program {
    public static void main(String[] args) {
        Phone iPhone = new Phone();
        iPhone.number = 375296724597l;
        iPhone.model = "iPhone 12";
        iPhone.weight = 164;
        iPhone.displayInfo();
        iPhone.getNumber();
        iPhone.recieveCall("Mike");
        System.out.println();
        iPhone.recieveCall("Mike", iPhone.number);
        System.out.println();

        Phone GooglePixel = new Phone (375441594178l, "Google Pixel 7a", 194);
        GooglePixel.displayInfo();
        GooglePixel.getNumber();
        GooglePixel.recieveCall("Dmitry");
        System.out.println();
        GooglePixel.recieveCall("Dmitry", GooglePixel.number);
        System.out.println();

        Phone Xiaomi = new Phone (375331973622l, "Xiaomi 11t Pro");
        Xiaomi.weight = 204;
        Xiaomi.displayInfo();
        Xiaomi.getNumber();
        Xiaomi.recieveCall("Anna");
        System.out.println();
        Xiaomi.recieveCall("Dmitry", Xiaomi.number);
        Xiaomi.sendMessage(iPhone.number, GooglePixel.number, Xiaomi.number);
    }
}
