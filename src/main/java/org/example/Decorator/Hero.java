package org.example.Decorator;

public class Hero implements Character{
    private Integer health;
    private Integer speed;
    private Integer jumpHeight;

    public Hero(){
        this.health = 100;
        this.speed = 1;
        this.jumpHeight = 5;
    }

    @Override
    public void attack() {

    }

    @Override
    public void takeDamage(Integer damage) {
        this.health = this.getHealth() -damage;
    }

    @Override
    public void move() {
    }

    @Override
    public void jump() {
    }

    @Override
    public Integer getHealth() {
        return this.health;
    }

    @Override
    public Integer getSpeed() {
        return this.speed;
    }

    @Override
    public Integer getJumpHeight() {
        return this.jumpHeight;
    }

}
