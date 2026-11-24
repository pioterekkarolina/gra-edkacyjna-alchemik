
import javax.swing.*;
import java.awt.*;

public class KsięgaAlchemika extends JFrame {

    public KsięgaAlchemika() {

        // Ustawienia okna
        setTitle("Księga Alchemika");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Główne tło
        JPanel tlo = new JPanel();
        tlo.setLayout(new BoxLayout(tlo, BoxLayout.Y_AXIS));
        tlo.setBackground(new Color(40, 30, 35));
        tlo.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        // Tytuł
        JLabel tytul = new JLabel("KSIĘGA ALCHEMIKA");

        tytul.setFont(new Font("Serif", Font.BOLD, 38));
        tytul.setForeground(new Color(226, 185, 105));
        tytul.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Wprowadzenie
        JLabel opis = new JLabel(
                "<html><div style='text-align:center;'>"
                        + "Do tego, który odważył się sięgnąć po wiedzę zawartą w owej księdze.<br>"
                        + "Nie każda reakcja prowadzi do stworzenia czegoś pożytecznego."
                        + "</div></html>"
        );

        opis.setFont(new Font("Serif", Font.ITALIC, 15));
        opis.setForeground(new Color(200, 180, 160));
        opis.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Tablica Mendelejewa
        String tablica =
                "              ✧ TABLICA MENDELEJEWA ✧\n" +
                        "       GRYMUAR PIERWOTNYCH SUBSTANCJI\n" +
                        "╔══════════════════════════════════════════════════════════╗\n" +
                        "║                                                          ║\n" +
                        "║  H                                                   He  ║\n" +
                        "║                                                          ║\n" +
                        "║  Li  Be                              B   C   N   O   F  Ne║\n" +
                        "║                                                          ║\n" +
                        "║  Na  Mg                              Al  Si  P   S  Cl  Ar║\n" +
                        "║                                                          ║\n" +
                        "║  K   Ca  Sc Ti V  Cr Mn Fe Co Ni Cu Zn Ga Ge As Se Br Kr ║\n" +
                        "║                                                          ║\n" +
                        "║  Rb  Sr  Y  Zr Nb Mo Tc Ru Rh Pd Ag Cd In Sn Sb Te I  Xe ║\n" +
                        "║                                                          ║\n" +
                        "║  Cs  Ba  La* Hf Ta W  Re Os Ir Pt Au Hg Tl Pb Bi Po At Rn║\n" +
                        "║                                                          ║\n" +
                        "║  Fr  Ra  Ac* Rf Db Sg Bh Hs Mt Ds Rg Cn Nh Fl Mc Lv Ts Og║\n" +
                        "║                                                          ║\n" +
                        "╠══════════════════════════════════════════════════════════╣\n" +
                        "║ LANTANOWCE                                               ║\n" +
                        "║ La Ce Pr Nd Pm Sm Eu Gd Tb Dy Ho Er Tm Yb Lu            ║\n" +
                        "║                                                          ║\n" +
                        "║ AKTYNOWCE                                                ║\n" +
                        "║ Ac Th Pa U  Np Pu Am Cm Bk Cf Es Fm Md No Lr            ║\n" +
                        "╠══════════════════════════════════════════════════════════╣\n" +
                        "║                                                          ║\n" +
                        "║             ⚗ SCIENTIA EST POTENTIA ⚗                   ║\n" +
                        "║                                                          ║\n" +
                        "║       Nie każda wiedza powinna być odkryta...             ║\n" +
                        "╚══════════════════════════════════════════════════════════╝";

        // Pole tekstowe tablicy
        JTextArea poleTablicy = new JTextArea(tablica);

        poleTablicy.setEditable(false);
        poleTablicy.setFocusable(false);
        poleTablicy.setFont(new Font("Monospaced", Font.PLAIN, 13));
        poleTablicy.setForeground(new Color(226, 185, 105));
        poleTablicy.setBackground(new Color(40, 30, 35));
        poleTablicy.setLineWrap(false);
        poleTablicy.setMargin(new Insets(10, 10, 10, 10));

        // Przewijanie tablicy
        JScrollPane przewijanie = new JScrollPane(poleTablicy);

        przewijanie.setBorder(BorderFactory.createLineBorder(
                new Color(174, 132, 70), 2
        ));

        przewijanie.setPreferredSize(new Dimension(900, 390));
        przewijanie.setMaximumSize(new Dimension(900, 390));

        przewijanie.getViewport().setBackground(new Color(40, 30, 35));

        // Przycisk powrotu
        JButton powrot = new JButton("Powrót do menu");

        powrot.setFont(new Font("Serif", Font.BOLD, 18));
        powrot.setForeground(new Color(239, 216, 166));
        powrot.setBackground(new Color(75, 51, 58));
        powrot.setFocusPainted(false);
        powrot.setAlignmentX(Component.CENTER_ALIGNMENT);
        powrot.setPreferredSize(new Dimension(250, 45));
        powrot.setMaximumSize(new Dimension(250, 45));

        powrot.setBorder(BorderFactory.createLineBorder(
                new Color(174, 132, 70), 2
        ));

        powrot.setCursor(
                Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)
        );

        // Obsługa powrotu do menu
        powrot.addActionListener(e -> {
            Main menu = new Main();
            menu.setVisible(true);
            this.dispose();
        });

        // Rozmieszczenie elementów
        tlo.add(tytul);
        tlo.add(Box.createVerticalStrut(8));

        tlo.add(opis);
        tlo.add(Box.createVerticalStrut(15));

        tlo.add(przewijanie);
        tlo.add(Box.createVerticalStrut(15));

        tlo.add(powrot);

        // Dodanie panelu do okna
        add(tlo);
    }
}
