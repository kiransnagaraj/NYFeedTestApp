package com.mauqah.nyfeedtestapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The type Media.
 */
public class Media {

    private String type;
    private String subtype;
    private String caption;
    private String copyright;
    private long approvedForSyndication;
    @SerializedName("media-metadata")
    private List<MediaMetaData> mediaMetadata;

    /**
     * Instantiates a new Media.
     *
     * @param type                   the type
     * @param subtype                the subtype
     * @param caption                the caption
     * @param copyright              the copyright
     * @param approvedForSyndication the approved for syndication
     * @param mediaMetadata          the media metadata
     */
    public Media(String type, String subtype, String caption, String copyright, long approvedForSyndication, List<MediaMetaData> mediaMetadata) {
        this.type = type;
        this.subtype = subtype;
        this.caption = caption;
        this.copyright = copyright;
        this.approvedForSyndication = approvedForSyndication;
        this.mediaMetadata = mediaMetadata;
    }

    /**
     * Instantiates a new Media.
     */
    public Media() {
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets subtype.
     *
     * @return the subtype
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     * Sets subtype.
     *
     * @param subtype the subtype
     */
    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    /**
     * Gets caption.
     *
     * @return the caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets caption.
     *
     * @param caption the caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * Gets copyright.
     *
     * @return the copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets copyright.
     *
     * @param copyright the copyright
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * Gets approved for syndication.
     *
     * @return the approved for syndication
     */
    public long getApprovedForSyndication() {
        return approvedForSyndication;
    }

    /**
     * Sets approved for syndication.
     *
     * @param approvedForSyndication the approved for syndication
     */
    public void setApprovedForSyndication(long approvedForSyndication) {
        this.approvedForSyndication = approvedForSyndication;
    }

    /**
     * Gets media metadata.
     *
     * @return the media metadata
     */
    public List<MediaMetaData> getMediaMetadata() {
        return mediaMetadata;
    }

    /**
     * Sets media metadata.
     *
     * @param mediaMetadata the media metadata
     */
    public void setMediaMetadata(List<MediaMetaData> mediaMetadata) {
        this.mediaMetadata = mediaMetadata;
    }


}
