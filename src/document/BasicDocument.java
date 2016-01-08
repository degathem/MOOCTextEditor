package document;

import java.util.List;

/** 
 * A naive implementation of the Document abstract class. 
 * @author UC San Diego Intermediate Programming MOOC team
 */
public class BasicDocument extends Document 
{
	/** Create a new BasicDocument object
	 * 
	 * @param text The full text of the Document.
	 */
	public BasicDocument(String text)
	{
		super(text);
	}
	
	
	/**
	 * Get the number of words in the document.
	 * "Words" are defined as contiguous strings of alphabetic characters
	 * i.e. any upper or lower case characters a-z or A-Z
	 * 
	 * @return The number of words in the document.
	 */
	@Override
	public int getNumWords()
	{
		//TODO: Implement this method.  See the Module 1 support videos 
	    // if you need help.
		List<String> words = this.getTokens("[A-Za-z]+");
	    return words.size();
	}
	
	/**
	 * Get the number of sentences in the document.
	 * Sentences are defined as contiguous strings of characters ending in an 
	 * end of sentence punctuation (. ! or ?) or the last contiguous set of 
	 * characters in the document, even if they don't end with a punctuation mark.
	 * 
	 * @return The number of sentences in the document.
	 */
	@Override
	public int getNumSentences()
	{
	    //TODO: Implement this method.  See the Module 1 support videos 
        // if you need help.
		List<String> tokens = this.getTokens("[^.!?]+");
        return tokens.size();
	}
	
	/**
	 * Get the number of syllables in the document.
	 * Words are defined as above.  Syllables are defined as:
	 * a contiguous sequence of vowels, except for a lone "e" at the 
	 * end of a word if the word has another set of contiguous vowels, 
	 * makes up one syllable.   y is considered a vowel.
	 * @return The number of syllables in the document.
	 */
	@Override
	public int getNumSyllables()
	{
	    //TODO: Implement this method.  See the Module 1 support videos 
        // if you need help.
		int wordcount = 0;
		List<String> words = getTokens("[A-Za-z]+");
		for (String w : words){
			wordcount = wordcount + countSyllables(w);
		}
        return wordcount;
	}
	
	
	/* The main method for testing this class. 
	 * You are encouraged to add your own tests.  */
	public static void main(String[] args)
	{
		testCase(new BasicDocument("This is a test.  How many???  "
		        + "Senteeeeeeeeeences are here... there should be 5!  Right?"),
				16, 13, 5);
		testCase(new BasicDocument(""), 0, 0, 0);
		testCase(new BasicDocument("sentence, with, lots, of, commas.!  "
		        + "(And some poaren)).  The output is: 7.5."), 15, 11, 4);
		testCase(new BasicDocument("many???  Senteeeeeeeeeences are"), 6, 3, 2);
		testCase(new BasicDocument("Here is a series of test sentences. Your program should "
				+ "find 3 sentences, 33 words, and 49 syllables. Not every word will have "
				+ "the correct amount of syllables (example, for example), "
				+ "but most of them will."), 49, 33, 3);
		testCase(new BasicDocument("Segue"), 2, 1, 1);
		testCase(new BasicDocument("Sentence"), 2, 1, 1);
		testCase(new BasicDocument("Sentences?!"), 3, 1, 1);
		testCase(new BasicDocument("Lorem ipsum dolor sit amet, qui ex choro quodsi moderatius, nam dolores explicari forensibus ad."),
		         32, 15, 1);
		
		BasicDocument testdoc1 = new BasicDocument("Netflix's Making a Murderer tells a chilling story: Steven Avery of Manitowoc County, Wisconsin, was sent to prison for 18 years for a crime he didn't commit, only to be released after a prolonged legal battle. But once he's finally let go, just a few years later he's thrown into prison again for a different crime that, the documentary argues, Avery also may not have committed.");
		System.out.println(testdoc1.getText());
		System.out.println(testdoc1.getFleschScore());
		
		BasicDocument testdoc2 = new BasicDocument("There was no return address but Tomasina knew who had sent it: Diane, her best friend and, recently, fertility specialist. Ever since Tomasina’s latest catastrophic breakup, Diane had been promoting what they referred to as Plan B. Plan A they’d been working on for some time. It involved love and a wedding. They’d been working on Plan A for a good eight years. But in the final analysis—and this was Diane’s whole point—Plan A had proved much too idealistic. So now they were giving Plan B a look.Plan B was more devious and inspired, less romantic, more solitary, sadder, but braver, too. It stipulated borrowing a man with decent teeth, body, and brains, free of the major diseases, who was willing to heat himself up with private fantasies (they didn’t have to include Tomasina) in order to bring off the tiny sputter that was indispensable to the grand achievement of having a baby. Like twin Schwarzkopfs, the two friends noted how the field of battle had changed of late: the reduction in their artillery (they’d both just turned forty); the increasing guerrilla tactics of the enemy (men didn’t even come out into the open anymore); and the complete dissolution of the code of honor. The last man who’d got Tomasina pregnant—not the boutique investment banker, the one before him, the Alexander Technique instructor—hadn’t even gone through the motions of proposing marriage. His idea of honor had been to split the cost of the abortion. There was no sense denying it: the finest soldiers had quit the field, joining the peace of marriage. What was left was a ragtag gang of adulterers and losers, hit-and-run types, village-burners. Tomasina had to give up the idea of meeting someone she could spend her life with. Instead, she had to give birth to someone who would spend life with her.");
		System.out.println(testdoc2.getText());
		System.out.println(testdoc2.getFleschScore());
		
		BasicDocument testdoc3 = new BasicDocument("When Mike Babcock warned that a couple of “heavy” games awaited his Maple Leafs in California this week, he knew what he was talking about.");
		System.out.println(testdoc3.getText());
		System.out.println(testdoc3.getFleschScore());
	}
	
}
