package homework;

public class KeeperUser implements Keeper{

    public void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}
