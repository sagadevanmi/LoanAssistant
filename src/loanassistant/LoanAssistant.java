package loanassistant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class LoanAssistant extends JFrame {
    
    JLabel balance, interest, months, payment, analysis;
    JTextField tbalance, tinterest, tmonths, tpayment;
    JButton btnCompute, btnNewLoan, btnMonths, btnPayment, btnExit;
    JTextArea analysisArea;
    Container c;
    Color lightYellow = new Color(255 ,255 ,128);
    boolean computePayment;

    public static void main(String[] args) {
        new LoanAssistant().show();
    }
    
    public LoanAssistant() {
        Font font = new Font("Arial", Font.PLAIN, 16);
        GridBagConstraints gridConstraints;
        c = getContentPane();
        c.setLayout(new GridBagLayout());
        
        //Initialize fields
        balance = new JLabel();
        tbalance = new JTextField();
        interest = new JLabel();
        tinterest = new JTextField();
        months = new JLabel();
        tmonths = new JTextField();
        payment = new JLabel();
        tpayment = new JTextField();
        btnCompute = new JButton();
        btnNewLoan = new JButton();
        btnMonths = new JButton();
        btnPayment = new JButton();
        btnExit = new JButton();
        analysis = new JLabel();
        analysisArea = new JTextArea();
        
        balance.setText("Loan Balance");
        balance.setFont(font);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10, 10, 0, 0);
        getContentPane().add(balance, gridConstraints);
        
        interest.setText("Interest Rate");
        interest.setFont(font);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10, 10, 0, 0);
        c.add(interest, gridConstraints);
        
        months.setText("Number of Payments");
        months.setFont(font);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10, 10, 0, 0);
        c.add(months, gridConstraints);
        
        payment.setText("Monthly Payment");
        payment.setFont(font);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 3;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10, 10, 0, 0);
        c.add(payment, gridConstraints);
        
        tbalance.setPreferredSize(new Dimension(100, 25));
        tbalance.setHorizontalAlignment(SwingConstants.RIGHT);
        tbalance.setFont(font);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10, 10, 0, 10);
        c.add(tbalance, gridConstraints);
        
        tinterest.setPreferredSize(new Dimension(100, 25));
        tinterest.setHorizontalAlignment(SwingConstants.RIGHT);
        tinterest.setFont(font);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10, 10, 0, 10);
        c.add(tinterest, gridConstraints);
        
        tmonths.setPreferredSize(new Dimension(100, 25));
        tmonths.setHorizontalAlignment(SwingConstants.RIGHT);
        tmonths.setFont(font);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10, 10, 0, 10);
        c.add(tmonths, gridConstraints);
        
        tpayment.setPreferredSize(new Dimension(100, 25));
        tpayment.setHorizontalAlignment(SwingConstants.RIGHT);
        tpayment.setFont(font);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 3;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10, 10, 0, 10);
        c.add(tpayment, gridConstraints);
        
        btnCompute.setText("Compute Monthly Payment");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 4;
        gridConstraints.gridwidth = 2;
        gridConstraints.insets = new Insets(10, 0, 0, 0);
        c.add(btnCompute, gridConstraints);
