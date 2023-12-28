package br.com.alura.screenmatch.models;

public class Series extends Title {
    //GETTERS OF SERIES
    private int seasons;
    private boolean active;
    private int episodePerSeaseon;
    private int minutesPerEpisode;

    public Series(String name, int relaseYear) {
        super(name, relaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public boolean isActive() {
        return active;
    }

    public int getEpisodePerSeaseon() {
        return episodePerSeaseon;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    //SETTERS OF SERIES
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEpisodePerSeaseon(int episodePerSeaseon) {
        this.episodePerSeaseon = episodePerSeaseon;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodePerSeaseon * minutesPerEpisode;
    }

    public String toString(){
        return "Serie: " + this.getName() + "(" + this.getRelaseYear() + ")";
    }
}
