import javax.swing.*;
import java.awt.event.*;  

class numberGuesser implements ActionListener{

    private static JLabel label;
    private static JTextField userText;
    private static JLabel label2;
    private static JPasswordField userText2;
    private static JButton button;
    private static JLabel success;
    public static void main(String args[]){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JPanel panel = new JPanel();

        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("USER");
        label.setBounds(10,20,80,25);
        panel.add(label);

        userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        label2 = new JLabel("PASSWORD");
        label2.setBounds(10,50,80,25);
        panel.add(label2);

        userText2 = new JPasswordField();
        userText2.setBounds(100,50,165,25);
        panel.add(userText2);
        
        button = new JButton("Press");
        button.setBounds(10,80,80,25);
        button.addActionListener(new numberGuesser());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);
        // success.setText("text");


        frame.setVisible(true);     

    //    int number = (int)(Math.random()*100+1);
       
    //    System.out.println("Guess a number from 1 to 100");

    //    Scanner scanner = new Scanner(System.in);

    //    int guess = 0;
    //    int numberOfGuesses = 0;
    //    while(guess != number){
    //         System.out.print("Enter a number: ");
    //         guess = scanner.nextInt();
    //         numberOfGuesses++;
    //         if(guess > number)
    //             System.out.println("Too big");
    //         else if(guess < number)
    //             System.out.println("Too small");
    //    }
       
    //    System.out.println("Correct. You guessed it! It is " + number);
    //    System.out.println("You did it in " + numberOfGuesses + " of guesses.");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = userText2.getText();

        if(user.equals("Admin") && password.equals("password")){
            success.setText("Login successful!");
        }
        else{
            success.setText("");
        }
    }
}