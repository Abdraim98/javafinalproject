public class Levels {
    private int level;
    Levels() {
        level = 1;
    }
    public int[][] nextLevel() {
        int[][] newDesktop = null;
        switch(level) {
               case 1:
                      newDesktop = firstLevel();
               break;
               case 2:
                      newDesktop = secondLevel();
               break;
               case 3:
                      newDesktop = thirdLevel();
               break;
               default:
                      newDesktop = firstLevel();
                      break;
               case 4:
                newDesktop = levelFromFile();
                javax.swing.JOptionPane.showMessageDialog(
                new javax.swing.JFrame(), "You winner!");
//                level = 0;

        }
        level++;
        return newDesktop;
    }
    private int[][] firstLevel() {
        int[][] desktop = new int[][]
                         {
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1, 2, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 2, 2, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 3, 2, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 3, 0, 2, 0, 0, 0},
                         {0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 2, 0, 2, 2, 2, 0}, 
                         {0, 0, 2, 5, 5, 0, 0, 0, 0, 2, 2, 0, 3, 0, 0, 0, 0, 0, 2, 0},
                         {0, 0, 2, 2, 5, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 2, 0},
                         {0, 0, 2, 5, 5, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0},
                         {0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                         };      

        return desktop;

    }

    private int[][] secondLevel() {
        int[][] desktop = new int[][]
                         {
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1, 2, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 3, 0, 0, 2, 2, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 5, 0, 2, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 2, 0, 0, 0},
                         {0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 2, 0, 2, 2, 2, 0}, 
                         };
       return desktop;

    }                      

    private int[][] thirdLevel() {
        int[][] desktop = new int[][]
                         {
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1, 2, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 3, 0, 0, 2, 2, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 2, 0, 0, 0},
                         {0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 2, 0, 2, 2, 2, 0}, 
                         };
        return desktop;
    }

    private int[][] levelFromFile() {


        ReadLevelFromFile readLevelFromFile = new ReadLevelFromFile();
        String text = readLevelFromFile.read("levels.txt");

        StringToArray stringToArray = new StringToArray();
        int[][] desktop = stringToArray.parseToArray(text);
        for (int i = 0; i < desktop.length; i++) {
            for (int j = 0; j < desktop[i].length; j++) {
            }
        }
        return desktop;
    }
}