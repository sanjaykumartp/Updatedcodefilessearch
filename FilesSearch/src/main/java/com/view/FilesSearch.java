//package com.view;
//
//import java.awt.BorderLayout;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import java.io.IOException;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//import com.assessment.ExcelWriter;
//import com.assessment.FilesSearchController;
//
//public class FilesSearch extends JFrame {
//    private JLabel directoryLabel;
//    private JLabel searchLabel;
//    private JTextField directoryField;
//    private JTextField searchField;
//    private JButton searchButton;
//    private JTextArea resultsTextArea;
//
//    public FilesSearch() {
//        // Set up UI components
//        directoryLabel = new JLabel("Directory path:");
//        searchLabel = new JLabel("Search String:");
//        directoryField = new JTextField(20);
//        searchField = new JTextField(20);
//        searchButton = new JButton("Search");
//        resultsTextArea = new JTextArea(100, 200);
//
//        // Set up main panel
//        JPanel mainPanel = new JPanel(new GridLayout(4, 2));
//        mainPanel.add(directoryLabel);
//        mainPanel.add(directoryField);
//        mainPanel.add(searchLabel);
//        mainPanel.add(searchField);
//        mainPanel.add(new JLabel()); // empty space
//        mainPanel.add(searchButton);
//
//        // Set up frame
//        setTitle("File Search");
//        setSize(600, 400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        add(mainPanel, BorderLayout.NORTH);
//        add(new JScrollPane(resultsTextArea), BorderLayout.CENTER);
//
//        // Add action listener to search button
//        searchButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String directoryPath = directoryField.getText();
//                String searchString = searchField.getText();
//
//                try {
//                    ExcelWriter excelWriter = new ExcelWriter();
//                    String results = FilesSearchController.searchDirectory(new File(directoryPath), searchString, excelWriter);
//                    excelWriter.save();
//                   
//                    resultsTextArea.setText(results.toString());
//                } catch (IllegalArgumentException ex) {
//                    resultsTextArea.setText("Error: " + ex.getMessage());
//                } catch (IOException ex) {
//                    resultsTextArea.setText("Error: " + ex.getMessage());
//                } catch (Exception ex) {
//                    resultsTextArea.setText("Error: " + ex.getMessage());
//                }
//            }
//        });
//    }
//
//    public static void main(String[] args) {
//        FilesSearch ui = new FilesSearch();
//        ui.setVisible(true);
//    }
//}
