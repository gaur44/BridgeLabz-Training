public class NormalFine implements FineStrategy {
    public int calculateFine(String type) {
        switch(type) {
            case "SignalJump": return 500;
            case "NoHelmet": return 300;
            default: return 200;
        }
    }
}
