import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
class Controller implements KeyListener {
    private Model model;
    Controller(Viewer viewer) {
         model = new Model(viewer);
    }  
    public Model getModel() {
       return model;
    }
    public void keyTyped(KeyEvent event) {
    }
    public void keyReleased(KeyEvent event) {
    
    }
    public void keyPressed(KeyEvent event) {
        int keyCode = event.getKeyCode();
        String textMove = "";
        switch(keyCode) {
           case 37:
                textMove = "Left";
           break;
           case 38:
                textMove = "Up";
           break;

           case 39:
                textMove = "Right";
           break;

           case 40:
                textMove = "Down";
           break;

        }
        model.move(textMove);

    }
}

