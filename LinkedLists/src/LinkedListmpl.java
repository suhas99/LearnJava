import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListmpl {
    public static void main(String[] args) {
        //declaration
        LinkedList<String> placesToVisit=new LinkedList<String>();
        //methods same as arraylists
        placesToVisit.add("paris");
        placesToVisit.add("New york");
        placesToVisit.add("Bali");
        placesToVisit.add("Andaman");

        printList(placesToVisit);
        //Simple mention the index and element. Link is created by default
        placesToVisit.add(0,"Gate of Heaven,China");
        printList(placesToVisit);
        placesToVisit.remove("New york");
        placesToVisit.remove(3);
        printList(placesToVisit);

        addInOrder(placesToVisit,"paris");
        addInOrder(placesToVisit,"Diu");
        addInOrder(placesToVisit,"California");
        addInOrder(placesToVisit,"Chandler");
        addInOrder(placesToVisit,"paris");
        printList(placesToVisit);


    }
    public static void printList(LinkedList<String> linkedList){
        Iterator<String> node=linkedList.iterator();

        while (node.hasNext()){
            System.out.println("now visiting "+node.next());
        }

        System.out.println("--------------------");
    }

    public static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> node =linkedList.listIterator();

        //default will be at 0
        while (node.hasNext()){
            //returns 0 if element is present in the index( lexical comaprison based on alpahabetical order)
            int comparison=node.next().compareTo(newCity);
            if(comparison==0){
                System.out.println("Already city "+newCity +" is present");
                return false;
            }
            else if(comparison >0){
                //go back using the node(Using list itertaor provides this method to step back to previous one)
                node.previous();
                node.add(newCity);
                return true;
            }
            else if (comparison<0){
                //
            }
        }
        node.add(newCity);
        return true;
    }

//    private static void visit(LinkedList<String> citiesNode){
//    ListIterator<String> node =citiesNode.listIterator();
//    Scanner scanner =new Scanner(System.in);
//    boolean quit=false;
//
//    if(citiesNode.getFirst()==""){
//        System.out.println("no data is present");
//        return;
//    }else{
//        System.out.println("now visiting node"+node.next());
//    }
//
//    while (!quit){
//      int action =
//    }
//
//    }
}
