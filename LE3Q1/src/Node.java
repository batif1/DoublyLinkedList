public class Node <E>  {
    private E element;
    private Node<E> prev;
    private Node<E> next;

    public Node(){}
    public Node(E element, Node<E> prev,Node<E> next){
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public Node<E> getNext(){
        return next;
    }

    public void setPrev(Node<E> previousNode){
        prev = previousNode;
    }

    public E getElement(){
        return element;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getPrev() {
        return prev;
    }
}
