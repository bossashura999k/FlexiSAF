public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(15);
        Person person2 = new Person(25);
        Person person3 = new Person(59);
        Person person4 = new Person(100);

        System.out.println("Checking voting eligibility for each person:");
        System.out.println("Person 1: " + person1.checkVotingEligibility());
        System.out.println("Person 2: " + person2.checkVotingEligibility());
        System.out.println("Person 3: " + person3.checkVotingEligibility());
        System.out.println("Person 4: " + person4.checkVotingEligibility());
    }
}
