package com.sidorchukandrew.pcoapi.models;

public class AttachmentTypeAttributes implements Attributes {
    private String name;
    private String aliases;
    private Boolean capoedChordCharts;
    private Boolean chordCharts;
    private String exclusions;
    private Boolean lyrics;
    private Boolean numberCharts;
    private Boolean numeralCharts;
    private Boolean builtIn;

    private AttachmentTypeAttributes() { }

    private AttachmentTypeAttributes(Builder builder) {
        name = builder.name;
        aliases = builder.aliases;
        capoedChordCharts = builder.capoedChordCharts;
        chordCharts = builder.chordCharts;
        exclusions = builder.exclusions;
        lyrics = builder.lyrics;
        numberCharts = builder.numberCharts;
        numeralCharts = builder.numeralCharts;
        builtIn = builder.builtIn;
    }

    public static class Builder {
        private String name;
        private String aliases;
        private Boolean capoedChordCharts;
        private Boolean chordCharts;
        private String exclusions;
        private Boolean lyrics;
        private Boolean numberCharts;
        private Boolean numeralCharts;
        private Boolean builtIn;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder aliases(String aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder capoedChordCharts(Boolean capoedChordCharts) {
            this.capoedChordCharts = capoedChordCharts;
            return this;
        }

        public Builder chordCharts(Boolean chordCharts) {
            this.chordCharts = chordCharts;
            return this;
        }

        public Builder exclusions(String exclusions) {
            this.exclusions = exclusions;
            return this;
        }

        public Builder lyrics(Boolean lyrics) {
            this.lyrics = lyrics;
            return this;
        }

        public Builder numberCharts(Boolean numberCharts) {
            this.numberCharts = numberCharts;
            return this;
        }

        public Builder numeralCharts(Boolean numeralCharts) {
            this.numeralCharts = numeralCharts;
            return this;
        }

        public Builder builtIn(Boolean builtIn) {
            this.builtIn = builtIn;
            return this;
        }

        public AttachmentTypeAttributes build() {
            return new AttachmentTypeAttributes(this);
        }
    }

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
        return "AttachmentTypeAttributes{" +
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
