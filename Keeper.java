package homework;

public interface Keeper<T extends User> {
    void save(T user);
}
