public class ListNode<T> {

    private T item;
    private ListNode<T> next;

    ListNode(T item, ListNode next) {
        this.item = item;
        this.next = next;
    }

    ListNode(T item) {
        this.item = item;
    }

    public void SetItem(T item){
        this.item = item;
    }

    public T GetItem(){
        return item;
    }

    public void SetNext(ListNode next){
        this.next = next;
    }

    public ListNode<T> GetNext(){
        return next;
    }
}