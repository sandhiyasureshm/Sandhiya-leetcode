public class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null || word.length() == 0) {
            return false;
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean dfs(char[][] board, String word, int index, int i, int j) {
       
        if (index == word.length()) {
            return true;
        }
        
       
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        
       
        char temp = board[i][j];
        board[i][j] = '#'; // Mark as visited
        
        
        boolean found = dfs(board, word, index + 1, i + 1, j) ||
                        dfs(board, word, index + 1, i - 1, j) ||
                        dfs(board, word, index + 1, i, j + 1) ||
                        dfs(board, word, index + 1, i, j - 1);
        
        
        board[i][j] = temp;
        
        return found;
    }
}
