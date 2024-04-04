public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static String stampUserInfo(User user) {
        return "User{" +
                "name='" + user.getName() + '\'' +
                ", age=" + user.getAge() +
                '}';
    }

    private static User user;
    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static User getUser() {
        if (user == null) {
            user = new User("unknown",0);
        }
        return user;
    }
}
