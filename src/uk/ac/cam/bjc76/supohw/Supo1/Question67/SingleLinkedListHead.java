package uk.ac.cam.bjc76.supohw.Supo1.Question67;

public class SingleLinkedListHead {
    private LinkedListElement list;
    private boolean isEmpty;

    public SingleLinkedListHead() {
        this.list = null;
        this.isEmpty = true;
    }

    public SingleLinkedListHead(int[] a) {
        if (a.length > 0) {
            this.list = new LinkedListElement(a[0]);
        }
        if (a.length > 1) {
            for (int i = 1; i < a.length; i++) {
                list.append(a[i]);
            }
        }
    }

    public int length() {
        if (this.isEmpty) {
            return 0;
        } else {
            return this.list.length();
        }
    }

    public void append(int data) {
        if (this.isEmpty) {
            this.list = new LinkedListElement(data);
        } else {
            this.list.append(data);
        }

    }

    public void remove(int index) {
        if (index == 0) {
            if (this.list.getChild() == null) {
                this.isEmpty = true;
                this.list = null;
            } else {
                this.list = this.list.getChild();
            }
        } else {
            this.list.remove(index);
        }
    }

    public void insert(int data, int index) {
        if (index == 0) {
            LinkedListElement temp = this.list;
            this.list = new LinkedListElement(data);
            this.list.setChild(temp);
        } else {
            this.list.insert(data, index);
        }
    }

    public int get(int index) {
        return this.list.get(index);
    }

    public void print() {
        System.out.println(this.list.print());
    }

    public boolean existsCycles() { //Using Floyd's detection
        if (isEmpty) {
            return false;
        } else {
            LinkedListElement fastPointer = this.list.getChild();
            LinkedListElement slowPointer = this.list;
            while (fastPointer.getChild() != null) {
                if (fastPointer == slowPointer) {  //if cycles these will eventually be the same
                    return true;
                } else {
                    try {
                        fastPointer = fastPointer.getChild().getChild();
                    } catch (Exception e) { //excpetion due to child being node so no cycles
                        return false;
                    }
                    slowPointer = slowPointer.getChild();
                }
            }
            return false;
        }
    }
}
