public class StreamAttribute {
    enum Resolution {
        LOW,
        MEDIUM,
        HIGH
    }

    void traverse() {
        System.out.println("\ntraverse:");
        for (Resolution resolution : Resolution.values()) {
            System.out.println(resolution);
        }
    }

    void condition(Resolution resolution) {
        System.out.println("\ncondition:");
        switch (resolution) {
            case HIGH: {
                System.out.println("HIGH");
                break;
            }
            case MEDIUM: {
                System.out.println("MEDIUM");
                break;
            }
            case LOW: {
                System.out.println("LOW");
                break;
            }
        }
    }
}
