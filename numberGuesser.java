import javax.swing.*;
import java.awt.event.*;  

class numberGuesser implements ActionListener{

    private static JLabel label;
    private static JTextField guessText;
    private static JLabel label2;
    private static JButton button;
    private static JLabel guessInfo;
    private static JLabel guessCount;
    private static int number;
    private static int numberOfGuessesStart;
    private static int numberOfGuesses;
    public static void main(String args[]){

        JFrame frame = new JFrame("Number Guesser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JPanel panel = new JPanel();

        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Guess a number from 1 to 100");
        label.setBounds(10,20,300,25);
        panel.add(label);

        label2 = new JLabel("Your guess");
        label2.setBounds(10,50,80,25);
        panel.add(label2);

        guessText = new JTextField();
        guessText.setBounds(100,50,165,25);
        panel.add(guessText);
        
        button = new JButton("Guess");
        button.setBounds(10,80,80,25);
        button.addActionListener(new numberGuesser());
        panel.add(button);

        guessInfo = new JLabel("");
        guessInfo.setBounds(10,135,300,25);
        panel.add(guessInfo);

        guessCount = new JLabel("");
        guessCount.setBounds(10,110,300,25);
        panel.add(guessCount);

        frame.setVisible(true);     

        number = (int)(Math.random()*100+1);

        numberOfGuessesStart = 8;
        numberOfGuesses = 0;
        guessCount.setText("You have " + (numberOfGuessesStart-numberOfGuesses) + " tries left.");

    }

    public static boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(numberOfGuessesStart-numberOfGuesses>0){
            String guess = guessText.getText();
            
            if(isNumeric(guess)){
                guessCount.setText("You have " + (numberOfGuessesStart-(++numberOfGuesses)) + " tries left.");
                int guessedNumber = Integer.parseInt(guess);

                if(guessedNumber==number){
                    guessInfo.setText("It is " + number + ".");
                    guessCount.setText("Correct. You have guessed it in " + numberOfGuesses + " tries.");
                }
                else{
                    if(guessedNumber > number)
                        guessInfo.setText("Too big");
                    else if(guessedNumber < number)
                        guessInfo.setText("Too small");
                }
            }
            else{
                guessInfo.setText("'" + guess + "' isn't even a number!");
            }
        }
        else{
            guessInfo.setText("Game over.");
        }
    }
}