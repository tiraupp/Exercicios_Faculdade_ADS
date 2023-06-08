import javax.swing.*;

public class MesPorExtenso {
    public int lingua, mes;

    public String [] mesPortugues = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julio", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
    public String [] mesIngles = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public String mesExtenso;
    public MesPorExtenso() {

    }

    public void verificaMes() {
        if(lingua == 1) {
            if (mes <= 12) {
                mesExtenso = mesPortugues[mes-1];
            } else {
                mesExtenso = "Opção Inválida";
            }
        } else if (lingua == 2) {
            if (mes <= 12) {
                mesExtenso = mesPortugues[mes-1];
            } else {
                mesExtenso = "Opção Inválida";
            }
            mesExtenso = mesIngles[mes-1];
        } else {
            mesExtenso = "Opção Inválida";
        }
    }
    public void getMesPorExtenso() {
        verificaMes();
        JOptionPane.showMessageDialog(null, mesExtenso);
    }
}

