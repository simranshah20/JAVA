import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KnapsackGUI extends JFrame {
    private JTextField[] profitFields;
    private JTextField[] weightFields;
    private JTextField capacityField;
    private JTextArea resultArea;

    public KnapsackGUI() {
        // Set up frame
        setTitle("0/1 Knapsack Problem Solver");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2));

        // Initialize components
        profitFields = new JTextField[4];
        weightFields = new JTextField[4];

        // Profit and Weight labels
        add(new JLabel("Profits:"));
        JPanel profitPanel = new JPanel(new GridLayout(1, 4));
        for (int i = 0; i < 4; i++) {
            profitFields[i] = new JTextField(3);
            profitFields[i].setText(String.valueOf(new int[]{2, 3, 4, 1}[i]));
            profitPanel.add(profitFields[i]);
        }
        add(profitPanel);

        add(new JLabel("Weights:"));
        JPanel weightPanel = new JPanel(new GridLayout(1, 4));
        for (int i = 0; i < 4; i++) {
            weightFields[i] = new JTextField(3);
            weightFields[i].setText(String.valueOf(new int[]{3, 4, 5, 6}[i]));
            weightPanel.add(weightFields[i]);
        }
        add(weightPanel);

        // Capacity input
        add(new JLabel("Knapsack Capacity (kg):"));
        capacityField = new JTextField(5);
        capacityField.setText("8");
        add(capacityField);

        // Calculate button
        JButton calculateButton = new JButton("Calculate Maximum Profit");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateKnapsack();
            }
        });
        add(calculateButton);

        // Result display
        resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));

        setVisible(true);
    }

    private void calculateKnapsack() {
        int[] profits = new int[4];
        int[] weights = new int[4];
        int capacity;

        // Parse input values
        try {
            for (int i = 0; i < 4; i++) {
                profits[i] = Integer.parseInt(profitFields[i].getText());
                weights[i] = Integer.parseInt(weightFields[i].getText());
            }
            capacity = Integer.parseInt(capacityField.getText());
        } catch (NumberFormatException e) {
            resultArea.setText("Please enter valid numbers.");
            return;
        }

        // Solve knapsack problem using dynamic programming
        int maxProfit = knapsack(profits, weights, capacity);
        resultArea.setText("Maximum Profit: " + maxProfit);
    }

    private int knapsack(int[] profits, int[] weights, int capacity) {
        int n = profits.length;
        int[][] dp = new int[n + 1][capacity + 1];

        // Build the DP table
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + profits[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KnapsackGUI());
    }
}
