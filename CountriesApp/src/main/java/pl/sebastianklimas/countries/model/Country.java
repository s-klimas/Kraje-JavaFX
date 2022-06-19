package pl.sebastianklimas.countries.model;

import java.util.Arrays;
import java.util.Objects;

public class Country {
    private String code;
    private String[] names;

    public Country(String code, String[] name) {
        this.code = code;
        this.names = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(code, country.code) && Arrays.equals(names, country.names);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(code);
        result = 31 * result + Arrays.hashCode(names);
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(names);
    }
}
