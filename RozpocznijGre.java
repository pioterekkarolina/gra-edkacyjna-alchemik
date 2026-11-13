import javax.swing.*;
import java.awt.*;

public class RozpocznijGre extends JFrame {

    //ustawienia okna
    setTitle("Wybierz swój poziom");
    setSize(1000, 650);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    //konstruktor
    public RozpocznijGre() {

    }

    // Tytul gry
    JLabel tytul = new JLabel("Wybierz swój poziom");
        tytul.setFont(new Font("Serif", Font.BOLD, 54));
        tytul.setForeground(new Color(226, 185, 105));
        tytul.setAlignmentX(Component.CENTER_ALIGNMENT);

    // Przyciski menu
    JButton poziom1 = utworzPrzycisk("Poziom 1");
    JButton poziom2 = utworzPrzycisk("Poziom 2");

    // Co sie stanie po kliknieciu
        poziom1.addActionListener(e ->
            JOptionPane.showMessageDialog(
            this,
            "Wkrotce rozpocznie sie Twoja przygoda!"
            )
            );

        wyjscie.addActionListener(e -> System.exit(0));

    // Rozmieszczenie elementow
        tlo.add(tytul);
        tlo.add(Box.createVerticalStrut(55));
        tlo.add(poziom1);
        tlo.add(Box.createVerticalStrut(18));
        tlo.add(poziom2);
        tlo.add(Box.createVerticalStrut(18));
        tlo.add(wyjscie);

    add(tlo);

}

private JButton utworzPrzycisk(String tekst) {
    JButton przycisk = new JButton(tekst);

    przycisk.setFont(new Font("Serif", Font.BOLD, 20));
    przycisk.setForeground(new Color(239, 216, 166)); // jasnozloty tekst
    przycisk.setBackground(new Color(75, 51, 58));    // ciemny bordowy
    przycisk.setFocusPainted(false);                  // bez ramki focusu
    przycisk.setAlignmentX(Component.CENTER_ALIGNMENT);
    przycisk.setPreferredSize(new Dimension(300, 50));
    przycisk.setMaximumSize(new Dimension(300, 50));  // kluczowe w BoxLayout!
    przycisk.setBorder(BorderFactory.createLineBorder(
            new Color(174, 132, 70), 2
    ));
    przycisk.setCursor(
            Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)
    );

    return przycisk;
}
public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        Main gra = new Main();
        gra.setVisible(true);
    });
}
