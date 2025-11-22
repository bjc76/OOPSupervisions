package uk.ac.cam.bjc76.supohw.Supo1.Question67;

public class LinkedListElement {
    private int data;
    private LinkedListElement child;


    public LinkedListElement(int data) {
        this.data = data;
        this.child=null;
    }

    public void append (int data) {
        if (this.child == null) {
            this.child = new LinkedListElement(data);
        } else {
            child.append(data);
        }
    }

    private int getData () {
        return this.data;
    }


    public String print () {
        String x;
        if (this.child != null) {
            x = this.child.print();
        } else {
            x = "";
        }
        return (this.data +", "+ x);
    }


    public LinkedListElement getChild () {
        return this.child;
    }

    public void insert(int data, int index){
        if (this.child == null) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (index == 1) {
                if (this.child == null) {
                    throw new ArrayIndexOutOfBoundsException();
                } else {
                    LinkedListElement temp = this.child;
                    this.child = new LinkedListElement(data);
                    this.child.setChild(temp);
                }
            } else {
                this.child.insert(data, index-1);
            }
        }
    }

    public void setChild(LinkedListElement child) {
        this.child = child;
    }


    public void remove (int index) {
        if (index == 1) {
            if (this.child == null) { //child doesn't exist, throw exception
                throw new ArrayIndexOutOfBoundsException();
            } else { //remove child by moving reference
                this.child = this.child.getChild();
            }

        } else if (this.child == null) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            this.child.remove(index - 1);
        }
    }

    public int length () {
        if (this.child == null) {
            return 1;
        } else {
            return (1 + this.child.length());
        }
    }

    public int get (int index) {
        if (index == 0) {
            return this.getData();
        } else if (this.child != null) {
            return this.child.get(index - 1);
        } else {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
    }
}
