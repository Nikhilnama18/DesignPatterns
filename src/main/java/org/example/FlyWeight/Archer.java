package org.example.FlyWeight;

public class Archer {
    private ArcherFlyWeight flyWeight;
    private String xPos;
    private String yPos;
    private Integer health;

    public Archer(ArcherFlyWeight flyWeight, String xPos, String yPos){
        this.flyWeight = flyWeight;
        this.xPos = xPos;
        this.yPos = yPos;
        this.health = 100;
    }

    public Integer getHealth() {
        return health;
    }

    public String getyPos() {
        return yPos;
    }

    public String getxPos() {
        return xPos;
    }
}
