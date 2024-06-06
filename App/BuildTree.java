/**
 * 
 * This class builds the final tree node data structure. This is what will be
 * displayed. It stores all final info that will be displayed.
 * 
 */

public class BuildTree {

   /*------------------------------------------------------------------------------------------------
                                             VARIABLES
   ------------------------------------------------------------------------------------------------*/

   // Pointer to point to the root/head of the tree
   private NodeElement head;

   /*------------------------------------------------------------------------------------------------
                                             CONSTRUCTORS
   ------------------------------------------------------------------------------------------------*/

   // Constructor to initialise the head to 0. Used when tree is empty
   public BuildTree() {

      this.head = new NodeElement("0");
   }

   // Constructor to initialise head to a certain node. Usewd when tree is not
   // empty
   public BuildTree(NodeElement node) {

      this.head = node;
   }

   /*------------------------------------------------------------------------------------------------
                                             GETTERS
   ------------------------------------------------------------------------------------------------*/

   // This return the head of the tree
   public NodeElement getHead() {

      return this.head;
   }

   /*------------------------------------------------------------------------------------------------
                                             SETTERS
   ------------------------------------------------------------------------------------------------*/

   // This sets the head of the tree
   public void setHead(NodeElement node) {

      this.head = node;
   }

   /*------------------------------------------------------------------------------------------------
                                             OTHER FUNCTIONS
   ------------------------------------------------------------------------------------------------*/

   // Returns the string attatched to the nide
   public String toString() {

      String headID = this.head.getid();
      NodeElement node = this.head;
      return headID;
   }

   private String listKids(NodeElement node) {

      return "NodeElement " + node.getid();
   }
}
