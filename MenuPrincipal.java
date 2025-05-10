package vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author fgarin
 */
public class MenuPrincipal extends JFrame {

    private JButton[] menuButtons = new JButton[3];

    private final int AMPLADA = 800;
    private final int ALCADA = 600;

    public MenuPrincipal() {

        /*
         * TODO
         * 
         * No afegiu cap listener a cap control.
         * 
         * Amb els atributs d'aquesta classe, heu de fer el següent:
         * 
         * - Heu de posar el títol "Menú Principal" a l'objecte JFrame
         * 
         * - Heu d'establir un layout Grid d'una columna per al JFrame
         * 
         * - Heu de crear els botons del formulari. Cada botó serà un element de l'array
         * de botons amb les etiquetes indicades:
         * 
         * "0. Sortir"
         * 
         * "1. Menú Universitats"
         * 
         * "2. Menú Aules"
         * 
         * - Heu afegir els botons al panell per defecte del JFrame
         * (this.getContentPane()).
         * 
         * - Heu de fer visible el frame amb l'amplada i alçada de les constants AMPLADA
         * i ALCADA, i fer que la finestra es tanqui quan l'usuari ho fa amb el control
         * "X" de la finestra. Per fer tot això, heu de cridar al mètode showFinestra()
         * d'aquesta classe.
         * 
         */

    }

    private void showFinestra() {
        // Es mostra la finestra amb propietats per defecte.
        this.setSize(AMPLADA, ALCADA);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JButton[] getMenuButtons() {
        return menuButtons;
    }

    public void setMenuButtons(JButton[] menuButtons) {
        this.menuButtons = menuButtons;
    }
}
