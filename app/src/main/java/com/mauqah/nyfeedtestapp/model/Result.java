package com.mauqah.nyfeedtestapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The type Result.
 */
public class Result {

    private String url;
    private String adx_keywords;
    private String column;
    private String section;
    private String byline;
    private String type;
    private String title;
    @SerializedName("abstract")
    private String _abstract;
    private String published_date;
    private String source;
    private Long id;
    private Long asset_id;
    private Long views;
    private List<String> des_facet;
    private String orgFacet;
    private List<String> perFacet;
    private String geoFacet;
    private List<Media> media;

    /**
     * Instantiates a new Result.
     */
    public Result() {
    }

    /**
     * Instantiates a new Result.
     *
     * @param url            the url
     * @param adx_keywords   the adx keywords
     * @param column         the column
     * @param section        the section
     * @param byline         the byline
     * @param type           the type
     * @param title          the title
     * @param _abstract      the abstract
     * @param published_date the published date
     * @param source         the source
     * @param id             the id
     * @param asset_id       the asset id
     * @param views          the views
     * @param des_facet      the des facet
     * @param orgFacet       the org facet
     * @param perFacet       the per facet
     * @param geoFacet       the geo facet
     * @param media          the media
     */
    public Result(String url, String adx_keywords, String column, String section, String byline, String type, String title, String _abstract, String published_date, String source, Long id, Long asset_id, Long views, List<String> des_facet, String orgFacet, List<String> perFacet, String geoFacet, List<Media> media) {
        this.url = url;
        this.adx_keywords = adx_keywords;
        this.column = column;
        this.section = section;
        this.byline = byline;
        this.type = type;
        this.title = title;
        this._abstract = _abstract;
        this.published_date = published_date;
        this.source = source;
        this.id = id;
        this.asset_id = asset_id;
        this.views = views;
        this.des_facet = des_facet;
        this.orgFacet = orgFacet;
        this.perFacet = perFacet;
        this.geoFacet = geoFacet;
        this.media = media;
    }

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
     * Gets adx keywords.
     *
     * @return the adx keywords
     */
    public String getAdx_keywords() {
        return adx_keywords;
    }

    /**
     * Sets adx keywords.
     *
     * @param adx_keywords the adx keywords
     */
    public void setAdx_keywords(String adx_keywords) {
        this.adx_keywords = adx_keywords;
    }

    /**
     * Gets column.
     *
     * @return the column
     */
    public String getColumn() {
        return column;
    }

    /**
     * Sets column.
     *
     * @param column the column
     */
    public void setColumn(String column) {
        this.column = column;
    }

    /**
     * Gets section.
     *
     * @return the section
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets section.
     *
     * @param section the section
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * Gets byline.
     *
     * @return the byline
     */
    public String getByline() {
        return byline;
    }

    /**
     * Sets byline.
     *
     * @param byline the byline
     */
    public void setByline(String byline) {
        this.byline = byline;
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
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets abstract.
     *
     * @return the abstract
     */
    public String get_abstract() {
        return _abstract;
    }

    /**
     * Sets abstract.
     *
     * @param _abstract the abstract
     */
    public void set_abstract(String _abstract) {
        this._abstract = _abstract;
    }

    /**
     * Gets published date.
     *
     * @return the published date
     */
    public String getPublished_date() {
        return published_date;
    }

    /**
     * Sets published date.
     *
     * @param published_date the published date
     */
    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets asset id.
     *
     * @return the asset id
     */
    public Long getAsset_id() {
        return asset_id;
    }

    /**
     * Sets asset id.
     *
     * @param asset_id the asset id
     */
    public void setAsset_id(Long asset_id) {
        this.asset_id = asset_id;
    }

    /**
     * Gets views.
     *
     * @return the views
     */
    public Long getViews() {
        return views;
    }

    /**
     * Sets views.
     *
     * @param views the views
     */
    public void setViews(Long views) {
        this.views = views;
    }

    /**
     * Gets des facet.
     *
     * @return the des facet
     */
    public List<String> getDes_facet() {
        return des_facet;
    }

    /**
     * Sets des facet.
     *
     * @param des_facet the des facet
     */
    public void setDes_facet(List<String> des_facet) {
        this.des_facet = des_facet;
    }

    /**
     * Gets org facet.
     *
     * @return the org facet
     */
    public String getOrgFacet() {
        return orgFacet;
    }

    /**
     * Sets org facet.
     *
     * @param orgFacet the org facet
     */
    public void setOrgFacet(String orgFacet) {
        this.orgFacet = orgFacet;
    }

    /**
     * Gets per facet.
     *
     * @return the per facet
     */
    public List<String> getPerFacet() {
        return perFacet;
    }

    /**
     * Sets per facet.
     *
     * @param perFacet the per facet
     */
    public void setPerFacet(List<String> perFacet) {
        this.perFacet = perFacet;
    }

    /**
     * Gets geo facet.
     *
     * @return the geo facet
     */
    public String getGeoFacet() {
        return geoFacet;
    }

    /**
     * Sets geo facet.
     *
     * @param geoFacet the geo facet
     */
    public void setGeoFacet(String geoFacet) {
        this.geoFacet = geoFacet;
    }

    /**
     * Gets media.
     *
     * @return the media
     */
    public List<Media> getMedia() {
        return media;
    }

    /**
     * Sets media.
     *
     * @param media the media
     */
    public void setMedia(List<Media> media) {
        this.media = media;
    }
}
