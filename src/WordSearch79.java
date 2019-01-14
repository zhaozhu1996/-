public class WordSearch79 {
    private static int[][] vector = {{0,1},{1,0},{0,-1},{-1,0}};
    private static boolean[][] isVisited ;
    private static boolean search(char[][] board,int index, String word,int startX,int startY){
        if(index==word.length()-1&&word.charAt(index)==board[startX][startY]&&!isVisited[startX][startY]){
            return true;
        }
        if(!isVisited[startX][startY]&&board[startX][startY]==word.charAt(index)){
            isVisited[startX][startY] = true;
            for (int i = 0; i < 4; i++) {
                int x = startX+vector[i][0];
                int y = startY+vector[i][1];
                if(x<board.length&&x>=0&&y<board[0].length&&y>=0){
                    if(search(board,index+1,word,x,y)){
                        return true;
                    }
                }
            }
            isVisited[startX][startY] = false;
        }
        return false;
    }
    public static boolean exist(char[][] board, String word) {
        isVisited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
               isVisited[i][j] = false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(search(board,0,word,i,j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*char[][] board = new char[][]  {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};*/
        char[][] board = new char[][]  {{'a','a'}};
        System.out.println(exist(board,"aaa"));
    }
}
