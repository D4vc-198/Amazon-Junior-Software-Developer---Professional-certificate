public class ForwardButtonClass extends AbstractButtonClass implements ButtonPress {
    private String forwardTo;
    private String message;
    
    @Override
    public void buttonPress() {
        System.out.println("Forwarding " + this.message + " to " + this.forwardTo);
    }

    public void onButtonHover() {
        
    }

    public void setForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
    }

    public String getForwardTo() {
        return this.forwardTo;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage () {
        return this.message;
    }


}
