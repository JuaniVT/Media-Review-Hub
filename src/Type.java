public enum Type {
    VIDEOGAME("videogame"),
    BOOK("book"),
    COMIC("comic");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
