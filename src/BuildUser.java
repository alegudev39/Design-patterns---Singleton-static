public class BuildUser {

    private String name;
    private int age;

//    public AnimalBuilder name(String name) {
//        this.name = name;
//        return this;
//    }

    public BuildUser name(String name) {
        this.name = name;
        return this;
    }

    public BuildUser age(int age) {
        this.age = age;
        return this;
    }

    public User build(){
        return new User();
    }

}
