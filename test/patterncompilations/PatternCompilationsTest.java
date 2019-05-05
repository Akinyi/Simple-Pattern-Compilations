package patterncompilations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.TestCase;
import org.junit.Test;
import patterncompilations.PatternCompilations;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ägare
 */
public class PatternCompilationsTest {
    private static final String REGEX1 = "^";
    private static final String REGEX2 = "$"; 
    private static final String INPUT = "Welcome to TutorialsPoint.COM";
   
    @Test
    public void inputShouldContainSomeText() {
     
      Pattern pattern1 = Pattern.compile(REGEX2);
      // get a matcher object
      Matcher matcher1 = pattern1.matcher(INPUT); 
      matcher1.lookingAt();
      TestCase.assertTrue("Welcome to TutorialsPoint.COM", matcher1.find());
    }
    @Test
    public void inputShouldGiveZero() {
    Pattern pattern1 = Pattern.compile(REGEX1);
    PatternCompilations compilations = new PatternCompilations();
      Matcher matcher1 = pattern1.matcher(INPUT);
        while(matcher1.find()){
            int number = compilations.findMatchedIndex(matcher1); //0 
        
            String result = "Match String start(): "+ number; //"Match String start(): "+ matcher1.start(); //
                    
            TestCase.assertTrue(result.equals("Match String start(): 0"));
        }
    }
    
    @Test
    public void matcherShouldShowLastChar(){
         Pattern pattern1 = Pattern.compile(REGEX2);
         PatternCompilations compilations = new PatternCompilations();
         Matcher matcher1 = pattern1.matcher(INPUT);
        while(matcher1.find()){
            int number = compilations.findMatchedIndex(matcher1); //29 
            int expected = 29;
            
            TestCase.assertEquals(number, expected);
        }
    }
   
        
}
