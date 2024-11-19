public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Ajouter des employés
        Employe e1 = new Employe(1, "Ali", "Ahmed", "Informatique", 3);
        Employe e2 = new Employe(2, "Sami", "Mahdi", "RH", 2);
        Employe e3 = new Employe(3, "Leila", "Amal", "Informatique", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        // Afficher les employés
        societe.displayEmploye();

        // Rechercher un employé
        System.out.println("Recherche par nom : " + societe.rechercherEmploye("Ali"));

        // Supprimer un employé
        societe.supprimerEmploye(e2);

        // Trier par ID
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Trier par Nom, Département, et Grade
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
}
