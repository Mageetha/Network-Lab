import java.io.*;
public class Main {
   public static char alphabeticalChars[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
   public static char mappingChars[] = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M' };
   public static String encryptStr(String str) {
      String e_str = "";
      for (int p = 0; p < str.length(); p++) {
         for (int q = 0; q < 26; q++) {
            if (str.charAt(p) == alphabeticalChars[q]) {
               e_str += mappingChars[q];
               break;
            }
            if (str.charAt(p) < 'a' || str.charAt(p) > 'z') {
               e_str += str.charAt(p);
               break;
            }
         }
      }
      return e_str;
   }
   public static String decryptStr(String str) {
      String d_str = "";
      for (int p = 0; p < str.length(); p++) {
         for (int q = 0; q < 26; q++) {
            if (str.charAt(p) == mappingChars[q]) {
               d_str += alphabeticalChars[q];
               break;
            }
            if (str.charAt(p) < 'A' || str.charAt(p) > 'Z') {
               d_str += str.charAt(p);
               break;
            }
         }
      }
      return d_str;
   }
   public static void main(String args[]) {
      String str = "Mageetha";
      System.out.println("Plain text is : " + str);
      System.out.println(" ");
      String e_str = encryptStr(str.toLowerCase());
      System.out.println("Encrypted string is : " + e_str);
      System.out.println("Decrypted string is : " + decryptStr(e_str));
   }
}
