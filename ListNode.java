public class ListNode<T> {

    private T item;
    private ListNode<T> next;

    ListNode(T item, ListNode next) {
        SetItem(item);
        SetNext(next);
    }

    ListNode(T item) {
        SetItem(item);
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