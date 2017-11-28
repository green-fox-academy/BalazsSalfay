public class SumElements {
    private static SumElements ourInstance = new SumElements();

    public static SumElements getInstance() {
        return ourInstance;
    }

    private SumElements() {
    }
}
