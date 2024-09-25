package com.chalapathi.designpattern.builder1;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500 GB", "16 GB")
                .bluetoothEnabled(true)
                .graphicsCardEnabled(true)
                .build();
        System.out.println("Computer Configured:");
        System.out.println("HDD: " + computer.getHDD());
        System.out.println("RAM: " + computer.getRAM());
        System.out.println("Graphics Card Enabled: " + computer.isGraphicsCardEnabled());
        System.out.println("Bluetooth Enabled: " + computer.isBluetoothEnabled());
    }
}


class Computer {
    private String HDD; // required
    private String RAM; // required
    private boolean isGraphicsCardEnabled; // optional
    private boolean isBluetoothEnabled; // optional

    private Computer(ComputerBuilder builder) {
        this.RAM = builder.HDD;
        this.HDD = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public static class ComputerBuilder {
        private String HDD; // required
        private String RAM; // required
        private boolean isGraphicsCardEnabled; // optional
        private boolean isBluetoothEnabled; // optional

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder graphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder bluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

       public Computer build(){
            return new Computer(this);
        }
    }
}
