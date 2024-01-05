import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
    private static final int playerVelocity = 2;
    private final Handler handler;

    public KeyInput(Handler handler){
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        for(GameObject gameObject : handler.object){
            if (gameObject.getId() == ID.Player){
                // We will be doing the Player things here.

                if(key == KeyEvent.VK_W){
                    gameObject.setVelY(-playerVelocity);
                }
                else if(key == KeyEvent.VK_S){
                    gameObject.setVelY(playerVelocity);
                }
            }
        }
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();

        for(GameObject gameObject : handler.object){
            if (gameObject.getId() == ID.Player){
                // We will be doing the Player things here.

                if(key == KeyEvent.VK_W){
                    gameObject.setVelY(0);
                }
                else if(key == KeyEvent.VK_S){
                    gameObject.setVelY(0);
                }
            }
        }
    }

}
