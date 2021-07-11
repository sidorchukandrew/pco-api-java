package com.sidorchukandrew.pcoapi.models;

public class ZoomAttributes implements Attributes {
    private Double aspectRatio;
    private Double zoomLevel;
    private Double xOffset;
    private Double yOffset;

    private ZoomAttributes() { }

    private ZoomAttributes(Builder builder) {
        aspectRatio = builder.aspectRatio;
        zoomLevel = builder.zoomLevel;
        xOffset = builder.xOffset;
        yOffset = builder.yOffset;
    }

    public static class Builder {
        private Double aspectRatio;
        private Double zoomLevel;
        private Double xOffset;
        private Double yOffset;

        public Builder aspectRatio(Double aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }

        public Builder zoomLevel(Double zoomLevel) {
            this.zoomLevel = zoomLevel;
            return this;
        }

        public Builder xOffset(Double xOffset) {
            this.xOffset = xOffset;
            return this;
        }

        public Builder yOffset(Double yOffset) {
            this.yOffset = yOffset;
            return this;
        }

        public ZoomAttributes build() {
            return new ZoomAttributes(this);
        }
    }

    public Double getAspectRatio() {
        return aspectRatio;
    }

    public Double getZoomLevel() {
        return zoomLevel;
    }

    public Double getxOffset() {
        return xOffset;
    }

    public Double getyOffset() {
        return yOffset;
    }

    @Override
    public String toString() {
        return "ZoomAttributes{" +
                "aspectRatio=" + aspectRatio +
                ", zoomLevel=" + zoomLevel +
                ", xOffset=" + xOffset +
                ", yOffset=" + yOffset +
                '}';
    }
}
