package com.find_sum_pair_bst.app;
import com.find_sum_pair_bst.model.*;


public class Main {
    public static void main(String[] args) {


        FindSumPairUsingBST findSumPair = new FindSumPairUsingBST();
        FindSumPairUsingBST.Node root = null;
        root = findSumPair.insert(root, 20);
        root = findSumPair.insert(root, 40);
        root = findSumPair.insert(root, 50);
        root = findSumPair.insert(root, 70);
        root = findSumPair.insert(root, 60);
        root = findSumPair.insert(root, 30);
        int sum = 130;
        findSumPair.findPairWithGivenSum((FindSumPairUsingBST.Node) root, sum);
    }
}
