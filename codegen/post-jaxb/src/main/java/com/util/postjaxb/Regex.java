package com.util.postjaxb;

public class Regex {
    private String filePath; // glob or regex for file matching
    private String regex;       // regex pattern to find
    private String replacement; // what to replace with

    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public String getRegex() {
        return regex;
    }
    public void setRegex(String regex) {
        this.regex = regex;
    }
    public String getReplacement() {
        return replacement;
    }
    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }
}
