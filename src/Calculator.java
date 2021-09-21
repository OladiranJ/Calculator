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

    double num; // = 135
    double reset;
    double answer; // = 135
    Boolean ableToAddMoreNumbers = true; // = false
    int operator = 0; // = 1

    public Calculator() {

        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0 && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    ableToAddMoreNumbers = true;
                } else if (operator == 0 && num == answer && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    num = reset;
                    ableToAddMoreNumbers = true;
                }

                String zero = zeroButton.getText();
                numberTextArea.setText(numberTextArea.getText() + zero);
                ableToAddMoreNumbers = true;
            }
        });

        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0 && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    ableToAddMoreNumbers = true;
                } else if (operator == 0 && num == answer && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    num = reset;
                    ableToAddMoreNumbers = true;
                }

                String one = oneButton.getText();
                numberTextArea.setText(numberTextArea.getText() + one);
                ableToAddMoreNumbers = true;
            }
        });

        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0 && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    ableToAddMoreNumbers = true;
                } else if (operator == 0 && num == answer && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    num = reset;
                    ableToAddMoreNumbers = true;
                }

                String two = twoButton.getText();
                numberTextArea.setText(numberTextArea.getText() + two);
                ableToAddMoreNumbers = true;
            }
        });

        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0 && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    ableToAddMoreNumbers = true;
                } else if (operator == 0 && num == answer && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    num = reset;
                    ableToAddMoreNumbers = true;
                }

                String three = threeButton.getText();
                numberTextArea.setText(numberTextArea.getText() + three);
                ableToAddMoreNumbers = true;
            }
        });

        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0 && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    ableToAddMoreNumbers = true;
                } else if (operator == 0 && num == answer && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    num = reset;
                    ableToAddMoreNumbers = true;
                }

                String four = fourButton.getText();
                numberTextArea.setText(numberTextArea.getText() + four);
                ableToAddMoreNumbers = true;
            }
        });

        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0 && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    ableToAddMoreNumbers = true;
                } else if (operator == 0 && num == answer && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    num = reset;
                    ableToAddMoreNumbers = true;
                }

                String five = fiveButton.getText();
                numberTextArea.setText(numberTextArea.getText() + five);
                ableToAddMoreNumbers = true;
            }
        });

        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0 && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    ableToAddMoreNumbers = true;
                } else if (operator == 0 && num == answer && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    num = reset;
                    ableToAddMoreNumbers = true;
                }

                String six = sixButton.getText();
                numberTextArea.setText(numberTextArea.getText() + six);
                ableToAddMoreNumbers = true;
            }
        });

        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0 && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    ableToAddMoreNumbers = true;
                } else if (operator == 0 && num == answer && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    num = reset;
                    ableToAddMoreNumbers = true;
                }

                String seven = sevenButton.getText();
                numberTextArea.setText(numberTextArea.getText() + seven);
                ableToAddMoreNumbers = true;
            }
        });

        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0 && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    ableToAddMoreNumbers = true;
                } else if (operator == 0 && num == answer && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    num = reset;
                    ableToAddMoreNumbers = true;
                }

                String eight = eightButton.getText();
                numberTextArea.setText(numberTextArea.getText() + eight);
                ableToAddMoreNumbers = true;
            }
        });

        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0 && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    ableToAddMoreNumbers = true;
                } else if (operator == 0 && num == answer && !ableToAddMoreNumbers) {
                    numberTextArea.setText("");
                    num = reset;
                    ableToAddMoreNumbers = true;
                }

                String nine = nineButton.getText();
                numberTextArea.setText(numberTextArea.getText() + nine);
                ableToAddMoreNumbers = true;
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberTextArea.setText("");
                operator = 0;
                num = reset;
                answer = reset;
                ableToAddMoreNumbers = true;
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0) {
                    mathOperations();
                    operator = 0;
                }

                num = Double.parseDouble(numberTextArea.getText());
                operator = 1;
                ableToAddMoreNumbers = false;
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0) {
                    mathOperations();
                    operator = 0;
                }

                num = Double.parseDouble(numberTextArea.getText());
                operator = 2;
                ableToAddMoreNumbers = false;
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0) {
                    mathOperations();
                    operator = 0;
                }

                num = Double.parseDouble(numberTextArea.getText());
                operator = 3;
                ableToAddMoreNumbers = false;
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator > 0) {
                    mathOperations();
                    operator = 0;
                }

                num = Double.parseDouble(numberTextArea.getText());
                operator = 4;
                ableToAddMoreNumbers = false;
            }
        });


        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mathOperations();
                operator = 0;
                num = answer;
                ableToAddMoreNumbers = false;
            }
        });
    }

    private void mathOperations() {
        switch (operator) {
            case 1 -> {
                answer = num + Double.parseDouble(numberTextArea.getText());
                numberTextArea.setText(Double.toString(answer));
            }
            case 2 -> {
                answer = num - Double.parseDouble(numberTextArea.getText());
                numberTextArea.setText(Double.toString(answer));
            }
            case 3 -> {
                answer = num * Double.parseDouble(numberTextArea.getText());
                numberTextArea.setText(Double.toString(answer));
            }
            case 4 -> {
                answer = num / Double.parseDouble(numberTextArea.getText());
                numberTextArea.setText(Double.toString(answer));
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
