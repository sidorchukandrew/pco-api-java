package com.sidorchukandrew.pcoapi.models;

public class AttachmentDataAttributes {
    private String name;
    private String aliases;
    private Boolean capoedChordCharts;
    private Boolean chordCharts;
    private String exclusions;
    private Boolean lyrics;
    private Boolean numberCharts;
    private Boolean numeralCharts;
    private Boolean builtIn;

    public String getName() {
        return name;
    }

    public String getAliases() {
        return aliases;
    }

    public Boolean getCapoedChordCharts() {
        return capoedChordCharts;
    }

    public Boolean getChordCharts() {
        return chordCharts;
    }

    public String getExclusions() {
        return exclusions;
    }

    public Boolean getLyrics() {
        return lyrics;
    }

    public Boolean getNumberCharts() {
        return numberCharts;
    }

    public Boolean getNumeralCharts() {
        return numeralCharts;
    }

    public Boolean getBuiltIn() {
        return builtIn;
    }

    @Override
    public String toString() {
        return "AttachmentDataAttributes{" +
                "name='" + name + '\'' +
                ", aliases='" + aliases + '\'' +
                ", capoedChordCharts=" + capoedChordCharts +
                ", chordCharts=" + chordCharts +
                ", exclusions='" + exclusions + '\'' +
                ", lyrics=" + lyrics +
                ", numberCharts=" + numberCharts +
                ", numeralCharts=" + numeralCharts +
                ", builtIn=" + builtIn +
                '}';
    }
}
