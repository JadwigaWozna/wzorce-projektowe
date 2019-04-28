package strategia;

import strategia.kwakanie.Kwacz;
import strategia.latanie.NieLatam;

public class ModelKaczki extends Kaczka {

    public ModelKaczki() {
        latanie = new NieLatam();
        kwakanie = new Kwacz();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem modelem kaczki!");
    }
}
