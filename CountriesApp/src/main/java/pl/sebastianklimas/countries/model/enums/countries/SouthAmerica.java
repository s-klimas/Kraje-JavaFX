package pl.sebastianklimas.countries.model.enums.countries;

import pl.sebastianklimas.countries.model.Country;

public enum SouthAmerica {
    POLISH(new Country[]
            {
                    new Country("AR", new String[]{"AR", "Argentyna"}),
                    new Country("BO", new String[]{"BO", "Boliwia"}),
                    new Country("BR", new String[]{"BR", "Brazylia"}),
                    new Country("CL", new String[]{"CL", "Chile"}),
                    new Country("EC", new String[]{"EC", "Ekwador"}),
                    new Country("GY", new String[]{"GY", "Gujana"}),
                    new Country("CO", new String[]{"CO", "Kolumbia"}),
                    new Country("PY", new String[]{"PY", "Paragwaj"}),
                    new Country("PE", new String[]{"PE", "Peru"}),
                    new Country("SR", new String[]{"SR", "Surinam"}),
                    new Country("TT", new String[]{"TT", "Trynidad i Tobago"}),
                    new Country("UY", new String[]{"UY", "Urugwaj"}),
                    new Country("VE", new String[]{"VE", "Wenezuela"})
            }
    );
//    ENGLISH(new String[][]
//            {
//                    {"Algieria"},
//                    {"Angola"}
//            }
//    );

    private final Country[] countries;

    SouthAmerica(Country[] countries) {
        this.countries = countries;
    }

    public Country[] getCountries() {
        return countries;
    }
}
