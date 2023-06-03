package Ejem03_Futbol;

public class Selection {
	protected int id;
	protected String name;
	protected String surname;
	protected int age;
	
	public Selection() {}
	
	public Selection(int id, String name, String surname, int age) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void concentrate() {
		System.out.println("Concentrarse");
	}

	public void travel() {
		System.out.println("Viajar");
	}

	
	@Override
	public String toString() {
		return "Selection [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}
}

class Trainer extends Selection{

	private String idFederation;
	
	public Trainer() {
		super();
	}
	
	public Trainer(int id, String name, String surname, int age, String idFederation) {
		super(id, name, surname, age);
		this.idFederation = idFederation;
	}

	public String getIdFederation() {
		return idFederation;
	}
	public void setIdFederation(String idFederation) {
		this.idFederation = idFederation;
	}
	
	public void directMatch() {
		System.out.println("Dirige un partido");
	}
	
	public void directTraining() {
		System.out.println("Dirige un entrenamiento");
	}

	@Override
	public String toString() {
		return super.toString() + " Trainer [idFederation=" + idFederation + "]";
	}
}

class Player extends Selection {
	private int number;
	private String position;
	
	public Player() {
		super();
	}
	
	public Player(int id, String name, String surname, int age, int number, String position) {
		super(id, name, surname, age);
		this.number = number;
		this.position = position;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void playMatch() {
		System.out.println("Juega un partido");
	}
	
	public void train() {
		System.out.println("Entrena");
	}

	@Override
	public String toString() {
		return super.toString() + " Player [number=" + number + ", position=" + position + "]";
	}
}

class Massager extends Selection {
	private String titulation;
	private int experienceYears;
	
	public Massager() {
		super();
	}
	
	public Massager(int id, String name, String surname, int age, String titulation, int experienceYears) {
		super(id, name, surname, age);
		this.titulation = titulation;
		this.experienceYears = experienceYears;
	}

	public String getTitulation() {
		return titulation;
	}
	public void setTitulation(String titulation) {
		this.titulation = titulation;
	}
	public int getExperienceYears() {
		return experienceYears;
	}
	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	
	public void giveMassage() {
		System.out.println("Dar masaje");
	}

	@Override
	public String toString() {
		return super.toString() + " Massager [titulation=" + titulation + ", experienceYears=" + experienceYears + "]";
	}
}