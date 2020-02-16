package com.mauqah.nyfeedtestapp.model;

/**
 * The type Media meta data.
 */
public class MediaMetaData {


    private String url;
    private String format;
    private long height;
    private long width;

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets format.
     *
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets format.
     *
     * @param format the format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public long getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(long height) {
        this.height = height;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public long getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(long width) {
        this.width = width;
    }


    /**
     * Instantiates a new Media meta data.
     *
     * @param url    the url
     * @param format the format
     * @param height the height
     * @param width  the width
     */
    public MediaMetaData(String url, String format, long height, long width) {
        this.url = url;
        this.format = format;
        this.height = height;
        this.width = width;
    }


    /**
     * Instantiates a new Media meta data.
     */
    public MediaMetaData() {
    }


}
