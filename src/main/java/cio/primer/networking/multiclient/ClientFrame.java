package cio.primer.networking.multiclient;

import java.awt.BorderLayout;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JScrollPane;
    import javax.swing.JTextArea;
    import javax.swing.JTextField;

    public class ClientFrame extends JFrame {

    private JTextArea chatArea;
    private JTextField type;
    private JButton submit;
    private JPanel upper;
    private JPanel lower;
    private BorderLayout bl;
    JScrollPane jsp;
    Controller c;

    public ClientFrame() {
        bl = new BorderLayout();
        upper = new JPanel();
        lower = new JPanel();
        chatArea = new JTextArea("chat goes here", 20, 30);
        c = new Controller(this);
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        type = new JTextField("type here", 20);
        jsp = new JScrollPane(chatArea);
        //new SmartScroller(jsp);
        lower.add(type);
        submit = new JButton("send");
        submit.addActionListener(new Submit());
        type.addActionListener(new Submit());
        lower.add(submit);
        upper.add(jsp);
        this.setSize(400, 600);
        this.setLayout(bl);
        this.setTitle("MattChatt");
        this.add(upper, BorderLayout.NORTH);
        this.add(lower, BorderLayout.SOUTH);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void updateGUI(String s) {
        chatArea.append("\n" + s);
    }

    private class Submit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (type.getText().equals("")) {
                System.out.println("no text entered");
            } else {
                System.out.println("submitted");
                c.sendChat(type.getText());
                type.setText("");

            }
        }

    }

	public static void main(String args[]){
		new ClientFrame();
	}
    }