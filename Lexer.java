import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Lexer {
   public ArrayList<ArrayList<String>> runLexer() {
      ArrayList<ArrayList<String>> arrayList = new ArrayList();
      byte b1 = 0;
      byte b2 = 1;
      File file = new File("Test.txt");
      try {
         Scanner scanner = new Scanner(file);
         ArrayList<String> arrayList1 = new ArrayList();
         String str = "";
         byte b3 = 0;
         byte b4 = 0;
         while (scanner.hasNextLine()) {
            b3++;
            String str1 = scanner.nextLine() + "\n";
            for (byte b = 0; b < str1.length(); b++) {
               boolean bool = true;
               String str2 = "" + str1.charAt(b);
               while (bool) {
                  bool = false;
                  if (b2 == 1) {
                     if (Pattern.compile("[b-dgj-lqruvx-z]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     if (Pattern.compile("e").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 3;
                        continue;
                     }
                     if (Pattern.compile("a").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 4;
                        continue;
                     }
                     if (Pattern.compile("o").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 5;
                        continue;
                     }
                     if (Pattern.compile("n").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 6;
                        continue;
                     }
                     if (Pattern.compile("m").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 7;
                        continue;
                     }
                     if (Pattern.compile("p").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 8;
                        continue;
                     }
                     if (Pattern.compile("i").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 9;
                        continue;
                     }
                     if (Pattern.compile("t").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 10;
                        continue;
                     }
                     if (Pattern.compile("w").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 11;
                        continue;
                     }
                     if (Pattern.compile("f").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 12;
                        continue;
                     }
                     if (Pattern.compile("h").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 13;
                        continue;
                     }
                     if (Pattern.compile("s").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 14;
                        continue;
                     }
                     if (Pattern.compile("\"").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 15;
                        continue;
                     }
                     if (Pattern.compile("[1-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 16;
                        continue;
                     }
                     if (Pattern.compile("0").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 17;
                        continue;
                     }
                     if (Pattern.compile("-").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 18;
                        continue;
                     }
                     if (Pattern.compile("=").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 19;
                        continue;
                     }
                     if (Pattern.compile("<").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 20;
                        continue;
                     }
                     if (Pattern.compile(">").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 21;
                        continue;
                     }
                     if (Pattern.compile(" ").matcher(str2).matches()) {
                        str = "";
                        b2 = 1;
                        continue;
                     }
                     if (Pattern.compile("\n").matcher(str2).matches()) {
                        str = "";
                        b2 = 1;
                        continue;
                     }
                     if (Pattern.compile("[(]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 24;
                        continue;
                     }
                     if (Pattern.compile("[)]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 25;
                        continue;
                     }
                     if (Pattern.compile("[{]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 26;
                        continue;
                     }
                     if (Pattern.compile("[}]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 27;
                        continue;
                     }
                     if (Pattern.compile(",").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 28;
                        continue;
                     }
                     if (Pattern.compile(";").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 29;
                        continue;
                     }
                     str = str + str;
                     System.out.println(LexError(str, b3, "", str2));
                     System.exit(0);
                     continue;
                  }
                  if (b2 == 2) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        continue;
                     }
                     arrayList1 = new ArrayList();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 3) {
                     if (Pattern.compile("l").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 30;
                        continue;
                     }
                     if (Pattern.compile("q").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 31;
                        continue;
                     }
                     if (Pattern.compile("[a-km-pr-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 4) {
                     if (Pattern.compile("n").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 32;
                        continue;
                     }
                     if (Pattern.compile("d").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 22;
                        continue;
                     }
                     if (Pattern.compile("[a-ce-mo-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 5) {
                     if (Pattern.compile("r").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 34;
                        continue;
                     }
                     if (Pattern.compile("u").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 35;
                        continue;
                     }
                     if (Pattern.compile("[a-qstv-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 6) {
                     if (Pattern.compile("o").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 36;
                        continue;
                     }
                     if (Pattern.compile("[a-np-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 7) {
                     if (Pattern.compile("u").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 37;
                        continue;
                     }
                     if (Pattern.compile("[a-mo-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 8) {
                     if (Pattern.compile("r").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 38;
                        continue;
                     }
                     if (Pattern.compile("[a-qs-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 9) {
                     if (Pattern.compile("f").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 39;
                        continue;
                     }
                     if (Pattern.compile("n").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 40;
                        continue;
                     }
                     if (Pattern.compile("[a-eg-mo-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 10) {
                     if (Pattern.compile("h").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 41;
                        continue;
                     }
                     if (Pattern.compile("[a-gi-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 11) {
                     if (Pattern.compile("h").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 42;
                        continue;
                     }
                     if (Pattern.compile("[a-gi-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 12) {
                     if (Pattern.compile("o").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 43;
                        continue;
                     }
                     if (Pattern.compile("[a-np-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 13) {
                     if (Pattern.compile("a").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 44;
                        continue;
                     }
                     if (Pattern.compile("[b-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 14) {
                     if (Pattern.compile("u").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 45;
                        continue;
                     }
                     if (Pattern.compile("[a-tv-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 15) {
                     if (Pattern.compile("\"").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 46;
                        continue;
                     }
                     if (Pattern.compile("[a-z0-9 ]").matcher(str2).matches() && b4 < 8) {
                        b4++;
                        str = str + str;
                        b2 = 15;
                        continue;
                     }
                     if (Pattern.compile("[\n]").matcher(str2).matches() && b4 < 8)
                        continue;
                     if (Pattern.compile("[a-z0-9 ]").matcher(str2).matches()) {
                        str = str + str;
                        System.out.println(LexError(str, b3, "strLen", str2));
                        System.exit(0);
                        continue;
                     }
                     str = str + str;
                     System.out.println(LexError(str, b3, "strError", str2));
                     System.exit(0);
                     continue;
                  }
                  if (b2 == 16) {
                     if (Pattern.compile("[0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 16;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("NUMBER");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 17) {
                     if (Pattern.compile("[0-9]").matcher(str2).matches()) {
                        str = str + str;
                        System.out.println(LexError(str, b3, "zero", str2));
                        System.exit(0);
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("NUMBER");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 18) {
                     if (Pattern.compile("[1-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 16;
                        continue;
                     }
                     str = str + str;
                     System.out.println(LexError(str, b3, "", str2));
                     System.exit(0);
                     continue;
                  }
                  if (b2 == 19) {
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Assignment SYMBOL");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 20) {
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Comparison SYMBOL");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 21) {
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Comparison SYMBOL");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 22) {
                     if (Pattern.compile("d").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 23;
                        continue;
                     }
                     if (Pattern.compile("[a-ce-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 23) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Math KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 24) {
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Grouping SYMBOL");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 25) {
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Grouping SYMBOL");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 26) {
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Grouping SYMBOL");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 27) {
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Grouping SYMBOL");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 28) {
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Grouping SYMBOL");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 29) {
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Grouping SYMBOL");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 30) {
                     if (Pattern.compile("s").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 47;
                        continue;
                     }
                     if (Pattern.compile("[a-rt-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 31) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Comparison KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 32) {
                     if (Pattern.compile("d").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 33;
                        continue;
                     }
                     if (Pattern.compile("[a-ce-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 33) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Boolean KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 34) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Boolean KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 35) {
                     if (Pattern.compile("t").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 48;
                        continue;
                     }
                     if (Pattern.compile("[a-su-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 36) {
                     if (Pattern.compile("t").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 53;
                        continue;
                     }
                     if (Pattern.compile("[a-su-z-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 37) {
                     if (Pattern.compile("l").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 54;
                        continue;
                     }
                     if (Pattern.compile("[a-km-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 38) {
                     if (Pattern.compile("o").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 56;
                        continue;
                     }
                     if (Pattern.compile("[a-np-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 39) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Control KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 40) {
                     if (Pattern.compile("p").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 58;
                        continue;
                     }
                     if (Pattern.compile("[a-oq-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 41) {
                     if (Pattern.compile("e").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 61;
                        continue;
                     }
                     if (Pattern.compile("[a-df-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 42) {
                     if (Pattern.compile("i").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 63;
                        continue;
                     }
                     if (Pattern.compile("[a-hj-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 43) {
                     if (Pattern.compile("r").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 66;
                        continue;
                     }
                     if (Pattern.compile("[a-qs-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 44) {
                     if (Pattern.compile("l").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 67;
                        continue;
                     }
                     if (Pattern.compile("[a-km-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 45) {
                     if (Pattern.compile("b").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 69;
                        continue;
                     }
                     if (Pattern.compile("[ac-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 46) {
                     b4 = 0;
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("STRING");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 47) {
                     if (Pattern.compile("e").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 52;
                        continue;
                     }
                     if (Pattern.compile("[a-df-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 48) {
                     if (Pattern.compile("p").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 49;
                        continue;
                     }
                     if (Pattern.compile("[a-oq-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 49) {
                     if (Pattern.compile("u").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 50;
                        continue;
                     }
                     if (Pattern.compile("[a-tv-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 50) {
                     if (Pattern.compile("t").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 51;
                        continue;
                     }
                     if (Pattern.compile("[a-su-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 51) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("I/O KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 52) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Control KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 53) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Boolean KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 54) {
                     if (Pattern.compile("t").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 55;
                        continue;
                     }
                     if (Pattern.compile("[a-su-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 55) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Math KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 56) {
                     if (Pattern.compile("c").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 57;
                        continue;
                     }
                     if (Pattern.compile("[a-su-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 57) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Procedure KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 58) {
                     if (Pattern.compile("u").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 59;
                        continue;
                     }
                     if (Pattern.compile("[a-tv-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 59) {
                     if (Pattern.compile("t").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 60;
                        continue;
                     }
                     if (Pattern.compile("[a-su-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 60) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("I/O KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 61) {
                     if (Pattern.compile("n").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 62;
                        continue;
                     }
                     if (Pattern.compile("[a-mo-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 62) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Control KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 63) {
                     if (Pattern.compile("l").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 64;
                        continue;
                     }
                     if (Pattern.compile("[a-km-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 64) {
                     if (Pattern.compile("e").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 65;
                        continue;
                     }
                     if (Pattern.compile("[a-df-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 65) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Control KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 66) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Control KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 67) {
                     if (Pattern.compile("t").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 68;
                        continue;
                     }
                     if (Pattern.compile("[a-su-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("ID");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 68) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Special KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                     continue;
                  }
                  if (b2 == 69) {
                     if (Pattern.compile("[a-z0-9]").matcher(str2).matches()) {
                        str = str + str;
                        b2 = 2;
                        continue;
                     }
                     arrayList1 = new ArrayList<>();
                     arrayList1.add("T" + b1);
                     arrayList1.add("Math KEYWORD");
                     arrayList1.add(str);
                     arrayList.add(arrayList1);
                     b1++;
                     str = "";
                     b2 = 1;
                     bool = true;
                  }
               }
            }
         }
         Integer[] arrayOfInteger1 = { Integer.valueOf(16), Integer.valueOf(17) };
         ArrayList arrayList2 = new ArrayList(Arrays.asList((Object[]) arrayOfInteger1));
         Integer[] arrayOfInteger2 = { Integer.valueOf(39), Integer.valueOf(52), Integer.valueOf(62),
               Integer.valueOf(65), Integer.valueOf(66) };
         ArrayList arrayList3 = new ArrayList(Arrays.asList((Object[]) arrayOfInteger2));
         Integer[] arrayOfInteger3 = { Integer.valueOf(24), Integer.valueOf(25), Integer.valueOf(26),
               Integer.valueOf(27), Integer.valueOf(28), Integer.valueOf(29) };
         ArrayList arrayList4 = new ArrayList(Arrays.asList((Object[]) arrayOfInteger3));
         Integer[] arrayOfInteger4 = { Integer.valueOf(51), Integer.valueOf(60) };
         ArrayList arrayList5 = new ArrayList(Arrays.asList((Object[]) arrayOfInteger4));
         Integer[] arrayOfInteger5 = { Integer.valueOf(23), Integer.valueOf(55), Integer.valueOf(69) };
         ArrayList arrayList6 = new ArrayList(Arrays.asList((Object[]) arrayOfInteger5));
         Integer[] arrayOfInteger6 = { Integer.valueOf(33), Integer.valueOf(34), Integer.valueOf(53) };
         ArrayList arrayList7 = new ArrayList(Arrays.asList((Object[]) arrayOfInteger6));
         if (b2 != 1 && b2 != 18) {
            if (arrayList2.contains(Integer.valueOf(b2))) {
               arrayList1 = new ArrayList<>();
               arrayList1.add("T" + b1);
               arrayList1.add("NUMBER");
               arrayList1.add(str);
               arrayList.add(arrayList1);
            } else if (arrayList3.contains(Integer.valueOf(b2))) {
               arrayList1 = new ArrayList<>();
               arrayList1.add("T" + b1);
               arrayList1.add("Control KEYWORD");
               arrayList1.add(str);
               arrayList.add(arrayList1);
            } else if (arrayList4.contains(Integer.valueOf(b2))) {
               arrayList1 = new ArrayList<>();
               arrayList1.add("T" + b1);
               arrayList1.add("Grouping SYMBOL");
               arrayList1.add(str);
               arrayList.add(arrayList1);
            } else if (arrayList5.contains(Integer.valueOf(b2))) {
               arrayList1 = new ArrayList<>();
               arrayList1.add("T" + b1);
               arrayList1.add("I/O KEYWORD");
               arrayList1.add(str);
               arrayList.add(arrayList1);
            } else if (arrayList6.contains(Integer.valueOf(b2))) {
               arrayList1 = new ArrayList<>();
               arrayList1.add("T" + b1);
               arrayList1.add("Math KEYWORD");
               arrayList1.add(str);
               arrayList.add(arrayList1);
            } else if (arrayList7.contains(Integer.valueOf(b2))) {
               arrayList1 = new ArrayList<>();
               arrayList1.add("T" + b1);
               arrayList1.add("Boolean KEYWORD");
               arrayList1.add(str);
               arrayList.add(arrayList1);
            } else if (b2 == 19) {
               arrayList1 = new ArrayList<>();
               arrayList1.add("T" + b1);
               arrayList1.add("Assignment SYMBOL");
               arrayList1.add(str);
               arrayList.add(arrayList1);
            } else if (b2 == 57) {
               arrayList1 = new ArrayList<>();
               arrayList1.add("T" + b1);
               arrayList1.add("Procedure KEYWORD");
               arrayList1.add(str);
               arrayList.add(arrayList1);
            } else if (b2 == 31) {
               arrayList1 = new ArrayList<>();
               arrayList1.add("T" + b1);
               arrayList1.add("Comparison KEYWORD");
               arrayList1.add(str);
               arrayList.add(arrayList1);
            } else if (b2 == 68) {
               arrayList1 = new ArrayList<>();
               arrayList1.add("T" + b1);
               arrayList1.add("Special KEYWORD");
               arrayList1.add(str);
               arrayList.add(arrayList1);
            } else if (b2 == 46) {
               arrayList1 = new ArrayList<>();
               arrayList1.add("T" + b1);
               arrayList1.add("STRING");
               arrayList1.add(str);
               arrayList.add(arrayList1);
            } else if (b2 == 15) {
               System.out.println(LexError(str, b3, "incompString", "a"));
               System.exit(0);
            }
            b1++;
         } else if (!str.equals("\n") && !str.equals(" ") && !str.equals("") && !str.equals("-")) {
            arrayList1 = new ArrayList<>();
            arrayList1.add("T" + b1);
            arrayList1.add("ID");
            arrayList1.add(str);
            arrayList.add(arrayList1);
            b1++;
         } else if (str.equals("-")) {
            str = str + "-";
            System.out.println(LexError(str, b3, "", "-"));
            System.exit(0);
         }
         scanner.close();
      } catch (FileNotFoundException fileNotFoundException) {
         fileNotFoundException.printStackTrace();
      }
      return arrayList;
   }

   private String LexError(String paramString1, int paramInt, String paramString2, String paramString3) {
      return paramString2.equals("strLen")
            ? ("Lexical Error on Line " + paramInt + ": " + paramString1 + " (String too long!)")
            : (paramString2.equals("strError")
                  ? ("Lexical Error on Line " + paramInt + ": " + paramString1 + " (Invalid character in string!)")
                  : (!Pattern.compile("[-a-z0-9\"(){};,<>=]").matcher(paramString3).matches()
                        ? ("Lexical Error on Line " + paramInt + ": " + paramString1 + " (Invalid Character: "
                              + paramString3 + ")")
                        : (paramString2.equals("incompString")
                              ? ("Lexical Error on Line " + paramInt + ": " + paramString1 + " (Incomplete String!)")
                              : (paramString2.equals("zero")
                                    ? ("Lexical Error on Line " + paramInt + ": " + paramString1
                                          + " (Malformed Number!)")
                                    : ("Lexical Error on Line " +

                                          paramInt + ": " + paramString1)))));
   }
}
