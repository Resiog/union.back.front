package sergio.medina.proyecto.septiembre.union.back.front.frontend;

import javax.swing.*;

public class UI extends JFrame{
    private JPanel panel;
    private JLabel desc;
    private JTextArea textArea1;
    private JButton btConectar;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField1;
    private JLabel id;
    private JLabel ojos;
    private JLabel name;
    private JButton btElim;
    private JButton btUpd;

    public UI(){
        setContentPane(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        UI nuevoPanel = new UI();
    }
}
