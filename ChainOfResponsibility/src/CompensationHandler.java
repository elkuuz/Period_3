public class CompensationHandler extends FeedbackHandler{
    @Override
    protected boolean canHandle(Message message) {
        return message.getMessageType() == Message.MessageType.COMPENSATION;
    }

    @Override
    protected void process(Message message) {
        System.out.println("=== COMPENSATION HANDLER ===");
        System.out.println("Sender: " + message.getSenderEmail());
        System.out.println("Claim: " + message.getMessageContent());

        // Review compensation claim
        if (message.getMessageContent().toLowerCase().contains("refund")) {
            System.out.println("Status: APPROVED - Refund authorized");
            System.out.println("Action: Processing refund to sender's account");
        } else {
            System.out.println("Status: PENDING REVIEW - Requires manual approval");
            System.out.println("Action: Forwarding to compensation manager");
        }
    }
}
