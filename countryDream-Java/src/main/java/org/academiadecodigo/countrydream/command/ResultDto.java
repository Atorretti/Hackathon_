package org.academiadecodigo.countrydream.command;

public class ResultDto {

    private String image;
    private String title;
    private String text;

    public ResultDto(String image, String title, String text) {
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
}
