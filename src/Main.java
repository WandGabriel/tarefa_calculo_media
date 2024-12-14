public class Main {
    public static void main(String[] args) {

    Nota nota = new Nota(8.5f, 7.2f, 8f,6.3f);
        float resultado = nota.calcularMediaNotas(nota.getPrimeiraNota(), nota.getSegundaNota(), nota.getTerceiraNota(), nota.getQuartaNota());
        System.out.println("Média Atingida: " + resultado);
    }
}