package Cursos;

import java.util.ArrayList;

public class CronogramaCursos {
    private int turno;
    private ArrayList<Curso> listaCursos = new ArrayList<>();

    public CronogramaCursos(int turno) {
        this.turno = turno;
        listaCursos = new ArrayList<>();
    }

    public void agregarCurso(Curso c){
        listaCursos.add(c);
    }
    public void quitarCurso(Curso c){
        listaCursos.remove(c);
    }
}
