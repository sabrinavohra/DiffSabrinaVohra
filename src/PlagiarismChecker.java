/**
 * Plagiarism Checker
 * A tool for finding the longest shared substring between two documents.
 *
 * @author Zach Blick
 * @author Sabrina Vohra
 */
public class PlagiarismChecker {

    /**
     * This method finds the longest sequence of characters that appear in both texts in the same order,
     * although not necessarily contiguously.
     * @param doc1 the first document
     * @param doc2 the second
     * @return The length of the longest shared substring.
     */
    public static int longestSharedSubstring(String doc1, String doc2) {

        // TODO Complete this function to return the length of the longest shared substring.
        int longest = 0;
        int current = 0;
        for(int i = 0; i < doc1.length(); i++) {
            for(int j = 0; j < doc2.length(); j++) {
                if(doc1.charAt(i) == (doc2.charAt(i))) {
                    current++;
                }
                else {
                    current = 0;
                }
                if(current > longest) {
                    longest = current;
                }
            }
        }
        return 0;
    }
}
