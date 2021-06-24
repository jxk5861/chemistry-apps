package mains;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import table.Element;
import table.PeriodicTable;

@SuppressWarnings("serial")
public class ElementNamingPractice extends JFrame {
	private PeriodicTable periodicTable;
	private JTextField text;
	private JLabel label;
	private JLabel streak;
	private JPanel panel;
	private JLabel correct;
	private Random random;
	private int index;
	private int streakVal;

	public ElementNamingPractice(final boolean randomize) {
		this.periodicTable = new PeriodicTable();
		this.streakVal = 0;
		this.random = new Random();
		if (randomize) {
			index = random.nextInt(periodicTable.getElements().size());
		} else {
			index = 0;
		}
		this.setSize(800, 400);
		this.setLocationRelativeTo((Component) null);
		this.setDefaultCloseOperation(3);
		this.setTitle("Element Name Practice");
		this.panel = new JPanel();
		this.label = new JLabel(this.periodicTable.getElements().get(this.index).getSymbol());
		this.streak = new JLabel(String.valueOf(this.streakVal));
		this.streak.setFont(new Font(this.streak.getFont().getFontName(), 1, 40));
		this.streak.setForeground(Color.RED);
		this.correct = new JLabel("N/A");
		this.text = new JTextField();
		this.label.setFont(new Font(this.label.getFont().getFontName(), 1, 40));
		this.text.setFont(new Font(this.label.getFont().getFontName(), 0, 35));
		this.correct.setFont(new Font(this.correct.getFont().getFontName(), 1, 40));
		this.text.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					List<Element> elements = periodicTable.getElements();

					if (text.getText().equalsIgnoreCase(elements.get(index).getName())) {
						++streakVal;
						correct.setText("Correct, " + (elements.get(index)).getNumber() + " "
								+ (elements.get(index)).getName() + " " + (elements.get(index)).getMass() + " g/mol");
						elements.remove(index);
						if (randomize) {
							index = random.nextInt(elements.size());
						}
					} else {
						streakVal = 0;
						correct.setText("Incorrect, " + (elements.get(index)).getNumber() + " "
								+ (elements.get(index)).getName() + " " + (elements.get(index)).getMass() + " g/mol");
					}

					streak.setText("" + streakVal);
					text.setText("");
					if (elements.size() == 0) {
						periodicTable.fillElements();
					}

					label.setText((elements.get(index)).getNumber() + " " + (elements.get(index)).getSymbol() + " "
							+ (elements.get(index)).getMass());
				}

			}

			public void keyReleased(KeyEvent e) {
			}
		});
		this.panel.setLayout(new BorderLayout());
		JPanel top = new JPanel();
		top.setLayout(new GridLayout(1, 2));
		this.label.setHorizontalAlignment(2);
		top.add(this.label);
		this.streak.setHorizontalAlignment(4);
		top.add(this.streak);
		this.panel.add(top, "North");
		this.panel.add(this.text, "Center");
		this.panel.add(this.correct, "South");
		this.add(this.panel);
		this.setVisible(true);
	}

	public static void main(String... strings) {
		int randomize = JOptionPane.showOptionDialog(null, "Randomize Order?", "Randomization Settings",
				JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Yes", "No" }, 0);
		new ElementNamingPractice(randomize == 0);
	}
}
