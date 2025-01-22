package subsytem;

import java.util.ArrayList;

public class Membership {
    ArrayList<Member> membersOfLibrary;

    // Add member
    public Membership() {
        this.membersOfLibrary = new ArrayList();
    }



    public void addMember(Member member) {
        membersOfLibrary.add(member);
    }
    // Check if someone is a member of the library
    public boolean isMember(String libraryCardNumber) {
        return membersOfLibrary.contains(libraryCardNumber);
    }

    // Remove member from the library
    public void removeMember(Member member) {
        membersOfLibrary.remove(member);
    }

    public void allMembers() {
        for (Member member : membersOfLibrary) {
            System.out.println(member);
        }
    }



}
