package com.chain.bottle.model;

public class BottleModel {
	private final long id;
    private final String content;

    public BottleModel(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
