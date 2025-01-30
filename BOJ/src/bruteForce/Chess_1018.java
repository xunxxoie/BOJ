package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chess_1018 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" "); // M과 N 입력받기

        int M = Integer.parseInt(size[0]); // M 저장
        int N = Integer.parseInt(size[1]); // N 저장

        // M X N 사이즈의 보드판 저장
        char[][] board = new char[M][N];
        for(int i = 0; i < M; i++){
            String line = br.readLine();
            for(int j  = 0; j < N; j++){
                board[i][j] = line.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;

        // (M - 7) X (N - 7) 번 검사(getRepaintMin)를 수행
        for(int i = 0; i < M - 7; i++){
            for(int j = 0; j < N - 7; j++){
                int repaintCount =  getRepaintMin(board,i,j);
                min = Math.min(min, repaintCount);
            }
        }

        System.out.println(min);
    }

    private static int getRepaintMin(char[][] board, int xPos, int yPos){
        int count1 = 0; // 시작이 백인 경우의 다시 칠해야 하는 횟수
        int count2 = 0; // 시작이 흑인 경우의 다시 칠해야 하는 횟수

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0){ //(짝수, 짝수) 인 경우
                        if(board[xPos + i][yPos + j] == 'W') count2++;
                        if(board[xPos + i][yPos + j] == 'B') count1++;
                    }else{ //(짝수, 홀수) 인 경우
                        if(board[xPos + i][yPos + j] == 'W') count1++;
                        if(board[xPos + i][yPos + j] == 'B') count2++;
                    }
                }else{
                    if(j % 2 == 0){ //(홀수, 짝수) 인 경우
                        if(board[xPos + i][yPos + j] == 'W') count1++;
                        if(board[xPos + i][yPos + j] == 'B') count2++;
                    }else{ //(홀수, 홀수) 인 경우
                        if(board[xPos + i][yPos + j] == 'W') count2++;
                        if(board[xPos + i][yPos + j] == 'B') count1++;
                    }
                }
            }
        }
        return Math.min(count1, count2);
    }
}