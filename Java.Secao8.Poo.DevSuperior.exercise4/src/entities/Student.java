package entities;

public class Student {

    private String name;
    private Double firstNote;
    private Double secondNote;
    private Double thirdNote;

    public Student(){

    }

    public Student(String name, Double firstNote, Double secondNote, Double thirdNote){
        this.name = name;
        this.firstNote = firstNote;
        this.secondNote = secondNote;
        this.thirdNote = thirdNote;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getFirstNote(){
        return firstNote;
    }

    public void setFirstNote(Double firstNote){
        this.firstNote = firstNote;
    }

    public Double getSecondNote(){
        return secondNote;
    }

    public void setSecondNote(Double secondNote){
        this.secondNote = secondNote;
    }

    public Double getThirdNote(){
        return thirdNote;
    }

    public void setThirdNote(Double thirdNote){
        this.thirdNote = thirdNote;
    }

    public double media(){
        return (firstNote + secondNote + thirdNote) / 3;
    }

}
