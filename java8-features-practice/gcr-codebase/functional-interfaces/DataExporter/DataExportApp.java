public class DataExportApp {
    public static void main(String[] args) {

        DataExporter csv = new CsvExporter();
        DataExporter pdf = new PdfExporter();

        csv.export();
        csv.exportToJSON();

        pdf.export();
        pdf.exportToJSON();
    }
}
