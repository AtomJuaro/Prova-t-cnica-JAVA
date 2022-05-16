public class Carro {
    private String Modelo;
    private String Cor;
    private String Ano;
    private String Marca;
    private String Chassi;
    private String Proprietario;
    private int Velocidade_máxima;
    private int Velocidade_atual;
    private int Numero_de_portas;
    private boolean teto_solar;
    private int Numero_de_Marchas;
    private boolean automatico;
    private int Volume_de_combusvel;
    private int marcha;
    private Owner Owner;

    public Carro(Owner Owner){
        this.Velocidade_atual=0;
        this.Owner=Owner;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String chassi) {
        Chassi = chassi;
    }

    public String getProprietario() {
        return Proprietario;
    }

    public void setProprietario(String proprietario) {
        Proprietario = proprietario;
    }

    public int getVelocidade_máxima() {
        return Velocidade_máxima;
    }

    public void setVelocidade_máxima(int velocidade_máxima) {
        Velocidade_máxima = velocidade_máxima;
    }

    public int getVelocidade_atual() {
        return Velocidade_atual;
    }

    public void setVelocidade_atual(int velocidade_atual) {
        Velocidade_atual = velocidade_atual;
    }

    public int getNumero_de_portas() {
        return Numero_de_portas;
    }

    public void setNumero_de_portas(int numero_de_portas) {
        Numero_de_portas = numero_de_portas;
    }

    public boolean isTeto_solar() {
        return teto_solar;
    }

    public void setTeto_solar(boolean teto_solar) {
        this.teto_solar = teto_solar;
    }

    public int getNumero_de_Marchas() {
        return Numero_de_Marchas;
    }

    public void setNumero_de_Marchas(int numero_de_Marchas) {
        Numero_de_Marchas = numero_de_Marchas;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public int getVolume_de_combusvel() {
        return Volume_de_combusvel;
    }

    public void setVolume_de_combusvel(int volume_de_combusvel) {
        Volume_de_combusvel = volume_de_combusvel;
    }

    public int getMarcha() {
        return marcha;
    }

    public void acelera(){
        Velocidade_atual++;
    }

    public void freia(){
        Velocidade_atual=0;
    }

    public void troca_marcha(int marcha){
        this.marcha=marcha;
    }

    public void reduz_a_marcha(){
        marcha--;
    }

    public int calcular_autonomia(int consumo){
        //considerando que la autonomia se calcula como consumo * volumen de combustible
        return consumo*this.Volume_de_combusvel;
    }

    public void visualizar_volumen_combustible(){
        System.out.println("El volumen del combustible es: "+this.Volume_de_combusvel);
    }
}
