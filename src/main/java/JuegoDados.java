public class JuegoDados {
    public static void main(String[] args) {
        CalculadoraDados calculadoraDados = new CalculadoraDados();
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        dado1.lanzarDado();
        dado2.lanzarDado();
        int resultado = calculadoraDados.sumarDados(dado1.getCaraVisible(), dado2.getCaraVisible());
        if (resultado == 7) {
            System.out.println("Has ganado!!!!!!!!!!!!!!!!!!!!!!!!");
        } else {
            System.out.println("Has perdido, bu");
        }
    }
}
