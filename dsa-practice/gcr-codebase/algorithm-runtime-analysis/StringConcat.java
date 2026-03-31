public class StringConcat {

    public static void main(String[] args) {
        int N = 1_000_000;

        // Using String
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < N; i++) {
            s = s + "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("String time: " + (end - start) + " ms");

        // Using StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end - start) + " ms");

        // Using StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbuf.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (end - start) + " ms");
    }
}

