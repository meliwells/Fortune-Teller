package src;

public class FortuneTeller {

    String fortuneTellerName;
    String fortuneTellerMessage;

    public FortuneTeller(String fortuneTellerName, String fortuneTellerMessage) {
        this.fortuneTellerName = fortuneTellerName;
        this.fortuneTellerMessage = fortuneTellerMessage;
    }

    public String getFortuneTellerName() {
        return fortuneTellerName;
    }

    public void setFortuneTellerName(String fortuneTellerName) {
        this.fortuneTellerName = fortuneTellerName;
    }

    public String getFortuneTellerMessage() {
        return fortuneTellerMessage;
    }

    public void setFortuneTellerMessage(String fortuneTellerMessage) {
        this.fortuneTellerMessage = fortuneTellerMessage;
    }

    public void fortuneTeller() {
        //print fortunes
    }

}
