class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = board[0];
        int y = board[1];
        int max_x = x / 2;
        int max_y = y / 2;
        int[] pos = {0, 0};
        
        for (String key: keyinput) {
            if (key.equals("left")) {
                if (pos[0] - 1 >= -(max_x)) pos[0] -= 1;
            } else if (key.equals("right")) {
                if (pos[0] + 1 <= max_x) pos[0] += 1;
            } else if (key.equals("up")) {
                if (pos[1] + 1 <= max_y) pos[1] += 1;
            } else if (key.equals("down")) {
                if (pos[1] - 1 >= -(max_y)) pos[1] -= 1;
            }
        }
        return pos;
    }
}