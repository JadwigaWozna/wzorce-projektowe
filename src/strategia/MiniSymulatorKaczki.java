package strategia;

import strategia.kwakanie.Piszcz;
import strategia.latanie.LotZNapędemRakietowym;

public class MiniSymulatorKaczki {

    public static void main(String[] args) {
        Kaczka dzika = new DzikaKaczka();
        dzika.kwacz();
        dzika.leć();
        dzika.setKwakanie(new Piszcz());
        dzika.kwacz();

        System.out.println("*********************************************");

        Kaczka model = new ModelKaczki();
        model.leć();
        model.setLatanie(new LotZNapędemRakietowym());
        model.leć();

    }
}
