public interface CircularListInterface<T> {
    public boolean IsEmpty();
    public void AddFront(T item);
    public void AddBack(T item);
    public void RemoveFront();
    public void RemoveBack();
    public String Search(T item);
    public void Display();
}