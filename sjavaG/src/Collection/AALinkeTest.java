package Collection;

public class AALinkeTest {
    public static void main(String[] args) {

    }
}

class Node{
    Object data;

    Node node;

    public Node() {

    }
    public Node(Object data, Node node) {
        this.data = data;
        this.node = node;
    }
}

class LinkeTest {
    Node header = null;

    public LinkeTest() {
    }

    public LinkeTest(Object data) {
        this.header = new Node();
        this.header.data = data;
        this.header.node = null;
    }

    public void add(Object data) {
        if (this.header == null) {
            this.header = new Node();
            this.header.data = data;
            this.header.node = null;
        } else {
            Node next = new Node();
            Node find = findNode(this.header);
            next.data = data;
            next.node = null;
            find.node = next;
        }
    }

    public Node findNode(Node next) {
        if (next.node == null) return next;
        return findNode(next.node);
    }
}