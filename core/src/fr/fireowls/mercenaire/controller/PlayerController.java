package fr.fireowls.mercenaire.controller;

import fr.fireowls.apigame.entity.Player;
import fr.fireowls.apigame.entity.type.movable.Direction;

public class PlayerController extends Controller {

    private Player player;

    public PlayerController(Player player) {
        this.player = player;
    }

    @Override
    public void handler(ControllerStatus status) {
        if (status.isUp()) {
            if (status.isLeft()) {
                player.move(Direction.NORTH_WEST);
                return;
            } else if (status.isRight()) {
                player.move(Direction.NORTH_EST);
                return;
            }
            player.move(Direction.NORTH);
        } else if (status.isDown()) {
            if (status.isLeft()) {
                player.move(Direction.SOUTH_WEST);
                return;
            } else if (status.isRight()) {
                player.move(Direction.SOUTH_EST);
                return;
            }
            player.move(Direction.SOUTH);
        } else if (status.isLeft()) {
            player.move(Direction.WEST);
        } else if (status.isRight()) {
            player.move(Direction.EST);
        } else {
            player.move(Direction.STATIC);
        }
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
