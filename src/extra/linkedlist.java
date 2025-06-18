package extra;

class node {
    private String data;
    private node next;
    public node(String data) {
        this.data = data;
    }

    public String getdata() {
        return this.data;
    }
    public void setdata(String data) {
        this.data = data;
    }
    public node getNext() {
        return this.next;
    }
    public void setNext(node next) {
        this.next = next;
    }
}
class LL {
    private node head;
    private node tail;

    public node getHead() {
        return this.head;
    }

    public node getTail() {
        return this.tail;
    }


    public void Adddataatend(String data) {
        node n = new node(data);
        if (this.head == null)
            this.head = this.tail = n;
        else {

            this.tail.setNext(n);

            this.tail = n;
        }
    }

    public void addDataAtBegin(String data) {
        node n = new node(data);
        if (this.head == null)
            this.head = this.tail = n;
        else {
            n.setNext(this.head);
            this.head = n;
        }
    }

    public node serchelemet(String data) {
        node current = this.head;
        while (current != null) {
            if (current.getdata().equals(data)) return current;
            else {

                current = current.getNext();
            }
        }
        return null;
    }

    public void printAllElements() {
        node current = this.head;
        while (current != null) {
            System.out.print(current.getdata() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

}

public class linkedlist {
    public static void main(String[] args) {
        LL llist = new LL();
        llist.Adddataatend("Deep");
        llist.Adddataatend("Jack");
        llist.Adddataatend("Dilip");
        llist.Adddataatend("Anj");
        llist.printAllElements();
        llist.addDataAtBegin("begin");
        llist.printAllElements();
        if (llist.serchelemet("Jack") != null) {
            System.out.println("Element found");
        } else System.out.println("Element not found");

    }

}
