package homework;

public class ReporterUser implements Reporter<User> {

    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }


}
