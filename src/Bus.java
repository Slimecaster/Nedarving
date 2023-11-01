public class Bus extends Koeretoej
{
    private int antalPassagerer;
    private int antalDoere;

    public Bus() {
    }

    public Bus(int vaegtafgift, String registreringsnummer, int antalPassagerer, int antalDoere) {
        super(vaegtafgift, registreringsnummer);
        this.antalPassagerer = antalPassagerer;
        this.antalDoere = antalDoere;
    }

    public int getAntalPassagerer() {
        return antalPassagerer;
    }

    public void setAntalPassagerer(int antalPassagerer) {
        this.antalPassagerer = antalPassagerer;
    }

    public int getAntalDoere() {
        return antalDoere;
    }

    public void setAntalDoere(int antalDoere) {
        this.antalDoere = antalDoere;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "antalPassagerer=" + antalPassagerer +
                ", antalDoere=" + antalDoere +
                ", vaegtafgift=" + vaegtafgift +
                ", registreringsnummer='" + registreringsnummer + '\'' +
                '}';
    }
}
