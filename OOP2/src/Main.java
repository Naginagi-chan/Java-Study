import java.util.ArrayList;
import java.util.List;


void main() {

    List<String> members = new ArrayList<>();

    members.add("Kim");
    members.add("Young");

    String first = members.get(0);
    System.out.println(first);

    for(String name : members){
        System.out.println(name);
    }
}