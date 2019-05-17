public class CircularList<T> implements CircularListInterface<T> {
    private int size;
    private ListNode head;

    CircularList() {
        size = 0;
        head = null;
    }

    public boolean IsEmpty() {
        return (size == 0);
    }

    public void AddFront(T item) {
        if (IsEmpty()) {
            Add(item);
        } else {
            ListNode current = head;
            while (current.GetNext() != head) {
                current = current.GetNext();
            }
            ListNode newHead = new ListNode<T>(item, head);
            current.SetNext(newHead);
            head = newHead;
        }
        size++;
    }

    public void AddBack(T item) {
        if (IsEmpty()) {
            Add(item);
        } else {
            ListNode current = head;
            while (current.GetNext() != head) {
                current = current.GetNext();
            }
            ListNode tail = new ListNode<T>(item, head);
            current.SetNext(tail);
        }
        size++;
    }

    public void RemoveFront() {
        if (size == 1) {
            size--;
        } else {
            ListNode current = head;
            while (current.GetNext() != head) {
                current = current.GetNext();
            }
            head = head.GetNext();
            current.SetNext(head);
            size--;
        }
    }

    public void RemoveBack() {
        if (size == 1) {
            size--;
        } else {
            ListNode current = head;
            ListNode previous = null;
            while (current.GetNext() != head) {
                previous = current;
                current = current.GetNext();
            }
            previous.SetNext(head);
            size--; 
        }
    }

    public String Search(T item) {
        if (!IsEmpty()) {
            ListNode current = head;
            int position = 1;
            while (position <= size) {
                if (current.GetItem() == item) {
                    return current.GetItem() + " is at position " + position;
                }
                current = current.GetNext();
                position++;
            }
        }
        return item + " not found";
    }

    public void Display() {
        ListNode current = head;
        int count = 0;
        while (count < size) {
            System.out.println(current.GetItem());
            current = current.GetNext();
            count++;
        }
    }

    private void Add(T item) {
        head = new ListNode<T>(item, head);
        head.SetNext(head);
    }
}