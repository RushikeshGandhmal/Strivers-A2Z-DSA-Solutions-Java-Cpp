
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class Solution {

    public static void createTree(Node root0, ArrayList<Integer> v) {

        Queue<Node> q = new LinkedList<>();

        q.add(root0);

        int iterator = 1;

        int length = v.size();

        while (iterator < length) {

            Node temp = q.poll();

            Node leftNode = new Node(v.get(iterator));

            temp.left = leftNode;

            q.add(leftNode);

            iterator++;

            Node rightNode = new Node(v.get(iterator));

            temp.right = rightNode;

            q.add(rightNode);

            iterator++;

        }

    }
}