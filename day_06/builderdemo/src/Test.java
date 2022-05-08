public class Test {
    public static void main(String[] args) {
        Person person = Person.builder().withName("Nguyễn Văn A").withAge(32).build();

        System.out.println(person);

        Person person1 = Person.builder().isMarrried(true).withName("Eddie").withAge(25).withEmail("eddie@gmail.com")
                .withPhone("012345").build();

        System.out.println(person1);
    }
}
