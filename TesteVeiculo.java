public class TesteVeiculo {
    public static void main(String[] args) throws Exception {
        Veiculo carro1 = new Veiculo("GOL", 2018, 140.0);

        System.out.println("\n"+"Carro I: " + carro1.getModelo() + " - Ano: " + carro1.getAno() +" - Velocidade Atual: " + carro1.getVelocidade()+"\n");
        carro1.acelerar(carro1.getModelo());
        carro1.parar(carro1.getModelo());

        Veiculo carro2 = new Veiculo("HB20X", 2020, 110.0);

        System.out.println("\n"+"Carro II: " + carro2.getModelo() + " Ano: " + carro2.getAno() +" Velocidade Atual: " + carro2.getVelocidade()+"\n");
        carro2.acelerar(carro2.getModelo());
        carro2.parar(carro2.getModelo());
    }
}
