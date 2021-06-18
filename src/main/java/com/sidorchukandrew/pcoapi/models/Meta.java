package com.sidorchukandrew.pcoapi.models;

import java.util.Arrays;

public class Meta {
    private Integer totalCount;
    private Integer count;
    private String [] canOrderBy;
    private String [] canQueryBy;
    private Parent parent;
    private Next next;

    private Meta() { }

    private Meta(Builder builder) {
        totalCount = builder.totalCount;
        count = builder.count;
        canOrderBy = builder.canOrderBy;
        canQueryBy = builder.canQueryBy;
        parent = builder.parent;
        next = builder.next;
    }

    public static class Builder {
        private Integer totalCount;
        private Integer count;
        private String [] canOrderBy;
        private String [] canQueryBy;
        private Parent parent;
        private Next next;

        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        public Builder canOrderBy(String[] canOrderBy) {
            this.canOrderBy = canOrderBy;
            return this;
        }

        public Builder canQueryBy(String[] canQueryBy) {
            this.canQueryBy = canQueryBy;
            return this;
        }

        public Builder parent(Parent parent) {
            this.parent = parent;
            return this;
        }

        public Builder next(Next next) {
            this.next = next;
            return this;
        }

        public Meta build() {
            return new Meta(this);
        }
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public Integer getCount() {
        return count;
    }

    public String[] getCanOrderBy() {
        return canOrderBy;
    }

    public String[] getCanQueryBy() {
        return canQueryBy;
    }

    public Parent getParent() {
        return parent;
    }

    public Next getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "totalCount=" + totalCount +
                ", count=" + count +
                ", canOrderBy=" + Arrays.toString(canOrderBy) +
                ", canQueryBy=" + Arrays.toString(canQueryBy) +
                ", parent=" + parent +
                ", next=" + next +
                '}';
    }
}
