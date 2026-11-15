
import javax.swing.*;
import java.awt.*;

public class KsięgaAlchemika extends JFrame{

    //konstruktor
    public KsięgaAlchemika() {


        // Ustawienia okna
        setTitle("Do tego, który odważył się sięgnąć po wiedzę zawartą w owej księdze. Nie każda reakcja prowadzi do stworzenia czegoś pożytecznego ");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel tła
        JPanel tlo = new JPanel();
        tlo.setLayout(new BoxLayout(tlo, BoxLayout.Y_AXIS));
        tlo.setBackground(new Color(40, 30, 35));

        // Tytuł gry
        JLabel tytul = new JLabel("Do tego, który odważył się sięgnąć po wiedzę zawartą w owej księdze. Nie każda reakcja prowadzi do stworzenia czegoś pożytecznego ");
        tytul.setFont(new Font("Serif", Font.BOLD, 54));
        tytul.setForeground(new Color(226, 185, 105));
        tytul.setAlignmentX(Component.CENTER_ALIGNMENT);







    }


    // Uruchomienie programu
    public static void main(String[] args) {



    }







}
