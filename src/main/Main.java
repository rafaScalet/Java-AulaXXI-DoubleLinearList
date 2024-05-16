package main;

import java.util.Scanner;

import eddll.DoubleLinearList;
import eddll.Node;

public class Main {
    public static void main(String[] args) {
        DoubleLinearList list = new DoubleLinearList();

        Scanner in = new Scanner(System.in);

        int id = 0;

        while (id >= 0) {
            System.out.print("informations: ");
            id = in.nextInt();

            if (id < 0) {
                break;
            }

            list.add(new Node(id + "", new Integer(id)));
        }

        System.out.print("Search id: ");
        id = in.nextInt();

        in.close();

        Node nodeRet = list.search(id + "");
        String sret = ((nodeRet == null) ? "*NULL*" : nodeRet.getId() + " - " + nodeRet.getValue().toString());
        System.out.println("Retorno -> " + sret);

        list.show();
    }
}
