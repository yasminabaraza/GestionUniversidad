/*
 * Classe que defineix una universitat, que es defineix pel seu nom,
 * la seva ubicació i un array de campus.
 */

package model;

import static interfaces.UnitatUniversitat.DADES;

import java.util.ArrayList;
import java.util.List;
import interfaces.UnitatUniversitat;

/**
 *
 */
public class Universitat implements UnitatUniversitat {
    private String nomUniversitat;
    private String ubicacioSeu;
    
    private List<Campus> campusList = new ArrayList<>();
   
    public Universitat(String nomUniversitat, String ubicacioSeu) {
        this.nomUniversitat = nomUniversitat;
        this.ubicacioSeu = ubicacioSeu;
    }
    
    public String getNomUniversitat() {
        return nomUniversitat;
    }

    public void setNomUniversitat(String nomUniversitat) {
        this.nomUniversitat = nomUniversitat;
    }

    public String getUbicacioSeu() {
        return ubicacioSeu;
    }

    public void setUbicacioSeu(String ubicacioSeu) {
        this.ubicacioSeu = ubicacioSeu;
    }

    public List<Campus> getCampusList() {
        return campusList;
    }

    public void setCampusList(List<Campus> campusList) {
        this.campusList = campusList;
    }
    
    public static Universitat addUniversitat() {
        
        String nomUniversitat, ubicacioSeu;

        System.out.println("\nNom de la universitat:");
        nomUniversitat = DADES.nextLine();
        System.out.println("\nUbicació de la universitat:");
        ubicacioSeu = DADES.nextLine();

        return new Universitat(nomUniversitat, ubicacioSeu);
    }

    @Override
    public void updateUnitatUniversitat() {
        
        System.out.println("\nNom de la universitat: " + nomUniversitat);
        System.out.println("\nEntra el nou nom:");
        nomUniversitat = DADES.nextLine();
        System.out.println("\nUbicació de la universitat: " + ubicacioSeu);
        System.out.println("\nEntra la nou ubicació:");
        ubicacioSeu = DADES.nextLine();
    }


    public double costManteniment() {
        double costTotal = 0;

        for (int i = 0; i < campusList.size(); i++) {
            costTotal += campusList.get(i).costManteniment();
        }

        return costTotal;
    }


    @Override
    public void showUnitatUniversitat() {
        System.out.println("\nLes dades de la universitat " + nomUniversitat + " són: ");
        System.out.println("\nUbicació: " + ubicacioSeu);
        System.out.println("\nCost de manteniment total: " + costManteniment() + " EUR");
    }

    public void addCampus(Campus campus) {
        if (campus == null) {
            campus = Campus.addCampus();
        }

        if (selectCampus(campus.getNomCampus()) == -1) {
            campusList.add(campus);
        } else {
            System.out.println("\nEl campus ja existeix");
        }
    }
    
    public int selectCampus(String nom) {
        if (nom == null) {
            System.out.println("\nNom del campus:");
            nom = DADES.nextLine();
        }

        for (int i = 0; i < campusList.size(); i++) {
            if (campusList.get(i).getNomCampus().equals(nom)) {
                return i;
            }
        }

        return -1;
    }

    public void addAulaEstandardCampus() {

        int index = selectCampus(null);

        if (index != -1) {
            campusList.get(index).addAulaEstandard(null);
        } else {
            System.out.println("\nEl campus no existeix");
        }
    }

    public void updateAulaEstandardCampus() {
        int indexCampus = selectCampus(null);

        if (indexCampus != -1) {
            int indexAulaEstandard = campusList.get(indexCampus).selectAula(1, null);

            if (indexAulaEstandard != -1) {
                ((AulaEstandard) campusList.get(indexCampus).getAules().get(indexAulaEstandard)).updateUnitatUniversitat();
            } else {
                System.out.println("\nL'aula estàndard no existeix");
            }
        } else {
            System.out.println("\nEl campus no existeix");
        }
    }

    public void addAulaInformaticaCampus() {
        int index = selectCampus(null);

        if (index != -1) {
            campusList.get(index).addAulaInformatica(null);
        } else {
            System.out.println("\nEl campus no existeix");
        }
    }

    public void updateAulaInformaticaCampus() {
        int indexCampus = selectCampus(null);

        if (indexCampus != -1) {
            int indexAulaInformatica = campusList.get(indexCampus).selectAula(2, null);

            if (indexAulaInformatica != -1) {
                ((AulaInformatica) campusList.get(indexCampus).getAules().get(indexAulaInformatica)).updateUnitatUniversitat();
            } else {
                System.out.println("\nL'aula d'informàtica no existeix");
            }
        } else {
            System.out.println("\nEl campus no existeix");
        }
    }

    public void addLaboratoriCampus() {
        int index = selectCampus(null);

        if (index != -1) {
            campusList.get(index).addLaboratori(null);
        } else {
            System.out.println("\nEl campus no existeix");
        }
    }

    public void updateLaboratoriCampus() {
        int indexCampus = selectCampus(null);

        if (indexCampus != -1) {
            int indexLaboratori = campusList.get(indexCampus).selectAula(3, null);

            if (indexLaboratori != -1) {
                ((Laboratori) campusList.get(indexCampus).getAules().get(indexLaboratori)).updateUnitatUniversitat();
            } else {
                System.out.println("\nEl laboratori no existeix");
            }
        } else {
            System.out.println("\nEl campus no existeix");
        }
    }
}

