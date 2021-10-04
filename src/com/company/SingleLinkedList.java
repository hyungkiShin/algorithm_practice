package com.company;

public class SingleLinkedList<T> {
    public Node<T> head = null;

    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next; // 그 다음 node 가 있다는 것.
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head; // 1
            System.out.println("node.data = " + node);
            while (node.next != null) {
                node = node.next;
                System.out.println("node.data = " + node.data);
            }
        }
    }

    public boolean delNode(T isData) {
        if(this.head == null) { // head 가 없을때.
            return false;
        } else {
            Node<T> node = this.head;
            if(node.data == isData) {
                this.head = this.head.next;
                return true;
            } else {
                while(node.next != null) {
                    if(node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }

    public void addNodeInside(T data, T isData) { // Node 사이 Data 삽입.
        Node<T> searchedNode = this.search(isData);
        if (searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }
    }

    private Node<T> search(T data) {
        if (this.head != null) {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }
}
