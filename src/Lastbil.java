public class Lastbil extends Koeretoej

{
    private int hestekraefter;
    private int lastkapacitet;

    public Lastbil() {
    }

    public Lastbil(int vaegtafgift, String registreringsnummer, int hestekraefter, int lastkapacitet) {
        super(vaegtafgift, registreringsnummer);
        this.hestekraefter = hestekraefter;
        this.lastkapacitet = lastkapacitet;
    }

    public int getHestekraefter() {
        return hestekraefter;
    }

    public void setHestekraefter(int hestekraefter) {
        this.hestekraefter = hestekraefter;
    }

    public int getLastkapacitet() {
        return lastkapacitet;
    }

    public void setLastkapacitet(int lastkapacitet) {
        this.lastkapacitet = lastkapacitet;
    }

    @Override
    public String toString() {
        return "Lastbil{" +
                "hestekraefter=" + hestekraefter +
                ", lastkapacitet=" + lastkapacitet +
                ", vaegtafgift=" + vaegtafgift +
                ", registreringsnummer='" + registreringsnummer + '\'' +
                '}';
    }
}
