import java.util.concurrent.TimeUnit;

public class CompareStringBufferAndBuilder {
    public static void main(String[] args) {
        int runs = 1_000_000; // one million
        String string = "hello";

        // initialize string buffer and string builder objects
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

          long stringBuilderStartTime = System.nanoTime();
        for (int i = 0; i < runs; i++) {
            stringBuilder.append(string);
        }
        long stringBuilderEndTime = System.nanoTime();
    
        long stringBufferStartTime = System.nanoTime();
        // perform concatenation on stringbuffer objects
        for (int i = 0; i < runs; i++) {
            stringBuffer.append(string);
        }
        long stringBufferEndTime = System.nanoTime();

      

        // calculate difference in end and start times for both
        long deltaStringBuffer = stringBufferEndTime - stringBufferStartTime ;
        long durationStringBufferMS = TimeUnit.NANOSECONDS.toMillis(deltaStringBuffer);

        long deltaStringBuilder =  stringBuilderEndTime - stringBuilderStartTime;
        long durationStringBuilderMS = TimeUnit.NANOSECONDS.toMillis(deltaStringBuilder);


        System.out.println("Appending \"" + string + "\" a million times:");
        System.out.println("StringBuffer Took: " + durationStringBufferMS + " ms");
        System.out.println("StringBuilder Took: " + durationStringBuilderMS + " ms");
    }
}
