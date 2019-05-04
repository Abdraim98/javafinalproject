class Model {
    private Viewer viewer;
    int[][] desktop;
    int indexX;
    int indexY;
    int[][] arrayGoal;
    boolean startGame;
    private Levels levels;
   
    Model(Viewer viewer) {
        this.viewer = viewer;
        loadNewLevel();
     
    }                   
        public void initialization() {
        startGame = true;
        int one = 0;
        int threeCounter = 0;
        int fiveCounter = 0;

        for (int i = 0; i < desktop.length; i++) {
            for (int j = 0; j < desktop[i].length; j++) {
                if (desktop[i][j] == 1) {
                    one++;
                    indexX = i;
                    indexY = j;
                }
                if (desktop[i][j] == 3) {
                    threeCounter++;
                }
                if (desktop[i][j] == 5) {
                    fiveCounter++;
                }
            }
        }
        if ((one != 1) | (threeCounter == 0 | fiveCounter == 0) | (threeCounter != fiveCounter)) {
            startGame = false;
        }
        arrayForCheck();
    }
    

    public void arrayForCheck() {
       int counterGoal = 0;
       for(int i = 0; i < desktop.length; i++) {
          for(int j = 0; j < desktop[i].length; j++) {
               if(desktop[i][j] == 5) {
                       counterGoal++;
               }
          }
      }
      arrayGoal = new int[2][counterGoal];
      int a = 0;
      for(int i = 0; i < desktop.length; i++) {
          for(int j = 0; j < desktop[i].length; j++) {
                if (desktop[i][j] == 5) {
                    arrayGoal[0][a] = i;
                    arrayGoal[1][a] = j;
                    a++;
                 }
            }
        }
    }

    public void move(String direction) {
        if(direction.equals("Left")) {
                moveLeft();
        } else if(direction.equals("Up")) { 
                moveUp();
        } else if(direction.equals("Right")) {
                moveRight();
        } else if(direction.equals("Down")) {
                moveDown();
        }
        check();
        viewer.update();
        won();
    }
    public void check() {
        for (int j = 0; j < arrayGoal[0].length; j++) {
            int x = arrayGoal[0][j];
            int y = arrayGoal[1][j];
            if (desktop[x][y] == 0) {
                desktop[x][y] = 5;       
            }
        }
    }


        private void moveLeft () {
            if (desktop[indexX][indexY-1]==3 & desktop[indexX][indexY - 2]==0){
                desktop[indexX][indexY - 1] = 0;
                desktop[indexX][indexY - 2] = 3;
              
            }
            if (desktop[indexX][indexY-1]==3 & desktop[indexX][indexY - 2] == 5){
                desktop[indexX][indexY - 1] = 0;
                desktop[indexX][indexY - 2] = 4;
                
            }
            if(desktop[indexX][indexY-1]==4){
                if (desktop[indexX][indexY - 2] == 5){
                    desktop[indexX][indexY - 1] = 0;
                    desktop[indexX][indexY - 2] = 4;
                }
            }
            if (desktop[indexX][indexY-1]==0|desktop[indexX][indexY-1]==5){
                desktop[indexX][indexY] = 0;
                indexY = indexY - 1;
                desktop[indexX][indexY] = 1;
            }
    
             }
        private void moveUp () {
            if (desktop[indexX - 1][indexY]==3 & desktop[indexX - 2][indexY]==0){
                    desktop[indexX - 1][indexY] = 0;
                    desktop[indexX - 2][indexY] = 3;
            

            }
            if (desktop[indexX - 1][indexY]==3 & desktop[indexX - 2][indexY]==5){
                desktop[indexX - 1][indexY] = 0;
                desktop[indexX - 2][indexY] = 4;
            }
            if (desktop[indexX - 1][indexY]==4){
                if (desktop[indexX - 2][indexY] == 5){
                    desktop[indexX - 1][indexY] = 0;
                    desktop[indexX - 2][indexY] = 4;
                }
            }
            if (desktop[indexX - 1][indexY]==0|desktop[indexX - 1][indexY]==5) {
                desktop[indexX][indexY] = 0;
                indexX = indexX - 1;
                desktop[indexX][indexY] = 1;
            }
        
            }
        private void moveRight () {

            if (desktop[indexX][indexY+1]==3 &desktop[indexX][indexY + 2]==0){
                    desktop[indexX][indexY + 1] = 0;
                    desktop[indexX][indexY + 2] = 3;
               
            }
            if (desktop[indexX][indexY+1]==3 &desktop[indexX][indexY + 2]==5){
                desktop[indexX][indexY + 1] = 0;
                desktop[indexX][indexY + 2] = 4;
            }
            if (desktop[indexX][indexY+1]==4){
                if (desktop[indexX][indexY + 2] == 5){
                    desktop[indexX][indexY + 1] = 0;
                    desktop[indexX][indexY + 2] = 4;
                }
            }
            if (desktop[indexX][indexY + 1]==0 |desktop[indexX][indexY + 1]==5){
                desktop[indexX][indexY] = 0;
                indexY = indexY + 1;
                desktop[indexX][indexY] = 1;
             }
        }

        private void moveDown () {

            if (desktop[indexX+1][indexY]==3 & desktop[indexX+2][indexY]==0){
                   desktop[indexX+1][indexY ] = 0;
                   desktop[indexX+2][indexY] = 3;
               
            }
            if (desktop[indexX+1][indexY]==3 & desktop[indexX+2][indexY]==5){
                desktop[indexX+1][indexY ] = 0;
                desktop[indexX+2][indexY] = 4;
            }
            if (desktop[indexX + 1][indexY]==4){
                if (desktop[indexX + 2][indexY] == 5){
                    desktop[indexX + 1][indexY] = 0;
                    desktop[indexX + 2][indexY] = 4;
               } 
            }
            if (desktop[indexX+1][indexY]==0|desktop[indexX+1][indexY]==5) {
                desktop[indexX][indexY] = 0;
                indexX = indexX + 1;
                desktop[indexX][indexY] = 1;
                }
            }

          public void won() {
            boolean flag = true;
            for(int j = 0; j < arrayGoal[0].length; j++) {
                    int x = arrayGoal[0][j];
                    int y = arrayGoal[1][j];
                    if(desktop[x][y] != 4) {
                            flag = false; 
                            break;
                    }
            }

            
            if(flag) {
                   javax.swing.JOptionPane.showMessageDialog(
                           new javax.swing.JFrame(), "You won!");
                   viewer.update();
                   loadNewLevel();
                  
            }
      }
      private void loadNewLevel() {
          if(levels == null) {
                  levels = new Levels();
          }
          desktop = levels.nextLevel();
          initialization();


    }
}

          





