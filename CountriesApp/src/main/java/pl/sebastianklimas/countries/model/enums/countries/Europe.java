package pl.sebastianklimas.countries.model.enums.countries;

import pl.sebastianklimas.countries.model.Country;

public enum Europe {
    POLISH(new Country[]
            {
                    new Country("AL", new String[]{"AL", "Albania"}),
                    new Country("AD", new String[]{"AD", "Andora"}),
                    new Country("AT", new String[]{"AT", "Austria"}),
                    new Country("BE", new String[]{"BE", "Belgia"}),
                    new Country("BY", new String[]{"BY", "Białoruś"}),
                    new Country("BA", new String[]{"BA", "Bośnia i Hercegowina"}),
                    new Country("BG", new String[]{"BG", "Bułgaria"}),
                    new Country("HR", new String[]{"HR", "Chorwacja"}),
                    new Country("ME", new String[]{"ME", "Czarnogóra"}),
                    new Country("CZ", new String[]{"CZ", "Republika Czeska", "Czechy"}),
                    new Country("DK", new String[]{"DK", "Dania"}),
                    new Country("EE", new String[]{"EE", "Estonia"}),
                    new Country("FI", new String[]{"FI", "Finlandia"}),
                    new Country("FR", new String[]{"FR", "Francja"}),
                    new Country("GR", new String[]{"GR", "Grecja"}),
                    new Country("ES", new String[]{"ES", "Hiszpania"}),
                    new Country("NL", new String[]{"NL", "Holandia"}),
                    new Country("IE", new String[]{"IE", "Irlandia"}),
                    new Country("IS", new String[]{"IS", "Islandia"}),
                    new Country("LI", new String[]{"LI", "Liechtenstein"}),
                    new Country("LT", new String[]{"LT", "Litwa"}),
                    new Country("LU", new String[]{"LU", "Luksemburg"}),
                    new Country("LV", new String[]{"LV", "Łotwa"}),
                    new Country("MK", new String[]{"MK", "Macedonia", "Macedonia Północna"}),
                    new Country("MT", new String[]{"MT", "Malta"}),
                    new Country("MD", new String[]{"MD", "Mołdawia"}),
                    new Country("MC", new String[]{"MC", "Monako"}),
                    new Country("DE", new String[]{"DE", "Niemcy"}),
                    new Country("NO", new String[]{"NO", "Norwegia"}),
                    new Country("PL", new String[]{"PL", "Polska"}),
                    new Country("PT", new String[]{"PT", "Portugalia"}),
                    new Country("RU", new String[]{"RU", "Rosja"}),
                    new Country("RO", new String[]{"RO", "Rumunia"}),
                    new Country("SM", new String[]{"SM", "San Marino"}),
                    new Country("XS", new String[]{"XS", "Serbia"}),
                    new Country("SK", new String[]{"SK", "Słowacja"}),
                    new Country("SI", new String[]{"SI", "Słowenia"}),
                    new Country("CH", new String[]{"CH", "Szwajcaria"}),
                    new Country("SE", new String[]{"SE", "Szwecja"}),
                    new Country("UA", new String[]{"UA", "Ukraina"}),
                    new Country("VA", new String[]{"VA", "Watykan"}),
                    new Country("HU", new String[]{"HU", "Węgry"}),
                    new Country("GB", new String[]{"GB", "Wielka Brytania"}),
                    new Country("IT", new String[]{"IT", "Włochy"})
            }
    );
//    ENGLISH(new String[][]
//            {
//                    {"Algieria"},
//                    {"Angola"}
//            }
//    );

    private final Country[] countries;

    Europe(Country[] countries) {
        this.countries = countries;
    }

    public Country[] getCountries() {
        return countries;
    }
}
