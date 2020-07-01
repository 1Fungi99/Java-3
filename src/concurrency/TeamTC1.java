package concurrency;

import java.util.*;

class TeamTC1 implements Runnable {
    List<String> team = new ArrayList<>();

    //This thread should be created by implementing the Runnable interface, 
    //      NOT by extending the Thread class.  In the run method of this thread, 
    //      print out the name of each student in your TA group, (starting with your TA).  
    //      There should be a pause of 1 second before each name is printed to the console.
    //      The name should then be pushed to the team List  After all the names have been 
    //      pushed to this List, print out the entire list of all the students in your TA group. 
    //      Don't forget your TA as well!  All of these steps should be done whenever the thread is started.  
    //      (i.e. it can be done directly in the run()method of the thread itself).  
    //      Kick off the thread in the Main class of the concurrency package.  

    public void run() {
        List<String> preTeam = new ArrayList<>();
        preTeam.add("Mark Bennett");
        preTeam.add("Aaron White");
        preTeam.add("John Bozarov");
        preTeam.add("Justin Cheng");
        preTeam.add("Kevin Keesee");
        preTeam.add("Korey Brooks");
        preTeam.add("Matthew Choat");
        preTeam.add("Zach ...");
        preTeam.add("Caleb Waters");
        preTeam.add("Cody Clark");
        preTeam.add("Gotham Katta");
        preTeam.add("Sarah ...");
        preTeam.add("Tyler Clements");
        System.out.println("Adding names...");
        for (int i = 0; i < preTeam.size(); i++) {
            System.out.println(preTeam.get(i));
            team.add(preTeam.get(i));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            ;
        }
        System.out.println("\n\n\nFull team: ");
        for (int i = 0; i < team.size(); i++) {
            System.out.println((i + 1) + ". " + team.get(i));
        }

    }

}