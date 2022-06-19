package pl.sebastianklimas.countries.model.enums.countries;

import pl.sebastianklimas.countries.model.Country;

public enum UnrecognizedCountries {
    POLISH(new Country[]
            {
                    new Country("U1", new String[]{"Abchazja"}),
                    new Country("U2", new String[]{"Cypr Północny"}),
                    new Country("U3", new String[]{"Donieck"}),
                    new Country("U4", new String[]{"Górski Karabach"}),
                    new Country("U5", new String[]{"Kosowo"}),
                    new Country("U6", new String[]{"Ługańsk"}),
                    new Country("U7", new String[]{"Naddniestrze"}),
                    new Country("U8", new String[]{"Osetia Południowa"}),
                    new Country("U9", new String[]{"Palestyna"}),
                    new Country("U10", new String[]{"Sahara Zachodnia"}),
                    new Country("U11", new String[]{"Somaliland"}),
                    new Country("U12", new String[]{"Tajwan"})
            }
    );
//    ENGLISH(new String[][]
//            {
//                    {"Algieria"},
//                    {"Angola"}
//            }
//    );

    private final Country[] countries;

    UnrecognizedCountries(Country[] countries) {
        this.countries = countries;
    }

    public Country[] getCountries() {
        return countries;
    }
}
