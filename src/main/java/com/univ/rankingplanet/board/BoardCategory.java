package com.univ.rankingplanet.board;

public enum BoardCategory {
    ED("전자제품"),
    CAR("자동차"),
    RETAURANT("음식"),
    TRIP("여행"),
    IDOL("아이돌");


    private final String displayName;

    BoardCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
