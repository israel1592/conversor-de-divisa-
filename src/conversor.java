import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class conversor {

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            String[] options = { "Pesos a Euros", "Pesos a Dólares", "Pesos a Libras Esterlinas", "Pesos a Yen",
                    "Pesos a Won", "Dólares a Pesos", "Euros a Pesos", "Libras Esterlinas a Pesos", "Yen a Pesos", "Won a Pesos" };
            String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                    "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            String input = JOptionPane.showInputDialog("Ingrese la cantidad: ");
            double cantidad;
            try {
                cantidad = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido.");
                return;
            }
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

            //Tasas de cambio
            double tasaDolar = 0.00024;
            double tasaEuro = 0.00022;
            double tasaLibra = 0.00018;
            double tasaYen = 0.035;
            double tasaWon = 0.32;

            if (choice.equals("Pesos a Dólares")) {
                double dollars = cantidad * tasaDolar;
                JOptionPane.showMessageDialog(null,
                        cantidad + " pesos colombianos son " + FormatearDecimal.format(dollars) + " dólares.");
            } else if (choice.equals("Pesos a Euros")) {
                double euros = cantidad * tasaEuro;
                JOptionPane.showMessageDialog(null, cantidad + " pesos colombianos son " + FormatearDecimal.format(euros) + " euros.");
            } else if (choice.equals("Pesos a Libras Esterlinas")) {
                double pounds = cantidad * tasaLibra;
                JOptionPane.showMessageDialog(null, cantidad + " pesos colombianos son " +FormatearDecimal.format(pounds)  + " libras esterlinas.");
            } else if (choice.equals("Pesos a Yen")) {
                double yen = cantidad * tasaYen;
                JOptionPane.showMessageDialog(null, cantidad + " pesos colombianos son " +FormatearDecimal.format(yen) + " yenes japoneses.");
            } else if (choice.equals("Pesos a Won")) {
                double won = cantidad * tasaWon;
                JOptionPane.showMessageDialog(null, cantidad + " pesos colombianos son " +FormatearDecimal.format(won) + " wones surcoreanos.");
            } else if (choice.equals("Dólares a Pesos")){
                double pesos = cantidad / tasaDolar;
                JOptionPane.showMessageDialog(null,
                cantidad + " dólares son " + FormatearDecimal.format(pesos) + " pesos colombianos.");
            } else if (choice.equals("Euros a Pesos")){
                double pesos = cantidad / tasaEuro;
                JOptionPane.showMessageDialog(null,
                cantidad + " euros son " + FormatearDecimal.format(pesos) + " pesos colombianos.");
            } else if (choice.equals("Libras Esterlinas a Pesos")){
                double pesos = cantidad / tasaLibra;
                JOptionPane.showMessageDialog(null,
                cantidad + " libras esterlinas son " + FormatearDecimal.format(pesos) + " pesos colombianos.");
            } else if (choice.equals("Yen a Pesos")){
                double pesos = cantidad / tasaYen;
                JOptionPane.showMessageDialog(null,
                cantidad + " yenes son " + FormatearDecimal.format(pesos) + " pesos colombianos.");
            } else if (choice.equals("Won a Pesos")){
                double pesos = cantidad / tasaWon;
                JOptionPane.showMessageDialog(null,
                cantidad + " wones son " + FormatearDecimal.format(pesos) + " pesos colombianos.");
            }
            
            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }
        }

    }
}