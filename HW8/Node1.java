/* Node1
 * Lucas Carpenter
 * Computer Programming II
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
    //      there is only 1 three-argument constructor. it uses item, count, and link.
    //      there is no use of the (this.) modifier. 
    public Node1(String newItem, int newCount, Node1 newLink) {
        item = newItem;
        count = newCount;
        link = newLink;
    }

    public String getItem() {
        return item;
    }

    public int getCount() {
        return count;
    }

    public Node1 getLink() {
        return link;
    }

    public void setData(String newItem, int newCount) {
        item = newItem;
        count = newCount;
    }

    public void setLink(Node1 newLink) {
        link = newLink;
    }
}