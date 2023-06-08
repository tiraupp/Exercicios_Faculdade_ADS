import javax.swing.*;

public class Main {


    public static void main(String[] args) {

        int continuar = 0;

        MesPorExtenso mes = new MesPorExtenso();

        do {
            mes.lingua = Integer.parseInt(JOptionPane.showInputDialog("Digite o Idioma (1 Para Português e 2 Para Inglês)"));
            mes.mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês em numeral:"));
            mes.getMesPorExtenso();
            continuar = JOptionPane.showConfirmDialog(null, "Deseja verificar um novo mês?");
        } while (continuar == 0);

    }
}