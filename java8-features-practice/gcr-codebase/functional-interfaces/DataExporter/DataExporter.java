interface DataExporter {

    void export();

    default void exportToJSON() {
        System.out.println("Exporting data to JSON using default implementation");
    }
}
