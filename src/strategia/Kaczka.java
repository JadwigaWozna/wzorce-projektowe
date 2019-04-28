package strategia;

import strategia.kwakanie.Kwakanie;
import strategia.latanie.Latanie;

public abstract class Kaczka {

    Kwakanie kwakanie;
    Latanie latanie;

    public Kaczka() {

    }

    public abstract void wyswietl();

    public void leć() {
        latanie.leć();
    }

    public void kwacz() {
        kwakanie.kwacz();
    }

    public void setKwakanie(Kwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }

    public void setLatanie(Latanie latanie) {
        this.latanie = latanie;
    }

    public void pływaj() {
        System.out.println("Wszystkie kaczki plywają, nawet te sztuczne!");
    }
}
