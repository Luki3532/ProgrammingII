/* Node1
 * Lucas Carpenter
 * Computer Programming II
 * 3/25/2024
 */



/* CLASS DESCRIPTION(Node1):
 *  The Node1 class represents a node in a linked list. It contains data, 
 *  an associated count, and a reference to the next node. 
 *  Methods allow you to get or set these values.
 *  This class is used by LinkedList1
 *  This class does not use any imports
 */
public class Node1 {

    // VARIABLES
    private String item;
    private int count;
    private Node1 link;

    // CONSTRUCTOR
    //    three-argument constructor. it uses item, count, and link.
    //    there is no use of the (this.) modifier. 
    //    class constructor initializes a node in a linked list. 
    //    It sets the data (item), an associated count, and establishes 
    //    a link to the next node.
    public Node1(String newItem, int newCount, Node1 newLink) {
        item = newItem;
        count = newCount;
        link = newLink;
    }

    // Description:
    //  Getter method for Node1. Returns item(String).
    public String getItem() {
        return item;
    }

    // Description:
    //  Getter method for Node1. Returns count(int).
    public int getCount() {
        return count;
    }

    // Description:
    //  Getter method for Node1. Returns link(Node1).
    public Node1 getLink() {
        return link;
    }

    // Description:
    //  Setter method for Node1. Sets Data(item & count).
    public void setData(String newItem, int newCount) {
        item = newItem;
        count = newCount;
    }

    // Description:
    //  Setter method for Node1. Sets Link(link).
    public void setLink(Node1 newLink) {
        link = newLink;
    }
}