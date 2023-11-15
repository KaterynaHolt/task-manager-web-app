package com.taskmanager.app.taskmanagerwebapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasks")
public class Task {
    @Id
    private String id;
    @Column(name="text")
    private String text;
    @Column(name="date")
    private String date;
    @Column(name="status")
    private String status;
    @Column(name="priority")
    private String priority;
    @Column(name="tag")
    private String tag;

    public Task(){

    }

    public Task(String text, String date, String status, String priority, String tag) {
        this.text = text;
        this.date = date;
        this.status = status;
        this.priority = priority;
        this.tag = tag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
