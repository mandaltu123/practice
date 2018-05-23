package ds.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Java program to find minimum number of dice throw to reach from first cell to last cell of a given
 * snake and ladder board
 */
public class SnakeLadderProblem {

    static class QEntry {
        int v;      // vertex number
        int dist;   // distance from the source
    }

    /**
     * This function returns minimum number of dice throws to reach last cell from
     * 0th cell on a snake ladder board.move[] is an array of size N where N is the
     * total number of cells on the ladder board.
     * If there is no snake or ladder on the board, then move[i] is -1 otherwise
     * move[i] contains cell to which snake or ladder at i takes to.
     *
     * @param move
     * @param n
     * @return
     */
    public static int getMinDiceThrows(int[] move, int n) {

        int[] visited = new int[n];
        Queue<QEntry> queue = new LinkedList<>();
        QEntry qEntry = new QEntry();
        qEntry.v = 0;
        qEntry.dist = 0;

        // Mark the 0th node visited and enqueue it
        visited[0] = 1;
        queue.add(qEntry);

        // Do a BFS starting from vertex at index 0
        while (!queue.isEmpty()) {
            qEntry = queue.remove();
            int v = qEntry.v;
            // If from vertex is the destination, then we are done
            if (v == n - 1) {
                break;
            }
            // Otherwise dequeue the front vertex and
            // enqueue its adjacent vertices (or cell
            // numbers reachable through a dice throw)
            for (int j = v + 1; j <= (v + 6) && j < n; ++j) {
                // If the cell is not already visited
                if (visited[j] == 0) {
                    // calculate the distance and mark it visited
                    QEntry entry = new QEntry();
                    entry.dist = qEntry.dist + 1;
                    visited[j] = 1;

                    // Check if there a snake or ladder at 'j'
                    // then tail of snake or top of ladder
                    // become the adjacent of 'i'

                    if (move[j] != -1) {
                        entry.v = move[j];
                    } else {
                        entry.v = j;
                    }
                    queue.add(entry);
                }
            }
        }
        // We reach here when 'qe' has last vertex
        // return the distance of vertex in 'qe'
        return qEntry.dist;
    }


    public static void main(String[] args) {
        // Let us construct the board given in above diagram
        int N = 30;
        int moves[] = new int[N];
        for (int i = 0; i < N; i++)
            moves[i] = -1;

        // Ladders
        moves[2] = 21;
        moves[4] = 7;
        moves[10] = 25;
        moves[19] = 28;

        // Snakes
        moves[26] = 0;
        moves[20] = 8;
        moves[16] = 3;
        moves[18] = 6;

        System.out.println("Min Dice throws required is " +
                getMinDiceThrows(moves, N));
    }

}
