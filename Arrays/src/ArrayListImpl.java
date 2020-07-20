import java.util.ArrayList;

public class ArrayListImpl {
    private ArrayList<String> groceryList =new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void displayList(){
        System.out.println("you have "+groceryList.size()+ " items in your list now!");
        for (int count=0;count<groceryList.size();count++){
            System.out.println(groceryList.get(count));
        }
    }

    public void  addList(String item){
        groceryList.add(item);
    }

    public void updateList(int position, String item){
        groceryList.set(position,item);
    }
    public void updateList(String oldItem, String newItem){
        int position =groceryList.indexOf(oldItem);
        if(position>=0){
            groceryList.set(position,newItem);
        }
    }

    public void removeList(int position){
        groceryList.remove(position);
    }
    public void removeList(String value){
        groceryList.remove(value);
    }

    public void findItem(String searchItem){
        if(groceryList.contains(searchItem)){
            System.out.println("you have already "+ searchItem+" in basket");
            System.out.println(groceryList.indexOf(searchItem));
        }

    }
    public void processArrayList(){
        //1st way of copying a Arraylist with add all()
        ArrayList<String> newList = new ArrayList<String>();
        newList.addAll(groceryList);

        //second way of doing it with direct initialization
        ArrayList<String> newListCopy = new ArrayList<String>(groceryList);

        for (int count=0;count<newList.size();count++){
            System.out.println(newList.get(count));
        }

        //using a array method
        String[] myArray= new String[groceryList.size()];
        myArray=groceryList.toArray(myArray);


    }



    public static void main(String[] args) {
        ArrayListImpl listExample =new ArrayListImpl();
        listExample.addList("Biscuit");
        listExample.displayList();

        listExample.updateList("Biscuit","Chocolate");
        listExample.displayList();
        listExample.updateList(0,"Biscuit");
        listExample.displayList();

        listExample.addList("Chocolate");
        listExample.addList("Dry fruits");
        listExample.displayList();

        listExample.findItem("Dry fruits");

        listExample.removeList(2);
        listExample.displayList();
        listExample.addList("Dry fruits");
        listExample.removeList("Dry fruits");

        listExample.displayList();
        listExample.processArrayList();



    }

}
