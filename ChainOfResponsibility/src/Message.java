public class Message {
    public enum MessageType {
        COMPENSATION,
        CONTACT,
        DEVELOPMENT,
        GENERAL
    }

    private final MessageType messageType;
    private final String messageContent;
    private final String senderEmail;

    public Message(MessageType messageType, String messageContent, String senderEmail) {
        this.messageType = messageType;
        this.messageContent = messageContent;
        this.senderEmail = senderEmail;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageType=" + messageType +
                ", messageContent='" + messageContent + '\'' +
                ", senderEmail='" + senderEmail + '\'' +
                '}';
    }
}
