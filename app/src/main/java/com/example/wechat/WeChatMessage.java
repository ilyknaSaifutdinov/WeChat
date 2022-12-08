package com.example.wechat;

public class WeChatMessage {

    private String name;
    private String sender;
    private String recipient;
    private String text;
    private String imageUrl;
    private boolean isMine;

    public WeChatMessage() {
    }

    public WeChatMessage(String name, String sender, String recipient,
                         String text, String imageUrl, boolean isMine) {
        this.name = name;
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.imageUrl = imageUrl;
        this.isMine = isMine;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
