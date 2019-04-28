package strategia;

import strategia.kwakanie.Kwacz;
import strategia.latanie.LatamBoMamSkrzydła;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanie = new Kwacz();
        latanie = new LatamBoMamSkrzydła();
    }

    @Override
    public void wyswietl(){
        System.out.println("Jestem prawdziwą Kaczką Dziwaczką");
    }
}
