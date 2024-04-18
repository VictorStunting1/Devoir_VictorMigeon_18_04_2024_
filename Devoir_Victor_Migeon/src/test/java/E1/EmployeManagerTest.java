package E1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe EmployeManagerTest permettant de tester la classe EmployeeManager.
 */
public class EmployeManagerTest {

    EmployeeManager employeeManager = new EmployeeManager();

    /**
     * Question d : Calcul du salaire d'un employé Junior de 1 ans
     */
    @Test
    void testSalaireEmployeJunior1an() {
        var employee = new EmployeeManager.Employee("Ian", "Foulon", 1, "Junior");
        double salaire = EmployeeManager.calculateSalary(employee);
        assertEquals(20000.0, salaire);
    }

    /**
     * Question e : Calcul du salaire d'un employé Intermédiaire de 5 ans
     */
    @Test
    void testSalaireEmployeIntermediaire5an() {
        var employee = new EmployeeManager.Employee("Ian", "Foulon", 5, "Intermédiaire");
        double salaire = EmployeeManager.calculateSalary(employee);
        assertEquals(48620.0, salaire);
    }

    /**
     * Question f : Calcul du salaire d'un employé Senior de 10 ans
     */
    @Test
    void testSalaireEmployeSenior10an() {
        var employee = new EmployeeManager.Employee("Ian", "Foulon", 10, "Senior");
        double salaire = EmployeeManager.calculateSalary(employee);
        assertEquals(93079.0, salaire);
    }

    /**
     * Question g : Calcul du salaire d'un employé Senior de 20 ans
     */
    @Test
    void testSalaireEmployeSenior20an() {
        var employee = new EmployeeManager.Employee("Ian", "Foulon", 20, "Senior");
        double salaire = EmployeeManager.calculateSalary(employee);
        assertEquals(151617.0, salaire);
    }

    /**
     * Question h : Méthode de mon choix
     * Calcul du salaire d'un employé intermédiaire de 6 ans
     */
    @Test
    void testSalaireEmployeIntermediaire6an() {
        var employee = new EmployeeManager.Employee("Ian", "Foulon", 6, "Intermédiaire");
        double salaire = EmployeeManager.calculateSalary(employee);
        assertEquals(51051, salaire);
    }
}
