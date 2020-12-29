package project16;

public class game {
    private simplequeue<Integer> q1 = new simplequeue<>();
    private simplequeue<Integer> q2 = new simplequeue<>();

    public game(String[] s1, String[] s2) {
        for (int i = 0; i < s1.length; i++){
            q1.add(Integer.parseInt(s1[i]));
            q2.add(Integer.parseInt(s2[i]));
        }
    }

    public void startGame() {
        int First, Second;
        int Turns = 0;

        while (!q1.isEmpty() && !q2.isEmpty() && Turns < 106) {
            First = q1.remove();
            Second = q2.remove();

            if (First > Second) {
                q1.add(First);
                q1.add(Second);
            }
            else {
                q2.add(Second);
                q2.add(First);
            }
            Turns++;
        }
        if (q1.isEmpty())
            System.out.println("second " + Turns);
        else if (q2.isEmpty())
            System.out.println("first " + Turns);
        else
            System.out.println("botva");
    }
}