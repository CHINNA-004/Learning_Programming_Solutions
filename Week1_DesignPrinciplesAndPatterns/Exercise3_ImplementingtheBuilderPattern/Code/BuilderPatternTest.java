package Exercise3_ImplementingtheBuilderPattern.Code;

public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        basicComputer.displayConfiguration();

        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11 Pro")
                .build();
        gamingComputer.displayConfiguration();

        Computer lightweightComputer = new Computer.Builder("Apple M2", "16GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("macOS Sonoma")
                .build();
        lightweightComputer.displayConfiguration();
    }
}
