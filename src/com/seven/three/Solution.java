package com.seven.three;

import java.io.InputStreamReader;

public class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode tmp=new ListNode(0);
        ListNode result=tmp;
        while(l1!=null && l2!=null) {
            if (l1.val > l2.val) {
                tmp.next = l2;
                l2 = l2.next;
            } else {
                tmp.next = l1;
                l1 = l1.next;
            }
            tmp = tmp.next;
        }
        if(l1!=null){
            tmp.next=l1;
        }
        if(l2!=null){
            tmp.next=l2;
        }
        return result.next;
    }


    public static void main(String[] args) {

    }
}




class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

