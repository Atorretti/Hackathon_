package org.academiadecodigo.countrydream.persistence.model;

public enum Result {
    IMAGE_1(Messages.IMAGE_1, Messages.COWBOY_WHIP, Messages.COWBOY_WHIP_TEXT),
    IMAGE_2(Messages.IMAGE_2, Messages.BOTTLE_OF_SPIT_AND_SWEAT, Messages.BOTTLE_OF_SPIT_AND_SWEAT_TEXT),
    IMAGE_3(Messages.IMAGE_3, Messages.COWBOY_HAT, Messages.COWBOY_HAT_TEXT),
    IMAGE_4(Messages.IMAGE_4, Messages.RED_EYED_COW, Messages.RED_EYED_COW_TEXT),
    IMAGE_5(Messages.IMAGE_5, Messages.CHEWING_TOBACCO, Messages.CHEWING_TOBACCO_TEXT),
    IMAGE_6(Messages.IMAGE_6, Messages.JHONNY_CASH_GUITAR, Messages.JHONNY_CASH_GUITAR_TEXT),
    IMAGE_7(Messages.IMAGE_7, Messages.HORSE_RIDE_IN_THE_SKY, Messages.HORSE_RIDE_IN_THE_SKY_TEXT),
    IMAGE_8(Messages.IMAGE_8, Messages.GHOST_RIDERS_RETREAT, Messages.GHOST_RIDERS_RETREAT_TEXT),
    IMAGE_9(Messages.IMAGE_9, Messages.JOHNNY_CASH_CD, Messages.JOHNNY_CASH_CD_TEXT),
    IMAGE_10(Messages.IMAGE_10, Messages.MAN_IN_WHITE_BOOK, Messages.MAN_IN_WHITE_BOOK_TEXT);

    private String image;
    private String title;
    private String text;

    Result(String image, String title, String text) {
        this.image = image;
        this.title = title;
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Result{" +
                "image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
