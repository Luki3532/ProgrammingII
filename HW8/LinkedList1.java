/* LinkedList1
 * Lucas Carpenter
 * Computer Programming II
 * 3/25/2024
 */



/* CLASS DESCRIPTION(LinkedList1):
 *  this class serves as a linked list body, and has methods that get and set items 
 *  from the list and can generate information such as the length of the list.
 *  this class uses getter and setter methods from Node1. The purpose of this class 
 *  is to piece together nodes, where the list can be modified by a user.
 *  It has methods to add nodes, delete the head node, count nodes, and print the list. 
 *  The head points to the first node.
 * 
 *  This class uses Node1
 *  This class is used by LinkedList1Demo
 */
public class LinkedList1 {


    //      VARIABLES
    // uninstanciated Node1 object(private).
    private Node1 head;                                 


    //      CONSTRUCTOR(s)
    // LinkedList1 has a object variable Node1, this is instantiated to null
    public LinkedList1() {
        head = null;
    }


    //      METHODS
    // Description: This method will add a node at the start of the list with the
    // passed in data. The added node will be the first node in the list.
    public void addtoStart(String itemName, int itemCount) {

        // head is set to a new Node, itemName and itemCount are formal parameters. 
        // and the link of the first new node is set set to null. 
        // all subsequential links are set to the link that was generated before itself
        head = new Node1(itemName, itemCount, head);    
    }

    // Description: This method removes the head node and returns true if the list
    // contains at least one node (before the deletion). It will return false if the
    // list is empty, and hence nothing can be deleted.
    public boolean deleteHeadNode() {
        if (head == null) {
            return false;
        } else{
            head = head.getLink();
            return true;
        }
    }

    // Description: This method determines the number of nodes that are in the list
    // and returns this value.
    public int count() {
        int tempCounter = 0;
        Node1 position = head;
        while (position != null) {
            tempCounter++;
            position = position.getLink();
        }
        return tempCounter;
    }

    // Description: This method outputs to the terminal screen all of the nodes in
    // the list. The format for the output is one node per line in the following
    // manner (make sure to align the fields):
    public void printList() {
        Node1 position = head;
        while (position != null) {
            System.out.println(position.getItem() + "\t" + position.getCount());
            position = position.getLink();
        }
    }

}
