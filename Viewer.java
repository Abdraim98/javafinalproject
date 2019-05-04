import javax.swing.JFrame;

class Viewer {
    private Canvas canvas;
    Viewer() {
        Controller controller = new Controller(this);
        Model model = controller.getModel();
        canvas = new Canvas(model);
        JFrame frame = new JFrame("Sokoban");
        frame.setSize(1000, 700);
        frame.add(canvas);
        frame.setLocation(30, 30);
        frame.setVisible(true);
        frame.addKeyListener(controller);
    }

    public void update() {
        canvas.repaint();
    }
}