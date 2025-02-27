package edu.ib.networktechnologies.controllers.dto.review;


public class CreateReviewDto {
    private long userId;
    private String rating;
    private String comment;

    public CreateReviewDto(long userId, String rating, String comment) {
        this.userId = userId;
        this.rating = rating;
        this.comment = comment;

    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
