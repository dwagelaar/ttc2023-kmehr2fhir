package kmehr;


import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.*;
import java.util.StringTokenizer;

public class GUI extends JFrame implements ActionListener
{ JPanel panel = new JPanel();
  Controller cont = Controller.inst();
  JButton loadModelButton = new JButton("loadModel");
  JButton loadXMLModelButton = new JButton("loadXMLModel");
  JButton saveModelButton = new JButton("saveModel");
  JButton mainModuleButton = new JButton("mainModule");

 public GUI()
  { super("Select use case to execute");
    setContentPane(panel);
    addWindowListener(new WindowAdapter() 
    { public void windowClosing(WindowEvent e)
      { System.exit(0); } });
    panel.add(loadModelButton);
    loadModelButton.addActionListener(this);
    panel.add(loadXMLModelButton);
    loadXMLModelButton.addActionListener(this);
    panel.add(saveModelButton);
    saveModelButton.addActionListener(this);
  panel.add(mainModuleButton);
  mainModuleButton.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e)
  { if (e == null) { return; }
    String cmd = e.getActionCommand();
    if ("loadModel".equals(cmd))
    { Controller.loadModel("in.txt");
      cont.checkCompleteness();
      System.err.println("Model loaded");
      return;
    } 
    if ("loadXMLModel".equals(cmd))
    { cont.loadXSI();
      System.err.println("Model loaded");
      return;
    } 
    if ("saveModel".equals(cmd))
    { cont.saveModel("out.txt");  
      return; } 
    if ("mainModule".equals(cmd))
    {  cont.mainModule() ;  return; } 
  }

  public static void main(String[] args)
  { GUI gui = new GUI();
    gui.setSize(400,400);
    gui.setVisible(true);
  }
 }
