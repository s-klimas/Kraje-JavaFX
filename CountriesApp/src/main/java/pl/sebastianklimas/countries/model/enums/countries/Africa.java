package pl.sebastianklimas.countries.model.enums.countries;

import pl.sebastianklimas.countries.model.Country;

public enum Africa {
    POLISH(new Country[]
            {
                    new Country("DZ", new String[]{"DZ", "Algieria"}),
                    new Country("AO", new String[]{"AO", "Angola"}),
                    new Country("BJ", new String[]{"BJ", "Benin"}),
                    new Country("BW", new String[]{"BW", "Botswana"}),
                    new Country("BF", new String[]{"BF", "Burkina Faso"}),
                    new Country("BI", new String[]{"BI", "Burundi"}),
                    new Country("TD", new String[]{"TD", "Czad"}),
                    new Country("CD", new String[]{"CD", "Demokratyczna Republika Konga"}),
                    new Country("DJ", new String[]{"DJ", "Dżibuti"}),
                    new Country("EG", new String[]{"EG", "Egipt"}),
                    new Country("ER", new String[]{"ER", "Erytrea"}),
                    new Country("SZ", new String[]{"SZ", "Eswatini", "Suazi"}),
                    new Country("ET", new String[]{"ET", "Etiopia"}),
                    new Country("GA", new String[]{"GA", "Gabon"}),
                    new Country("GM", new String[]{"GM", "Gambia"}),
                    new Country("GH", new String[]{"GH", "Ghana"}),
                    new Country("GN", new String[]{"GN", "Gwinea"}),
                    new Country("GW", new String[]{"GW", "Gwinea Bissau"}),
                    new Country("GQ", new String[]{"GQ", "Gwinea Równikowa"}),
                    new Country("CM", new String[]{"CM", "Kamerun"}),
                    new Country("KE", new String[]{"KE", "Kenia"}),
                    new Country("KM", new String[]{"KM", "Komory"}),
                    new Country("CG", new String[]{"CG", "Kongo"}),
                    new Country("LS", new String[]{"LS", "Lesotho"}),
                    new Country("LR", new String[]{"LR", "Liberia"}),
                    new Country("LY", new String[]{"LY", "Libia"}),
                    new Country("MG", new String[]{"MG", "Madagaskar"}),
                    new Country("MW", new String[]{"MW", "Malawi"}),
                    new Country("ML", new String[]{"ML", "Mali"}),
                    new Country("MA", new String[]{"MA", "Maroko"}),
                    new Country("MR", new String[]{"MR", "Mauretania"}),
                    new Country("MU", new String[]{"MU", "Mauritius"}),
                    new Country("MZ", new String[]{"MZ", "Mozambik"}),
                    new Country("NA", new String[]{"NA", "Namibia"}),
                    new Country("NE", new String[]{"NE", "Niger"}),
                    new Country("NG", new String[]{"NG", "Nigeria"}),
                    new Country("ZA", new String[]{"ZA", "Republika Południowej Afryki", "RPA"}),
                    new Country("CF", new String[]{"CF", "Republika Środkowoafrykańska"}),
                    new Country("CV", new String[]{"CV", "Republika Zielonego Przylądka"}),
                    new Country("RW", new String[]{"RW", "Rwanda"}),
                    new Country("SN", new String[]{"SN", "Senegal"}),
                    new Country("SC", new String[]{"SC", "Seszele"}),
                    new Country("SL", new String[]{"SL", "Sierra Leone"}),
                    new Country("SO", new String[]{"SO", "Somalia"}),
                    new Country("SD", new String[]{"SD", "Sudan"}),
                    new Country("SS", new String[]{"SS", "Sudan Południowy"}),
                    new Country("TZ", new String[]{"TZ", "Tanzania"}),
                    new Country("TG", new String[]{"TG", "Togo"}),
                    new Country("TN", new String[]{"TN", "Tunezja"}),
                    new Country("UG", new String[]{"UG", "Uganda"}),
                    new Country("CI", new String[]{"CI", "Wybrzeże Kości Słoniowej", "WKS"}),
                    new Country("ST", new String[]{"ST", "Wyspy Świętego Tomasza i Książęca", "WŚTIK"}),
                    new Country("ZM", new String[]{"ZM", "Zambia"}),
                    new Country("ZW", new String[]{"ZW", "Zimbabwe"})
            }
    );
//    ENGLISH(new String[][]
//            {
//                    {"Algieria"},
//                    {"Angola"}
//            }
//    );

    private final Country[] countries;

    Africa(Country[] countries) {
        this.countries = countries;
    }

    public Country[] getCountries() {
        return countries;
    }
}
