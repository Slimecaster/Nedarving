public class Personvogn extends Koeretoej
{
    private int hastighed;
    private int hestekraefter;
    private String motorStoerlse;

    public Personvogn() {
    }

    public Personvogn(int vaegtafgift, String registreringsnummer, int hastighed, int hestekraefter, String motorStoerlse) {
        super(vaegtafgift, registreringsnummer);
        this.hastighed = hastighed;
        this.hestekraefter = hestekraefter;
        this.motorStoerlse = motorStoerlse;
    }

    public int getHastighed() {
        return hastighed;
    }

    public void setHastighed(int hastighed) {
        this.hastighed = hastighed;
    }

    public int getHestekraefter() {
        return hestekraefter;
    }

    public void setHestekraefter(int hestekraefter) {
        this.hestekraefter = hestekraefter;
    }

    public String getMotorStoerlse() {
        return motorStoerlse;
    }

    public void setMotorStoerlse(String motorStoerlse) {
        this.motorStoerlse = motorStoerlse;
    }

    @Override
    public String toString() {
        return "Personvogn{" +
                "hastighed=" + hastighed +
                ", hestekraefter=" + hestekraefter +
                ", motorStoerlse='" + motorStoerlse + '\'' +
                ", vaegtafgift=" + vaegtafgift +
                ", registreringsnummer='" + registreringsnummer + '\'' +
                '}';
    }
}
