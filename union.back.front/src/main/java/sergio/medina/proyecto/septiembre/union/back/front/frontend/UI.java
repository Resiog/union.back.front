package sergio.medina.proyecto.septiembre.union.back.front.frontend;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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

        btConectar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conector conexion = new Conector();
                conexion.cliente = HttpClient.newHttpClient();
                conexion.request = HttpRequest.newBuilder()
                        .uri(URI.create("http://localhost:8080/listado"))
                        .build();
                try {
                    conexion.respuesta = conexion.cliente.send(conexion.request, HttpResponse.BodyHandlers.ofString());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println(conexion.respuesta.statusCode());
                System.out.println(conexion.respuesta.body());
            }
        });


    }

    public static void main(String[] args) {
        UI nuevoPanel = new UI();
    }
}
