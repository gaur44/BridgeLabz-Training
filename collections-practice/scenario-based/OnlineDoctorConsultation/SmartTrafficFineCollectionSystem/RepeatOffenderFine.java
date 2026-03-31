public class RepeatOffenderFine implements FineStrategy {
    public int calculateFine(String type) {
        return new NormalFine().calculateFine(type) + 200;
    }
}
