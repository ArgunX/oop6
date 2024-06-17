package homework;

public class Main{
    public static void main(String[] args){
       User user = new User("Bob");
       Reporter<User> reporter = new ReporterUser();
       Keeper<User> keeper = new KeeperUser();
       reporter.report(user);
       keeper.save(user);


    }
}