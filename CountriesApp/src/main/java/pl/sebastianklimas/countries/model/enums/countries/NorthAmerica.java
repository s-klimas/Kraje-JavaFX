package pl.sebastianklimas.countries.model.enums.countries;

import pl.sebastianklimas.countries.model.Country;

public enum NorthAmerica {
    POLISH(new Country[]
            {
                    new Country("AG", new String[]{"AG", "Antigua i Barbuda"}),
                    new Country("BS", new String[]{"BS", "Bahamy"}),
                    new Country("BB", new String[]{"BB", "Barbados"}),
                    new Country("BZ", new String[]{"BZ", "Belize"}),
                    new Country("DM", new String[]{"DM", "Dominika"}),
                    new Country("DO", new String[]{"DO", "Dominikana"}),
                    new Country("GD", new String[]{"GD", "Grenada"}),
                    new Country("GT", new String[]{"GT", "Gwatemala"}),
                    new Country("HT", new String[]{"HT", "Haiti"}),
                    new Country("HN", new String[]{"HN", "Honduras"}),
                    new Country("JM", new String[]{"JM", "Jamajka"}),
                    new Country("CA", new String[]{"CA", "Kanada"}),
                    new Country("CR", new String[]{"CR", "Kostaryka"}),
                    new Country("CU", new String[]{"CU", "Kuba"}),
                    new Country("MX", new String[]{"MX", "Meksyk"}),
                    new Country("NI", new String[]{"NI", "Nikaragua"}),
                    new Country("PA", new String[]{"PA", "Panama"}),
                    new Country("KN", new String[]{"KN", "St.Kitts i Nevis", "Saint Kitts i Nevis"}),
                    new Country("LC", new String[]{"LC", "St.Lucia", "Saint Lucia"}),
                    new Country("VC", new String[]{"VC", "St.Vincent i Grenadyny", "Saint Vincent i Grenadyny"}),
                    new Country("SV", new String[]{"SV", "Salwador"}),
                    new Country("US", new String[]{"US", "Stany Zjednoczone", "Stany Zjednoczone Ameryki", "USA"})
            }
    );
//    ENGLISH(new String[][]
//            {
//                    {"Algieria"},
//                    {"Angola"}
//            }
//    );

    private final Country[] countries;

    NorthAmerica(Country[] countries) {
        this.countries = countries;
    }

    public Country[] getCountries() {
        return countries;
    }
}
