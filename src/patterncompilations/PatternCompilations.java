
package patterncompilations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.MatchResult;


public class PatternCompilations {

    private static final String REGEX0 = "(.*)(\\d+)(.*)";
     private static final String REGEX1 = "^"; // Beginning of a line
     private static final String REGEX2 = "$"; // End of a line
     private static final String INPUT = "Welcome to TutorialsPoint.COM";
     
     public static void main(final String... args)
    {
     // create a pattern
      Pattern pattern0 = Pattern.compile(REGEX0);  
      Pattern  pattern1 = Pattern.compile(REGEX1);
      Pattern pattern2 = Pattern.compile(REGEX2);
      // get a matcher object
      Matcher matcher0 = pattern0.matcher(INPUT);
      Matcher matcher1 = pattern1.matcher(INPUT); 
      Matcher matcher2 = pattern2.matcher(INPUT);
      

      while(matcher2.find()) {
        System.out.println("Match String end(): "+ matcher2.start());// shows the end of the line
      }
      
      while(matcher1.find()){
        PatternCompilations compilations = new PatternCompilations();  
        System.out.println(compilations.findInMatcher1(matcher1));
        System.out.println(compilations.findMatchedIndex(matcher1));
      }
     
    System.out.println("*****************************");
    System.out.println(UNDERSCORE.split("_").length);
    System.out.println(UNDERSCORE.split("__").length);
    System.out.println(UNDERSCORE.split("_x_").length);
    System.out.println(UNDERSCORE.split("_", -1).length);
    System.out.println(UNDERSCORE.split("__", -1).length);
    System.out.println(UNDERSCORE.split("_x_", -1).length);
}
    //Method for Pattern UnderScore
    private static final Pattern UNDERSCORE = Pattern.compile("_");
    
    // method for matcher1
    public String findInMatcher1(Matcher matcher1){
           
      return "Match String start(): "+ matcher1.start(); // shows the beginning of the line
           
    }
    
    public int findMatchedIndex(Matcher matcher1){
            
        return matcher1.start(); // 0
    }
    
}
