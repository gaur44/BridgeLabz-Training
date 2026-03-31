package parcel;

class ParcelChain {
    private Stage head;

    // add stage at end
    void addStage(String name) {
        Stage s = new Stage(name);

        if (head == null) {
            head = s;
            return;
        }

        Stage t = head;
        while (t.next != null)
            t = t.next;

        t.next = s;
    }

    // add checkpoint after a stage
    void addAfter(String after, String name) {
        Stage t = head;
        while (t != null) {
            if (t.name.equals(after)) {
                Stage s = new Stage(name);
                s.next = t.next;
                t.next = s;
                return;
            }
            t = t.next;
        }
    }

    // forward tracking
    void track() {
        Stage t = head;
        if (t == null) {
            System.out.println("Parcel lost");
            return;
        }

        while (t != null) {
            System.out.print(t.name + " -> ");
            t = t.next;
        }
        System.out.println("END");
    }
}
