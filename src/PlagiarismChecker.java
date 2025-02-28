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
     *
     * @param doc1 the first document
     * @param doc2 the second
     * @return The length of the longest shared substring.
     */
    public static int longestSharedSubstring(String doc1, String doc2) {
        // TODO Complete this function to return the length of the longest shared substring.
        int[][] save = new int[doc1.length() + 1][doc2.length() + 1];
        int current;
        for (int i = 1; i < save.length; i++) {
            for (int j = 1; j < save[0].length; j++) {
                if (doc1.charAt(i - 1) == doc2.charAt(j - 1)) {
                    current = save[i - 1][j - 1] + 1;
                    if (current <= i && current <= j) {
                        save[i][j] = current;
                    }
                }
                else {
                    save[i][j] = Math.max((save[i - 1][j]), (save[i][j - 1]));
                }
            }
        }
        return save[doc1.length()][doc2.length()];
    }
}
