package Task2;

public class Director implements Employee{
    String post = "Director";
    @Override
    public void displayPost() {
        System.out.println("Post is"+ " "+post);
    }
}
