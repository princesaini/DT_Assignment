/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deepthoughtassignment;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author princ
 */
public class DeepThoughtAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        HomeFrame mainFrame = new HomeFrame();
        
        String[] courseNames = {"Introduction to Java", "Data Structures", "Data Science", "Digital Electronics", "Discrete Mathematics"};
        String[] courseDescription = {"Placeholder Description", "Placeholder Description", "Placeholder Description", "Placeholder Description", "Placeholder Description"};
        String[] learningOutcome = {"Java Skills", "Data Structures", "Data Science Skills", "Digital Electronics Knowledge", "Mathematics Skills"};
        String prerequisiteDescription = "Nothing";
        
        mainFrame.panelInScrollPane.setSize(1280, courseNames.length * 310);
        
        for (int i = 0; i < courseNames.length; i++) {
            Cards card = new Cards();
            card.setCourseName(courseNames[i]);
            card.setCourseDescription(courseDescription[i]);
            card.setOutcomeDescription(learningOutcome[i]);
            card.setPrerequisiteDescription(prerequisiteDescription);
            mainFrame.panelInScrollPane.add(card);
        }
        
        mainFrame.setVisible(true);
    }
    
}
