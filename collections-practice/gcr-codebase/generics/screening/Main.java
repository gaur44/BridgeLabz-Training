package screening;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Alice", new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Bob", new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Charlie", new ProductManager());

        ScreeningUtils.processResume(r1);
        ScreeningUtils.processResume(r2);
        ScreeningUtils.processResume(r3);

        System.out.println();

        ScreeningUtils.runPipeline(
                List.of(new SoftwareEngineer(),
                        new DataScientist(),
                        new ProductManager())
        );
    }
}

