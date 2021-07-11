package com.sidorchukandrew.pcoapi.models;

public class CreateZoomRequest implements CreateRequest {
    private Double aspectRatio;
    private Double zoomLevel;
    private Double xOffset;
    private Double yOffset;

    private CreateZoomRequest() { }

    private CreateZoomRequest(Builder builder) {
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

        public CreateZoomRequest build() {
            return new CreateZoomRequest(this);
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
    public Zoom toResource() {
        ZoomAttributes attributes = new ZoomAttributes.Builder()
                .aspectRatio(aspectRatio)
                .xOffset(xOffset)
                .yOffset(yOffset)
                .zoomLevel(zoomLevel)
                .build();

        ZoomData data = new ZoomData.Builder()
                .attributes(attributes)
                .build();

        Zoom zoom = new Zoom.Builder()
                .data(data)
                .build();

        return zoom;
    }

    @Override
    public String toString() {
        return "CreateZoomRequest{" +
                "aspectRatio=" + aspectRatio +
                ", zoomLevel=" + zoomLevel +
                ", xOffset=" + xOffset +
                ", yOffset=" + yOffset +
                '}';
    }
}
