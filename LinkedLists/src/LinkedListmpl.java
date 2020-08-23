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

        visit(placesToVisit);


    }
    public static void printList(LinkedList<String> linkedList){

        for (String s : linkedList) {
            System.out.println("now visiting " + s);
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
            else {
                //
            }
        }
        node.add(newCity);
        return true;
    }

    //method to check how list is being traversed
    private static void visit(LinkedList<String> citiesNode){
    ListIterator<String> node =citiesNode.listIterator();
    Scanner scanner =new Scanner(System.in);
    boolean quit=false;
    boolean movingForward=true;

    //can also use cities.isempty()
    if(citiesNode.getFirst()==""){
        System.out.println("no data is present");
        return;
    }else{
        System.out.println("now visiting node "+node.next());
        printMenu();
    }

    while (!quit){
      int action =scanner.nextInt();
      scanner.nextLine();

      switch (action){
          case 0:
              System.out.println("trip finished");
              quit=true;
              break;
          case 1:
              //the first if block is specified to avoid loops in linkedlist by listIterator. if we dont use we will be visting same node while changing back and forward. comment and see what we get
              if(!movingForward){
                  if(node.hasNext()){
                      node.next();
                  }
                  movingForward =true;
              }
              if (node.hasNext()){
                  System.out.println("now visiting "+node.next());
              }
              else{
                  System.out.println("Reached end of the list");
                  movingForward=false;
              }
              break;
          case 2:
              if(movingForward){
                  if(node.hasPrevious()){
                      node.previous();
                  }
                  movingForward=false;
              }
              if(node.hasPrevious()){
                  System.out.println("now traversing back to "+node.previous());
              }
              else{
                  System.out.println("This is top element of list");
                  movingForward=true;
              }
              break;
          case 3:
              printMenu();
              break;
      }
    }

    }

    // simple method for scanner
    private static void printMenu(){
        System.out.println("Available actiona :\n press" );
        System.out.println("0 - quit\n"+
                "1 - next city \n"+
                "2 -previous city\n"+
                "3 - print menu options");
    }
}
