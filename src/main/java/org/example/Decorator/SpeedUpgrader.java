package org.example.Decorator;

public class SpeedUpgrader implements Upgrade{
    private Character hero;

    public SpeedUpgrader(Character hero){
        this.hero= hero;
    }

    @Override
    public void attack() {

    }

    @Override
    public void takeDamage(Integer damage) {
        this.hero.takeDamage(damage);
    }

    @Override
    public void move() {
        this.hero.move();
    }

    @Override
    public void jump() {
        this.hero.move();
    }

    @Override
    public Integer getHealth() {
        return this.hero.getHealth();
    }

    @Override
    public Integer getSpeed() {
        return this.hero.getSpeed()+2;
    }

    @Override
    public Integer getJumpHeight() {
        return this.hero.getJumpHeight();
    }
}
