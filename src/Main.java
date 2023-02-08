public class Main {
    public static void main(String[] args) {
        //todo Студент класс Супер классты мурастап бир студенттин маалыматын тустринг аркылуу консолго чыгарып берет.
        Student st=new Student("АбдуСомад",31,"a@gmail.com");
        System.out.println(st);
        st.study();
        st.run();
    }
}