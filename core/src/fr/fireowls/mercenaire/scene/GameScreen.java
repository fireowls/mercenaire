package fr.fireowls.mercenaire.scene;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import fr.fireowls.apigame.entity.Player;
import fr.fireowls.apigame.entity.type.EntityType;
import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.generator.WorldCreator;
import fr.fireowls.mercenaire.controller.PlayerController;

public class GameScreen extends Screen {

    World world;
    Camera camera;
    Viewport viewport;
    Player player;

    @Override
    protected void onCreate() {
        world = new WorldCreator("test").generate();
        player = new Player(world.spawnEntity(EntityType.HUMAN, new Location(world, 5, 5)));
        PlayerController controller = new PlayerController(player);
        Gdx.input.setInputProcessor(controller);
        camera = new OrthographicCamera();
        viewport = new FitViewport(800, 480, camera);
    }

    @Override
    protected void onUpdate(float delta) {
        viewport.apply();
        world.update(delta);
        camera.position.x = player.getLocation().getDrawingX();
        camera.position.y = player.getLocation().getDrawingY();
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        world.draw(batch);
    }

    @Override
    protected void onPause() {
        world.pause();
    }

    @Override
    protected void onResume() {
        world.resume();
    }

    @Override
    protected void onDispose() {
        world.dispose();
    }

}
