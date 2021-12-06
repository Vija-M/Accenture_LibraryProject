package com.libraryproject.LibraryProject.Domain;

public class Books {

    private int id;
    private String title;
    public int authorID;
    private String url;
    private Availability availability;

    public Books() {
    }

    public Books(int id, String title, int authorID, String url, Availability availability) {
        this.id = id;
        this.title = title;
        this.authorID = authorID;
        this.url = url;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }
}
