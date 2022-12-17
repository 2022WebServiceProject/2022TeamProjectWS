package com.mycompany.myapp.board;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BoardVO {
    private int seq;
    private String title;
    private String writer;
    private String content;

    private String category;
    private LocalDateTime regDate;

    private LocalDate date;
    private int cnt;
    private String alarm;

    public String getCategory(){
        return category;
    }
    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public int getSeq() {
        return seq;
    }
    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }
    
    public void setAlarm(String alarm){
        this.alarm = alarm;
    }
    public String getAlarm() {
        return alarm;
    }
}