package tests;

// combobox med strategierna vi ska testa
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Strategier extends JPanel {

    private JComboBox<String> strategiComboBox;

    public Strategier() {
        setLayout(new FlowLayout());

        // Alternativen i comboboxen
        String[] strategier = {
                "Välj strategi...",
                "Random",
                "Håller sig till en väg",
                "Titta start och mål",
                "Kolla varje korsning",
                "Gå mot mål",
                "räkna rutor",
                "ignorera vägar"
        };

        strategiComboBox = new JComboBox<>(strategier);
        add(strategiComboBox);

        // Event som triggas när användaren väljer något
        strategiComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valt = (String) strategiComboBox.getSelectedItem();
                körProgramm(valt);
            }
        });
    }

    private void körProgramm(String strategi) {
        switch (strategi) {
            case "Random":
                körRandom();
                break;
            case "Håller sig till en väg":
                körHV();
                break;
            case "Titta start och mål":
                körStartOchMål();
                break;
            case "Kolla varje korsning":
                körKorsningar();
                break;
            case "ignorera vägar":
                körIV();
                break;
            default:
                break;
        }
    }

    private void körRandom() {
        System.out.println("körRandom");
    }

    private void körHV() {
        System.out.println("körHV");

    }

    private void körStartOchMål() {
        System.out.println("kör Start->mål");
    }

    private void körKorsningar() {
        System.out.println("KörKorsningar");
    }

    private void KörGåMotMål()  {
        System.out.println("Kör Gå mot mål");
    }

    private void körRäkna() {
        System.out.println("Kör Räkna");
    }

    private void körIV() {
        System.out.println("Kör IV");
    }
}
