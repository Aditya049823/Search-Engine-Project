package com.example.searchengine;

import java.sql.Timestamp;

public class HistoryResult {
    private String keyword;

    private Timestamp timestamp;

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    HistoryResult(String keyword,Timestamp time){
        this.keyword=keyword;
        this.timestamp=time;
    }

}
