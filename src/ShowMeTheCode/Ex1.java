package ShowMeTheCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex1 {
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        int numOfMTown = Integer.parseInt(st.nextToken());
        int health = Integer.parseInt(st.nextToken());
        ArrayList<Town> listTown = new ArrayList<>();

        input = br.readLine();
        st = new StringTokenizer(input);

        for (int i = 0; i < numOfMTown; i++) {
            Town t = new Town();
            t.damage = Integer.parseInt(st.nextToken());
            listTown.add(t);
        }

        input = br.readLine();
        st = new StringTokenizer(input);

        for (int i = 0; i < numOfMTown; i++) {
            Town t= listTown.get(i);
            t.numOfPeople = Integer.parseInt(st.nextToken());
            listTown.set(i, t);
        }

        visitTown(health, 0, listTown);
        System.out.println(max);
    }

    public static void visitTown(int health, int savePeople, ArrayList<Town> listTown) {
        for(int i = 0; i< listTown.size(); i++){
            Town t = listTown.get(i);
            if(t.damage <= health){
                ArrayList<Town> newListTown = listTown;
                int newHealth = health;
                int newSavePeople = savePeople;
                newSavePeople += t.numOfPeople;
                newHealth -= t.damage;
                newListTown.remove(i);
                visitTown(newHealth, newSavePeople, newListTown);
            }
        }
        if(savePeople > max){
            max = savePeople;
        }
    }

    static class Town {
        int numOfPeople;
        int damage;
    }
}
