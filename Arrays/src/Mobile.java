import java.util.ArrayList;

public class Mobile {
    private String phoneNumber;
    private ArrayList<Contact> myContacts;

    public Mobile(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public boolean addContact(Contact contact){
        // checking for element present with index
        if(findContact(contact.getName())>=0){
            System.out.println("Contact already in file");
            return false;
        }
    myContacts.add(contact);
    return true;
    }

    private int findContact(Contact contact) {
    return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
       for(int count=0;count<myContacts.size();count++){
           Contact contact =this.myContacts.get(count);
           if(contact.getName().equals(name)){
               return count;
           }
       }
        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int offset=findContact(oldContact);
        if(offset>=0){
            this.myContacts.set(offset,newContact);
            System.out.println("name specified replaced");
            return true;
        }
            System.out.println("Cant find the name specified");
            return false;

    }

    public boolean removeContact(Contact contact){
        int offset=findContact(contact);
        if(offset>=0){
            this.myContacts.remove(contact);
            System.out.println("removed contact specified");
            return true;
        }
        else{
            System.out.println("Cant find the name specified");
            return false;
        }
    }


}
