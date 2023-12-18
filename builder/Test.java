package builder;

public class Test {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setId(15);
        std1.setName("Abdelrahman");
        std1.setGpa(3.5);
        System.out.println(std1.getName());
        
        Student std2 = new Student();
        System.out.println(std2.withId(1).withName("Ahmad").withGpa(3.1).withEmail("ahmad@gmail.com"));
    }
}
