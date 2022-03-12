package com.example.retrofit;

public class Todo {

//    private int id;
//    private int userId;
//    private String title;
//    private boolean completed;
//
//    public Todo(int id, int userId, String title, boolean completed) {
//        this.id = id;
//        this.userId = userId;
//        this.title = title;
//        this.completed = completed;
//    }
//
//    public Todo(int userId, String title, boolean completed) {
//        this.userId = userId;
//        this.title = title;
//        this.completed = completed;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public boolean isCompleted() {
//        return completed;
//    }
//
//    public void setCompleted(boolean completed) {
//        this.completed = completed;
//    }
//
//    @Override
//    public String toString() {
//        return "Todo{" +
//                "id=" + id +
//                ", userId=" + userId +
//                ", title='" + title + '\'' +
//                ", completed=" + completed +
//                '}';
//    }



    private String success;
    private int qid;
    public Todo(String success, int qid) {
        this.success = success;
        this.qid = qid;
    }
    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "qid=" + qid +
                ", success=" + success;
    }

}
