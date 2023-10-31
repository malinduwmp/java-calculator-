
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class close extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class cal implements ActionListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;

    TextField tf;

    String fv, sv, op;

    double fdv, sdv, tot;

    cal() {

        Frame f1 = new Frame();

        f1.setBackground(Color.black);
        f1.addWindowListener(new close());
        f1.setBounds(600, 350, 350, 400);
        f1.setTitle("Calculator");

        MenuBar mbar = new MenuBar();

        MenuItem mi1 = new MenuItem("Standed");
        MenuItem mi2 = new MenuItem("Scientific");
        MenuItem mi3 = new MenuItem("Copy");
        MenuItem mi4 = new MenuItem("Past");
        MenuItem mi5 = new MenuItem("Help");
        MenuItem mi6 = new MenuItem("About");

        Menu m1 = new Menu("View");
        m1.add(mi1);
        m1.add(mi2);

        Menu m2 = new Menu("Edit");
        m2.add(mi3);
        m2.add(mi4);

        Menu m3 = new Menu("Help");
        m3.add(mi5);
        m3.add(mi6);

        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);

        f1.setMenuBar(mbar);

        b1 = new Button("%");
        b2 = new Button("CE");
        b3 = new Button("C");
        b4 = new Button("<=");
        b5 = new Button("√x");
        b6 = new Button("(x²)");
        b7 = new Button("1/x");
        b8 = new Button("/");
        b9 = new Button("7");
        b10 = new Button("8");
        b11 = new Button("9");
        b12 = new Button("×");
        b13 = new Button("4");
        b14 = new Button("5");
        b15 = new Button("6");
        b16 = new Button("-");
        b17 = new Button("1");
        b18 = new Button("2");
        b19 = new Button("3");
        b20 = new Button("+");
        b21 = new Button("00");
        b22 = new Button("0");
        b23 = new Button(".");
        b24 = new Button("=");

        Font font1 = new Font("Calibri", Font.BOLD, 18);

        Font font2 = new Font("Times New Roman", Font.BOLD, 18);

        b1.setFont(font2);
        b2.setFont(font2);
        b3.setFont(font2);
        b4.setFont(font2);
        b5.setFont(font2);
        b6.setFont(font2);
        b7.setFont(font2);
        b8.setFont(font2);
        b9.setFont(font2);
        b10.setFont(font1);
        b11.setFont(font1);
        b12.setFont(font1);
        b13.setFont(font2);
        b14.setFont(font1);
        b15.setFont(font1);
        b16.setFont(font1);
        b17.setFont(font2);
        b18.setFont(font1);
        b19.setFont(font1);
        b20.setFont(font1);
        b21.setFont(font2);
        b22.setFont(font1);
        b23.setFont(font1);
        b24.setFont(font2);

        tf = new TextField(30);

        Font font = new Font("Calibri", Font.BOLD, 17);

        tf.setFont(font);
        tf.setEditable(false);

        tf.setForeground(Color.white);
        tf.setBackground(Color.black);

        Panel p1 = new Panel();

        Panel p2 = new Panel();

        GridLayout g1 = new GridLayout(6, 6, 2, 2);

        p1.add(tf);

        p2.setLayout(g1);

        p2.setBackground(Color.black);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        p2.add(b21);
        p2.add(b22);
        p2.add(b23);
        p2.add(b24);

        f1.add(p1, BorderLayout.NORTH);
        f1.add(p2, BorderLayout.CENTER);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);

        f1.setVisible(true);

        b1.setForeground(Color.black);
        b2.setForeground(Color.black);
        b3.setForeground(Color.black);
        b4.setForeground(Color.white);
        b5.setForeground(Color.black);
        b6.setForeground(Color.black);
        b7.setForeground(Color.black);
        b8.setForeground(Color.black);
        b9.setForeground(Color.white);
        b10.setForeground(Color.white);
        b11.setForeground(Color.white);
        b12.setForeground(Color.black);
        b13.setForeground(Color.white);
        b14.setForeground(Color.white);
        b15.setForeground(Color.white);
        b16.setForeground(Color.black);
        b17.setForeground(Color.white);
        b18.setForeground(Color.white);
        b19.setForeground(Color.white);
        b20.setForeground(Color.black);
        b21.setForeground(Color.white);
        b22.setForeground(Color.white);
        b23.setForeground(Color.white);
        b24.setForeground(Color.white);

        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b10.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b13.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b14.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b15.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b16.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b17.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b18.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b19.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b20.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b21.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b22.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b23.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b24.setCursor(new Cursor(Cursor.HAND_CURSOR));

        b1.setBackground(Color.orange);
        b2.setBackground(Color.orange);
        b3.setBackground(Color.orange);
        b4.setBackground(Color.red);
        b5.setBackground(Color.orange);
        b6.setBackground(Color.orange);
        b7.setBackground(Color.orange);
        b8.setBackground(Color.orange);
        b9.setBackground(Color.gray);
        b10.setBackground(Color.gray);
        b11.setBackground(Color.gray);
        b12.setBackground(Color.orange);
        b13.setBackground(Color.gray);
        b14.setBackground(Color.gray);
        b15.setBackground(Color.gray);
        b16.setBackground(Color.orange);
        b17.setBackground(Color.gray);
        b18.setBackground(Color.gray);
        b19.setBackground(Color.gray);
        b20.setBackground(Color.orange);
        b21.setBackground(Color.gray);
        b22.setBackground(Color.gray);
        b23.setBackground(Color.gray);
        b24.setBackground(Color.blue);

    }

    @Override

    public void actionPerformed(ActionEvent d) {

        Object o = d.getSource();

        if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());
        } else if (o.equals(b11)) {
            tf.setText(tf.getText() + b11.getLabel());
        } else if (o.equals(b13)) {
            tf.setText(tf.getText() + b13.getLabel());
        } else if (o.equals(b14)) {
            tf.setText(tf.getText() + b14.getLabel());
        } else if (o.equals(b15)) {
            tf.setText(tf.getText() + b15.getLabel());
        } else if (o.equals(b17)) {
            tf.setText(tf.getText() + b17.getLabel());
        } else if (o.equals(b18)) {
            tf.setText(tf.getText() + b18.getLabel());
        } else if (o.equals(b19)) {
            tf.setText(tf.getText() + b19.getLabel());
        } else if (o.equals(b21)) {
            tf.setText(tf.getText() + b21.getLabel());
        } else if (o.equals(b22)) {
            tf.setText(tf.getText() + b22.getLabel());
        } else if (o.equals(b23)) {
            tf.setText(tf.getText() + b23.getLabel());
        } else if (o.equals(b20)) {

            fv = tf.getText();
            tf.setText("");

            op = b20.getLabel();

        } else if (o.equals(b16)) {

            fv = tf.getText();
            tf.setText("");

            op = b16.getLabel();

        } else if (o.equals(b12)) {

            fv = tf.getText();
            tf.setText("");

            op = b12.getLabel();

        } else if (o.equals(b8)) {

            fv = tf.getText();
            tf.setText("");

            op = b8.getLabel();

        } else if (o.equals(b7)) {

            fv = tf.getText();
            tf.setText("");

            op = b7.getLabel();

        } else if (o.equals(b6)) {

            fv = tf.getText();
            tf.setText("");

            op = b6.getLabel();

        } else if (o.equals(b5)) {

            fv = tf.getText();

            fdv = Double.parseDouble(fv);

            tot = Math.sqrt(fdv);

            tf.setText(tot + "");

        } else if (o.equals(b1)) {

            fv = tf.getText();
            tf.setText("");

            op = b1.getLabel();

        } else if (o.equals(b24)) {

            sv = tf.getText();

            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            if (op.equals("-")) {

                tot = fdv - sdv;

                tf.setText(tot + "");

            } else if (op.equals("+")) {

                tot = fdv + sdv;

                tf.setText(tot + "");

            } else if (op.equals("×")) {

                tot = fdv * sdv;

                tf.setText(tot + "");

            } else if (op.equals("/")) {

                tot = fdv / sdv;

                tf.setText(tot + "");

            } else if (op.equals("%")) {

                tot = fdv / 100 * sdv;

                tf.setText(tot + "%");
            }
        }
        if (o.equals(b2)) {
            tf.setText("");

        } else if (o.equals(b3)) {
            tf.setText("");

        } else if (o.equals(b4)) {
            tf.setText("");
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private MenuItem MenuItem(String standed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

public class calculator {

    public static void main(String[] args) {

        new cal();
    }

}
