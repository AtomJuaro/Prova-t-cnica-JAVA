public class prueba {
    public static void main(String[] args) {
        Carro obj=new Carro();
        System.out.println(obj.getVelocidade_atual());
        obj.acelera();
        System.out.println(obj.getVelocidade_atual());
        obj.acelera();
        System.out.println(obj.getVelocidade_atual());
        obj.freia();
        System.out.println(obj.getVelocidade_atual());
    }
}
