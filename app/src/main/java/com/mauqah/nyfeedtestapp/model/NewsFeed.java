package com.mauqah.nyfeedtestapp.model;

import java.util.List;

/**
 * The type News feed.
 */
public class NewsFeed {

    private String status;
    private String copyright;
    private String num_results;
    private List<Result> results;

    /**
     * Instantiates a new News feed.
     */
    public NewsFeed() {
    }

    /**
     * Instantiates a new News feed.
     *
     * @param status      the status
     * @param copyright   the copyright
     * @param num_results the num results
     * @param results     the results
     */
    public NewsFeed(String status, String copyright, String num_results, List<Result> results) {
        this.status = status;
        this.copyright = copyright;
        this.num_results = num_results;
        this.results = results;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
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
     * Gets num results.
     *
     * @return the num results
     */
    public String getNum_results() {
        return num_results;
    }

    /**
     * Sets num results.
     *
     * @param num_results the num results
     */
    public void setNum_results(String num_results) {
        this.num_results = num_results;
    }

    /**
     * Gets results.
     *
     * @return the results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     * Sets results.
     *
     * @param results the results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }



}
