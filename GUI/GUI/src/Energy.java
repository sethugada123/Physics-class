import javax.swing.*;
import java.awt.*;

public class Energy {


    JFrame myFrame = new JFrame();


    //KINETIC ENERGY

    JButton KeBtn = new JButton("Kinetic Energy");
    JLabel mass = new JLabel("Enter Mass");
    JTextField enterMass =new JTextField(10);
    JLabel velocity = new JLabel("ENter Velocity");
    JTextField enterVelocity = new JTextField(10);
    JButton CalcKineticEnergy = new JButton("Calculate");

    //POTENTIAL ENERGY
    JFrame PotentialEnergy = new JFrame("Potential Energy");
    JButton PeBtn = new JButton("Potential Energy");
    JLabel PotentialEnergyMass = new JLabel("Enter Mass");
    JTextField enterPotentialEnergyMass =new JTextField(10);
    JLabel height = new JLabel("Enter Velocity");
    JTextField enterPotentialEnergyHeight = new JTextField(10);
    JButton CalcPotentialEnergy = new JButton("Calculate");


    public void physicsUi() {
        myFrame.add(KeBtn);
        myFrame.add(PeBtn);
        myFrame.setSize(400,400);
        myFrame.setLayout(new FlowLayout());
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Kinetic energy
        KeBtn.addActionListener(e -> {
            System.out.println("Calculate Kinetic Energy");
            runKineticEnergy();
        });
        //Potential Energy
        PeBtn.addActionListener(e -> {
            System.out.println("Calculate Potential Energy");
            runPotentialEnergy();
        });

        //KINETIC ENERGY
        CalcKineticEnergy.addActionListener(e -> {
            try {
                double mass = Double.parseDouble(enterMass.getText());
                double velocity = Double.parseDouble(enterVelocity.getText());
                double KineticEnergy = (0.5 * (mass * (velocity*velocity)));
                JOptionPane.showMessageDialog(null, "Kinetic Energy =" + KineticEnergy);
            }catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Pls Input a Valid Number");
            }
        });

        //POTENTIAL ENERGY
        CalcPotentialEnergy.addActionListener(e -> {
            try {
                double mass = Double.parseDouble(enterMass.getText());
                double height = Double.parseDouble(enterPotentialEnergyHeight.getText());
                double PotentialEnergy = (mass * Physics.getGravity() * height);
                JOptionPane.showMessageDialog(null, "Potential Energy =" + PotentialEnergy);
            }catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Pls Input a Valid Number");
            }
        });
    }
    public void runKineticEnergy(){
        JFrame KineticEnergyFrame = new JFrame("KINETIC ENERGY");
        KineticEnergyFrame.add(mass);
        KineticEnergyFrame.add(enterMass);
        KineticEnergyFrame.add(velocity);
        KineticEnergyFrame.add(enterVelocity);
        KineticEnergyFrame.add(CalcKineticEnergy);
        KineticEnergyFrame.setLayout(new FlowLayout());
        KineticEnergyFrame.setSize(400,400);
        KineticEnergyFrame.setVisible(true);
    }
    public void runPotentialEnergy(){
        JFrame PotentialEnergyFrame = new JFrame("Potential ENERGY");
        PotentialEnergyFrame.add(enterMass);
        PotentialEnergyFrame.add(enterPotentialEnergyMass);
        PotentialEnergyFrame.add(height);
        PotentialEnergyFrame.add(enterPotentialEnergyHeight);
        PotentialEnergyFrame.add(CalcPotentialEnergy);
        PotentialEnergyFrame.setLayout(new FlowLayout());
        PotentialEnergyFrame.setSize(400,400);
        PotentialEnergyFrame.setVisible(true);
    }

}