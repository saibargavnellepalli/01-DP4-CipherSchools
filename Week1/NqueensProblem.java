package Week1;

import java.util.*;

public class NqueensProblem {
    public static void main(String[] args) {
        List<List<String>> ans = solveNQueens(3);
        System.out.println(ans);
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ansList = new ArrayList<>();
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }

        dfs(0,board,ansList,n);

        return ansList;

    }

    public static void dfs(int col, char[][] board, List<List<String>> ansList, int n){
        if(col==n){
            // new n*n and copy current into it
            List<String> inner = new ArrayList<>();
            for(int i=0;i<n;i++){
                String str = new String();
                for(int j=0;j<n;j++){
                    str += board[i][j];
                }
                inner.add(str);

            }
            ansList.add(inner);
            return;

        }

        for(int row=0;row<n;row++){
            if(isSafe(board,row,col,n)){
                board[row][col] = 'Q';
                dfs(col+1,board,ansList,n);
                board[row][col] = '.';
            }
        }

    }

    public static boolean isSafe(char[][] board, int row, int col, int n){
        //left straight
        int dupCol = col;
        while(dupCol >= 0){
            if(board[row][dupCol]=='Q') return false;
            dupCol--;
        }

        //left up
        dupCol = col;
        int dupRow = row;
        while(dupCol>=0 && dupRow >=0){
            if(board[dupRow][dupCol]=='Q') return false;
            dupRow--;
            dupCol--;
        }

        //right down
        dupCol = col;
        dupRow = row;
        while(dupCol>=0 && dupRow <=n-1){
            if(board[dupRow][dupCol]=='Q') return false;
            dupRow++;
            dupCol--;
        }


        return true;




    }
}
