package library.members;

public class Member {
    public String name;
    public int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayMember() {
        System.out.println("Member: " + name + " | ID: " + memberId);
    }
}