//        btnCompute.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                btnComputeActionPerformed(e);
//            }
//            
//        });
        
        btnCompute.setText("Compute Monthly Payment");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 4;
        gridConstraints.gridwidth = 2;
        gridConstraints.insets = new Insets(10, 0, 0, 0);
        c.add(btnCompute, gridConstraints);
        btnCompute.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnComputeActionPerformed(e);
            }
            
        });
        
        btnNewLoan.setText("New Loan Analysis");
        btnNewLoan.setEnabled(false);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 5;
        gridConstraints.gridwidth = 2;
        gridConstraints.insets = new Insets(10, 0, 10, 0);
        c.add(btnNewLoan, gridConstraints);
        btnNewLoan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnNewLoanActionPerformed(e);
            }
            
        });
        
        btnMonths.setText("X");
        btnMonths.setFocusable(false);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 2;
        gridConstraints.insets = new Insets(10, 0, 0, 0);
        c.add(btnMonths, gridConstraints);
        btnMonths.addActionListener(new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnMonthsActionPerformed(e);
            }
        
        });
        
        btnPayment.setText("X");
        btnPayment.setFocusable(false);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 3;
        gridConstraints.insets = new Insets(10, 0, 0, 0);
        c.add(btnPayment, gridConstraints);
        btnPayment.addActionListener(new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnPaymentActionPerformed(e);
            }
        
        });
        
        analysis.setText("Loan Analysis:");
        analysis.setFont(font);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(0, 10, 0, 0);
        c.add(analysis, gridConstraints);
        
        analysisArea.setPreferredSize(new Dimension (250, 150));
        analysisArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        analysisArea.setFont(new Font("Courier New", Font.PLAIN, 14));
        analysisArea.setEditable(false);
        analysisArea.setFocusable(false);
        analysisArea.setBackground(Color.WHITE);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 1;
        gridConstraints.gridheight = 4;
        gridConstraints.insets = new Insets(0, 10, 0, 10);
        c.add(analysisArea, gridConstraints);
        
        btnExit.setText("Exit");
        btnExit.setFocusable(false);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 5;
        gridConstraints.insets = new Insets(0, 10, 0, 10);
        c.add(btnExit, gridConstraints);
        
        tbalance.addActionListener(new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                tbalance.transferFocus();
            }
        
        });
        
        tinterest.addActionListener(new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                tinterest.transferFocus();
            }
        
        });
        
        tmonths.addActionListener(new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                tmonths.transferFocus();
            }
        
        });
        
        tpayment.addActionListener(new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                tpayment.transferFocus();
            }
        
        });
        
        btnExit.addActionListener(new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                exitButtonActionPerformed(e);
            }
        });
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent evt) {
                exitForm(evt);
            }
        });
        setTitle("Loan Assistant");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) (0.5* (screenSize.width - getWidth())), (int) (0.5 * (screenSize.height - getHeight())), 
                getWidth(), getHeight());
        
        btnPayment.doClick();
    }
    
    private void exitForm (WindowEvent evt) {
        System.exit(0);
    }
    
