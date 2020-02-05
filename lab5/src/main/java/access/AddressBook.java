package access;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @OneToMany
    private List<BuddyInfo> buddy;

    public AddressBook(){
        buddy = new ArrayList<BuddyInfo>();
    }

    public void addBuddyInfo(BuddyInfo info){
        buddy.add(info);
    }


    public String toString(){
        String s = "";
        for (BuddyInfo b: buddy) {
            s += b.toString() + "\n";
        }
        return s;
    }

    public void init(){
        AddressBook book = new AddressBook();
    }
}
