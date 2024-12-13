import pkg.*;

class starter {
    public static void main(String[] args) {
        Employee michael = new Employee(9622, "Michael", "Petrossian", 9999999);
        michael.employeeToString();

        Employee dwight = new Employee(1987, "Dwight", "Schrute", 60000);
        dwight.employeeToString();

        Employee jim = new Employee(2474, "Jim", "Halpert", 66666);
        jim.employeeToString();

        Employee pam = new Employee(2611, "Pam", "Beesly", 78);
        pam.employeeToString();

        Employee shant = new Employee(5463, "Shant", "Shazabian", 2);
        shant.employeeToString();

        dwight.raiseSalary(800);
        dwight.getAnnualSalary();

        jim.raiseSalary(30);
        jim.getAnnualSalary();

        pam.raiseSalary(90);
        pam.getAnnualSalary();

        shant.raiseSalary(3);
        shant.getAnnualSalary();
    }
}
