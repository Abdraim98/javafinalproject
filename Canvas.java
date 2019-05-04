import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Canvas extends JPanel {
    private Model model;
    private Image imagemario;
    private Image imageWall;
    private Image imageBox;
    private Image imagefinish;
    private Image imageGoal;
    Canvas(Model model){
        this.model = model;
        setBackground(Color.white);

        File fileNamemario= new File("image/mario.png");
        File fileNameWall = new File("image/Wall.png");
        File fileNameBox = new File("image/box.png");
        File fileNamefinish = new File("image/finish.png");
        File fileNameGoal = new File("image/Goal.png");
        try{
            imagemario = ImageIO.read(fileNamemario);
            imageWall = ImageIO.read(fileNameWall);
            imageBox = ImageIO.read(fileNameBox);
            imagefinish = ImageIO.read(fileNamefinish);
            imageGoal = ImageIO.read(fileNameGoal);
        }catch(IOException e){
            System.out.println(e);
        }

    }
    public void paint(Graphics pen) {
        super.paint(pen);

        if (model.startGame){
            drawDesktop(pen);
        } else {
            setFont(new java.awt.Font("Impact", java.awt.Font.PLAIN,30));
            pen.setColor(Color.lightGray);
            pen.drawString("INITIALIZATION ERROR!", 50 ,80);
        }
    }

    public void drawDesktop(Graphics pen){
      int x=30;
      int y=30;
      int width=30;
      int height=30;

      for (int i = 0; i < model.desktop.length; i++){
          for (int j = 0; j < model.desktop[i].length; j++){

              if (model.desktop[i][j]==5){
                  pen.drawImage(imageGoal, x, y, width, height, null);
//                  pen.setColor(Color.white);
  //                pen.drawRect(x, y, width, height);
              }
              if (model.desktop[i][j]==4){
                  pen.drawImage(imagefinish, x, y, width, height, null);
//                  pen.setColor(Color.white);
  //                pen.drawRect(x, y, width, height);
              }

              if (model.desktop[i][j]==3){
                  pen.drawImage(imageBox, x, y, width, height, null);
    //              pen.setColor(Color.white);
      //            pen.drawRect(x, y, width, height);
              }
              if (model.desktop[i][j]==2){
                  pen.drawImage(imageWall, x, y, width, height, null);
     //             pen.setColor(Color.white);
       //           pen.drawRect(x, y, width, height);
              }
              if (model.desktop[i][j]==1) {
                  pen.setColor(Color.white);
                  pen.drawRect(x, y, width, height);
                  pen.drawImage(imagemario, x, y, width, height, null);
           //   } else {
           //           pen.setColor(Color.white);
            //          pen.drawRect(x, y, width, height);
              }
              x = x + width;

          }

          y = y + height;

          x = 30;
      }


  }
}