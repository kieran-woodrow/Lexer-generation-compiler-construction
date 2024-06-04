import java.util.ArrayList;

public class Parser {

   private ArrayList<BuildTree> stack = new ArrayList<>();

   private int token = 0;

   private int ID = 1;

   private String[][] matrixTable;

   private BuildTree t = new BuildTree();

   private ArrayList<ArrayList<String>> list;

   public BuildTree runParser(ArrayList<ArrayList<String>> paramArrayList) {

      this.list = paramArrayList;
      shift();
      this.token++;
      for (byte b = 0; b < paramArrayList.size() + 5; b++) {
         String str = checkAll();
         if (str.equals("")) {
            shift();
            this.token++;
         } else {
            this.ID = reduce(str, this.ID);
            b--;
         }
      }
      this.t = prog();
      return this.t;
   }

   private void shift() {

      if (this.list.size() > this.token) {
         if (((String) ((ArrayList) this.list.get(this.token)).get(1)).length() > 6
               && ((String) ((ArrayList<String>) this.list.get(this.token)).get(1))
                     .substring(((String) ((ArrayList<String>) this.list.get(this.token)).get(1)).length() - 6)
                     .equals("SYMBOL")) {
            this.stack.add(this.stack.size(),
                  new BuildTree(new NodeElement("" + this.ID, ((ArrayList<String>) this.list.get(this.token)).get(2))));
         } else if (((String) ((ArrayList) this.list.get(this.token)).get(1)).length() > 7
               && ((String) ((ArrayList<String>) this.list.get(this.token)).get(1))
                     .substring(((String) ((ArrayList<String>) this.list.get(this.token)).get(1)).length() - 7)
                     .equals("KEYWORD")) {
            this.stack.add(this.stack.size(),
                  new BuildTree(new NodeElement("" + this.ID, ((ArrayList<String>) this.list.get(this.token)).get(2))));
         } else {
            this.stack.add(this.stack.size(),
                  new BuildTree(new NodeElement("" + this.ID, ((ArrayList<String>) this.list.get(this.token)).get(1))));
         }
         this.ID++;
      }
   }

   private BuildTree prog() {

      BuildTree tree = new BuildTree(new NodeElement("0", "PROG"));
      NodeElement node = tree.getHead();
      NodeElement[] nodeElementArray = new NodeElement[this.stack.size()];

      for (byte b = 0; b < this.stack.size(); b++) {

         if (!((BuildTree) this.stack.get(b)).getHead().getInfo().equals(";"))
            if (((BuildTree) this.stack.get(b)).getHead().getInfo().equals("CODE")) {

               nodeElementArray[b] = ((BuildTree) this.stack.get(b)).getHead();
            }

            else if (((BuildTree) this.stack.get(b)).getHead().getInfo().equals("PROC_DEFS")) {

               nodeElementArray[b] = ((BuildTree) this.stack.get(b)).getHead();
            }
      }

      node.setleafNodes(nodeElementArray);
      return tree;
   }

   private int reduce(String stringSequence, int index) {

      if (stringSequence.equals("VAR")) {

         NodeElement node = new NodeElement("" + index, "VAR");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead() };
         node.setleafNodes(nodeElementArray);

         BuildTree tree = new BuildTree(node);
         this.stack.remove(this.stack.size() - 1);
         this.stack.add(tree);
      }

