import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel MainPanel;
    private JPanel topPanel;
    private JLabel titleLabel;
    private JPanel middlePanel;
    private JPanel bottomPanel;
    private JTextArea numberTextArea;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton zeroButton;
    private JButton resetButton;
    private JButton equalsButton;

    public Calculator() {

        double num;
        double answer;
        int operator;

        public void mathOperations() {
            switch (operator) {
                case 1:
                    answer = num + Double.parseDouble(numberTextArea.getText());
                    numberTextArea.setText(Double.toString(answer));
                    break;

                case 2:
                    answer = num - Double.parseDouble(numberTextArea.getText());
                    numberTextArea.setText(Double.toString(answer));
                    break;

                case 3:
                    answer = num * Double.parseDouble(numberTextArea.getText());
                    numberTextArea.setText(Double.toString(answer));
                    break;

                case 4:
                    answer = num / Double.parseDouble(numberTextArea.getText());
                    numberTextArea.setText(Double.toString(answer));
                    break;
            }
        }

        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String zero = zeroButton.getText();
                numberTextArea.setText(numberTextArea.getText() + zero);
            }
        });

        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String one = oneButton.getText();
                numberTextArea.setText(numberTextArea.getText() + one);
            }
        });

        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String two = twoButton.getText();
                numberTextArea.setText(numberTextArea.getText() + two);
            }
        });

        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String three = threeButton.getText();
                numberTextArea.setText(numberTextArea.getText() + three);
            }
        });

        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String four = fourButton.getText();
                numberTextArea.setText(numberTextArea.getText() + four);
            }
        });

        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String five = fiveButton.getText();
                numberTextArea.setText(numberTextArea.getText() + five);
            }
        });

        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String six = sixButton.getText();
                numberTextArea.setText(numberTextArea.getText() + six);
            }
        });

        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seven = sevenButton.getText();
                numberTextArea.setText(numberTextArea.getText() + seven);
            }
        });

        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eight = eightButton.getText();
                numberTextArea.setText(numberTextArea.getText() + eight);
            }
        });

        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nine = nineButton.getText();
                numberTextArea.setText(numberTextArea.getText() + nine);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberTextArea.setText("");
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(numberTextArea.getText());
                operator = 1;
                numberTextArea.setText("");
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(numberTextArea.getText());
                operator = 2;
                numberTextArea.setText("");
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(numberTextArea.getText());
                operator = 3;
                numberTextArea.setText("");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(numberTextArea.getText());
                operator = 4;
                numberTextArea.setText("");
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
