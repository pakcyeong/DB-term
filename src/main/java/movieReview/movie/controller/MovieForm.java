package movieReview.movie.controller;

public class MovieForm {
    private String name;
    private String dname;
    private String actor;
    private Long rdate;
    private String genre;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDname() {
        return dname;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getActor() {
        return actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }

    public Long getRdate() {
        return rdate;
    }
    public void setRdate(Long rdate) {
        this.rdate = rdate;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

}
