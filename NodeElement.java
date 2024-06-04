/**
 *
 * This class defines the node elements. Nodes are used to store all the
 * information.
 * 
 */

public class NodeElement {

   /*------------------------------------------------------------------------------------------------
                                             VARIABLES
   ------------------------------------------------------------------------------------------------*/

   // holds the id
   private String id;

   // holds the details/info
   private String detail;

   // Have an array for the leaf nodes
   private NodeElement[] leafNodes;

   /*------------------------------------------------------------------------------------------------
                                             CONSTRUCTORS
   ------------------------------------------------------------------------------------------------*/

   // sets the leafnodes array and sets the id of the node element
   public NodeElement(String id) {

      this.id = id;
      this.leafNodes = new NodeElement[50];
   }

   // sets the leaf node and sets the id and the detail of the node element
   public NodeElement(String id, String detail) {

      this.id = id;
      this.detail = detail;
      this.leafNodes = new NodeElement[50];

   }

   /*------------------------------------------------------------------------------------------------
                                             GETTERS
   ------------------------------------------------------------------------------------------------*/

   public String getInfo() {

      return this.detail;
   }

   public String getid() {

      return this.id;
   }

   public NodeElement[] getleafNodes() {

      return this.leafNodes;
   }

   /*------------------------------------------------------------------------------------------------
                                             SETTERS
   ------------------------------------------------------------------------------------------------*/

   public void setid(String id) {

      this.id = id;
   }

   public void setInfo(String detail) {

      this.detail = detail;
   }

   public void setleafNodes(NodeElement[] array) {

      this.leafNodes = array;
   }

}
