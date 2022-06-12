package cz.czechitas.ukol7.model;

public enum Barva {
    Bila("bílá"),
    Zluta("žlutá"),
    Cerna("černá"),
    Zelena("zelená"),
    Modra("modrá"),
    Cervena("červená");

    private final String barva;

    Barva(String barva) {
    this.barva = barva;
    }
    public String getBarva() {
        return barva;
    }
}
