package sk.domaceZadanie.patterny.factory;

public class Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Computer() {
    }

    public Computer(Builder builder) {
        setRam(builder.ram);
        setHdd(builder.hdd);
        setCpu(builder.cpu);
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public static Builder newComputer() {
        return new Builder();
    }

    @Override
    public String toString() {
        return String.format("ram: %s, hdd: %s, cpu: %s%n", ram, hdd, cpu);
    }

    public static class Builder {
        private String ram;
        private String hdd;
        private String cpu;

        private Builder() {
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder hdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Computer build() {
            Computer computer = new Computer(this);
            System.out.println(computer);
            return computer;
        }
    }
}
