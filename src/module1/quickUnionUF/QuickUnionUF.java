package module1.quickUnionUF;

import java.util.Arrays;

public class QuickUnionUF {
    public int[] id;

    public QuickUnionUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // chase parent pointers until reach root
    private int root(int i){
        while(i != id[i]) {
            i = id[i];
        }
        return i;
    }

    // check if p and q have same root
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    // change root of p to point to root of q
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

}
