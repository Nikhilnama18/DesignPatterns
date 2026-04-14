package org.example.Decorator;

public interface Character {
    public void attack();
    public void takeDamage(Integer damage);
    public void move();
    public void jump();

    public Integer getHealth();
    public Integer getSpeed();
    public Integer getJumpHeight();
}
