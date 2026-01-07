package model;

import movable.Movable;
import position.Position;

public class Actor implements Movable {

    private Position position;

    @Override
    public Position getPosition() { return this.position; }
    @Override
    public void setPosition(Position position) { this.position = position; }
    
}
