public class Main{
    public static void main(String[] args) {
        CircularListInterface myList = new CircularList();
        System.out.println(myList.IsEmpty());
        System.out.println("=============================");
        myList.AddFront(3);
        myList.AddFront(2);
        myList.AddBack(4);
        myList.AddFront(1);
        myList.Display();
        System.out.println("=============================");
        myList.RemoveFront();
        myList.Display();
        System.out.println("=============================");        
        myList.RemoveBack();
        myList.Display();
        System.out.println("=============================");
        String itemPostion = myList.Search(4);
        System.out.println(itemPostion);
        System.out.println("=============================");
        itemPostion = myList.Search(3);
        System.out.println(itemPostion);
        System.out.println("=============================");
    }
}