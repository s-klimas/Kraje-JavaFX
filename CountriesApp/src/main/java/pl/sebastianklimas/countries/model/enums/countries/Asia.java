package pl.sebastianklimas.countries.model.enums.countries;

import pl.sebastianklimas.countries.model.Country;

public enum Asia {
    POLISH(new Country[]
            {
                    new Country("AF", new String[]{"AF", "Afganistan"}),
                    new Country("SA", new String[]{"SA", "Arabia Saudyjska"}),
                    new Country("AM", new String[]{"AM", "Armenia"}),
                    new Country("AZ", new String[]{"AZ", "Azerbejdżan"}),
                    new Country("BH", new String[]{"BH", "Bahrajn"}),
                    new Country("BD", new String[]{"BD", "Bangladesz"}),
                    new Country("BT", new String[]{"BT", "Bhutan"}),
                    new Country("BN", new String[]{"BN", "Brunei", "Brunei Darussalam"}),
                    new Country("CN", new String[]{"CN", "Chiny"}),
                    new Country("CY", new String[]{"CY", "Cypr"}),
                    new Country("PH", new String[]{"PH", "Filipiny"}),
                    new Country("GE", new String[]{"GE", "Gruzja"}),
                    new Country("IN", new String[]{"IN", "Indie"}),
                    new Country("ID", new String[]{"ID", "Indonezja"}),
                    new Country("IQ", new String[]{"IQ", "Irak"}),
                    new Country("IR", new String[]{"IR", "Iran"}),
                    new Country("IL", new String[]{"IL", "Izrael"}),
                    new Country("JP", new String[]{"JP", "Japonia"}),
                    new Country("YE", new String[]{"YE", "Jemen"}),
                    new Country("JO", new String[]{"JO", "Jordania"}),
                    new Country("KH", new String[]{"KH", "Kambodża"}),
                    new Country("QA", new String[]{"QA", "Katar"}),
                    new Country("KZ", new String[]{"KZ", "Kazachstan"}),
                    new Country("KG", new String[]{"KG", "Kirgistan"}),
                    new Country("KR", new String[]{"KR", "Korea Południowa", "Republika Korei"}),
                    new Country("KP", new String[]{"KP", "Korea Północna", "KRLD", "Koreańska Republika Ludowo-Demokratyczna"}),
                    new Country("KW", new String[]{"KW", "Kuwejt"}),
                    new Country("LA", new String[]{"LA", "Laos"}),
                    new Country("LB", new String[]{"LB", "Liban"}),
                    new Country("MV", new String[]{"MV", "Malediwy"}),
                    new Country("MY", new String[]{"MY", "Malezja"}),
                    new Country("MM", new String[]{"MM", "Mjanma", "Birma"}),
                    new Country("MN", new String[]{"MN", "Mongolia"}),
                    new Country("NP", new String[]{"NP", "Nepal"}),
                    new Country("OM", new String[]{"OM", "Oman"}),
                    new Country("PK", new String[]{"PK", "Pakistan"}),
                    new Country("SG", new String[]{"SG", "Singapur"}),
                    new Country("LK", new String[]{"LK", "Sri Lanka"}),
                    new Country("SY", new String[]{"SY", "Syria"}),
                    new Country("TJ", new String[]{"TJ", "Tadżykistan"}),
                    new Country("TH", new String[]{"TH", "Tajlandia"}),
                    new Country("TL", new String[]{"TL", "Timor Wschodni"}),
                    new Country("TR", new String[]{"TR", "Turcja"}),
                    new Country("TM", new String[]{"TM", "Turkmenistan"}),
                    new Country("UZ", new String[]{"UZ", "Uzbekistan"}),
                    new Country("VN", new String[]{"VN", "Wietnam"}),
                    new Country("AE", new String[]{"AE", "Zjednoczone Emiraty Arabskie", "ZEA"})
            }
    );
//            }
//    );
//    ENGLISH(new String[][]
//            {
//                    {"Algieria"},
//                    {"Angola"}
//            }


    private final Country[] countries;

    Asia(Country[] countries) {
        this.countries = countries;
    }

    public Country[] getCountries() {
        return countries;
    }
}
