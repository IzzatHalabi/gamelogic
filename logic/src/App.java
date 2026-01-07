import model.Actor;
import position.Position;
import position.PositionPrinter;

public class App {
    public static void main(String[] args) throws Exception {

        Actor actor = new Actor();
        actor.setPosition(new Position(10, 20));
        actor.move(new Position(0, 30));

        PositionPrinter.print(actor);

    }
}
