package Task1;

public class Phone {
    Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {
    }

    Phone(long number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    long number;
    String model;
    int weight;

    void displayInfo() {
        System.out.print("The phone is" + " " + number + " " + model + " " + weight + "g");
    }

    void recieveCall(String nameOfCaller) {
        System.out.print(" Name of caller is" + " " + nameOfCaller);
    }

    long getNumber() {
        return number;
    }

    long recieveCall(String nameofCaller, long getNumber) {
        System.out.println("The name of caller is " + nameofCaller + " and telephone number is " + number);
        return number;
    }
    void sendMessage (long ...phonenumbers){
        for (long telnumb : phonenumbers) {
            System.out.println("You sent message to those numbers: "+ telnumb);
        }
        }
}

