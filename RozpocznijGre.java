
import javax.swing.*;
import java.awt.*;

public class RozpocznijGre extends JFrame {

    // Konstruktor
    public RozpocznijGre() {

        // Ustawienia okna
        setTitle("Wybierz swój poziom");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel tła
        JPanel tlo = new JPanel();
        tlo.setLayout(new BoxLayout(tlo, BoxLayout.Y_AXIS));
        tlo.setBackground(new Color(40, 30, 35));

        // Tytuł gry
        JLabel tytul = new JLabel("Wybierz swój poziom");
        tytul.setFont(new Font("Serif", Font.BOLD, 54));
        tytul.setForeground(new Color(226, 185, 105));
        tytul.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Przyciski menu
        JButton poziom1 = utworzPrzycisk("Poziom 1");
        JButton poziom2 = utworzPrzycisk("Poziom 2");
        JButton wyjscie = utworzPrzycisk("Wyjście");

        // Co się stanie po kliknięciu
        poziom1.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        this,
                        "Wkrótce rozpocznie się Twoja przygoda!"
                )
        );

        poziom2.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        this,
                        "Wybrano poziom 2!"
                )
        );

        wyjscie.addActionListener(e -> System.exit(0));

        // Rozmieszczenie elementów
        tlo.add(Box.createVerticalStrut(100));
        tlo.add(tytul);
        tlo.add(Box.createVerticalStrut(55));
        tlo.add(poziom1);
        tlo.add(Box.createVerticalStrut(18));
        tlo.add(poziom2);
        tlo.add(Box.createVerticalStrut(18));
        tlo.add(wyjscie);

        add(tlo);
    }

    // Metoda tworząca przyciski
    private JButton utworzPrzycisk(String tekst) {

        JButton przycisk = new JButton(tekst);

        przycisk.setFont(new Font("Serif", Font.BOLD, 20));
        przycisk.setForeground(new Color(239, 216, 166));
        przycisk.setBackground(new Color(75, 51, 58));
        przycisk.setFocusPainted(false);
        przycisk.setAlignmentX(Component.CENTER_ALIGNMENT);
        przycisk.setPreferredSize(new Dimension(300, 50));
        przycisk.setMaximumSize(new Dimension(300, 50));

        przycisk.setBorder(BorderFactory.createLineBorder(
                new Color(174, 132, 70), 2
        ));

        przycisk.setCursor(
                Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)
        );

        return przycisk;
    }

    // Uruchomienie programu
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            RozpocznijGre gra = new RozpocznijGre();
            gra.setVisible(true);
        });
    }
}
