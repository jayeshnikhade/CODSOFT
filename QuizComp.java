import java.util.*;

public class QuizComp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        
        System.out.println();
        System.out.println("There are 10 questions based on Money Heist with 4 options each among which 1 option is the answer");
        System.out.println("Choose the correct option to the best of your knowledge");
        System.out.println("Giving a right answer will increase your score by 1");
        System.out.println();
        
        int[] correctAnswers = {2, 3, 2, 3, 2, 1, 2, 4, 3, 2};
        String[] questions = {
            "A.What is the real name of The Professor?\n1) Andrés de Fonollosa    2) Sergio Marquina    3) Raquel Murillo    4) Aníbal Cortés",
            "B.Which city name does Tokyo represent in real life?\n1) Lisbon   2) Nairobi  3) Silene Oliveira  4) Manila",
            "C.What was the main target of the gang in the first heist?\n1) Bank of Spain   2) Royal Mint of Spain  3) Central European Bank  4) Federal Reserve",
            "D.Who is Berlin’s brother?\n1) Denver   2) Palermo  3) The Professor  4) Helsinki",
            "E.Which character was a police officer before joining the heist?\n1) Manila   2) Lisbon  3) Nairobi  4) Stockholm",
            "F.What is the signature song that the gang sings throughout the series?\n1) Bella Ciao   2) Despacito  3) La Vida Loca  4) O Bella Notte",
            "G.What is the name of the undercover officer who infiltrates the Royal Mint in Season 1?\n1) Alicia Sierra   2) Ángel Rubio  3) Raquel Murillo  4) Mónica Gaztambide",
            "H.Which country does Raquel escape to with The Professor?\n1) Argentina   2) Brazil  3) Thailand  4) Philippines",
            "I.What was Nairobi's real name?\n1) Silene Oliveira   2) Raquel Murillo  3) Ágata Jiménez  4) Camila Torres",
            "J.Who was the lead inspector hunting the gang in Season 3 and 4?\n1) Raquel Murillo  2) Alicia Sierra  3) Suárez  4) Colonel Tamayo"
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Ans:- ");
            
            Timer timer = new Timer();
            final int[] ans = {-1};
            
            TimerTask task = new TimerTask() {
                public void run() {
                    if (ans[0] == -1) {
                        System.out.println("\nTime is up! Moving to the next question.");
                        ans[0] = 0;
                    }
                }
            };
            
            timer.schedule(task, 60000);
            
            if (sc.hasNextInt()) {
                ans[0] = sc.nextInt();
            }
            
            timer.cancel();
            
            if (ans[0] == correctAnswers[i]) {
                score += 1;
            }
            System.out.println();
        }
        
        System.out.println("Your total score is: " + score);
        System.out.println("The correct answers were: ");
        System.out.println("1) Andrés de Fonollosa");
        System.out.println("3) Silene Oliveira");
        System.out.println("2) Royal Mint of Spain");
        System.out.println("3) The Professor");
        System.out.println("2) Lisbon");
        System.out.println("1) Bella Ciao");
        System.out.println("2) Ángel Rubio");
        System.out.println("4) Philippines");
        System.out.println("3) Ágata Jiménez");
        System.out.println("2) Alicia Sierra");
    }
}
