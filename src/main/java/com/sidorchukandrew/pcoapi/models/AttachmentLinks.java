package com.sidorchukandrew.pcoapi.models;

public class AttachmentLinks extends Links {
    private String open;
    private String preview;
    private String slides;
    private String zooms;

    private AttachmentLinks() { }

    private AttachmentLinks(Builder builder) {
        open = builder.open;
        preview = builder.preview;
        slides = builder.slides;
        zooms = builder.zooms;
        self = builder.self;
    }

    public static class Builder {
        private String open;
        private String preview;
        private String slides;
        private String zooms;
        private String self;

        public Builder open(String open) {
            this.open = open;
            return this;
        }

        public Builder preview(String preview) {
            this.preview = preview;
            return this;
        }

        public Builder slides(String slides) {
            this.slides = slides;
            return this;
        }

        public Builder zooms(String zooms) {
            this.zooms = zooms;
            return this;
        }

        public Builder self(String self) {
            this.self = self;
            return this;
        }

        public AttachmentLinks build() {
            return new AttachmentLinks(this);
        }
    }

    public String getOpen() {
        return open;
    }

    public String getPreview() {
        return preview;
    }

    public String getSlides() {
        return slides;
    }

    public String getZooms() {
        return zooms;
    }

    @Override
    public String toString() {
        return "AttachmentLinks{" +
                "open='" + open + '\'' +
                ", preview='" + preview + '\'' +
                ", slides='" + slides + '\'' +
                ", zooms='" + zooms + '\'' +
                ", self='" + self + '\'' +
                ", next='" + next + '\'' +
                ", render='" + render + '\'' +
                '}';
    }
}
