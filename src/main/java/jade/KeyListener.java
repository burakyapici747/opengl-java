package jade;

import static org.lwjgl.glfw.GLFW.*;

public class KeyListener {

    private static KeyListener instance = null;
    private boolean keyPressed[] = new boolean[GLFW_KEY_LAST];

    public static KeyListener get(){
        if(KeyListener.instance == null){
            KeyListener.instance = new KeyListener();
        }

        return KeyListener.get();
    }

    public static void keyCallback(long window, int key, int scancode, int action, int mods){
        if(action == GLFW_PRESS){
            get().keyPressed[key] = true;
        }else if(action == GLFW_RELEASE){
            get().keyPressed[key] = false;
        }
    }

    public static boolean isKeyPressed(int keyCode){
        return get().keyPressed[keyCode];
    }
}
