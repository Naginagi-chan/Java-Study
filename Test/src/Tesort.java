import java.util.*;


class Member{
    String name;
    String grade;

    Member(String name, String grade){
        this.name = name;
        this.grade = grade;
    }
}

interface MemberRepository{
    void save(Member member);
    List<Member> findAll();
}

class MemoryMemberRepository implements MemberRepository{
    List<Member> store = new ArrayList<>();

    @Override
    public void save(Member member) {
        store.add(member);
    }

    @Override
    public List<Member> findAll() {
        return store;
    }
}

public class Tesort {
    public static void main(String[] args)
    {
        MemberRepository repository = new MemoryMemberRepository();

        Member member1 = new Member("철수", "BASIC");
        Member member2 = new Member("영희","VIP");

        repository.save(member1);
        repository.save(member2);

        List<Member> members = repository.findAll();

        for(Member m : members)
        {
            System.out.println("이름: " + m.name + ", 등급: " + m.grade);
        }
    }
}