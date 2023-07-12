package Leetcode.Leetcode_Daily_Question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode207 {
    public static void main(String[] args) {
        int a[][] = {{1, 0},
                {0, 1}};
        int b = 2;
        System.out.println(canFinish(b,a));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
            ArrayList<Integer>[] preqmap = new ArrayList[numCourses];
            for (int i = 0; i < numCourses; i ++)
                preqmap[i] = new ArrayList<>();
            int[] preqnum = new int[numCourses];
            for (int[] prerequisite : prerequisites){
                preqmap[prerequisite[1]].add(prerequisite[0]);
                preqnum[prerequisite[0]] ++;
            }
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < preqnum.length; i++){
                if (preqnum[i] == 0)
                    queue.add(i);
            }
            int result = 0;

            while (queue.size()>0){
                int u = queue.poll();
                result ++;
                for (int v : preqmap[u]){
                    preqnum[v] --;
                    if (preqnum[v] == 0)
                        queue.add(v);
                }
            }
            return result == numCourses;
        }
    }