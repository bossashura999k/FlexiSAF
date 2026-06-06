public class Person {
    private int age;
    public Person(int initAge) {
        this.age = initAge;
    }
    public String checkVotingEligibility() {
        if (age < 18) {
            return "You are not eligible to vote.";
        } else if (age >= 60) {
            return "You are a senior citizen and eligible to vote";
        } else {
            return "You are eligible to vote.";
        }   
    }
}
