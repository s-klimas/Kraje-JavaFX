package pl.sebastianklimas.countries.model;

import pl.sebastianklimas.countries.model.enums.Continent;
import pl.sebastianklimas.countries.model.enums.Language;
import pl.sebastianklimas.countries.model.enums.countries.*;

import java.io.*;
import java.util.*;

public class Game {
    private Language language;
    private Map<Country, Boolean> gameContainer = new HashMap<>();
    private int guessed = 0;

    private Scoreboard scoreboard = new Scoreboard();

    private Set<Continent> loadedContinents = new HashSet<>();

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Map<Country, Boolean> getGameContainer() {
        return gameContainer;
    }

    public void setGameContainer(Map<Country, Boolean> gameContainer) {
        this.gameContainer = gameContainer;
    }

    public int getGuessed() {
        return guessed;
    }

    public void setGuessed(int guessed) {
        this.guessed = guessed;
    }

    public Scoreboard getScoreboard() {
        return scoreboard;
    }

    public void setScoreboard(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
    }

    public List<Score> getScoreboardList() {
        return scoreboard.getScoreboardList();
    }

    public Set<Continent> getLoadedContinents() {
        return loadedContinents;
    }

    public void setLoadedContinents(Set<Continent> loadedContinents) {
        this.loadedContinents = loadedContinents;
    }

    @Override
    public String toString() {
        return "Game " + language + " " + gameContainer.keySet();
    }

    public void restart() {
        gameContainer.clear();
        loadedContinents.clear();
        guessed = 0;
    }

    public void guessed() {
        guessed++;
    }

    public void clear() {
        for (Country country: gameContainer.keySet()) {
            gameContainer.replace(country, false);
        }
        guessed = 0;
    }

    public void saveScoreboard() {
        boolean closeFlag = true;
        do {
            try (
                    var fos = new FileOutputStream(Scoreboard.SCOREBOARD_FILE_PATH);
                    var oos = new ObjectOutputStream(fos);
            ) {
                oos.writeObject(scoreboard);
                closeFlag = false;
            } catch (FileNotFoundException e) {
                System.err.println("File not found, closing without saving.");
            } catch (IOException e) {
                System.err.println("Saving scoreboard to file failed, closing without saving.");
            }
        } while (closeFlag);
    }

    public void initializeScoreboardFromDisc() {
        try (
                var fis = new FileInputStream(Scoreboard.SCOREBOARD_FILE_PATH);
                var ois = new ObjectInputStream(fis);
        ) {
            scoreboard = (Scoreboard) ois.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("File " + Scoreboard.SCOREBOARD_FILE_PATH + " not found.");
        } catch (IOException e) {
            System.err.println("Error occurred while trying to read " + Scoreboard.SCOREBOARD_FILE_PATH + ".");
        } catch (ClassNotFoundException e) {
            System.err.println("Mismatch data type in file " + Scoreboard.SCOREBOARD_FILE_PATH + ".");
        }
    }

    public void addContinent(Continent continent) {
        loadedContinents.add(continent);

        switch (continent) {
            case AFRICA -> {
                switch (language) {
                    case POLISH -> Arrays.stream(Africa.POLISH.getCountries())
                            .forEach(country -> gameContainer.put(country, false));
                }
            }
            case ASIA -> {
                switch (language) {
                    case POLISH -> Arrays.stream(Asia.POLISH.getCountries())
                            .forEach(country -> gameContainer.put(country, false));
                }
            }
            case AUSTRALIA -> {
                switch (language) {
                    case POLISH -> Arrays.stream(Australia.POLISH.getCountries())
                            .forEach(country -> gameContainer.put(country, false));
                }
            }
            case EUROPE -> {
                switch (language) {
                    case POLISH -> Arrays.stream(Europe.POLISH.getCountries())
                            .forEach(country -> gameContainer.put(country, false));
                }
            }
            case NORTH_AMERICA -> {
                switch (language) {
                    case POLISH -> Arrays.stream(NorthAmerica.POLISH.getCountries())
                            .forEach(country -> gameContainer.put(country, false));
                }
            }
            case SOUTH_AMERICA -> {
                switch (language) {
                    case POLISH -> Arrays.stream(SouthAmerica.POLISH.getCountries())
                            .forEach(country -> gameContainer.put(country, false));
                }
            }
            case UNRECOGNIZED_COUNTRIES -> {
                switch (language) {
                    case POLISH -> Arrays.stream(UnrecognizedCountries.POLISH.getCountries())
                            .forEach(country -> gameContainer.put(country, false));
                }
            }
            case ALL_COUNTRIES -> {
                switch (language) {
                    case POLISH ->  {
                        Arrays.stream(Africa.POLISH.getCountries())
                                .forEach(country -> gameContainer.put(country, false));
                        Arrays.stream(Asia.POLISH.getCountries())
                                .forEach(country -> gameContainer.put(country, false));
                        Arrays.stream(Australia.POLISH.getCountries())
                                .forEach(country -> gameContainer.put(country, false));
                        Arrays.stream(Europe.POLISH.getCountries())
                                .forEach(country -> gameContainer.put(country, false));
                        Arrays.stream(NorthAmerica.POLISH.getCountries())
                                .forEach(country -> gameContainer.put(country, false));
                        Arrays.stream(SouthAmerica.POLISH.getCountries())
                                .forEach(country -> gameContainer.put(country, false));
                    }
                }
            }
        }
    }
}
