public class Veiculo {

    private String modelo;
    private int ano;
    private double velocidade;

    //#region  GETTERS & SETTERS (Encapsulamento)

    //Setters
    public void setVelocidade(double v){
        velocidade = v;
    }   

    public void setModelo(String model){
        modelo = model;
    }

    public void setAno(int number){
        ano = number;
    }

    //Getters
    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public double getVelocidade(){
        return velocidade;
    }
    //#endregion

    //#region METHODS (Regras de negócio)
    public void acelerar(String veiculo){
        System.out.println(veiculo + " acelerando...");
        while(this.velocidade < 200){
            this.velocidade += 10;
            if(this.velocidade >= 200) {
                this.velocidade = 200;
                System.out.println(veiculo + " Velocidade máxima alcançada..." + this.velocidade);
            } else {
                System.out.println(veiculo + " Aumentando velocidade..." + this.velocidade);
            }
        }
    }

    public void parar(String veiculo){
        while(this.velocidade != 0){
            this.velocidade -= 10;
            if(this.velocidade <= 0) {
                System.out.println(veiculo + " parado ...");
            } else {
                System.out.println(veiculo + " Reduzindo velocidade..." + this.velocidade);
            }
        }
    }

    //#endregion
}