//    JLabel balance, interest, months, payment, analysis;
//    JTextField tbalance, tinterest, tmonths, tpayment;
//    JButton btnCompute, btnNewLoan, btnMonths, btnPayment, btnExit;
//    JTextArea analysisArea;
    
    private void btnNewLoanActionPerformed (ActionEvent evt) {
        
        if (computePayment) {
            tpayment.setText("");
        }
        else {
            tmonths.setText("");
        }
        analysisArea.setText("");
        btnCompute.setEnabled(true);
        btnNewLoan.setEnabled(false);
        tbalance.requestFocus(true);
        
    }
    
    private void btnMonthsActionPerformed (ActionEvent evt) {
        
        computePayment = false;
        btnPayment.setVisible(true);
        tpayment.setFocusable(true);
        btnMonths.setVisible(false);
        tmonths.setEditable(false);
        tmonths.setBackground(lightYellow);
        tmonths.setText("");
        tpayment.setEditable(true);
        tpayment.setBackground(Color.WHITE);
        tmonths.setFocusable(false);
        btnCompute.setText("Compute Number of Payments");
        tbalance.requestFocus();
        
    }
    
    private void btnPaymentActionPerformed (ActionEvent evt) {
        
        computePayment = true;
        btnPayment.setVisible(false);
        btnMonths.setVisible(true);
        tmonths.setFocusable(true);
        tmonths.setEditable(true);
        tmonths.setBackground(Color.WHITE);
        tpayment.setText("");
        tpayment.setEditable(false);
        tpayment.setBackground(lightYellow);
        tpayment.setFocusable(false);
        btnCompute.setText("Compute Monthly Payment");
        tbalance.requestFocus();
        
    }
    
    private void btnComputeActionPerformed (ActionEvent evt) {
        
        double balance, interest, payment, monthlyInterest, multiplier;
        double loanBalance, finalPayment;
        int months;
        if (validateDecimalNumber(tbalance))
            balance = Double.valueOf(tbalance.getText()).doubleValue();
        else {
            JOptionPane.showConfirmDialog(null, "Invalid or empty Loan Balance entry. \n Please Correct."
                    , "Balance Input Error", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if (validateDecimalNumber(tinterest))
            interest = Double.valueOf(tinterest.getText()).doubleValue();
        else {
            JOptionPane.showConfirmDialog(null, "Invalid or empty Interest rate entry. \n Please Correct."
                    , "Balance Input Error", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        monthlyInterest = interest/1200;
        if (computePayment) {
            
            if (validateDecimalNumber(tmonths))
                months = Integer.valueOf(tmonths.getText()).intValue();
            else {
                JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Payments entry. \n Please Correct."
                    , "Balance Input Error", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (interest == 0) 
                payment = balance / months;
            else {
                multiplier = Math.pow(1 + monthlyInterest, months);
                payment = balance * monthlyInterest * multiplier/(multiplier-1);
            }
            tpayment.setText(new DecimalFormat("0.00").format(payment));
            
        } 
        else {
            
            if (validateDecimalNumber(tpayment)) {
                payment = Double.parseDouble(tpayment.getText());
                if (payment <= (balance * monthlyInterest + 1.0))
                {
                    if (JOptionPane.showConfirmDialog(null, "Minimum payment must be Rs. " +
                        new DecimalFormat("0.00").format((int)(balance * monthlyInterest + 1.0)) + "\n" + 
                            "Do you want to use the minimum payment?", "Input Error",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION ) {
                        tpayment.setText(new DecimalFormat("0.00").format((int)
                        (balance * monthlyInterest + 1.0)));
                        payment =
                        Double.valueOf(tpayment.getText()).doubleValue();
                    }
                    else
                    {
                        tpayment.requestFocus();
                        return;
                    }
                }
            }
            else {
                JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Payment entry. \n Please Correct."
                    , "Balance Input Error", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (interest == 0)
                months = (int) (balance / payment);
            else {
                months = (int)((Math.log(payment) - Math.log(payment - balance * monthlyInterest)) 
                       / (Math.log(1 + monthlyInterest)));
            }
            tmonths.setText(String.valueOf(months));
            
        }
        
        payment = Double.parseDouble(tpayment.getText());
        analysisArea.setText("Loan Balance: Rs."+ new DecimalFormat("0.00").format(balance));
        analysisArea.append("\n"+"Interest Rate: "+new DecimalFormat("0.00").format(interest) + "%");
        loanBalance = balance;
        for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++) {
            loanBalance += loanBalance * monthlyInterest - payment;
        }
        finalPayment = loanBalance;
        if (finalPayment > payment) {
            loanBalance += loanBalance * monthlyInterest - payment;
            finalPayment = loanBalance;
            months++;
            tmonths.setText(String.valueOf(months));
        }
        analysisArea.append("\n\n"+ String.valueOf(months-1) + " Payments of Rs. " + new DecimalFormat("0.00").format(payment));
        analysisArea.append("\n"+ "Final Payment of Rs. " + new DecimalFormat("0.00").format(finalPayment));
        analysisArea.append("\n"+ "Total Payments of Rs. " + new DecimalFormat("0.00").format((months-1)*payment + finalPayment));
        analysisArea.append("\n"+ "Interest Paid Rs. " + new DecimalFormat("0.00").format((months-1)*payment + finalPayment - balance));
        
        btnCompute.setEnabled(false);
        btnNewLoan.setEnabled(true);
        btnNewLoan.requestFocus();
    }
    
    public boolean validateDecimalNumber (JTextField tf) {
        
        String s = tf.getText().trim();
        boolean hasDecimal = false;
        boolean valid = true;
        if (s.length() == 0)
            valid = false;
        else {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    continue;
                }
                else if (ch == '.' && !hasDecimal) {
                    hasDecimal = true;
                }
                else 
                    valid = false;
            }
        }
        tf.setText(s);
        if (!valid) {
            tf.requestFocus();
        }
        return valid;
    }
    
    private void exitButtonActionPerformed (ActionEvent evt) {
        
        System.exit(0);
        
    }
}
