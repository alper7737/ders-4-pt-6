
package javaapplication6;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;



public class JavaApplication6 {


    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      /*  L.setLayout((LayoutManager) new LineBorder(Color.BLACK));*/
        f.setLayout(new BorderLayout(30,30));
        JButton b1 = new JButton("TİP 1 Düğme Ekle");
        JButton b2 = new JButton("TiP 2 Düğme Ekle");
        JLabel l1 = new JLabel("Tip 1 Düğme Sayısı");
        JLabel l2 = new JLabel("Tip 1 Düğme Sayısı");
        JPanel pa = new JPanel();
        pa.setBorder(new LineBorder(Color.BLACK,2));
        ActionListener a1 = new ActionListener(){
        int tip1=0;
        int tip2=0;
        @Override
                public void actionPerformed(ActionEvent ae){
        JButton ref = (JButton)ae.getSource();
        if (ref.getText()=="TİP 1 Düğme Ekle"){
            pa.add(new JButton("TİP 1 DÜĞME"));  
        tip1++;
        l1.setText("Tip 1 .Düğme Sayısı"+tip1);
        }
        else{
            pa.add(new JButton("tip 2 Düğme"));
            tip2++;
            l2.setText("Tip 2 Düğme sayısı"+tip2);
            
        }
      }
    };
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        f.add(b1,BorderLayout.NORTH);
         f.add(b2,BorderLayout.SOUTH);
          f.add(l1,BorderLayout.EAST);
           f.add(l2,BorderLayout.WEST);
            
            f.add(pa,BorderLayout.CENTER);
        f.setSize(800,500);
        f.setVisible(true);
    }
    
}
