package hibernate.MODEL;

import hibernate.CONTROLLER.DAO;

public class TesteExe {
    public static void main(String[] args) {
        /*Entrada entrada = new Entrada();
        entrada.setCategoria("Salário");
        entrada.setValor(1200);
        
        DAO.getInstace().inserirEntrada(entrada);*/
        
        Saida saida = new Saida();
        saida.setCategoria("Lazer");
        saida.setValor(10);
        
        DAO.getInstace().inserirSaida(saida);
       
        
        
    }
}
