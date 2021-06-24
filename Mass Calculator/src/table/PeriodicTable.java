package table;
import java.util.ArrayList;

public class PeriodicTable {
	private ArrayList<Element> elements;
	
	public PeriodicTable() {
		elements = new ArrayList<>();
		this.fillElements();
	}
	
	public ArrayList<Element> getElements() {
		return elements;
	}

	public void fillElements() {
		this.elements.add(new Element("Hydrogen", "H", 1, 1.00794D));
		this.elements.add(new Element("Helium", "He", 2, 4.002602D));
		this.elements.add(new Element("Lithium", "Li", 3, 6.941D));
		this.elements.add(new Element("Beryllium", "Be", 4, 9.01218D));
		this.elements.add(new Element("Boron", "B", 5, 10.811D));
		this.elements.add(new Element("Carbon", "C", 6, 12.011D));
		this.elements.add(new Element("Nitrogen", "N", 7, 14.00674D));
		this.elements.add(new Element("Oxygen", "O", 8, 15.9994D));
		this.elements.add(new Element("Fluorine", "F", 9, 18.998403D));
		this.elements.add(new Element("Neon", "Ne", 10, 20.1797D));
		this.elements.add(new Element("Sodium", "Na", 11, 22.989768D));
		this.elements.add(new Element("Magnesium", "Mg", 12, 24.305D));
		this.elements.add(new Element("Aluminum", "Al", 13, 26.981539D));
		this.elements.add(new Element("Silicon", "Si", 14, 28.0855D));
		this.elements.add(new Element("Phosphorus", "P", 15, 30.973762D));
		this.elements.add(new Element("Sulfur", "S", 16, 32.066D));
		this.elements.add(new Element("Chlorine", "Cl", 17, 35.4527D));
		this.elements.add(new Element("Argon", "Ar", 18, 39.948D));
		this.elements.add(new Element("Potassium", "K", 19, 39.0983D));
		this.elements.add(new Element("Calcium", "Ca", 20, 40.078D));
		this.elements.add(new Element("Scandium", "Sc", 21, 44.95591D));
		this.elements.add(new Element("Titanium", "Ti", 22, 47.88D));
		this.elements.add(new Element("Vanadium", "V", 23, 50.9415D));
		this.elements.add(new Element("Chromium", "Cr", 24, 51.9961D));
		this.elements.add(new Element("Manganese", "Mn", 25, 54.93805D));
		this.elements.add(new Element("Iron", "Fe", 26, 55.847D));
		this.elements.add(new Element("Cobalt", "Co", 27, 58.9332D));
		this.elements.add(new Element("Nickel", "Ni", 28, 58.6934D));
		this.elements.add(new Element("Copper", "Cu", 29, 63.546D));
		this.elements.add(new Element("Zinc", "Zn", 30, 65.39D));
		this.elements.add(new Element("Gallium", "Ga", 31, 69.723D));
		this.elements.add(new Element("Germanium", "Ge", 32, 72.61D));
		this.elements.add(new Element("Arsenic", "As", 33, 74.92159D));
		this.elements.add(new Element("Selenium", "Se", 34, 78.96D));
		this.elements.add(new Element("Bromine", "Br", 35, 79.904D));
		this.elements.add(new Element("Krypton", "Kr", 36, 83.8D));
		this.elements.add(new Element("Rubidium", "Rb", 37, 85.4678D));
		this.elements.add(new Element("Strontium", "Sr", 38, 87.62D));
		this.elements.add(new Element("Yttrium", "Y", 39, 88.90585D));
		this.elements.add(new Element("Zirconium", "Zr", 40, 91.224D));
		this.elements.add(new Element("Niobium", "Nb", 41, 92.90638D));
		this.elements.add(new Element("Molybdenum", "Mo", 42, 95.94D));
		this.elements.add(new Element("Technetium", "Tc", 43, 97.9072D));
		this.elements.add(new Element("Ruthenium", "Ru", 44, 101.07D));
		this.elements.add(new Element("Rhodium", "Rh", 45, 102.9055D));
		this.elements.add(new Element("Palladium", "Pd", 46, 106.42D));
		this.elements.add(new Element("Silver", "Ag", 47, 107.8682D));
		this.elements.add(new Element("Cadmium", "Cd", 48, 112.411D));
		this.elements.add(new Element("Indium", "In", 49, 114.818D));
		this.elements.add(new Element("Tin", "Sn", 50, 118.71D));
		this.elements.add(new Element("Antimony", "Sb", 51, 121.76D));
		this.elements.add(new Element("Tellurium", "Te", 52, 127.6D));
		this.elements.add(new Element("Iodine", "I", 53, 126.90447D));
		this.elements.add(new Element("Xenon", "Xe", 54, 131.29D));
		this.elements.add(new Element("Cesium", "Cs", 55, 132.90543D));
		this.elements.add(new Element("Barium", "Ba", 56, 137.327D));
		this.elements.add(new Element("Lanthanum", "La", 57, 138.9055D));
		this.elements.add(new Element("Cerium", "Ce", 58, 140.115D));
		this.elements.add(new Element("Praseodymium", "Pr", 59, 140.90765D));
		this.elements.add(new Element("Neodymium", "Nd", 60, 144.24D));
		this.elements.add(new Element("Promethium", "Pm", 61, 144.9127D));
		this.elements.add(new Element("Samarium", "Sm", 62, 150.36D));
		this.elements.add(new Element("Europium", "Eu", 63, 151.965D));
		this.elements.add(new Element("Gadolinium", "Gd", 64, 157.25D));
		this.elements.add(new Element("Terbium", "Tb", 65, 158.92534D));
		this.elements.add(new Element("Dysprosium", "Dy", 66, 162.5D));
		this.elements.add(new Element("Holmium", "Ho", 67, 164.93032D));
		this.elements.add(new Element("Erbium", "Er", 68, 167.26D));
		this.elements.add(new Element("Thulium", "Tm", 69, 168.93421D));
		this.elements.add(new Element("Ytterbium", "Yb", 70, 173.04D));
		this.elements.add(new Element("Lutetium", "Lu", 71, 174.967D));
		this.elements.add(new Element("Hafnium", "Hf", 72, 178.49D));
		this.elements.add(new Element("Tantalum", "Ta", 73, 180.9479D));
		this.elements.add(new Element("Tungsten", "W", 74, 183.84D));
		this.elements.add(new Element("Rhenium", "Re", 75, 186.207D));
		this.elements.add(new Element("Osmium", "Os", 76, 190.23D));
		this.elements.add(new Element("Iridium", "Ir", 77, 192.22D));
		this.elements.add(new Element("Platinum", "Pt", 78, 195.08D));
		this.elements.add(new Element("Gold", "Au", 79, 196.96654D));
		this.elements.add(new Element("Mercury", "Hg", 80, 200.59D));
		this.elements.add(new Element("Thallium", "Tl", 81, 204.3833D));
		this.elements.add(new Element("Lead", "Pb", 82, 207.2D));
		this.elements.add(new Element("Bismuth", "Bi", 83, 208.98037D));
		this.elements.add(new Element("Polonium", "Po", 84, 208.9824D));
		this.elements.add(new Element("Astatine", "At", 85, 209.9871D));
		this.elements.add(new Element("Radon", "Rn", 86, 222.0176D));
		this.elements.add(new Element("Francium", "Fr", 87, 223.0197D));
		this.elements.add(new Element("Radium", "Ra", 88, 226.0254D));
		this.elements.add(new Element("Actinium", "Ac", 89, 227.0278D));
		this.elements.add(new Element("Thorium", "Th", 90, 232.0381D));
		this.elements.add(new Element("Protactinium", "Pa", 91, 231.03588D));
		this.elements.add(new Element("Uranium", "U", 92, 238.0289D));
		this.elements.add(new Element("Neptunium", "Np", 93, 237.048D));
		this.elements.add(new Element("Plutonium", "Pu", 94, 244.0642D));
		this.elements.add(new Element("Americium", "Am", 95, 243.0614D));
		this.elements.add(new Element("Curium", "Cm", 96, 247.0703D));
		this.elements.add(new Element("Berkelium", "Bk", 97, 247.0703D));
		this.elements.add(new Element("Californium", "Cf", 98, 251.0796D));
		this.elements.add(new Element("Einsteinium", "Es", 99, 252.083D));
		this.elements.add(new Element("Fermium", "Fm", 100, 257.0951D));
		this.elements.add(new Element("Mendelevium", "Md", 101, 258.1D));
		this.elements.add(new Element("Nobelium", "No", 102, 259.1009D));
		this.elements.add(new Element("Lawrencium", "Lr", 103, 262.11D));
	}
}
