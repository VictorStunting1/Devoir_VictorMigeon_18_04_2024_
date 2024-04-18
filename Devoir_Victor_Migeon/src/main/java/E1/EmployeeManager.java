package E1;

import java.util.Objects;

/**
 * Classe permettant de réaliser des calculs pour des employés
 * calculateSalary() et anneesExperience
 */
public class EmployeeManager {

    /**
     * Question a : Employé :
     * - nom
     * - prénom
     * - nombre d'années d'experience
     * - niveau (Junior, Intermédiaire, Senior)
     */
    static class Employee {
        String nom;
        String prenom;
        int nbAnneesExperiences;
        String niveau;

        public Employee(String nom, String prenom, int nbAnneesExperiences, String niveau) {
            this.nom = nom;
            this.prenom = prenom;
            this.nbAnneesExperiences = nbAnneesExperiences;
            this.niveau = niveau;
        }
    }

    /**
     * Question b : Calculer le salaire d'un employé en fonction de son niveau et de son ancienneté
     *
     * @param employee
     * @return
     */
    public static int calculateSalary(Employee employee) {
        double salaire = 0;
        double experienceMultiplier = calculateExperienceMultiplier(employee.nbAnneesExperiences);

        switch (employee.niveau) {
            case "Junior":
                salaire = 20000 * experienceMultiplier;
                break;
            case "Intermédiaire":
                salaire = 40000 * experienceMultiplier;
                break;
            case "Senior":
                salaire = 60000 * experienceMultiplier;
                break;
            default:
                // Niveau inconnu, retourner 0 ou lancer une exception
                break;
        }

        return (int) salaire;
    }


    /**
     * Question c : Calculer le coefficient d’ancienneté en fonction des années d’expérience
     * Ce dernier augmente de 5% par années d'experiences
     * @param anneesExperience
     */
    public static double calculateExperienceMultiplier(int anneesExperience) {
        double coeficientanviennete = 1.0;

        for (var i=2; i<=anneesExperience; i++) {
            coeficientanviennete *= 1.05;
        }

        return coeficientanviennete;
    }

}
