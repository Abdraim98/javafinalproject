public class StringToArray {
    public int[][] parseToArray(String value){
        int row = 1;
        int column = 0;

        for (int i = 0; i<value.length();i++){
            char symbol = value.charAt(i);
            if (symbol == '\n') {
                row++;
            }
        }
        int[][] newDesktop = new int[row][5];
        int y = 0;
        for (int i = 0; i<value.length();i++){
            char symbol = value.charAt(i);
            if ('0' <= symbol && symbol <= '9'){
                column++;
            }
            if (symbol == '\n') {
                newDesktop[y] = new int[column];
                y++;
                column = 0;
            }
        }
        newDesktop[y] = new int[column];
        int a = 0;
        int b = 0;
        for (int i = 0; i < value.length(); i++){
            char symbol = value.charAt(i);
            if ('0' <= symbol && symbol <= '9'){
                newDesktop[a][b] = Integer.parseInt(""+symbol);
                b++;
            }
            if (symbol == '\n'){
                a++;
                b = 0;
            }
        }
        return newDesktop;
    }
}
