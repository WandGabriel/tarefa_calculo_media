public class Nota {

    private float primeiraNota;

    private float segundaNota;

    private float terceiraNota;

    private float quartaNota;

    public float getPrimeiraNota() {
        return primeiraNota;
    }

    public Nota(float primeiraNota, float segundaNota, float terceiraNota, float quartaNota) {
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
        this.terceiraNota = terceiraNota;
        this.quartaNota = quartaNota;
    }

    public void setPrimeiraNota(float primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public float getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(float segundaNota) {
        this.segundaNota = segundaNota;
    }

    public float getTerceiraNota() {
        return terceiraNota;
    }

    public void setTerceiraNota(float terceiraNota) {
        this.terceiraNota = terceiraNota;
    }

    public float getQuartaNota() {
        return quartaNota;
    }

    public void setQuartaNota(float quartaNota) {
        this.quartaNota = quartaNota;
    }

    public float calcularMediaNotas(float primeiraNota, float segundaNota, float terceiraNota, float quartaNota) {
        return (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
    }
}
