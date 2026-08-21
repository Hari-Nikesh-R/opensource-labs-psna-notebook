public class EncapsulationDemo {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.password);
    }
}

class User {
    int age = 24;
    String name;
    String username = "AirSpidey";
    String password = "User123";
    String rollNo = "12123";
    String secretNumber = "89123";
}