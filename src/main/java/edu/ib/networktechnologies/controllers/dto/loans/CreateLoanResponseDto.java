package edu.ib.networktechnologies.controllers.dto.loans;

import java.sql.Date;

public class CreateLoanResponseDto {

    private Date loanDate;
    private Date dueDate;
    private long userId;
    private long bookId;

    public CreateLoanResponseDto(Date loanDate, Date dueDate, long userId, long bookId) {
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.userId = userId;
        this.bookId = bookId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getUserId() {
        return userId;
    }

    public long getBookId() {
        return bookId;
    }


    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }
}
