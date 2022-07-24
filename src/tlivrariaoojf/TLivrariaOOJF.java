/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tlivrariaoojf;

import controler.CClientes;
import controler.CEditoras;
import controler.CLivros;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import view.jfCliente;
import view.jfEditora;
import view.jfLivro;
/**
 *
 * @author jairb
 */
public class TLivrariaOOJF extends JFrame implements ActionListener{
    public static CClientes cadClientes = new CClientes();// Repositório de Clientes
    public static CEditoras cadEditoras = new CEditoras();
    public static CLivros cadLivros = new CLivros();
    
    JTextArea output;
    JScrollPane scrollPane;

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("Cadastros");
        menu.setMnemonic(KeyEvent.VK_C);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        //Clientes
        menuItem = new JMenuItem("Clientes",
                KeyEvent.VK_C);       
        menuItem.setActionCommand("mClientes");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Editoras
        menuItem = new JMenuItem("Editoras",
                KeyEvent.VK_E);
        menuItem.setActionCommand("mEditoras");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Livros
        menuItem = new JMenuItem("Livros",
                KeyEvent.VK_L);
        menuItem.setActionCommand("mLivros");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        return menuBar;
    }

    public void actionPerformed(ActionEvent e) {
        if ("mClientes".equals(e.getActionCommand())) {
            jfCliente c = new jfCliente();
            c.setVisible(true);
            c.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mEditoras".equals(e.getActionCommand())) {
            jfEditora ed = new jfEditora();
            ed.setVisible(true);
            ed.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mLivros".equals(e.getActionCommand())) {
            jfLivro liv = new jfLivro();
            liv.setVisible(true);
            liv.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }

    }

    public Container createContentPane() {
        //Create the content-pane-to-be.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);

        //Create a scrolled text area.
        output = new JTextArea(5, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);

        //Add the text area to the content pane.
        contentPane.add(scrollPane, BorderLayout.CENTER);

        return contentPane;
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Painel Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        TLivrariaOOJF demo = new TLivrariaOOJF();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());

        //Display the window.
        frame.setSize(450, 260);
        frame.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cadClientes.mokClientes();
        cadEditoras.mokEditoras();
        cadLivros.mokLivros();
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
        
    }
    
}
