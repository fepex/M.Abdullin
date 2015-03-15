package ru.kpfu.itis.group403.abdullin.linklist;

public class MyLinkedList {

    private class Item {
        private Object obj;
        private Item next;

        public Item getNext() {
            return next;
        }

        public void setNext(Item next) {
            this.next = next;
        }

        public Object getObj() {
            return obj;
        }

        public void setObj(Object obj) {
            this.obj = obj;
        }
    }


    private Item first;

    private Item last;


    public void add(Object data) {

        Item addedItem = new Item();
        addedItem.setObj(data);

        if (first == null) {
            first = new Item();
            first.setObj(data);
            last = first;
        } else if (first == last) {
            first.setNext(addedItem);
            last = addedItem;
        } else {
            last.setNext(addedItem);
            last = addedItem;
        }

    }

    public void paste(Object data, int ind) {

        Item pastedItem = new Item();
        pastedItem.setObj(data);
        Item currentItem = new Item();
        currentItem = first.getNext();

        int i = 1;

        while (ind - 2 != i) {

            currentItem = currentItem.getNext();
            i++;
        }
        currentItem.setNext(pastedItem);
    }

    public void delete(int ind) {

        Item itemBefore = first.getNext();
        Item itemAfter = new Item();

        int i = 1;

        while (ind - 2 > i) {

            itemBefore = itemBefore.getNext();
            i++;
        }

        for (int j = 0; j < 2; j++) {

            itemAfter = itemBefore.getNext();
        }
        itemBefore.setNext(itemAfter);
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(new Student(10, 1940, "John"));
        myLinkedList.add(new Student(11, 1941, "Bill"));
        myLinkedList.add(new Student(12, 1940, "Kir"));
        myLinkedList.paste(new Student(8, 1948, "James"), 1);
        myLinkedList.delete(3);
    }

}

