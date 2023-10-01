package Task2;

public class Worker implements Employee{
    String post = "Worker";
    @Override
    public void displayPost() {
        System.out.println("Post is"+ " "+post);
    }
}

