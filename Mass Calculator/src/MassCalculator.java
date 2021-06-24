import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;

public class MassCalculator extends JFrame {
	private static final long serialVersionUID = 132342342332L;
	private PeriodicTable periodicTable;
	public JList<Element> list;
	public JLabel label;
	public JTextArea textArea;
	public JPanel panel;
	boolean upperCase = true;

	public MassCalculator() {
		this.periodicTable = new PeriodicTable();
		this.list = new JList<>();
		this.textArea = new JTextArea();
		this.textArea.setFont(new Font("", 1, 10));
		this.textArea.setText("");
		this.label = new JLabel();
		this.textArea.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if (Character.isDigit(e.getKeyChar())) {
					MassCalculator.this.upperCase = true;
				} else if (Character.isUpperCase(e.getKeyChar())) {
					MassCalculator.this.upperCase = false;
				} else if (Character.isLowerCase(e.getKeyChar())) {
					if (MassCalculator.this.upperCase) {
						e.setKeyChar(Character.toUpperCase(e.getKeyChar()));
						MassCalculator.this.upperCase = false;
					} else {
						String temp = "";
						String s = MassCalculator.this.textArea.getText();
						char[] var7;
						int var6 = (var7 = s.toCharArray()).length;

						for (int var5 = 0; var5 < var6; ++var5) {
							char c = var7[var5];
							if (Character.isUpperCase(c) && !temp.toString().equals("")) {
								temp = "";
							}

							temp = temp + c;
						}

						if (!temp.toString().equals("")) {
							String test = temp.toString() + e.getKeyChar();
							e.setKeyChar(Character.toUpperCase(e.getKeyChar()));
							Iterator<Element> var10 = MassCalculator.this.periodicTable.getElements().iterator();

							while (var10.hasNext()) {
								Element element = (Element) var10.next();
								if (element.getSymbol().equalsIgnoreCase(test)) {
									e.setKeyChar(Character.toLowerCase(e.getKeyChar()));
									break;
								}
							}
						}
					}
				}

			}

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					double mass = 0.0D;
					ArrayList<String> strs = new ArrayList<>();
					String temp = "";
					int q = 0;

					try {
						q = MassCalculator.this.textArea.getLineEndOffset(MassCalculator.this.textArea.getLineCount() - 2);
					} catch (BadLocationException var17) {
					}

					String s = MassCalculator.this.textArea.getText().substring(q, MassCalculator.this.textArea.getCaretPosition());
					char[] var11;
					int var10 = (var11 = s.toCharArray()).length;

					int j;
					for (j = 0; j < var10; ++j) {
						char cx = var11[j];
						if (Character.isUpperCase(cx) && !temp.toString().equals("")) {
							strs.add(temp.toString());
							temp = "";
						}

						temp = temp + cx;
					}

					if (!temp.toString().equals("")) {
						strs.add(temp);
					}

					for (int i = 0; i < strs.size(); ++i) {
						j = 0;
						String item = (String) strs.get(i);
						char[] var14;
						int var13 = (var14 = item.toCharArray()).length;

						for (int var12 = 0; var12 < var13; ++var12) {
							char c = var14[var12];
							if (Character.isDigit(c)) {
								break;
							}

							++j;
						}

						Iterator<Element> var24 = MassCalculator.this.periodicTable.getElements().iterator();

						while (var24.hasNext()) {
							Element el = (Element) var24.next();
							if (el.getSymbol().equalsIgnoreCase(item.substring(0, j))) {
								try {
									mass += el.mass * (double) Integer.parseInt(item.substring(j, item.length()));
								} catch (NumberFormatException var16) {
									mass += el.mass;
								}
							}
						}
					}

					MassCalculator.this.label.setText("Mass " + s + ": " + mass);
					StringBuilder builder = new StringBuilder();

					for (j = s.length(); j < 50; ++j) {
						builder.append(" ");
					}

					MassCalculator.this.textArea.append(builder.toString() + mass + "g/mol" + System.lineSeparator());
					e.consume();
					MassCalculator.this.upperCase = true;
				} else if (e.getKeyCode() == 8) {
					if (MassCalculator.this.textArea.getText().length() == 1) {
						MassCalculator.this.upperCase = true;
					}

					int qx = 0;

					try {
						qx = MassCalculator.this.textArea.getLineEndOffset(MassCalculator.this.textArea.getLineCount() - 2);
					} catch (BadLocationException var15) {
					}

					if (MassCalculator.this.textArea.getCaretPosition() - qx == 0) {
						MassCalculator.this.upperCase = true;
						e.consume();
					}
				}

			}

			public void keyReleased(KeyEvent e) {
			}
		});
		this.list.setListData((Element[]) this.periodicTable.getElements().toArray(new Element[this.periodicTable.getElements().size()]));
		this.panel = new JPanel();
		this.panel.setLayout(new BorderLayout());
		this.panel.add(this.textArea, "Center");
		this.panel.add(this.label, "South");
		this.textArea.setBorder(BorderFactory.createEtchedBorder());
		this.add(this.panel);
		this.setSize(400, 400);
		this.setDefaultCloseOperation(3);
		this.setTitle("Mass Calculator");
		this.setLocationRelativeTo((Component) null);
		this.setVisible(true);
	}

	public static void main(String... args) throws FileNotFoundException {
		new MassCalculator();
	}

	public void parse(String s) {
		new ArrayList<Object>();
		StringBuilder temp = new StringBuilder();
		char[] var7;
		int var6 = (var7 = s.toCharArray()).length;

		for (int var5 = 0; var5 < var6; ++var5) {
			char c = var7[var5];
			System.out.println(temp);
			if (Character.isUpperCase(c)) {
				temp.toString();
				temp.delete(0, temp.length());
			}

			temp.append(c);
		}

		System.out.println(temp);
	}

	class Token {
		String symbol;
		int amount;

		public Token(String token, int amount) {
			this.symbol = token;
			this.amount = amount;
		}

		public String getToken() {
			return this.symbol;
		}

		public void setToken(String token) {
			this.symbol = token;
		}

		public int getAmount() {
			return this.amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}
	}
}
