public class Student extends Person{
    private int age;
    private String email;
    public int getAge() {
        return age;
    }

    public Student(int age, String email) {
        this.age = age;
        this.email = email;
    }

    public Student(String name, int age, String email) {
        super(name);
        this.age = age;
        this.email = email;
    }

    public void study(){
        System.out.println("Китеп окуйт");
    }
    public void run(){
        System.out.println("Таң эрте жүгүрөт");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.getName() + " age: " + age + " email: " + email;
    }
}
