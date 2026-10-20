import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(){
        setTitle("alchemik");
        setSize(900, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //glowne tlo
        JPanel tlo = new JPanel();
        tlo.setBackground(new Color(30, 22, 35));
        tlo.setLayout(new BoxLayout(tlo, BoxLayout.Y_AXIS));
        tlo.setBorder(BorderFactory.createEmptyBorder(65, 50, 50, 50));

        // Tytul gry
        JLabel tytul = new JLabel("ALCHEMIK");
        tytul.setFont(new Font("Serif", Font.BOLD, 54));
        tytul.setForeground(new Color(226, 185, 105));
        tytul.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Ostrzezenie alchemika
        JLabel ostrzezenie = new JLabel(
                "Poznaj nature skladnikow, zanim odwazysz sie je polaczyc."
        );
        ostrzezenie.setFont(new Font("Serif", Font.ITALIC, 15));
        ostrzezenie.setForeground(new Color(177, 157, 180));
        ostrzezenie.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Przyciski menu
        JButton start = utworzPrzycisk("Rozpocznij gre");
        JButton ksiega = utworzPrzycisk("Ksiega skladnikow");
        JButton wyjscie = utworzPrzycisk("Wyjscie");

        // Co sie stanie po kliknieciu
        start.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        this,
                        "Wkrotce rozpocznie sie Twoja przygoda!"
                )
        );

        ksiega.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        this,
                        "Tutaj znajdzie sie ksiega pierwiastkow."
                )
        );

        wyjscie.addActionListener(e -> System.exit(0));

        // Rozmieszczenie elementow
        tlo.add(tytul);
        tlo.add(Box.createVerticalStrut(8));
        tlo.add(ostrzezenie);
        tlo.add(Box.createVerticalStrut(55));
        tlo.add(start);
        tlo.add(Box.createVerticalStrut(18));
        tlo.add(ksiega);
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
}