package pl.sebastianklimas.countries.model.enums.countries;

import pl.sebastianklimas.countries.model.Country;

public enum Australia {
    POLISH(new Country[]
            {
                    new Country("AU", new String[]{"AU", "Australia"}),
                    new Country("FJ", new String[]{"FJ", "Fidżi"}),
                    new Country("KI", new String[]{"KI", "Kiribati"}),
                    new Country("FM", new String[]{"FM", "Mikronezja"}),
                    new Country("NR", new String[]{"NR", "Nauru"}),
                    new Country("NZ", new String[]{"NZ", "Nowa Zelandia"}),
                    new Country("PW", new String[]{"PW", "Palau"}),
                    new Country("PG", new String[]{"PG", "Papua Nowa Gwinea", "Papua-Nowa Gwinea"}),
                    new Country("WS", new String[]{"WS", "Samoa"}),
                    new Country("TO", new String[]{"TO", "Tonga"}),
                    new Country("TV", new String[]{"TV", "Tuvalu"}),
                    new Country("VU", new String[]{"VU", "Vanuatu"}),
                    new Country("MH", new String[]{"MH", "Wyspy Marshalla"}),
                    new Country("SB", new String[]{"SB", "Wyspy Salomona"})
            }
    );
//    ENGLISH(new String[][]
//            {
//                    {"Algieria"},
//                    {"Angola"}
//            }
//    );

    private final Country[] countries;

    Australia(Country[] countries) {
        this.countries = countries;
    }

    public Country[] getCountries() {
        return countries;
    }
}
