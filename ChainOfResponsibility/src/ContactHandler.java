public class ContactHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getMessageType() == Message.MessageType.CONTACT;
    }

    @Override
    protected void process(Message message) {
        System.out.println("=== CONTACT HANDLER ===");
        System.out.println("Sender: " + message.getSenderEmail());
        System.out.println("Request: " + message.getMessageContent());

        // Route to appropriate department
        String department = determineDepartment(message.getMessageContent());
        System.out.println("Action: Routing to " + department + " department");
        System.out.println("Status: SCHEDULED - Customer will be contacted within 24 hours");
    }

    private String determineDepartment(String content) {
        if (content.toLowerCase().contains("order")) {
            return "Sales";
        } else if (content.toLowerCase().contains("technical") || content.toLowerCase().contains("issue")) {
            return "Technical Support";
        } else if (content.toLowerCase().contains("account")) {
            return "Account Management";
        }
        return "General Support";
    }
}


