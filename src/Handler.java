import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
    LinkedList<GameObject> object = new LinkedList<GameObject>();


    public void tick(){
        for (GameObject gameObject : object) {
            gameObject.tick();
        }
    }

    public void render(Graphics g){
        for (GameObject gameObject : object) {
            gameObject.render(g);
        }
    }

    public void addObject(GameObject object){
        this.object.add(object);
    }

    public void removeObject(GameObject object){
        this.object.remove(object);
    }

}
