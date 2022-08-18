import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;

import java.util.Vector;

public class EightPuzzle
 {

private int gn=0;

private Board start;

private Board goal;

public void initStart()

{

System.out.println("\n\n Enter start Board : ");

start=new Board();

start.initBoard();

System.out.println("\n\nThe given start board is : ");
start.display();

}

public void initGoal()

{

System.out.println("\n\n Enter goal Board : ");

goal=new Board();

goal.initBoard();

System.out.println("\n\nThe given goal board is : ");

goal.display();

}

public void solve()

{

Board cur = start;

while(true)

{

System.out.println("\n\nBoard after "+gn+" moves : ");

cur.display();

if(cur.equals(goal))

{

System.out.println("\nGoal state achieved.");

return;

}

gn++;

cur = cur.nextMove(gn, goal);

}

}

public static void main(String[] args)
 {

EightPuzzle ep = new EightPuzzle();

ep.initStart();

ep.initGoal();

System.out.println("\n\nThe board is solved as : \n");ep.solve();

}

}
