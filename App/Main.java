import java.util.ArrayList;

public class Main {
   public static void main(String[] paramArrayOfString) {

      /*------------------------------------------------------------------------------------------------
                                 CREATE THE OBJECTS AND INSTANTIATE THE TREE
      ------------------------------------------------------------------------------------------------*/
      Lexer lexerObject = new Lexer();

      // instantiate the lexer object with an array list
      ArrayList<ArrayList<String>> arrayList = lexerObject.runLexer();

      Parser parserObject = new Parser();
      BuildTree treeObject = parserObject.runParser(arrayList);

      // Print the tree
      System.out.println("<pre>");
      printTree(treeObject.getHead(), 0);
      System.out.println("</pre>");
   }

   /*------------------------------------------------------------------------------------------------
                                 MAIN RECURSIVE FUNCTION TO PRINT TREE
   ------------------------------------------------------------------------------------------------*/
   private static void printTree(NodeElement node, int x) {

      if (node != null) {

         String answer = "";

         for (byte y = 0; y < x; y++) {

            answer = answer + "   ";
         }

         System.out.println(answer + answer);

         NodeElement[] nodeElementArray = node.getleafNodes();

         for (byte z = 0; z < nodeElementArray.length; z++) {

            printTree(nodeElementArray[z], x + 1);
         }
      }

   }
}
