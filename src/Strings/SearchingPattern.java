package Strings;

public class SearchingPattern {
  static   void patternsearch(String txt, String pat){
        int pos = txt.indexOf(pat);// here we are serching the pattern in txt using the indexof it gives the 1st occurence
        while (pos>=0){
            System.out.print(pos+" ");
            pos=txt.indexOf(pat,pos+1);
        }
    }
    public static void main(String[] args){
        String txt = "geeks for geeks";
        String pat = "geeks";
        patternsearch(txt,pat);
    }
}
