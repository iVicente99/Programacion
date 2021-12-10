import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(44, 32, 327, 188);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("C\u00F3digo Departamento:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 40, 135, 14);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nombre Departamento:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 85, 135, 14);
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Loacalidad Departamento:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 137, 155, 14);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBackground(Color.PINK);
		textField.setBounds(171, 37, 60, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 82, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(171, 134, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(130, 11, 164, 23);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Insertar datos");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(72, 231, 129, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTON LIMPIAR");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(244, 231, 114, 23);
		panel.add(btnNewButton_1);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
