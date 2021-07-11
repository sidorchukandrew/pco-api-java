package com.sidorchukandrew.pcoapi.models;

public class UpdateZoomRequest implements UpdateRequest {
    private Double zoomLevel;
    private Double xOffset;
    private Double yOffset;

    private UpdateZoomRequest() { }

    private UpdateZoomRequest(Builder builder) {
        zoomLevel = builder.zoomLevel;
        xOffset = builder.xOffset;
        yOffset = builder.yOffset;
    }

    public static class Builder {
        private Double zoomLevel;
        private Double xOffset;
        private Double yOffset;

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

        public UpdateZoomRequest build() {
            return new UpdateZoomRequest(this);
        }
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
                ", zoomLevel=" + zoomLevel +
                ", xOffset=" + xOffset +
                ", yOffset=" + yOffset +
                '}';
    }
}
