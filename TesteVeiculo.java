import javax.swing.JOptionPane;
public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo();

        String modelo1 = JOptionPane.showInputDialog("Digite modelo para o carro I");
        String ano1 = JOptionPane.showInputDialog("Digite o ano para o carro I");
        int anoModeloUm = Integer.parseInt(ano1);
        String velocidadeModeloUm = JOptionPane.showInputDialog("Digite a velocidade");
        double velocidadeUm = Double.parseDouble(velocidadeModeloUm);

        carro1.setModelo(modelo1);
        carro1.setAno(anoModeloUm);
        carro1.setVelocidade(velocidadeUm);

        System.out.println();
        System.out.println("Carro I: " + carro1.getModelo() + " Ano: " + carro1.getAno() +" Velocidade Atual: " + carro1.getVelocidade()+"\n");
        carro1.acelerar(carro1.getModelo());
        carro1.parar(carro1.getModelo());

        Veiculo carro2 = new Veiculo();

        String modelo2 = JOptionPane.showInputDialog("Digite modelo para o carro II");
        String ano2 = JOptionPane.showInputDialog("Digite o ano para o carro II");
        int anoModeloDois = Integer.parseInt(ano2);
        String velocidadeModeloDois = JOptionPane.showInputDialog("Digite a velocidade");
        double velocidadeDois = Double.parseDouble(velocidadeModeloDois);


        carro2.setModelo(modelo2);
        carro2.setAno(anoModeloDois);
        carro2.setVelocidade(velocidadeDois);

        System.out.println();
        System.out.println("Carro II: " + carro2.getModelo() + " Ano: " + carro2.getAno() +" Velocidade Atual: " + carro2.getVelocidade()+"\n");
        carro2.acelerar(carro2.getModelo());
        carro2.parar(carro2.getModelo());
    }
}
