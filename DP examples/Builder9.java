public class Employee {
    private final String firstName;
    private final String secondName;
    private final int yearOfBirth;
    private final long employeeId;
    private final String registrationAddress;

    private Employee(Builder builder) {
        firstName = builder.firstName;
        secondName = builder.secondName;
        yearOfBirth = builder.yearOfBirth;
        employeeId = builder.employeeId;
        registrationAddress = builder.registrationAddress;
    }

    public static class Builder {
        //Required fields
        private final String firstName;
        private final String secondName;
        private final long employeeId;

        //Optional fields may be initialized with default values
        private int yearOfBirth;
        private String registrationAddress = "No address";

        public Builder(String firstName, String secondName, long employeeId) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.employeeId = employeeId;
        }

        public Builder yearOfBirth(int val) {
            this.yearOfBirth = val;
            return this;
        }

        public Builder registrationAddress(String val) {
            this.registrationAddress = val;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}