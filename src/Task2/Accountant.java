package Task2;

public class Accountant implements Employee{
String post = "Accountant";
    @Override
    public void displayPost() {
        System.out.println("Post is"+ " "+post);
    }
}
