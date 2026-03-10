public class DevelopmentHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getMessageType() == Message.MessageType.DEVELOPMENT;
    }

    @Override
    protected void process(Message message) {
        System.out.println("=== DEVELOPMENT HANDLER ===");
        System.out.println("Sender: " + message.getSenderEmail());
        System.out.println("Suggestion: " + message.getMessageContent());

        // Log and prioritize suggestion
        String priority = determinePriority(message.getMessageContent());
        System.out.println("Priority Level: " + priority);
        System.out.println("Action: Logged in feature request system");
        System.out.println("Status: ADDED TO BACKLOG - Product team will review");
    }

    private String determinePriority(String content) {
        if (content.toLowerCase().contains("critical") || content.toLowerCase().contains("urgent")) {
            return "HIGH";
        } else if (content.toLowerCase().contains("important")) {
            return "MEDIUM";
        }
        return "LOW";
    }
}