      else if (stringSequence.equals("IO")) {

         NodeElement node = new NodeElement("" + index, "IO");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 4)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 4; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("INSTR")) {

         NodeElement node = new NodeElement("" + index, "INSTR");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree BuildTree = new BuildTree(node);

         for (byte b = 1; b <= 1; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(BuildTree);
      }

      else if (stringSequence.equals("PROG1")) {

         NodeElement node = new NodeElement("" + index, "PROG");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 1; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("PROG2")) {

         NodeElement node = new NodeElement("" + index, "PROG");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 1; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("PROC_DEFS1")) {

         NodeElement node = new NodeElement("" + index, "PROC_DEFS");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 1; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("PROC_DEFS2")) {

         NodeElement node = new NodeElement("" + index, "PROC_DEFS");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 2; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("CODE1")) {

         NodeElement node = new NodeElement("" + index, "CODE");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 1; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("CODE2")) {

         NodeElement node = new NodeElement("" + index, "CODE");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 3)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree BuildTree = new BuildTree(node);

         for (byte b = 1; b <= 3; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(BuildTree);
      }

      else if (stringSequence.equals("CALL")) {

         NodeElement node = new NodeElement("" + index, "CALL");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 1; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("NUMEXPR")) {

         NodeElement node = new NodeElement("" + index, "NUMEXPR");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 1; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("BOOL1")) {

         NodeElement node = new NodeElement("" + index, "BOOL");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 2; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("BOOL2")) {

         NodeElement node = new NodeElement("" + index, "BOOL");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 4)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 3)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 5; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("BOOL3")) {

         NodeElement node = new NodeElement("" + index, "BOOL");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 6)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 4)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 6; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("ASSIGN")) {

         NodeElement node = new NodeElement("" + index, "ASSIGN");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 3)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 3; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("CALC")) {

         NodeElement node = new NodeElement("" + index, "CALC");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 6)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 4)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 6; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("PROC")) {

         NodeElement node = new NodeElement("" + index, "PROC");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 5)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 4)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 5; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("COND_LOOP1")) {

         NodeElement node = new NodeElement("" + index, "COND_LOOP");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 7)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 5)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 7; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);

      }

      else if (stringSequence.equals("COND_LOOP1")) {

         NodeElement node = new NodeElement("" + index, "COND_LOOP");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 7)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 5)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 7; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("COND_LOOP2")) {

         NodeElement node = new NodeElement("" + index, "COND_LOOP");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 22)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 20)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 16)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 14)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 12)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 8)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 22; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("COND_BRANCH1")) {

         NodeElement node = new NodeElement("" + index, "COND_BRANCH");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 8)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 6)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 4)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 8; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("COND_BRANCH2")) {

         NodeElement node = new NodeElement("" + index, "COND_BRANCH");
         NodeElement[] nodeElementArray = { ((BuildTree) this.stack.get(this.stack.size() - 12)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 10)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 8)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 6)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 4)).getHead(),
               ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead() };
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b = 1; b <= 12; b++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("INTEGRATE_CODE")) {

         NodeElement node = new NodeElement("" + index, "CODE");
         NodeElement[] nodeElementArray = new NodeElement[(((BuildTree) this.stack.get(this.stack.size() - 3)).getHead()
               .getleafNodes()).length
               + (((BuildTree) this.stack.get(this.stack.size() - 1)).getHead().getleafNodes()).length];
         byte b1;
         for (b1 = 0; b1 < (((BuildTree) this.stack.get(this.stack.size() - 3)).getHead().getleafNodes()).length; b1++)
            nodeElementArray[b1] = ((BuildTree) this.stack.get(this.stack.size() - 3)).getHead().getleafNodes()[b1];
         for (b1 = 0; b1 < (((BuildTree) this.stack.get(this.stack.size() - 1)).getHead().getleafNodes()).length; b1++)
            nodeElementArray[b1 + (((BuildTree) this.stack.get(this.stack.size() - 3)).getHead()
                  .getleafNodes()).length] = ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead()
                        .getleafNodes()[b1];
         node.setleafNodes(nodeElementArray);
         BuildTree tree = new BuildTree(node);

         for (byte b2 = 1; b2 <= 3; b2++) {

            this.stack.remove(this.stack.size() - 1);
         }

         this.stack.add(tree);
      }

      else if (stringSequence.equals("REMOVE_SEMI")) {
         this.stack.remove(this.stack.size() - 2);
      }
      return index;
   }

   // THIS FUNCTION IS USED TO LOOK AHEAD
   private BuildTree lookAhead() {

      BuildTree tree = new BuildTree();
      if (((String) ((ArrayList) this.list.get(this.token)).get(1)).length() > 6
            && ((String) ((ArrayList<String>) this.list.get(this.token)).get(1))
                  .substring(((String) ((ArrayList<String>) this.list.get(this.token)).get(1)).length() - 6)
                  .equals("SYMBOL")) {
         tree = new BuildTree(new NodeElement("" + this.ID, ((ArrayList<String>) this.list.get(this.token)).get(2)));
      } else if (((String) ((ArrayList) this.list.get(this.token)).get(1)).length() > 7
            && ((String) ((ArrayList<String>) this.list.get(this.token)).get(1))
                  .substring(((String) ((ArrayList<String>) this.list.get(this.token)).get(1)).length() - 7)
                  .equals("KEYWORD")) {
         tree = new BuildTree(new NodeElement("" + this.ID, ((ArrayList<String>) this.list.get(this.token)).get(2)));
      } else {
         tree = new BuildTree(new NodeElement("" + this.ID, ((ArrayList<String>) this.list.get(this.token)).get(1)));
      }
      return tree;
   }

   // THIS FUNCTION CHECKS EVERYTHING
   private String checkAll() {

      String str1 = "";
      String str2 = ((BuildTree) this.stack.get(this.stack.size() - 1)).getHead().getInfo();
      if (str2.equals("PROC")) {
         str1 = "PROC_DEFS1";
      } else if (str2.equals("INSTR")) {
         str1 = "CODE1";
      } else if (str2.equals("halt")) {
         str1 = "INSTR";
      } else if (str2.equals("IO")) {
         str1 = "INSTR";
      } else if (str2.equals("CALL")) {
         str1 = "INSTR";
      } else if (str2.equals("ASSIGN")) {
         str1 = "INSTR";
      } else if (str2.equals("COND_BRANCH")) {
         str1 = "INSTR";
      } else if (str2.equals("COND_LOOP")) {
         str1 = "INSTR";
      } else if (str2.equals("ID")) {
         String str = "";
         if (this.stack.size() - 2 >= 0) {
            str = ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead().getInfo();
            if ((str.equals(";") || str.equals("}")) && lookAhead().getHead().getInfo().equals(";")) {
               str1 = "CALL";
            } else if (!str.equals("proc")) {
               str1 = "VAR";
            }
         }
      } else if (str2.equals("CALC")) {
         str1 = "NUMEXPR";
      } else if (str2.equals("NUMBER")) {
         if (this.stack.size() >= 17) {
            if (!((BuildTree) this.stack.get(this.stack.size() - 17)).getHead().getInfo().equals("for"))
               str1 = "NUMEXPR";
         } else if (this.stack.size() >= 5
               && !((BuildTree) this.stack.get(this.stack.size() - 5)).getHead().getInfo().equals("for")) {
            str1 = "NUMEXPR";
         }
      }
      if (this.stack.size() >= 2) {
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 2)).getHead().getInfo();
         if (str2.equals("PROCPROC_DEFS")) {
            str1 = "PROC_DEFS2";
         } else if (str2.equals("notBOOL")) {
            str1 = "BOOL1";
         }
      }
      if (this.stack.size() >= 3) {
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 3)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 3)).getHead().getInfo();
         if (str2.equals("CODE;CODE")) {
            str1 = "INTEGRATE_CODE";
         } else if (str2.equals("INSTR;CODE")) {
            str1 = "CODE2";
         } else if (str2.equals("VAR=STRING")) {
            str1 = "ASSIGN";
         } else if (str2.equals("VAR=VAR")) {
            str1 = "ASSIGN";
         } else if (str2.equals("VAR=NUMEXPR")) {
            str1 = "ASSIGN";
         } else if (str2.equals("CODE;}")) {
            str1 = "REMOVE_SEMI";
         }
      }
      if (this.stack.size() >= 4) {
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 4)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 4)).getHead().getInfo();
         if (str2.equals("input(VAR)")) {
            str1 = "IO";
         } else if (str2.equals("output(VAR)")) {
            str1 = "IO";
         }
      }
      if (this.stack.size() >= 5) {
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 5)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 5)).getHead().getInfo();
         if (str2.equals("procID{CODE}")) {
            str1 = "PROC";
         } else if (str2.equals("(VAR<VAR)")) {
            str1 = "BOOL2";
         } else if (str2.equals("(VAR>VAR)")) {
            str1 = "BOOL2";
         } else if (str2.equals("(NUMEXPR<VAR)")) {
            str1 = "BOOL2";
         } else if (str2.equals("(VAR<NUMEXPR)")) {
            str1 = "BOOL2";
         } else if (str2.equals("(NUMEXPR<NUMEXPR)")) {
            str1 = "BOOL2";
         } else if (str2.equals("(NUMEXPR>VAR)")) {
            str1 = "BOOL2";
         } else if (str2.equals("(VAR>NUMEXPR)")) {
            str1 = "BOOL2";
         } else if (str2.equals("(NUMEXPR>NUMEXPR)")) {
            str1 = "BOOL2";
         }
      }
      if (this.stack.size() >= 6) {
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 6)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 6)).getHead().getInfo();
         if (str2.equals("add(NUMEXPR,NUMEXPR)")) {
            str1 = "CALC";
         } else if (str2.equals("add(VAR,VAR)")) {
            str1 = "CALC";
         } else if (str2.equals("add(VAR,NUMEXPR)")) {
            str1 = "CALC";
         } else if (str2.equals("add(NUMEXPR,VAR)")) {
            str1 = "CALC";
         } else if (str2.equals("sub(VAR,VAR)")) {
            str1 = "CALC";
         } else if (str2.equals("sub(VAR,NUMEXPR)")) {
            str1 = "CALC";
         } else if (str2.equals("sub(NUMEXPR,VAR)")) {
            str1 = "CALC";
         } else if (str2.equals("sub(NUMEXPR,NUMEXPR)")) {
            str1 = "CALC";
         } else if (str2.equals("mult(VAR,VAR)")) {
            str1 = "CALC";
         } else if (str2.equals("mult(VAR,NUMEXPR)")) {
            str1 = "CALC";
         } else if (str2.equals("mult(NUMEXPR,VAR)")) {
            str1 = "CALC";
         } else if (str2.equals("mult(NUMEXPR,NUMEXPR)")) {
            str1 = "CALC";
         } else if (str2.equals("eq(NUMEXPR,NUMEXPR)")) {
            str1 = "BOOL3";
         } else if (str2.equals("eq(VAR,VAR)")) {
            str1 = "BOOL3";
         } else if (str2.equals("eq(VAR,NUMEXPR)")) {
            str1 = "BOOL3";
         } else if (str2.equals("eq(NUMEXPR,VAR)")) {
            str1 = "BOOL3";
         } else if (str2.equals("eq(BOOL,BOOL)")) {
            str1 = "BOOL3";
         } else if (str2.equals("and(BOOL,BOOL)")) {
            str1 = "BOOL3";
         } else if (str2.equals("or(BOOL,BOOL)")) {
            str1 = "BOOL3";
         }
      }
      if (this.stack.size() >= 7) {
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 7)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 7)).getHead().getInfo();
         if (str2.equals("while(BOOL){CODE}"))
            str1 = "COND_LOOP1";
      }
      if (this.stack.size() >= 9) {
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 8)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 8)).getHead().getInfo();
         if (str2.equals("if(BOOL)then{CODE}") && !lookAhead().getHead().getInfo().equals("else"))
            str1 = "COND_BRANCH1";
      }
      if (this.stack.size() >= 12) {
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 9)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 9)).getHead().getInfo();
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 10)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 10)).getHead().getInfo();
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 11)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 11)).getHead().getInfo();
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 12)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 12)).getHead().getInfo();
         if (str2.equals("if(BOOL)then{CODE}else{CODE}"))
            str1 = "COND_BRANCH2";
      }
      if (this.stack.size() >= 22) {
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 13)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 13)).getHead().getInfo();
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 14)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 14)).getHead().getInfo();
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 15)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 15)).getHead().getInfo();
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 16)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 16)).getHead().getInfo();
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 17)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 17)).getHead().getInfo();
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 18)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 18)).getHead().getInfo();
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 19)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 19)).getHead().getInfo();
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 20)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 20)).getHead().getInfo();
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 21)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 21)).getHead().getInfo();
         str2 = ((BuildTree) this.stack.get(this.stack.size() - 22)).getHead().getInfo()
               + ((BuildTree) this.stack.get(this.stack.size() - 22)).getHead().getInfo();
         if (str2.equals("for(VAR=0;VAR<VAR;VAR=add(VAR,1)){CODE}"))
            str1 = "COND_LOOP2";
      }
      return str1;
   }

   public String[][] getmatrixTable() {
      return this.matrixTable;
   }

   public void setmatrixTable(String[][] table) {
      this.matrixTable = table;
   }
}
