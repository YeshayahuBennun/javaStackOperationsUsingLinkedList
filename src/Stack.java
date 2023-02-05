public class Stack {
    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void createStack(int nodeValue) {
        Node newNode = new Node();
        newNode.setValue(nodeValue);
        head = newNode;
        tail = newNode;
        tail.setNext(null);
        size = 1;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int nodeValue) {
        if (isEmpty()) {
            createStack(nodeValue);
        } else {
            Node newNode = new Node();
            newNode.setValue(nodeValue);
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }

    public int pop() {
        Node popNode = new Node();
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            popNode = head;
            head = head.getNext();
            size--;
        }
        return popNode.getValue();
    }

    public int peek() {
        Node peekNode = new Node();
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            peekNode.setValue(head.getValue());
        }
        return peekNode.getValue();
    }

    public void delete() {
        head = null;
        System.out.println("The stack is empty");
    }

    public void traversal() {
        if (head != null) {
            Node currentNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(currentNode.getValue());
                if (i < size - 1) {
                    System.out.print(" -> ");
                }
                currentNode = currentNode.getNext();
            }
            System.out.println("\n");
        }
    }
}
