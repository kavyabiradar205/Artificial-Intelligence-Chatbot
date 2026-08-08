public class ChatBot {

    private KnowledgeBase knowledgeBase;
    private NLPProcessor nlp;

    public ChatBot() {

        knowledgeBase = new KnowledgeBase();
        nlp = new NLPProcessor();

    }

    public Response getResponse(String userInput) {

        if (userInput == null || userInput.trim().isEmpty()) {
            return new Response("Please enter a question.");
        }

        userInput = userInput.toLowerCase().trim();

        // Process input using NLP
        String keyword = nlp.processInput(
                userInput,
                knowledgeBase.getKeywords()
        );

        // If keyword found
        if (!keyword.equals("unknown")) {

            String answer = knowledgeBase.getResponse(keyword);

            if (answer != null) {
                return new Response(answer);
            }

        }

        // Default response
        return new Response(
                "Sorry, I couldn't understand your question.\n\n"
                + "You can ask me about:\n\n"
                + "• Java\n"
                + "• HTML\n"
                + "• CSS\n"
                + "• JavaScript\n"
                + "• SQL\n"
                + "• Artificial Intelligence\n"
                + "• Machine Learning\n"
                + "• Spring Boot\n"
                + "• Git\n"
                + "• GitHub\n"
                + "• Resume\n"
                + "• Interview Questions"
        );

    }

}