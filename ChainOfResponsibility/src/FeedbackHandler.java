public abstract class FeedbackHandler {
    private FeedbackHandler nextHandler;

    public void setNextHandler(FeedbackHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleMessage(Message message) {
        if (canHandle(message)) {
            process(message);
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message);
        } else {
            System.out.println("No handler available for message: " + message);
        }
    }

    protected abstract boolean canHandle(Message message);
    protected abstract void process(Message message);
}
