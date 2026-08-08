import java.util.Set;

public class NLPProcessor {

    public String processInput(String input, Set<String> keywords) {

        if (input == null || input.trim().isEmpty()) {
            return "";
        }

        input = input.toLowerCase();
        input = input.replaceAll("[^a-zA-Z0-9 ]", "");
        input = input.trim().replaceAll("\\s+", " ");

        // Exact Match
        if (keywords.contains(input)) {
            return input;
        }

        String bestMatch = "";
        int longestLength = 0;

        for (String keyword : keywords) {

            keyword = keyword.toLowerCase().trim();

            // Exact keyword
            if (input.equals(keyword)) {
                return keyword;
            }

            // Match whole words only
            String[] words = input.split(" ");

            for (String word : words) {

                if (word.equals(keyword)) {

                    if (keyword.length() > longestLength) {

                        longestLength = keyword.length();
                        bestMatch = keyword;

                    }

                }

            }

            // Match complete phrase
            if (input.contains(keyword)) {

                if (keyword.length() > longestLength) {

                    longestLength = keyword.length();
                    bestMatch = keyword;

                }

            }

        }

        if (!bestMatch.isEmpty()) {
            return bestMatch;
        }

        return "unknown";
    }

}