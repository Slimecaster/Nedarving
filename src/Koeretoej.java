public class Koeretoej
{
    protected int vaegtafgift;
    protected String registreringsnummer;

    public Koeretoej() {
    }

    public Koeretoej(int vaegtafgift, String registreringsnummer) {
        this.vaegtafgift = vaegtafgift;
        this.registreringsnummer = registreringsnummer;
    }

    public int getVaegtafgift() {
        return vaegtafgift;
    }

    public void setVaegtafgift(int vaegtafgift) {
        this.vaegtafgift = vaegtafgift;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public void setRegistreringsnummer(String registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }

    @Override
    public String toString() {
        return "Koeretoej{" +
                "vaegtafgift=" + vaegtafgift +
                ", registreringsnummer='" + registreringsnummer + '\'' +
                '}';
    }
}
